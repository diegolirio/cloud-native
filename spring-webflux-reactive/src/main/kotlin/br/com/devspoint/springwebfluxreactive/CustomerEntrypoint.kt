package br.com.devspoint.springwebfluxreactive

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router
import reactor.core.publisher.Mono

@Configuration
class CustomerEntrypoint(
        private val repository: CustomerRepository
) {

    companion object {
        val CONTEXT_PATH_URL = "/customers"
    }

    @Bean
    fun route() = router {
        (CONTEXT_PATH_URL and accept(MediaType.APPLICATION_JSON)).nest {
            GET("", ::getAll)
        }
    }

    fun getAll(serverRequest: ServerRequest): Mono<ServerResponse> =
            ServerResponse.ok()
                    .body(repository.findAll(), Customer::class.java)

}