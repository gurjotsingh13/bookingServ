package com.paypal.bfs.test.bookingserv;

import com.paypal.bfs.test.bookingserv.api.Entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepo extends JpaRepository<Address, Integer> {
}