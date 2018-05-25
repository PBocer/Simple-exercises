package simpleExercises.designPattern.Factory;

import simpleExercises.designPattern.Factory.cars.BMWModel;
import simpleExercises.designPattern.Factory.cars.Car;
import simpleExercises.designPattern.Factory.cars.FordModel;

public class Main {

    public static void main(String[] args) {


        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();


        Car bmw =commonwealthFactory.buildCar(BMWModel.E60);
        System.out.println(bmw.getSteeringWheelPosition());


        Car ford= continentalFactory.buildCar(FordModel.CMax);
        System.out.println(ford.getSteeringWheelPosition());

    }
}
