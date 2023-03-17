package View;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import Controller.Controller;
import Controller.Date_validator;
import Model.Cat;
import Model.Creator;
import Model.Dog;
import Model.Donkey;

public class View {
    public void start() throws ParseException {
        Date_validator date_checker = new Date_validator();

        while (true) {
            System.out.println("Меню: ");
            System.out.print(
                    "-  1: Полный список животных\n" +
                            "-  2: Завести в базу новое животное\n" +
                            "-  3: Что умеет животное\n" +
                            "-  4: Дрессировать животное\n" +
                            "-  5: Найти инф по имени\n" +
                            "-  6: Изменить данные\n" +
                            "-  7: Удалить животное\n" +
                            "-  8: Выход\n");

            System.out.println("Введите цифру: ");
            Scanner key = new Scanner(System.in);
            Controller controller = new Controller();
            switch (key.next()) {

                case "1":
                    controller.printAll();
                    break;
                case "2":

                    System.out.println("Какое животное: ");
                    System.out.print(
                            "1 - Кошка\n" +
                                    "2 - Собака\n" +
                                    "3 - Осел\n");
                    int pet_choice = new Scanner(System.in).nextInt();

                    System.out.println("Как его зовут?: ");
                    String pet_name = new Scanner(System.in).nextLine();

                    System.out.println("Что он умеет?: ");
                    String pet_command = new Scanner(System.in).nextLine();

                    System.out.println("Когда он родился?: ");
                    String pet_bday = new Scanner(System.in).nextLine();

                    while (!date_checker.valid_date(pet_bday)) {
                        System.out.println("Введены неверные данные!");
                        System.out.println("Когда он родился?: ");
                        pet_bday = new Scanner(System.in).nextLine();

                    }

                    switch (pet_choice) {
                        case 1:
                            new Cat(pet_name, pet_command, pet_bday);
                            break;
                        case 2:
                            new Dog(pet_name, pet_command, pet_bday);
                        case 3:
                            new Donkey(pet_name, pet_command, pet_bday);

                        default:
                            break;
                    }

                    break;
                case "3":
                    System.out.println("3");
                    break;
                case "4":
                    System.out.println("4");
                    break;
                case "5":
                    System.out.println("5");
                    break;
                case "6":
                    System.out.println("6");
                    break;
                case "7":
                    System.out.println("7");
                    break;
                case "8":
                    return;

                default:
                    System.out.println("Неверный ввод!");
                    break;
            }

        }
    }
}
