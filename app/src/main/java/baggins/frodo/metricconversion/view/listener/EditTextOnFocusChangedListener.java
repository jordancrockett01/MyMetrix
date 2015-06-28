package baggins.frodo.metricconversion.view.listener;

import android.util.Log;
import android.view.View;

import baggins.frodo.metricconversion.view.FromText;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class EditTextOnFocusChangedListener implements View.OnFocusChangeListener {

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        Log.d("onFocusChange()", "" + hasFocus);
    }
}
