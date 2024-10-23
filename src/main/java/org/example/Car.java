package org.example;

public class Car implements Drivable {

    private String brandAuto;
    private String modelAuto;
    private int yearAuto;

    public String getBrandAuto() {
        return brandAuto;
    }

    public void setBrandAuto(String brandAuto) {
        this.brandAuto = brandAuto;
    }

    public int getYearAuto() {
        return yearAuto;
    }

    public void setYearAuto(int yearAuto) {
        this.yearAuto = yearAuto;
    }

    public String getModelAuto() {
        return modelAuto;
    }

    public void setModelAuto(String modelAuto) {
        this.modelAuto = modelAuto;
    }

    @Override
    public void start() {
        System.out.println("Автомобиль " + this.brandAuto + " " + this.modelAuto + " " + this.yearAuto + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль " + this.brandAuto + " " + this.modelAuto + " " + this.yearAuto + " остановился");
    }

    @Override
    public void drive(int distance) {
        System.out.println("Автомобиль " + this.brandAuto + " " + this.modelAuto + " " + this.yearAuto + " г.в. проехал " + distance + " км.");
    }


}
