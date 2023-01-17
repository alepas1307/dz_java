//Дано два числа, например 3 и 56, необходимо составить следующие строки:
// 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

package dz2java;

public class task4 {
   
    public static void main(String[] args) {
        Integer x = 3;
        Integer y = 56;
        StringBuilder str_1 = new StringBuilder();
        str_1.append(x);
        str_1.append('+');
        str_1.append(y);
        str_1.append('=');
        str_1.append(x+y);
        System.out.println(str_1);
        StringBuilder str_2 = new StringBuilder();
        str_2.append(x);
        str_2.append('-');
        str_2.append(y);
        str_2.append('=');
        str_2.append(x-y);
        System.out.println(str_2);
        StringBuilder str_3 = new StringBuilder();
        str_3.append(x);
        str_3.append('*');
        str_3.append(y);
        str_3.append('=');
        str_3.append(x*y);
        System.out.println(str_3);
    }
}