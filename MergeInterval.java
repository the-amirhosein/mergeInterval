package mergeInterval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {

    public static List<Interval> merge(List<Interval> intervals) {

        if(intervals.size() == 0 || intervals.size() == 1)
            return intervals;

        intervals.sort(new IntervalComparator());

        Interval first = intervals.get(0);
        int start = first.getStart();
        int end = first.getEnd();

        ArrayList<Interval> result = new ArrayList<>();

        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            if (current.getStart() <= end) {
                end = Math.max(current.getEnd(), end);
            } else {
                result.add(new Interval(start, end));
                start = current.getStart();
                end = current.getEnd();
            }
        }

        result.add(new Interval(start, end));
        return result;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 8));
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(8, 12));
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(1, 9));
        intervals.add(new Interval(15, 29));
        System.out.println(merge(intervals));;
    }
}

class IntervalComparator implements Comparator<Interval>
{
    public int compare(Interval i1, Interval i2)
    {
        return i1.getStart() - i2.getStart();
    }
}
