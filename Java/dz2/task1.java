package dz2;

public class task1 {
   
   public static void main(String[] args) 
   {

       // Напишите программу на Java, чтобы найти наименьшее окно в строке, 
       // содержащей все символы другой строки.        

       String str1 = "У лукоморья дуб зелёный. Златая цепь на дубе том";
       String str2 = "дуб зелёный";
       
       if (str1.length() > str2.length() && str1.contains(str2)) {
           System.out.println();
           System.out.println(
                   str1.contains(str2) + "-->" + "'" + str2 + "'" + "  " + "находится в" + "  " + "'" + str1 + "'\n");
       } else if (str1.length() < str2.length()) {
           System.out.println(str1.contains(str2) + "-->" + " " + str1 + " " + "str1" + " " + "<" + " " + "str2" +  " " + str2 + "\n");
       } else {
           System.out.println(str1.contains(str2) + "-->" + " " + "str2" + " " + " не входит в" + " " + "str1\n");
       }
   }
   
}         
