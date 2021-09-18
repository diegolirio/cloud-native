package br.com.devspoint.springwebimperative;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerRestController {

    private final CustomerRepository repository;

    @GetMapping
    public Iterable<Customer> getList() {
        return repository.findAll();
    }
}
