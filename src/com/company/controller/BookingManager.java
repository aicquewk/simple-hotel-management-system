package com.company.controller;

import com.company.models.Booking;

import java.util.ArrayList;

public class BookingManager {
    private static int bookingId = 1;
    private static ArrayList<Booking> bookingArrayList = new ArrayList<Booking>();

    public static void bookRoom(int roomId, int checkInDate, int checkOutDate) {
        Booking booking = new Booking(bookingId++,roomId,checkInDate,checkOutDate);
        bookingArrayList.add(booking);
    }

    public static void cancelBooking(int bookingId) {
        bookingArrayList.remove(bookingId-1);
    }

    public static ArrayList<Booking> getBookingArrayList() {
        return bookingArrayList;
    }

}
