package Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeagueTeam<T extends Team> {
    private String name;
    private List<T>teams;

    public LeagueTeam(String name) {
        this.name = name;
        teams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addTeam(T team){
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
        for (T team : teams){
            System.out.println(team.getName()  + " "+team.getPoints());
        }
    }

    public List<T> getTeams() {
        return teams;
    }

    public void printTableByStream (){
        Collections.sort(teams);
        System.out.println(name + " tabela");
        teams.stream().forEach(x->System.out.println(
                x.getName()+ " "+ x.getPoints()));
    }
}
