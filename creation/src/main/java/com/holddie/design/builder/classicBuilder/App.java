package com.holddie.design.builder.classicBuilder;


import com.holddie.design.builder.classicBuilder.builder.IMobilePhoneBuilder;
import com.holddie.design.builder.classicBuilder.concreatebuilder.AndroidPhoneBuilder;
import com.holddie.design.builder.classicBuilder.concreatebuilder.WindowsPhoneBuilder;
import com.holddie.design.builder.classicBuilder.director.Manufacturer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Manufacturer manufacturer = new Manufacturer();

        IMobilePhoneBuilder androidPhoneBuilder = new AndroidPhoneBuilder();

        manufacturer.construct(androidPhoneBuilder);

        System.out.println(androidPhoneBuilder.builder().getOperationSystemType());


        WindowsPhoneBuilder windowsPhoneBuilder = new WindowsPhoneBuilder();

        manufacturer.construct(windowsPhoneBuilder);

        System.out.println(windowsPhoneBuilder.builder().getPhoneName());

    }
}
