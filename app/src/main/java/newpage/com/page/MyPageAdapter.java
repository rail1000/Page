package newpage.com.page;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {
    public MyPageAdapter(FragmentManager manager){
        super(manager);

    }

    //
    @Override
    public Fragment getItem(int i) {
        if(i == 0){
            return new FirstFragment();
        }else if(i == 1){
            return new SecondFragment();
        }
        else {
            return new ThisrFragment();

        }

    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "first";

        }
        else if(position == 1){
            return "second";

        }
        else {
            return "Third";

        }

        //return "Title"+position;
    }

    @Override
    //管理内容个数
    public int getCount() {
        return 3;
    }
}
