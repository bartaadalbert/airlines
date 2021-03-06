package com.company;

public class Timetable {
    private String from;
    private String to;
    private int distance;
    private int id;
    private int al_id;

    public Timetable(String from, String to, int distance, int id) {
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.id = id;
    }

    public Timetable(String from, String to, int distance) {
        this.from = from;
        this.to = to;
        this.distance = distance;
    }

    public Timetable(String from, String to, int distance, int id, int al_id) {
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.id = id;
        this.al_id = al_id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAl_id() {
        return al_id;
    }

    public void setAl_id(int al_id) {
        this.al_id = al_id;
    }
}
