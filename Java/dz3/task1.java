//Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел
package dz3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class task1
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> listAliquot3 = new ArrayList<Integer>();
        ArrayList<Integer> listAliquot2 = new ArrayList<Integer>();
        ArrayList<Integer> listOther = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (Integer i : list){
            if (i % 3 == 0 && i % 2 == 0){
                listAliquot2.add(i);
                listAliquot3.add(i);
            }
            else if (i % 3 == 0)
                listAliquot3.add(i);
            else if (i % 2 == 0)
                listAliquot2.add(i);
            else
                listOther.add(i);
        }

        printList(listAliquot3);
        printList(listAliquot2);
        printList(listOther);
    }

    public static void printList(List<Integer> list)
    {
        for (Integer i : list){
            System.out.println(i);
        }
    }
}