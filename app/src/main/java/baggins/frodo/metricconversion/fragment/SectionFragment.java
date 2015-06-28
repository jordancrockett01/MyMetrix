package baggins.frodo.metricconversion.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import java.util.Vector;

import baggins.frodo.metricconversion.R;
import baggins.frodo.metricconversion.activity.HomeActivity;
import baggins.frodo.metricconversion.math.Metric;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class SectionFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static SectionFragment newInstance(int sectionNumber) {
        SectionFragment fragment = new SectionFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public SectionFragment() {
    }

    public static final int NUM_ITEMS = 2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("SectionFragment", "onCreateView()");
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        Bundle args = getArguments();
        int sectionNumber = args.getInt(ARG_SECTION_NUMBER);
        Metric metric = Metric.parse(sectionNumber);
        final ViewPager viewPager = (ViewPager) rootView.findViewById(R.id.pager);
        initPages(rootView, metric);
        viewPager.setCurrentItem(0);

        // Watch for button clicks.
//        Button button = (Button)rootView.findViewById(R.id.goto_first);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                viewPager.setCurrentItem(0);
//            }
//        });
//        button = (Button)rootView.findViewById(R.id.goto_last);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                viewPager.setCurrentItem(NUM_ITEMS - 1);
//            }
//        });



        return rootView;
    }

    private void initPages(View rootView, Metric metric) {
        List<Fragment> fragments = new Vector<>();
        fragments.add(WorldToUsFragment.newInstance(metric));
        fragments.add(UsToWorldFragment.newInstance(metric));
//            fragments.add(Fragment.instantiate(getActivity(), UsToWorldFragment.class.getName()));
//            fragments.add(Fragment.instantiate(getActivity(), WorldToUsFragment.class.getName()));
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getChildFragmentManager(), fragments);
        ((ViewPager)rootView.findViewById(R.id.pager)).setAdapter(pagerAdapter);
    }
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((HomeActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}