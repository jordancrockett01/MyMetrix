package baggins.frodo.metricconversion.view.listener;

import android.util.Log;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class EditTextOnEditorActionListener implements EditText.OnEditorActionListener {

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        Log.d("onEditorAction()", "" + actionId + ", " + event);

        if (actionId == 6) { //enter pressed

        }
        return false;
    }
}
