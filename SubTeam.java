import java.util.ArrayList;
import java.util.List;

public class SubTeam implements TeamInterface {
  private List<TeamInterface> subTeams;

  public SubTeam() {
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
    System.out.println("---->Deploying a SubTeam");
        for (TeamInterface team : subTeams) {
        team.deploy();
      }
      System.out.println("");
  }
}
