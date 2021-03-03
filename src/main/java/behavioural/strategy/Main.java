package behavioural.strategy;

import java.util.ArrayList;
import java.util.List;

//reference: https://www.codiwan.com/strategy-design-pattern-real-world-example-java/#real-world-examples
public class Main {

    public static void main(String[] args) {
        Team t1 = new Team();
        t1.setGoal(2);
        t1.setName("TestTeam");
        t1.setRating(5);

        Team t2 = new Team();
        t2.setName("Ans");
        t2.setRating(4);
        t2.setGoal(3);

        List<Team> teams = new ArrayList<>();
        teams.add(t1);
        teams.add(t2);

        teams.sort(new NameComparator());
        for (Team team : teams) {
            System.out.print(team.getName() + " ");
        }
        System.out.println();
        teams.sort(new GoalDifferenceComparator());
        for (Team team : teams) {
            System.out.print(team.getName()+ " ");
        }
    }
}
