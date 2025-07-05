package org.example;

import org.example.patterns.abstractfactory.Region;
import org.example.patterns.abstractfactory.SmartDeviceFactory;
import org.example.patterns.abstractfactory.SmartDeviceFactoryConfigurer;
import org.example.patterns.abstractfactory.interfaces.SmartDoorLock;
import org.example.patterns.abstractfactory.interfaces.SmartThermostat;
import org.example.patterns.decorator.decorators.BasePizza;
import org.example.patterns.decorator.decorators.Farmhouse;
import org.example.patterns.decorator.decorators.Margherita;
import org.example.patterns.decorator.decorators.decorators.Jalapenos;
import org.example.patterns.decorator.decorators.decorators.Olives;
import org.example.patterns.factory.Shape;
import org.example.patterns.factory.ShapeFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");

//        Observable observable = new WeatherObservable();
//        DisplayObserver tv = new TvObserver();
//        DisplayObserver mobile = new MobileObserver();
//        observable.add(tv);
//        observable.add(mobile);
//        observable.changeState("Weather changing now");


          // Decorator Pattern
//        BasePizza basePizza = new Farmhouse();
//        basePizza = new Margherita();
//        basePizza = new Jalapenos(basePizza);
//        basePizza = new Olives(basePizza);
//        basePizza = new Jalapenos(basePizza);
//
//        System.out.println(basePizza.getDescription());
//        System.out.println(basePizza.getCost());

        // Factory pattern
//        ShapeFactory shapeFactory = new ShapeFactory();
//        Shape newShape = shapeFactory.getShape("circle");
//        Shape dfd = shapeFactory.getShape("abc");


        // Abstract Factory Pattern
        SmartDeviceFactoryConfigurer smartDeviceFactoryConfigurer = new SmartDeviceFactoryConfigurer();
        SmartDeviceFactory smartDeviceFactory = smartDeviceFactoryConfigurer.getSmartDeviceFactory(Region.US);
        SmartDoorLock smartDoorLock = smartDeviceFactory.createDoorLock();
        System.out.println(smartDoorLock.getSpecs());



    }
}