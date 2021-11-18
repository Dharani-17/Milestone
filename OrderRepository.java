package com.example.demo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Integer>{

	Optional<Order> findById(long l);
	Optional<Order> findByName(String name);

}
