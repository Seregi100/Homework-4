/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework4;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Seregi
 */
public class Homework4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Работу выполнил Кузьмин Сергей Александрович, РИБО-01-21, вариант 1");
        HashMap<String, Car> cars = new HashMap<>();
        cars.put("x001xx", new Car("Volvo s90", 2015, "x001xx"));
        cars.put("x002xx", new Car("Lada Vesta", 2020, "x002xx"));
        cars.put("x003xx", new Car("Kia Rio", 2012, "x003xx"));
        System.out.println("Введите 1, если хотите добавить автомобиль в список, 2, если хотите удалить машину из списка, 3, если хотите удалить все машины из списка. Введите 0, чтобы прекратить ввод");
        int ans = scan.nextInt();
        while (true){
            if (ans==1){
                System.out.println("Введите марку машины, год выпуска и регистрационный номер: ");
                String brand = scan.next();
                int releaseYear = scan.nextInt();
                String regNumber = scan.next();
                if (releaseYear<1886 || releaseYear>2023){
                    System.out.println("Неправильный год, повторите попытку");
                }else{
                    Car newCar = new Car(brand, releaseYear, regNumber);
                    AddCar addCar = new AddCar();
                    cars = addCar.modify(newCar, cars);
                    for (String key:cars.keySet()){
                        System.out.println(cars.get(key));
                    }
                }
            }
            if (ans==0){
                break;
            }
            if (ans==2){
                System.out.println("Введите регистрационный номер автомобиля, который необходимо удалить из списка: ");
                String regNumber = scan.next();
                DelCar delCar = new DelCar ();
                cars = delCar.modify(regNumber, cars);
                for (String key:cars.keySet()){
                        System.out.println(cars.get(key));
                }
            }
            if (ans==3){
                cars.clear();
                for (String key:cars.keySet()){
                        System.out.println(cars.get(key));
                }
            }
            ans = scan.nextInt();
        }
    }
}
