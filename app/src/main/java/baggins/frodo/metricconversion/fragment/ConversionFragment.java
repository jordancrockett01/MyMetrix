package baggins.frodo.metricconversion.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

import baggins.frodo.metricconversion.math.MathLibrary;
import baggins.frodo.metricconversion.math.Unit;
import baggins.frodo.metricconversion.math.Metric;
import baggins.frodo.metricconversion.view.FromText;
import baggins.frodo.metricconversion.view.ToText;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public abstract class ConversionFragment extends Fragment {
    static final String METRIC = "Metric";

    protected Metric myMetric;
    protected FromText fromText;
    protected ToText toText;

    protected Spinner fromDropDown;
    protected Spinner toDropDown;

    protected Button convertButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        fromText.addTextChangedListener(new FromTextWatcher());
        fromText.setOnEditorActionListener(new OnDoneTypingClicked());
        convertButton.setOnClickListener(new ConvertListener());
    }

    public void setAdapter(int resID, Spinner spinner) {
        ArrayAdapter<CharSequence> usAdapter = ArrayAdapter.createFromResource(getActivity(),
                resID, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        usAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(usAdapter);
        spinner.setOnItemSelectedListener(new OnSpinnerItemSelected());
    }

    public String getFromText() {
        return fromText.getText().toString();
    }

    public String getToText() {
        return toText.getText().toString();
    }

    public String getFromUnit() {
        return fromDropDown.getSelectedItem().toString();
    }

    public String getToUnit() {
        return toDropDown.getSelectedItem().toString();
    }

    public String getFormattedConversion(String fromUnitStr, String toUnitStr, String number) {
        double fromNum = 0;
        if (!number.equals("") && !number.equals(".")) {
            fromNum = Double.parseDouble(number);
        } else if (number.equals("")) {
            return "";
        }
        Unit fromUnit = Unit.parse(fromUnitStr);
        Unit toUnit = Unit.parse(toUnitStr);
        double converted = MathLibrary.convert2(myMetric, fromUnit, toUnit, fromNum);
        DecimalFormat df = new DecimalFormat("0.########");
        String formatted = df.format(converted);
        return formatted;
    }

    protected class ConvertListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
//            InputMethodManager inputManager = (InputMethodManager)
//                    getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
//
//            inputManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(),
//                    InputMethodManager.HIDE_NOT_ALWAYS);
            String formatted2 = getFormattedConversion(getFromUnit(), getToUnit(), getFromText());
            toText.setText(formatted2);
        }
    }

    protected class OnDoneTypingClicked implements EditText.OnEditorActionListener {

        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            if (actionId == 6) {
                String formatted2 = getFormattedConversion(getFromUnit(), getToUnit(), getFromText());
                toText.setText(formatted2);
            }
            return false;
        }
    }

    protected class OnSpinnerItemSelected implements AdapterView.OnItemSelectedListener {
        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String formatted2 = getFormattedConversion(getFromUnit(), getToUnit(), getFromText());
            toText.setText(formatted2);
        }
    }

    protected class FromTextWatcher implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            String formatted2 = getFormattedConversion(getFromUnit(), getToUnit(), getFromText());
            toText.setText(formatted2);
        }
    }
}
