package com.wipro.velocity.ims.repository;

import org.springframework.data.repository.CrudRepository;

import com.wipro.velocity.ims.model.Dealer;

public interface UserRepository extends CrudRepository<Dealer, Long> {
	
	// Fetch record/object based on email - non Id field
    public Dealer findByEmail(String email);

}
