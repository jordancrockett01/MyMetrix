package baggins.frodo.metricconversion.math;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public enum Metric {
    TEMPERATURE("Temperature", 1),
    LENGTH("Length", 2),
    SPEED("Speed", 3),
    UNKNOWN("Unknown", -1);

    private String metric;
    private int sectionNumber;
    Metric(String metric, int number) {
        this.metric = metric;
        this.sectionNumber = number;
    }

    @Override
    public String toString() {
        return this.metric;
    }

    public static Metric parse(String metric) {
        for (Metric m : values()) {
            if (m.toString().equals(metric)) {
                return m;
            }
        }
        return UNKNOWN;
    }

    public static Metric parse(int sectionNumber) {
        for (Metric m : values()) {
            if (m.sectionNumber == sectionNumber) {
                return m;
            }
        }
        return UNKNOWN;
    }
}
