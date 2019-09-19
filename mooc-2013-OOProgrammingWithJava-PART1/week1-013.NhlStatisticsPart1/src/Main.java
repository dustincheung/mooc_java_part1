
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        //print the top ten players based on goals
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("");
        //print the top 25 players based on penalty amounts
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("");
        //print the statistics for Sidney Crosby
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("");
        //Print the statistics for Philadelphia Flyers
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        System.out.println("");
        //Print the players in Anaheim Ducks ordered by points
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
    }
}
