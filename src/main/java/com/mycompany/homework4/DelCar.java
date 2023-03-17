/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework4;

import java.util.HashMap;

/**
 *
 * @author Seregi
 */
public class DelCar {
    public HashMap<String, Car> modify(String regNumber, HashMap<String, Car> cars){
        /*if (cars.containsKey(newCar.getRegNumber())){
            System.out.println("Такой регистрационный номер уже существует, попробуйте снова");
        }else{*/
        cars.remove(regNumber);
        //}
        return cars;
    }
}
