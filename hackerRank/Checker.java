package hackerRank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Checker implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.score == o2.score){
            return o1.name.compareTo(o2.name);
        }
        return ((Integer)o2.score).compareTo(o1.score);
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {

        int n = 5;

        Player[] player = new Player[n];
        Checker checker = new Checker();
/*amy 100
david 100
heraldo 50
aakansha 75
aleksa 150*/
        player[0] =  new Player("amy",100);
        player[1] =  new Player("david",100);
        player[2] =  new Player("heraldo",50);
        player[3] =  new Player("aakansha",75);
        player[4] =  new Player("aleksa",150);
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}