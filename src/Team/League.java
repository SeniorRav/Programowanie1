package Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League {
    private String name;
    private List<Team>teams;

    public League(String name) {
        this.name = name;
        teams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addTeam(Team team){
        if(!teams.contains(team)){
            System.out.println("Adding "+ team.getName()+ " to"+ name);
            return teams.add(team);
        }
        System.out.println("Team "+team.getName() + " alredy in league");
        return false;
    }

    public void printTable(){
        Collections.sort(teams);
        System.out.println(name + " tabela");
        for (Team team : teams){
            System.out.println(team.getName()  + " "+ team.getPoints());
        }



    }


}
