package behavioural.strategy;

import java.util.Comparator;

public class RatingComparator implements Comparator<Team> {
    @Override
    public int compare(Team o1, Team o2) {
        return o1.getRating()-o2.getRating();
    }
}
