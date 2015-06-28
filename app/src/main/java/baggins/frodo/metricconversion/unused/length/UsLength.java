package baggins.frodo.metricconversion.unused.length;

import baggins.frodo.metricconversion.unused.IUnit;

/**
 * Created by Zach Sogolow on 6/26/2015.
 */
public enum UsLength implements IUnit {
        Mile("Mile"),
        Yard("Yard"),
        Foot("Foot"),
        Inch("Inch");

        private String type;
        private UsLength(String type) {
            this.type = type;
        }

        public String toString() {
            return type;
        }
}
