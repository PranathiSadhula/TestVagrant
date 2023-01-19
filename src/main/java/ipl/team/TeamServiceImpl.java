package ipl.team;

import com.fasterxml.jackson.databind.ObjectMapper;

import ipl.lib.json.objects.Team;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class TeamServiceImpl extends PlayerServiceImpl implements IJSonService {
    public static Team teamDetails;

    @Override
    public void readJsonFile(String fileName) {
        try {
            Path resourcesDir = Paths.get("src", "test", "resources");
            String path = resourcesDir.toAbsolutePath().toFile().getCanonicalPath();
            ObjectMapper objMapper = new ObjectMapper();
            String filePath = Arrays.stream(resourcesDir.toFile().list()).filter(filena -> filena.contains(fileName)).findAny().get().toString();
            teamDetails = objMapper.readValue(new File(path + "/" + filePath), Team.class);
        } catch (IOException e) {
            throw new RuntimeException("Unable to read provided json file " + fileName);
        }

    }

    @Override
    public int countPlayersFrom(String country) {
        country = country.toLowerCase();
        if (country.equalsIgnoreCase("foreign") || country.equalsIgnoreCase("nonindian")) {
            return countPlayersFrom(false, "India");
        }
        return countPlayersFrom(true, country); //true, nonindian
    }

    public int countPlayersFrom(boolean notFromGivenCountry, String country) {
        int count = 0;
        if (notFromGivenCountry)
            return (int) teamDetails.getPlayer().stream().filter(player -> player.getCountry().equalsIgnoreCase(country)).count();
        else
           /* for(Player eachPlayer : teamDetails.getPlayer()){
                if(!eachPlayer.getCountry().equalsIgnoreCase(country)) count++;
            }*/
           return (int) teamDetails.getPlayer().stream().filter(player -> !player.getCountry().equalsIgnoreCase(country)).count();
       // return count;
    }

    @Override
    public int countPlayersWho(String role) {
        return countPlayersWho(true, role);
    }

    public int countPlayersWho(boolean whoseRoleIsNot, String role) {
        if (whoseRoleIsNot)
            return (int) teamDetails.getPlayer().stream().filter(player -> !player.getRole().equals(role)).count();
        else
            return (int) teamDetails.getPlayer().stream().filter(player -> player.getRole().equals(role)).count();
    }

}
