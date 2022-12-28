import java.util.Scanner;

public class Main {

    private static Scanner scn;
    public static int amountHuman;

    public static void main(String[] args) {

        scn = new Scanner(System.in);

        System.out.print("Введите количество человек для ввода: ");
        amountHuman = scn.nextInt();

        Person[] arrayHuman = new Person[amountHuman];

        for (int i = 0; i < amountHuman; i++){
            System.out.printf("Человек под номером № %d \n", i+1);
            System.out.print("Имя: ");
            String name = scn.next();
            System.out.print("Возраст: ");
            int age = scn.nextInt();
            Person person = new Person(name, age);
            arrayHuman[i] = person;
        }

        for(Person i : arrayHuman){
            i.displayInfo();
        }
    }
}