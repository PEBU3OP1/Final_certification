package Controller;

import java.util.List;
import java.util.Scanner;

import Database.Farm_database_intfc;
import Database.Farm_db;

public class Controller {
    Farm_db farm_pet_list = new Farm_db();

    public void printAll() {
        List<String> farm = farm_pet_list.getAll();
        for (int i = 0; i < farm.size(); i++) {
            System.out.println(farm.get(i).replace(";", " "));
        }
        System.out.println("Для возврата в меню введите что угодно");
        Scanner pause = new Scanner(System.in);
        switch (pause.nextLine()) {
            default:
                break;
        }


    }
}
