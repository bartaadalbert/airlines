package com.company;

public class Town {
    private String name;
    private int population;
    private int id;

    public Town(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public Town(String name, int population, int id) {
        this.name = name;
        this.population = population;
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
