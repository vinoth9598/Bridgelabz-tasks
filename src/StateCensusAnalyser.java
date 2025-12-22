import java.io.Reader ;
import java.util.Iterator ;
import java.io.FileReader ;

import com.opencsv.bean.CsvToBean ;
import com.opencsv.bean.CsvToBeanBuilder ;

public class StateCensusAnalyser {

    public int loadStateCensusData (String csvFilePath) throws Exception{
        Reader reader = new FileReader(csvFilePath);

        CsvToBean<CSVStateCensus> csvToBean = new CsvToBeanBuilder<CSVStateCensus>(reader)
                .withType(CSVStateCensus.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        Iterator<CSVStateCensus> iterator = csvToBean.iterator();

        int recordCount = 0;
        while (iterator.hasNext()){
            CSVStateCensus censusData = iterator.next();
            recordCount++ ;
        }
        return recordCount ;
    }
}
