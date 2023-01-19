package ipl.team;

import com.fasterxml.jackson.databind.ObjectMapper;
import ipl.lib.json.objects.Team;

import java.io.File;
import java.io.IOException;

public abstract class JsonImpl implements IJsonService{
    @Override
    public void readJsonFile(String filePath) throws IOException {
        ObjectMapper objMapper = new ObjectMapper();
        Team teamDetails =objMapper.readValue(new File(filePath), Team.class);

    }

    public abstract int countPlayersFrom(String country);

    public  abstract int countPlayersWho(String role);

}
