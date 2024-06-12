package org.example;

import lombok.AllArgsConstructor;
import org.example.model.*;
import org.example.sevice.CleanerDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class Main implements CommandLineRunner {

    public static void main(String[] args) {


        SpringApplication.run(Main.class, args);

    }
    @Autowired
    private final CleanerDeviceService service;

    @Override
    public void run(String... args) throws Exception {
        DeviceAttributes attributes= new DeviceAttributes();
        Country country=new Country();
        country.setName("China");
        attributes.setCountry(country);
        Manufacture manufacture=new Manufacture();
        manufacture.setName("Huawei");
        attributes.setManufacture(manufacture);
        CleanerDevice cleanerDevice=new CleanerDevice();
        cleanerDevice.setDeviceAttributes(attributes);
        cleanerDevice.setName("SUPER CLEANER");
        ModelAttributes modelAttributes=new ModelAttributes();
        ColorName colorName=new ColorName();
        colorName.setName("Blue");
        modelAttributes.setColor(colorName);
        modelAttributes.setModelSize("20 cm x 20 cm");
        modelAttributes.setSerialNumber("12345");
        modelAttributes.setCost(100);
        CleanerModel cleanerModel=new CleanerModel();
        cleanerModel.setModelAttributes(modelAttributes);
        cleanerModel.setName("BLUE SUPER CLEANER");
        cleanerModel.setModeCnt(3);
        cleanerModel.setDustCollVolume("255 m");
        cleanerDevice.getModels().add(cleanerModel);
        service.createIfNotExists(cleanerDevice);
    }
}