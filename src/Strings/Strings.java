package Strings;

public class Strings {

    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "Java";
        String result = s1 + " "+ s2 ;

        System.out.println(result);

        String s = "A";
        s = s + "B";

        System.out.println(s);

        String res = s1.concat(" "+ s2);

        System.out.println("concat result :" + res);

//        Big difference

        String str = "";
        for(int i = 0; i < 1000; i++){
            str = str + i;
        }

        System.out.println(str);

    }
}
