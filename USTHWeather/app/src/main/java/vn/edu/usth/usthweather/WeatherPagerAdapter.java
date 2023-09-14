package vn.edu.usth.usthweather;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WeatherPagerAdapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 3;
    private String titles[] = new String[] { "Hanoi", "Paris", "Toulouse" };

    public WeatherPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int page) {
        switch (page) {
            case 0:
                return new WeatherandForecastFragment();
            case 1:
                return new WeatherandForecastFragment();
            case 2:
                return new WeatherandForecastFragment();
            default:
                return null;
        }
    }
    public CharSequence getPageTitle(int page){
        return titles[page];
    }
}

