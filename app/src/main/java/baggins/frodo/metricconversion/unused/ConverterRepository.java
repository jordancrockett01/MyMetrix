package baggins.frodo.metricconversion.unused;

import baggins.frodo.metricconversion.activity.HomeActivity;
import baggins.frodo.metricconversion.unused.length.LengthConverter;
import baggins.frodo.metricconversion.unused.speed.SpeedConverter;
import baggins.frodo.metricconversion.unused.temperature.TempConverter;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class ConverterRepository {

    public static IConverter newInstance(HomeActivity activity, String section) {
        IConverter converter = null;

        switch (section) {
            case HomeActivity.TEMP_SECTION:
                converter = new TempConverter(activity);
                break;
            case HomeActivity.LENGTH_SECTION:
                converter = new LengthConverter(activity);
                break;
            case HomeActivity.SPEED_SECTION:
                converter = new SpeedConverter(activity);
                break;
            default:
                converter = null;
                break;
        }
        return converter;
    }

}
