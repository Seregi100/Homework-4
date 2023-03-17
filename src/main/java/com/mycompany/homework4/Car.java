/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework4;

/**
 *
 * @author Seregi
 */
public class Car {
    private String brand;
    private int releaseYear;
    private String regNumber;

    public Car(String brand, int releaseYear, String regNumber) {
        this.brand = brand;
        this.releaseYear = releaseYear;
        this.regNumber = regNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getRegNumber() {
        return regNumber;
    }
    
    @Override
    public String toString (){
        return "Марка машины = " + this.brand + ", год выпуска = " + this.releaseYear + ", регистрационный номер = " + this.regNumber;
    }
}
