package com.company;

public class Airline {


    private String name;
    private int avg_speed;
    private int sit_place;
    private int id;

    public Airline(String name, int avg_speed, int sit_place) {
        this.name = name;
        this.avg_speed = avg_speed;
        this.sit_place = sit_place;
    }

    public Airline(String name, int avg_speed, int sit_place, int id) {
        this.name = name;
        this.avg_speed = avg_speed;
        this.sit_place = sit_place;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvg_speed() {
        return avg_speed;
    }

    public void setAvg_speed(int avg_speed) {
        this.avg_speed = avg_speed;
    }

    public int getSit_place() {
        return sit_place;
    }

    public void setSit_place(int sit_place) {
        this.sit_place = sit_place;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
