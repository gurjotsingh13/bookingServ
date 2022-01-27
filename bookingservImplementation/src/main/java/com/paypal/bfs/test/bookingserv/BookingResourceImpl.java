package com.paypal.bfs.test.bookingserv;

import java.util.List;

import javax.validation.Valid;

import com.paypal.bfs.test.bookingserv.api.BookingResource;
import com.paypal.bfs.test.bookingserv.api.Entities.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingResourceImpl implements BookingResource {

    @Autowired
    BookingService bookingService;

    @Override
    public ResponseEntity<Booking> create(@Valid  @RequestBody Booking booking) {
        Booking bking  = bookingService.createBookings(booking);
        return new ResponseEntity<>(bking,HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<Booking> > getAllBookings() {
        List<Booking> arr = bookingService.getAllBookings();
        return new ResponseEntity<>(arr,HttpStatus.OK);
    }
}