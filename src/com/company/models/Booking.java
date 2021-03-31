package com.company.models;

public class Booking {
    private int bookingId;
    private int bookedRoomId;
    private int checkInDate;
    private int checkOutDate;

    public Booking(int bookingId, int bookedRoomId, int checkInDate, int checkOutDate) {
        this.bookingId = bookingId;
        this.bookedRoomId = bookingId;
        this.bookedRoomId = bookedRoomId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public int getBookedRoomId() {
        return bookedRoomId;
    }

    public int getCheckInDate() {
        return checkInDate;
    }

    public int getCheckOutDate() {
        return checkOutDate;
    }

    public int getBookingId() {
        return bookingId;
    }
}
