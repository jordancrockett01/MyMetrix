package baggins.frodo.metricconversion.view.listener;

import android.util.Log;
import android.view.View;

import baggins.frodo.metricconversion.view.FromText;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class EditTextOnClickListener implements View.OnClickListener{
    @Override
    public void onClick(View v) {
        Log.d("FromTextOnClickListener", v.toString());
    }
}
