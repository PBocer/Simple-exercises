package simpleExercises.designPattern.Factory;

import simpleExercises.designPattern.Factory.cars.BMWModel;
import simpleExercises.designPattern.Factory.cars.Car;
import simpleExercises.designPattern.Factory.cars.FordModel;

public interface Factory {


    Car buildCar(FordModel model);
    Car buildCar(BMWModel model);
}
