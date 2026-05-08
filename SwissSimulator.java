import java.util.ArrayList;
public class SwissSimulator{
    public static String[] names = new String[] {
        "Eve Spears",        "Ameer Shields",        "Analia Mayer",
        "Yahir Crawford",        "Aubree Carrillo",        "Wade Robbins",        
        "Stevie Jaramillo",        "Riggs Navarro",        "Winter Alexander",
        "Kingston Hancock",        "Katelyn French",        "Corey Chen",
        "Valeria Macias",        "Moshe Felix",        "Paisleigh Mueller",
        "Albert Kaur",        "Holland Vargas",        "Ryker Fox",
        "Juliette Schultz",        "Cody Matthews",        "Lila Weber",
        "Crew Mahoney",        "Promise Levy",        "Harold Payne",
        "London Morrison",        "Maximus Reilly",        "Tori Hancock",
        "Rex Vo",        "Artemis Lowe",        "Julius Foley",
        "Zaylee Correa",        "Zakai Huang",        "Francesca Barnett",
        "Stephen Thomas",        "Elizabeth Madden",        "Everest Gonzalez",
        "Abigail Moody",        "Ryland Espinosa",        "Braylee Acosta",
        "Jensen Pollard",        "Marisol Carr",        "Kash Wallace",
        "Arianna Ryan",        "Timothy Coffey",        "Paola Hurley",
        "Van Wilkins",        "Amalia Raymond",        "Maurice Kirk",
        "Ellis Carlson",        "Paul Melendez",        "Bethany Hart",
        "Joel Conway",        "Ryann Webster",        "Shawn Wade",
        "Evie Ashley",        "Kylen Steele",        "Rylie Fischer",
        "Leonidas Ware",        "Eileen Sloan",        "Ocean Whitehead",
        "Sylvie Donovan",        "Brayan Barajas",        "Keilani McLaughlin",
        "Ibrahim Duarte",
    };
    
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

        ArrayList<Player> participants = new ArrayList<Player>();

        for(int i = 0; i < 64; i++){
            Player newPlayer = new Player(names[i]);
            participants.add(newPlayer);
        }

        Swiss tournament = new Swiss(participants);

        tournament.runRound();


    }
}

class Swiss{
    public static ArrayList playersList = new ArrayList<Player>();
    int numRounds;
    int numPlayers;
    int tgtPodSize;
    int round;

    public Swiss(ArrayList<Player> players){
        this.numPlayers = players.size();
        this.numRounds = determineRounds(numPlayers);
    }

    private int determineRounds(int numPlayers){
        int ans = -1;
        if(numPlayers < 8){
            ans = 3;
        } else {
            ans = (int) Math.log(numPlayers);
        }

        return ans;
    }

    /**
     * Runs one round of tournament play.
     */
    public void runRound(){

        System.out.println("The tournament will now begin round number " + this.round);
        
        
    }

    public void nextRound(){
        if(round > numRounds){
            System.out.println("Incorrect number of rounds run");
            return;
        } 
        round++;
        // each player gets their results of the round, each match is played/ each group of n players creates an end result
        // for(Player p : playersList){
        //     p.playWith(q,r,s)
        // }
        // match results update ratios/tiebreakers
        // 

        
    };

    

}

class Player{
    byte wins;
    byte draws;
    byte losses;
    String name;
    public Player(String name){
        this.wins = this.draws = this.losses = 0;
        this.name = name;

    }

    public Player(int[] record, String name){
        record[0] = this.wins;
        record[1] = this.draws;
        record[2] = this.losses;
        this.name = name;

    }
    public Player(byte wins, byte draws, byte losses, String name){
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
        this.name = name;

    }
    
}


// class pod{

// }