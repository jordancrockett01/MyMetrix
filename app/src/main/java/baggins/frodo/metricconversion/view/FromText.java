package baggins.frodo.metricconversion.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import baggins.frodo.metricconversion.view.listener.EditTextOnClickListener;
import baggins.frodo.metricconversion.view.listener.EditTextOnFocusChangedListener;
import baggins.frodo.metricconversion.view.listener.EditTextOnLongClickListener;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class FromText extends EditText {

    public FromText(Context context) {
        super(context);
        init(context);
    }

    public FromText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public FromText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context context) {
        this.setOnClickListener(new EditTextOnClickListener());
        this.setOnFocusChangeListener(new EditTextOnFocusChangedListener());
        this.setOnLongClickListener(new EditTextOnLongClickListener());
    }
}
