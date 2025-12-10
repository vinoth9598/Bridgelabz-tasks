import java.util.Scanner ;
public class MoodAnalyser {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter message your mood analyser : ");
        String message = sc.nextLine();

        String result = analyseMood(message);
        System.out.println(result);

    }

    public static String analyseMood(String message){
        if (message == null || message.isEmpty()) {

            return "NEUTRAL";
        }

        if(message.toLowerCase().contains("sad")){
            return "SAD";
        }
        return "HAPPY";
    }
}
