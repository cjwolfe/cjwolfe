import java.util.ArrayList;
public class SwissSimulator{
    
    
    public void displayResults(Swiss tournament){

    }

    public int[] createRecord(int win, int draw, int loss){
        return new int[] {win,draw,loss};
    }

    public static void main(String[] args){
        // game
        // round
        // player

        // create a tournament with 64 players
        // create a random pairing for each player
        // TODO: odd number of tournaments create buys

        Swiss tournament = new Swiss();


    }
}

class Swiss{
    public static ArrayList playersList = new ArrayList<Player>();
    int numRounds;
    int numPlayers;
    int tgtPodSize;




}

class Player{
    byte wins;
    byte draws;
    byte losses;
    String name;


    public Player(int[] record, String name){
        record[0] = this.wins;
        record[1] = this.draws;
        record[2] = this.losses;
        this.name = name;

    }
    
}


// class pod{

// }