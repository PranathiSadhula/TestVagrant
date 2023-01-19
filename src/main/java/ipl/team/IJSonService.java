package  ipl.team;

import java.io.IOException;

public interface IJSonService {
    /**
     * This method used to read the JSON file
     * @param filePath - helps to load the team details`
     * @author PranathiSadhula
     */
    void readJsonFile(String filePath) throws IOException ;
}
