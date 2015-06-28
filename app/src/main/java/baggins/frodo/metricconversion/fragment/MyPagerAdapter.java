package baggins.frodo.metricconversion.fragment;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

import java.util.List;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;

    public MyPagerAdapter(FragmentManager supportFragmentManager, List<Fragment> fragments) {
        super(supportFragmentManager);
        this.fragments = fragments;
    }

    @Override
    public int getCount() {
        return this.fragments.size();
    }

    @Override
    public void destroyItem(View arg0, int arg1, Object arg2) {
        ((ViewPager) arg0).removeView((View) arg2);
    }

    @Override
    public Parcelable saveState() {
        return null;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        String[] titles = { "World", "Us" };
        return String.format(titles[position]);
    }

    @Override
    public Fragment getItem(int position) {
        Log.d("MyPageAdapter", "getItem()");
        return fragments.get(position);
    }
}