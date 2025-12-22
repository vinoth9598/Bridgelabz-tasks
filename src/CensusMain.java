

public class CensusMain {

    public static void main(String[] args){
        try{
            StateCensusAnalyser analyser = new StateCensusAnalyser();
            int count = analyser.loadStateCensusData("IndiaStateCensus.csv");

            System.out.println("Total Records Loaded " + count);

            int expectedCount = 37 ;
            if(count == expectedCount){
                System.out.println("State code record count matches :" + count);
            }else {
                System.out.println("Record count misMatch!");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
