# TestVagrant_Assignment

<h2>Problem Statement:</h2>
<ul>
<li>1. Write test to validate that the team has only 4 foreign players</li>
<li>2. Write test to validate that their is atleast 1 wicket keeper </li>
</ul>

## Libraries Used 

<table>
<thead align="left">
    <tr >
    <td><b>Dependency</b></td>
      <td><b>Version</b></td>
      <td><b>Feature</b></td>
    </tr>
</thead>
<tbody>
    <tr>
      <td><b>Java</b></td>
      <td><b>19</b></td>
      <td><b>Programming languages</b></td>
    </tr>
    <tr>
      <td><b>TestNG</b></td>
      <td><b>7.6.1</b></td>
      <td><b>Test cases</b></td>
    </tr>
    <tr>
      <td><b>jackson-databind</b></td>
      <td><b>2.14.1</b></td>
      <td><b>JSON Object Mapper to convert JSON object to Pojo Class Object</b></td>
    </tr>
 <tr>
      <td><b>lombok</b></td>
      <td><b>1.18.24</b></td>
      <td><b>Annotations used to enable a Pojo class with getters and getters</b></td>
    </tr>
    
  </tbody>
</table>

<h2>Design Principles</h2>
<table>
<thead align="left">
    <tr >
    <td><b>OOPs Concept</b></td>
      <td><b>Implementation</b></td>
      <td><b>Advantages</b></td>
    </tr>
</thead>
<tbody>
    <tr>
      <td><b>Interface</b></td>
      <td><b>IJsonService.java</b></td>
      <td><b>Overriden methods gives capability to have runtime(dynamic) Polymorphism</b></td>
    </tr>
    <tr>
      <td><b>Abstract Class</b></td>
      <td><b>PlayerServiceImpl.java</b></td>
      <td><b>This abstract class having abstract methods making it very dynamic keeping future enhancements in mind</b></td>
    </tr>
    <tr>
      <td><b>Inheritence</b></td>
      <td><b>TeamServiceImpl.java</b></td>
      <td><b>By implementing IJsonService.java and extending PlayerServiceImpl.java, this class gives framework flexibility implement overriden methods and also to overload those methods</b></td>
    </tr>
 <tr>
      <td><b>Java 8 concepts</b></td>
      <td><b>Streams</b></td>
      <td><b>Used to collect Objects as Arrays streams, apply filters, return distinct elements, count of elements</b></td>
    </tr>
 <tr>
      <td><b>java.nio.file.Path</b></td>
      <td><b>Paths.get("src", "test", "resources")</b></td>
      <td><b>Used to get a path based on the folder name,filter files based on fileName</b></td>
    </tr>

   

  </tbody>
</table>
<h2>Project Structure</h2>
<ul>
    <li><b>src/main/java</b>
        <ol>ipl.lib.json.objects.Player.java<br>ipl.lib.json.objectsTeam.java
</ol>  
 <ol>ipl.team.IJsonServiceImpl.java
</ol> 
 <ol>ipl.team.PlayerServiceImpl.java
</ol>
 <ol>ipl.team.teamServiceImpl.java
</ol>
</li>

</ul>
<ul>
    <li><b>src/test/java</b>
        <ol>
</ol>  
 
 <ol>tests.TestTeamPlayerDetails.java</ol>
</li>

</ul>
<h2>Testcase Design</h2>
<table>
<thead align="left">
    <tr >
    <td ><b>TestNG Annotation</b></td>
      <td><b>Method</b></td>
      <td><b>Implementation Purpose</b></td>
    </tr>
</thead>
<tbody>
    <tr>
      <td><b>BeforeClass</b></td>
      <td><b>submitTeamPlayerDetails</b></td>
      <td><b>This method executes once for all those @Test methods in this class. So, submitting TeamRCB.json file logic is handle here so that teamRCB data is available for all testcases related to Team RCB</b></td>
    </tr>
    <tr>
      <td><b>Test</b></td>
      <td><b>validateTeamHasForeignPlayersCount</b></td>
      <td><b>This Testcase is to validate if team is having expected foreign players</b></td>
    </tr>
    <tr>
      <td><b>Test</b></td>
      <td><b>validateTeamHasRolePlayer</b></td>
      <td><b>This Testcase is to validate if team is having expected wicket-keeping players </b></td>
    </tr>
 <tr>
      <td><b>AfterClass</b></td>
      <td><b>approveTeam</b></td>
      <td><b>This method executes once after all test cases executed in this class scope. Soft assertion is handled here to validate the team submitted to approve without any issues</b></td>
    </tr>

  </tbody>
</table>

<h2>Test Exectuion</h2>
<table>
<thead>
<th>
   Mode Of Execution
</th>
<th>
    Steps to Execute
</th>

</thead>
<tbody>
<tr>
<td>TestNG : @Test method</td>
<td>Right click on @Test method, execute. </td>
</tr>
<tr>
<td>Maven command</td>
<td>mvn clean test</td>

</tr>
</tbody>
</table>

<h2>Test Reports</h2>
<table>
<thead>
<th>
   Tests Reports
</th>
<th>
    Location
</th>

</thead>
<tbody>
<td>TestNG Reports</td>
<td>target/surefire-reports/</td><tr>
</tr>


</tbody>
</table>