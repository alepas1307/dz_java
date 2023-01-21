// Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел. 
// Удалить из первого списка элементы отсутствующие во втором списке. 
// Отсортировать первый список методом sort класса Collections. 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Random randomNumber = new Random();
        for (int i = 0; i < 20; i++) {
            list1.add(randomNumber.nextInt(100));
            list2.add(randomNumber.nextInt(100));
        }
    System.out.println("\nСписок 1: " + list1);

    Collections.sort(list1);
    System.out.println("Список по возрастаию: " + list1 + "\n");
    System.out.println("Список 2: " + list1 + "\n");

    list1.removeIf(i -> !list2.contains(i));
    System.out.println("Итоговый список: " + list1);

    }
}