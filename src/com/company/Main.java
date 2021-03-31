package com.company;

import com.company.controller.BookingManager;
import com.company.controller.RoomManager;
import com.company.models.Booking;
import com.company.models.Room;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        RoomManager.createRoom("Suite");
        BookingManager.bookRoom(1, 5, 10);
        RoomManager.createRoom("Deluxe");
        BookingManager.bookRoom(2, 1, 10);
        BookingManager.bookRoom(1, 12, 18);
        BookingManager.bookRoom(2, 20, 25);
        BookingManager.cancelBooking(4);


        ArrayList<Room> roomArrayList = RoomManager.getRoomList();

        ArrayList<Booking> bookingArrayList = BookingManager.getBookingArrayList();

        for (Room room : roomArrayList) {
            String roomName = room.getRoomName();
            System.out.println("Room: " + roomName);
            for (Booking booking : bookingArrayList) {
                if (booking.getBookedRoomId() == room.getRoomId()) {
                    System.out.println("Booking Id " + booking.getBookingId() + ": " + booking.getCheckInDate() + " -> " + booking.getCheckOutDate());
                }
            }
            System.out.println();
        }
    }
}
