package Association;

import java.util.ArrayList;
import java.util.List;

public class Aggregation {
    public static void main(String[] args) {
        Player player1=new Player("Alice");
        Player player2=new Player("Bob");

        Team team=new Team("Dream Team");
        team.addPlayer(player1);
        team.addPlayer(player2);

        System.out.println("Players in "+team.getPlayers());
        for (Player player: team.getPlayers()){
            System.out.println(player.getPlayerName());
        }
    }
}
class Player{
    private String playerName;
    public Player(String name){
        this.playerName=name;
    }
    public String getPlayerName(){
        return playerName;
    }
}
class Team{
    private String teamName;
    private List<Player>players=new ArrayList<>();
    public Team(String name){
        this.teamName=name;
    }
    public void addPlayer(Player player){
        players.add(player);
    }
    public List<Player>getPlayers(){
        return players;
    }
}