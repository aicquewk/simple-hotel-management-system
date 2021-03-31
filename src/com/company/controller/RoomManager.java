package com.company.controller;

import com.company.models.Room;

import java.util.ArrayList;

public class RoomManager {
    private static int roomId = 1;
    private static ArrayList<Room> roomArrayList = new ArrayList<Room>();

    public static void createRoom (String roomName) {
        Room room = new Room(roomId++,roomName);
        roomArrayList.add(room);
    }

    public static ArrayList<Room> getRoomList() {
        return roomArrayList;
    }

}
