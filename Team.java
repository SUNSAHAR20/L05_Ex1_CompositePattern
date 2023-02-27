import java.util.ArrayList;
import java.util.List;

public class Team implements TeamInterface {
  private List<TeamInterface> subTeams;

  public Team() {
      this.subTeams = new ArrayList<>();
  }
  public void add(TeamInterface team) {
      subTeams.add(team);
  }
  public void remove(TeamInterface team) {
      subTeams.remove(team);
  }
  public List<TeamInterface> getSubTeams() {
      return subTeams;
  }
  @Override
  public void deploy() {
      System.out.println("\n-->Deploying a Team\n");
      for (TeamInterface team : subTeams) {
          team.deploy();
      }
      System.out.println("");
  }
}
