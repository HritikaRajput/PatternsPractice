package org.example;

import org.example.patterns.abstractfactory.Region;
import org.example.patterns.abstractfactory.SmartDeviceFactory;
import org.example.patterns.abstractfactory.SmartDeviceFactoryConfigurer;
import org.example.patterns.abstractfactory.interfaces.SmartDoorLock;
import org.example.patterns.adapter.Client;
import org.example.patterns.adapter.adaptee.ConcreteAdaptee;
import org.example.patterns.adapter.adaptee.adapter.Aparter;
import org.example.patterns.adapter.adaptee.adapter.ConcreteAdapter;
import org.example.patterns.builder.AccountsEmployeeBuilder;
import org.example.patterns.builder.Director;
import org.example.patterns.builder.Employee;
import org.example.patterns.singleton.Impl1_EagerSingleton;
import org.example.patterns.singleton.Impl2_LazySingleton;
import org.example.patterns.singleton.Impl3_SynchronizedSingleton;

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
//        SmartDeviceFactoryConfigurer smartDeviceFactoryConfigurer = new SmartDeviceFactoryConfigurer();
//        SmartDeviceFactory smartDeviceFactory = smartDeviceFactoryConfigurer.getSmartDeviceFactory(Region.US);
//        SmartDoorLock smartDoorLock = smartDeviceFactory.createDoorLock();
//        System.out.println(smartDoorLock.getSpecs());


        // Singleton
//        Impl1_EagerSingleton eagerSingleton = Impl1_EagerSingleton.getSingleton();
//        Impl2_LazySingleton lazySingleTon = Impl2_LazySingleton.getSingleton();
//
//        Impl3_SynchronizedSingleton singleton = Impl3_SynchronizedSingleton.getSingleton();
//


        // Builder
//        Director dir = new Director(new AccountsEmployeeBuilder());
//        Employee em = dir.run();
//        System.out.println(em.toString());

        //Ada[ter
//        ConcreteAdapter concreteAdapter  = new ConcreteAdapter(new ConcreteAdaptee());
//        Client client = new Client(concreteAdapter);



    }
}