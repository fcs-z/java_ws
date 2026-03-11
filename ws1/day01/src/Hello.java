package src;

/**
 * @author:Fcs
 * @className:Hello
 * @description:
 * @date:2021/6/20 17:51
 * @version:0.1
 * @since:1.8
 */

//最多只有一个类声明public，且Public放到文件名同名的类前面
public class Hello {                          //String a[] or String a[]
    public static void  main(String[] args){  //arguments:参数  args[]——>a(可变)
      System.out.println("Hello AiLin a"+"   Hi");
      System.out.print("Hello AiLin");

      System.out.println();

      String str1=123+"";
      System.out.println(str1);

      int num1=Integer.parseInt(str1);
      System.out.println(num1);
    }
}

class Person{
}

class Animal{
}