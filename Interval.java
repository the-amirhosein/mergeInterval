package mergeInterval;

class Interval {
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
}