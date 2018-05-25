package com.holddie.design;

import com.holddie.design.builder.IMobilePhoneBuilder;
import com.holddie.design.concreatebuilder.AndroidPhoneBuilder;
import com.holddie.design.concreatebuilder.WindowsPhoneBuilder;
import com.holddie.design.director.Manufacturer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Manufacturer manufacturer = new Manufacturer();

        IMobilePhoneBuilder androidPhoneBuilder = new AndroidPhoneBuilder();

        manufacturer.construct(androidPhoneBuilder);

        System.out.println(androidPhoneBuilder.getPhone().getOperationSystemType());


        WindowsPhoneBuilder windowsPhoneBuilder = new WindowsPhoneBuilder();

        manufacturer.construct(windowsPhoneBuilder);

        System.out.println(windowsPhoneBuilder.getPhone().getPhoneName());

    }
}
