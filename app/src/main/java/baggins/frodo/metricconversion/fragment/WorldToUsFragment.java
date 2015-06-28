package baggins.frodo.metricconversion.fragment;

import android.os.Bundle;
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
public class WorldToUsFragment extends ConversionFragment {

    public static WorldToUsFragment newInstance(Metric metric) {
        WorldToUsFragment fragment = new WorldToUsFragment();
        Bundle args = new Bundle();
        args.putString(METRIC, metric.toString());
        fragment.setArguments(args);
        return fragment;
    }

    public WorldToUsFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.world_to_us_frag, container, false);
        TextView textView = (TextView) layout.findViewById(R.id.text_view_worldUs);
        textView.setText("");

        fromText = (FromText) layout.findViewById(R.id.from_text_field);
        toText = (ToText) layout.findViewById(R.id.to_text_field);

        fromDropDown = (Spinner) layout.findViewById(R.id.from_drop_down);
        toDropDown = (Spinner) layout.findViewById(R.id.to_drop_down);

        convertButton = (Button) layout.findViewById(R.id.convert_button);

        String metricString = getArguments().getString(METRIC);
        Metric m = Metric.parse(metricString);

        myMetric = m;

        int resId = -1;
        switch (m) {
            case TEMPERATURE:
                resId = R.array.all_temp_array;
                break;
            case LENGTH:
                resId = R.array.all_length_array;
                break;
            case SPEED:
                resId = R.array.all_speed_array;
                break;
            case UNKNOWN:
                break;
        }
        setAdapter(resId, fromDropDown);
        setAdapter(resId, toDropDown);
        return layout;
    }
}