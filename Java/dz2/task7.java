//**Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "="
// средствами String и StringBuilder.

package dz2;

public class task7 {

    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += '=';
        }
        String s = "равно";
        String str_1 = null;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str_1 = str.replaceAll("=", s);
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(str_1);

        StringBuilder stringBuilder = new StringBuilder(str);
        long start_2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int index = stringBuilder.indexOf("=");
            stringBuilder.replace(index, index + 1, "равно");
        }
        System.out.println(System.currentTimeMillis() - start_2);
        System.out.println(stringBuilder);

    }
}