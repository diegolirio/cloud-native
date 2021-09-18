package br.com.devspoint.springwebfluxreactive

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : ReactiveCrudRepository<Customer, Long> {
}