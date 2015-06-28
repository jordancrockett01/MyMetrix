package baggins.frodo.metricconversion.unused;

import baggins.frodo.metricconversion.activity.HomeActivity;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class ConvertContext implements IConvertContext {
    IConverter currentConverter = null;
    HomeActivity activity = null;

    public ConvertContext(HomeActivity activity) {
        this.activity = activity;
    }

    public void setConverter(IConverter converter) {
        this.currentConverter = converter;
    }


}
