package dz2java;
public class task2 {

   public static void main(String[] args) {

      // Напишите программу на Java, чтобы проверить, являются ли 
      // две данные строки вращением друг друга. 
            
      String str1= "ABACD";
      String str2= "CDABA";
      String str3= "abcd";
      String str4= "dcba";
     
      if(str1.length()==str2.length()&&((str1+str1).indexOf(str2) != -1)&&((str2+str2).indexOf(str1) != -1))
      {
          System.out.println();
          System.out.println("данные str2 являются вращением str1 и наоборот");
          System.out.println(str1+str1+" --> "+str2);
          System.out.println(str2+str2+" --> "+str1);
      }
      else
      {
          System.out.println();
          System.out.println("не являются");
          System.out.println(str1+str1+" --> "+str2);
          System.out.println(str2+str2+" --> "+str1); 
          System.out.println();
            
      }
      if(str3.length()==str4.length()&&((str3+str3).indexOf(str4) != -1)&&((str4+str4).indexOf(str3) != -1))
      {
          System.out.println("данные str3 являются вращением str4 и наоборот: ");
          System.out.println();
          System.out.println(str3+str3+" --> "+str4);
          System.out.println(str4+str4+" --> "+str3);
          System.out.println();
      }
      else
      {
          System.out.println();
          System.out.println("не являются");
          System.out.println(str3+str3+" --> "+str4);
          System.out.println(str4+str4+" --> "+str3); 
            
      }
  }
}