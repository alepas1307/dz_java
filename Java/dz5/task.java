   package dz5;

   import java.util.*;
   
   public class task {
           public static void main(String[] args) {
   //1. Создать словарь HashMap. Обобщение <Integer, String>.
                   HashMap<Integer, String> writers = new HashMap<Integer, String>();
   
   //2. Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключ, если не было!)
                   writers.put(0, "Иванов Иван Иванович 28 м");
                   writers.put(1, "Булкин Михаил Александрович 38 м");
                   writers.put(2, "Пастухов Борис Леонович 40 м");
                   writers.put(3, "Горячева Николь Сергеевна 32 ж");
                   writers.put(4, "Осетрова Александра Николаевна 43 ж");
                   writers.put(5, "Дорогов Фёдор Максимович 39 м");
   
                   Set<Map.Entry<Integer, String>> allWriters = writers.entrySet();
                   System.out.println("\nСписок (ключ+значение): ");
                   System.out.println(allWriters);
   
   //3. Изменить значения сделав пол большой буквой.
                   Set<Integer> keysWriters = writers.keySet();
                   for (int i = 0; i < writers.size(); i++) {
                           int a = (int) keysWriters.toArray()[i];
                           String[] strW = writers.get(a).split(" ");
                           String str1 = strW[0] + " " + strW[1] + " " + strW[2] + " " + strW[3] + " " + strW[4].toUpperCase();
                           writers.replace(a, str1);
                   }
                   System.out.println("\nЗаменили у пола значения с маленькой буквы на большую: ");
                   System.out.println(allWriters);
   
   //4. Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
                   System.out.println("\nВывод значений в формате \"Иванов И.И.\": ");
                   for (Integer keys : keysWriters) {
                           String temp = writers.get(keys).split(" ")[0];
                           String initialsOfWriters = temp.toUpperCase().charAt(0) + temp.toLowerCase().substring(1, temp.length());
                           temp = writers.get(keys).split(" ")[1].toUpperCase().charAt(0) + ".";
                           initialsOfWriters = initialsOfWriters + " " + temp;
                           temp = writers.get(keys).split(" ")[2].toUpperCase().charAt(0) + ".";
                           initialsOfWriters = initialsOfWriters + temp;
                           System.out.println(initialsOfWriters);
                   }
                  }
               }