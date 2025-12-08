package Strings;

public class StringsBuilders {

    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);

        sb.append(" Programming");
        System.out.println(sb);

        sb.insert(4, " is");
        System.out.println(sb);

        sb.delete(7, 18);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println("_____________________________");
        StringBuffer sf = new StringBuffer("Java");
        System.out.println(sf);
        sf.append(" Programming");
        System.out.println(sf);
        sf.insert(4, " is");
        System.out.println(sf);
        sf.delete(9,15);
        System.out.println(sf);
        sf.reverse();
        System.out.println(sf);

    }
}
