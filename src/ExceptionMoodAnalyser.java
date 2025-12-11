import java.util.regex.*;
public class ExceptionMoodAnalyser {

    public static void main(String[] args) {
        try{
            MoodAnalyser m1 = new MoodAnalyser(" I am in Sad Mood");
            System.out.println(m1.analyseMood());

            MoodAnalyser m2 = new MoodAnalyser("I am in Any Mood");
            System.out.println(m2.analyseMood());

            MoodAnalyser m3 = new MoodAnalyser(null);
            System.out.println(m3.analyseMood());

            MoodAnalyser m4 = new MoodAnalyser("");
            System.out.println(m4.analyseMood());

        }catch(Exception e){
            System.out.println("validate result " + e.getMessage());
        }
    }
}

class MoodAnalyser{
    private String message ;

    public MoodAnalyser(String message){
        this.message = message ;
    }

    public String analyseMood() throws Exception{
        if (message == null){
            try{
                return "HAPPY";
            }catch(Exception e){
                System.out.println("message is null");
            }
        }

        if(message.trim().isEmpty()){
            throw new Exception("Mood can't be empty");
        }

        if(message.toLowerCase().contains("sad")){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }
}
