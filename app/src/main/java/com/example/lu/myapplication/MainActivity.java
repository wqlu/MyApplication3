package com.example.lu.myapplication;

import android.os.Handler;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private Toolbar mToolBar;
    private FragmentTabHost mTableHost;
    private Class[] fragments = new Class[] {HomeFragment.class, CertificateFragment.class, NoticeFragment.class, ProfileFragment.class};
    private int[] imageResIds = new int[]{R.drawable.home_tab, R.drawable.certificate_tab, R.drawable.notice_tab, R.drawable.profile_tab};
    private String[] tags = new String[]{"home", "certificate", "notice", "profile"};
    private String[] titles = new String[]{"首页", "凭证", "公示", "我的"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolBar = (Toolbar) findViewById(R.id.toobar);
        setSupportActionBar(mToolBar);

        mTableHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTableHost.setup(this, getSupportFragmentManager(), R.id.realcontent);

        for (int i = 0; i < fragments.length; i++) {
            // 相当于每一个分页
            TabHost.TabSpec tabSpec = mTableHost.newTabSpec(tags[i]).setIndicator(getTabItemView(i));
            mTableHost.addTab(tabSpec,fragments[i], null);
        }

    }



    private View getTabItemView(int i) {
        View view = LayoutInflater.from(this).inflate(R.layout.tab_item, null);
        ImageView imageView = view.findViewById(R.id.tab_image);
        TextView textView = view.findViewById(R.id.tab_text);
        imageView.setImageResource(imageResIds[i]);
        textView.setText(titles[i]);
        return view;
    }
}
