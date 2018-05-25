package simpleExercises.designPattern.Factory;

import simpleExercises.designPattern.Factory.cars.*;

public class CommonwealthFactory implements Factory {

    SteeringWheelPosition position=SteeringWheelPosition.RIGHT;


    public Car buildCar(FordModel model) {
        switch (model) {
            case CMax:
                return new Ford("2018", "1,8", "Diesiel", position);
            case Focus:
                return new Ford("2016", "1,4", "Diesiel", position);
            default:
                throw new IllegalArgumentException("No such model");

        }
    }


    public Car buildCar(BMWModel model) {

        switch (model) {
            case X5:
                return new BMW("2015", "1,2","Disel", position);
            case E60:
                return new BMW("2018", "1,4", "Gas", position);
            default:
                throw new IllegalArgumentException("No such model");
        }
    }
}
