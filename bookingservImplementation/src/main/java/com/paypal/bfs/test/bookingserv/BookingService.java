package com.paypal.bfs.test.bookingserv;

import java.sql.Date;
import java.util.List;
import java.util.Optional;


import com.paypal.bfs.test.bookingserv.BookingRepo;
import com.paypal.bfs.test.bookingserv.api.Entities.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookingService {

    @Autowired
    BookingRepo bookRepo;


    public Booking createBookings(Booking booking){
        Optional<Booking> existingBooking = bookRepo.findByFirstNameAndLastNameAndDate_Of_Birth(booking.getFirstName(),booking.getLastName(),booking.getDate_of_birth(),booking.getCheckin_datetime());
        if(existingBooking.isPresent()){
            return existingBooking.get();
        }
        Booking bk = bookRepo.save(booking);
        return bk;
    }

    public List<Booking> getAllBookings(){
        List<Booking> bookings  = bookRepo.findAll();
        return bookings;
    }
}