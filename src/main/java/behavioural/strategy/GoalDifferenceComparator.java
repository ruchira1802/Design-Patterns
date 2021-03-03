package behavioural.strategy;

import java.util.Comparator;

public class GoalDifferenceComparator implements Comparator<Team> {
    @Override
    public int compare(Team o1, Team o2) {
        return o1.getGoal()-o2.getGoal();
    }
}
