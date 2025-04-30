package com.example.recoverycalculator;

public class Elliptical extends Parachute{

    private float goreArea;
    private int goreCount;

    public Elliptical(float goreArea, int goreCount){
        this.goreArea = goreArea;
        this.goreCount = goreCount;
    }

    @Override
    public float getArea() {
        return goreArea*goreCount;
    }
}
