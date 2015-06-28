package baggins.frodo.metricconversion.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class ToText extends EditText {


    public ToText(Context context) {
        super(context);
        init();
    }

    public ToText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ToText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {

    }
}
