//Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

package dz2java;

public class task6 {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("World = Мир");
        System.out.println(str);
        while (str.toString().contains("=")) {
            int index = str.indexOf("=");
            str.replace(index, index + 1, "равно");

        }
        System.out.println(str);
    }
}