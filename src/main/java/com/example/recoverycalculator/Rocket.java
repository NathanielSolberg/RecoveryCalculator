package com.example.recoverycalculator;

public class Rocket implements DragEquation{

    public float velocity;
    public float airDensity;
    public float weight;
    public float dragCoefficient;

    private float area;

    public Rocket(Parachute parachute) {
        area = parachute.getArea();
    }

    @Override
    public float calculate(String variableType) {

        switch(variableType){
            case "velocity":

                if(airDensity != 0){}
                velocity = (float) Math.sqrt((2.0f*weight)/dragCoefficient*airDensity*area);
                return velocity;
            case "airDensity":
                return airDensity;
            case "weight":
                return weight;
            case "dragCoefficient":
                return dragCoefficient;
        }

        return 0;
    }
}
