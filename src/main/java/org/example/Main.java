package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // подключаем сканер
        int choice = 0; //переменная для выбора операций
        int order = 0; //переменная для вычисления индекса заказа
        String[] companys = new String[]{"Casio", "Tissot", "Swatch", "Rolex", "Orient", "Omega"}; //массив компаний
        Object[][] marks = new Object[][]{          //двумерный массив компания + марка
                {companys[0], "G-Shock GW-M5610-1E"},
                {companys[0], "G-Shock GA-2100-1AER"},
                {companys[1], "T116.617.11.047.01"},
                {companys[2], "GZ356"},
                {companys[2], "SB03G100"},
                {companys[3], "Submariner"},
                {companys[3], "Day-Date"},
                {companys[3], "Cosmograph Daytona"},
                {companys[4], "KV00008W"},
                {companys[5], "131.20.28.60.02.001"},
                {companys[5], "431.10.41.21.01.001"}
        };
        ArrayList<Object> users = new ArrayList<>(); //лист пользователей
        ArrayList<Object> orders = new ArrayList<>(); //лист заказов
        System.out.println("Добро пожаловать! Пройдите регистрацию для оформоения заказа\nВведите свои ФИО");
        users.add(sc.nextLine());
        System.out.println("Введите свой email");
        users.add(sc.nextLine());
        System.out.println("Введите свой номер телефона");
        users.add(sc.nextLine());
        System.out.println("Выберете марку часов");
        for (int i = 0; i< marks.length; i++){          //вывод двумерного массива
            System.out.println(i+1 +". " + marks[i][0] + " / " + marks[i][1]);
        }
        int num = sc.nextInt()-1;
        users.add(marks[num][0] + " / " + marks[num][1]);
        System.out.println("Назовите количество");
        users.add(sc.nextInt());
        orders.add("Заказчик: " + users.get(0) + " " + users.get(1) + " " + users.get(2) + "\tЗаказ: " + users.get(3)  + " В количестве: " + users.get(4) + "шт"); // добавление заказа
        order++;
        do{
            System.out.println("Что вы хотите сделать?\n1. Сделать заказ ещё раз\n2. Посмотреть заказы\n3. Выйти");
            choice = sc.nextInt(); sc.nextLine();
            if (choice == 1){
                System.out.println("Добро пожаловать! Пройдите регистрацию для оформоения заказа\nВведите свои ФИО");
                users.add(sc.nextLine());
                System.out.println("Введите свой email");
                users.add(sc.nextLine());
                System.out.println("Введите свой номер телефона");
                users.add(sc.nextLine());
                System.out.println("Выберете марку часов");
                for (int i = 0; i< marks.length; i++){
                    System.out.println(i+1 +". " + marks[i][0] + " / " + marks[i][1]);
                }
                num = sc.nextInt()-1;
                users.add(marks[num][0] + " / " + marks[num][1]);
                System.out.println("Назовите количество");
                users.add(sc.nextInt());
                orders.add("Заказчик: " + users.get(5*order) + " " + users.get(5*order+1) + " " + users.get(5*order+2) + "\tЗаказ: " + users.get(5*order+3)  + " В количестве: " + users.get(5*order+4) + "шт");
            }
            if (choice == 2){           //вывод заказов
                for (int i = 0; i < orders.size(); i++){
                    System.out.println(orders.get(i));
                }
            }
        }while (choice != 3); //завепшение работы
    }
}