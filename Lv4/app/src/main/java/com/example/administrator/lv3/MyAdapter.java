package com.example.administrator.lv3;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by Administrator on 2015/7/30.
 */
public class MyAdapter extends FragmentPagerAdapter {
    final int num = 10;
    private String title[] = new String[]{"吴随","饶东","曾名杨","徐书展","郑昱旋","曹越","叶学姐","TNT","凌霄","朱大"};
    private Context context;
    public  String key = "key";

    public MyAdapter(FragmentManager fm,Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int NowPage) {
        Bundle bundle = new Bundle();
        bundle.putInt(key,NowPage);
        FragmentOne fragmentOne = new FragmentOne();
        fragmentOne.setArguments(bundle);
        return fragmentOne;
    }
    @Override
    public int getCount() {
        return num;
    }
    @Override
    public CharSequence getPageTitle(int num) {
        return title[num];
    }
}