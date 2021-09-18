package br.com.devspoint.springwebfluxreactive

import org.springframework.data.annotation.Id

data class Customer(
        @Id
        var id: Long? = null,
        var firstname: String? = null,
        var lastname: String? = null,
)