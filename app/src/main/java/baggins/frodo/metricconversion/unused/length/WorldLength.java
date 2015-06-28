package baggins.frodo.metricconversion.unused.length;

import baggins.frodo.metricconversion.unused.IUnit;

/**
 * Created by Zach Sogolow on 6/26/2015.
 */
public enum WorldLength implements IUnit {
        KM("Kilometer"),
        M("Meter"),
        CM("Centimeter"),
        MM("Millimeter");

        private String type;
        private WorldLength(String type) {
            this.type = type;
        }

        public String toString() {
            return type;
        }
    }