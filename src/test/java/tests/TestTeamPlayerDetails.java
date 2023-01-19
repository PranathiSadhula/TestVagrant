package tests;

import ipl.team.TeamServiceImpl;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestTeamPlayerDetails extends TeamServiceImpl {
   public SoftAssert softAssert = new SoftAssert();

    @BeforeClass
    public void submitTeamPlayerDetails(){
        String teamName = "RCB";
        String filePath = "Team"+teamName;
        readJsonFile(filePath);
        softAssert.assertNotNull(teamDetails,"Given ["+teamName+"] failed to fetch details from resources/json");
      //  Assert.assertNotNull("Given ["+teamName+"] failed to fetch details from resources/json",teamDetails);

    }

    @Test(description = "Test to Validate that team has only 4 Foriegn Players")
    public void validateTeamHasForiegnPlayersCount(/*@Optional("Foreign") String country, @Optional("4") int count*/){
        String country = "NonIndian";
        int count = 4;

        softAssert.assertEquals(count, countPlayersFrom(country));
    }

    @Test(description = "Test to Validate that team has atleast 1 wicket-keeper")
    public void validateTeamHasRolePlayer(/*@Optional("TeamRCB") String teamName, @Optional("Wicket-keeper") String role*/){

        countPlayersWho("Wicket-keeper");
        softAssert.assertTrue( countPlayersWho("Wicket-keeper") >= 1, "Given team expected to have atleast 1 wicket-keeper, but not found");
    }


    @AfterClass
    public void approveTeam(){
        softAssert.assertAll("Based on all validations, Team[RCB] is approved");
    }
}
