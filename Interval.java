package mergeInterval;

import java.util.Comparator;

class Interval implements Comparator<Interval> {
    private int start;
    private int end;

    Interval(int s, int e) {
        start = s;
        end = e;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    @Override
    public int compare(Interval i1, Interval i2) {
        return i1.getStart() - i2.getStart();

    }
}