//Разработать программу, имитирующую поведение коллекции HashSet. В программе содать метод add добавляющий элемент, и метод позволяющий выводить эллементы коллекции в консоль. Формат данных Integer.

import java.util.HashMap;   
public class task {
    private static HashMap<Integer,Object> hm  = new HashMap<>();
    private static final Object OBJ = new Object();    
    public static void main(String[] args) {
        add(5);
        add(5);
        add(10);
        add(13);
        add(8);
        add(13);
        add(5);   
        System.out.println(getStr());   
    }
    private static String getStr() {
        return hm.keySet().toString();
    }
    private static void add(Integer num) {
        hm.put(num, OBJ);
    }    
}