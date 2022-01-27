package com.paypal.bfs.test.bookingserv.api.Entities;


import java.sql.Date;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer booking_id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private Date date_of_birth;
    @NotNull
    private LocalDateTime checkin_datetime;
    @NotNull
    private LocalDateTime checkout_datetime;
    @NotNull
    private Integer totalprice;
    @NotNull
    private Integer deposit;
    @OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    public Booking(){

    }

    public Booking(final String firstName, final String lastName, final Date date_of_birth, final LocalDateTime checkin_datetime, final LocalDateTime checkout_datetime, final Integer totalprice, final Integer deposit, final Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date_of_birth = date_of_birth;
        this.checkin_datetime = checkin_datetime;
        this.checkout_datetime = checkout_datetime;
        this.totalprice = totalprice;
        this.deposit = deposit;
        this.address = address;
    }

    public void setBooking_id(final Integer booking_id) {
        this.booking_id = booking_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(final Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public LocalDateTime getCheckin_datetime() {
        return checkin_datetime;
    }

    public void setCheckin_datetime(final LocalDateTime checkin_datetime) {
        this.checkin_datetime = checkin_datetime;
    }

    public LocalDateTime getCheckout_datetime() {
        return checkout_datetime;
    }

    public void setCheckout_datetime(final LocalDateTime checkout_datetime) {
        this.checkout_datetime = checkout_datetime;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(final Integer totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(final Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getBooking_id() {
        return booking_id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

}