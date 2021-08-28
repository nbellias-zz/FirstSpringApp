package net.nbellias.firstspringapp.repositories;

import net.nbellias.firstspringapp.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    Customer findCustomerById(Integer id);
}
