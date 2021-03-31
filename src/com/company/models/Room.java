package com.company.models;

public class Room {
    private int roomId;
    private String roomName;

    public Room (int roomId, String roomName) {
        this.roomId = roomId;
        this.roomName = roomName;
    }

    public String getRoomName () {
        return roomName;
    }

    public int getRoomId() {
        return roomId;
    }
}
