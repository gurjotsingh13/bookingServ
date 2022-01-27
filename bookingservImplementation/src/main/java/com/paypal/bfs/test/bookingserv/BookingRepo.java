package com.paypal.bfs.test.bookingserv;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Optional;

import com.paypal.bfs.test.bookingserv.api.Entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends JpaRepository<Booking,Integer> {
    @Query(value = "SELECT u FROM Booking u WHERE u.firstName= ?1 and u.lastName= ?2 and u.date_of_birth= ?3 and u.checkin_datetime =?4")
    Optional<Booking> findByFirstNameAndLastNameAndDate_Of_Birth(String firstName, String lastName,Date date_of_birth,LocalDateTime checkin_datetime);
}