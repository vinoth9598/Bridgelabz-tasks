
import com.opencsv.bean.CsvBindByName ;
public class CSVStateCensus {

    @CsvBindByName(column = "State")
    public String state ;

    @CsvBindByName(column = "Population")
    public int population ;

    @CsvBindByName(column = "AreaInSqKm")
    public int areaInSqKm;

    @CsvBindByName(column = "DensityPerSqKm")
    public int density ;

    @CsvBindByName(column = "StateCode")
    public String stateCode ;
}
