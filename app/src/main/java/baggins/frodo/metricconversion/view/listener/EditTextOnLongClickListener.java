package baggins.frodo.metricconversion.view.listener;

import android.util.Log;
import android.view.View;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class EditTextOnLongClickListener implements View.OnLongClickListener {
    @Override
    public boolean onLongClick(View v) {
        Log.d("onLongClick", "longClick");
        return false;
    }
}
