package baggins.frodo.metricconversion.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import baggins.frodo.metricconversion.R;
import baggins.frodo.metricconversion.math.Metric;
import baggins.frodo.metricconversion.view.FromText;
import baggins.frodo.metricconversion.view.ToText;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class UsToWorldFragment extends ConversionFragment {

    public static UsToWorldFragment newInstance(Metric metric) {
        UsToWorldFragment fragment = new UsToWorldFragment();
        Bundle args = new Bundle();
        args.putString(METRIC, metric.toString());
        fragment.setArguments(args);
        return fragment;
    }

    public UsToWorldFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("UsToWorldFragment", "onCreateView()");
        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.us_to_world_frag, container, false);
        TextView textView = (TextView) layout.findViewById(R.id.text_view_usWorld);
        textView.setText("");

        fromText = (FromText) layout.findViewById(R.id.from_text_field);
        toText = (ToText) layout.findViewById(R.id.to_text_field);

        fromDropDown = (Spinner)layout.findViewById(R.id.from_drop_down);
        toDropDown = (Spinner)layout.findViewById(R.id.to_drop_down);

        convertButton = (Button)layout.findViewById(R.id.convert_button);

        String metricString = getArguments().getString(METRIC);
        Metric m = Metric.parse(metricString);
        myMetric = m;
        int usResId = -1;
        int wResId = -1;
        switch (m) {
            case TEMPERATURE:
                usResId = R.array.us_temp_array;
                wResId = R.array.world_temp_array;
                break;
            case LENGTH:
                usResId = R.array.us_length_array;
                wResId = R.array.world_length_array;
                break;
            case SPEED:
                usResId = R.array.us_speed_array;
                wResId = R.array.world_speed_array;
                break;
            case UNKNOWN:
                break;
        }
        setAdapter(usResId, fromDropDown);
        setAdapter(wResId, toDropDown);

        return layout;
    }
}
