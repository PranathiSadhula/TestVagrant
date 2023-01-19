package  ipl.team;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public interface ITeamService {
    /**
     * This method used to read the JSON file
     * @param filePath - helps to load the team details`
     * @return type void
     * @author PranathiSadhula
     * @throws ParserConfigurationException
     */
    public void readJsonFile(String filePath) throws IOException ;
}
