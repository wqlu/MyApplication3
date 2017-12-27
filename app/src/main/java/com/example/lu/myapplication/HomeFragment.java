package com.example.lu.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends ListFragment {

    private XListView mListView;
    private MainAdapter mainAdapter;
    private List<News.NewsListBean> datas;
    private Handler mHandler;
    private String s= "{\n" +
            "  \"NewsList\": [\n" +
            "    {\n" +
            "      \"NewsId\": \"9437c278-296b-43a2-a0a6-e81f9618fd23\",\n" +
            "      \"Title\": \"参观考察活动\",\n" +
            "      \"Abstract\": \"\",\n" +
            "      \"ImageUrl\": \"http://182.254.152.65:8000/Upload/News/20160523190004251.png\",\n" +
            "      \"PublishDate\": \"2016-05-23\",\n" +
            "      \"Author\": \"admin\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"NewsId\": \"dfa499f0-0f7c-41b8-8b92-c9844861d321\",\n" +
            "      \"Title\": \"春的锣鼓，为五月太阳盛会敲响\",\n" +
            "      \"Abstract\": \"\",\n" +
            "      \"ImageUrl\": \"http://182.254.152.65:8000/Upload/News/20160523185952089.png\",\n" +
            "      \"PublishDate\": \"2016-05-23\",\n" +
            "      \"Author\": \"admin\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"NewsId\": \"6e40e0a9-ed93-436b-8794-55d0cf1e60d3\",\n" +
            "      \"Title\": \"阳光恩典砺风雨 绿色征程创新篇”　SNEC十周年新闻讲坛会在上海传媒大厦召开\",\n" +
            "      \"Abstract\": \"\",\n" +
            "      \"ImageUrl\": \"http://182.254.152.65:8000/Upload/News/20160523185938792.png\",\n" +
            "      \"PublishDate\": \"2016-05-23\",\n" +
            "      \"Author\": \"admin\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"NewsId\": \"7cc140b8-7892-4883-ab55-44cb6e5565fd\",\n" +
            "      \"Title\": \"江苏军团”将亮相上海国际太阳能产业展\",\n" +
            "      \"Abstract\": \"\",\n" +
            "      \"ImageUrl\": \"http://182.254.152.65:8000/Upload/News/20160523185925673.png\",\n" +
            "      \"PublishDate\": \"2016-05-23\",\n" +
            "      \"Author\": \"admin\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"NewsId\": \"10cc028d-8bb5-4201-b9cc-29a2945ce9b9\",\n" +
            "      \"Title\": \"我国光伏发电装机容量已超德国 分布式光伏发展迅速\",\n" +
            "      \"Abstract\": \"\",\n" +
            "      \"ImageUrl\": \"http://182.254.152.65:8000/Upload/News/20160523185911589.png\",\n" +
            "      \"PublishDate\": \"2016-05-23\",\n" +
            "      \"Author\": \"admin\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"NewsId\": \"699ed4cb-4392-427c-8b6b-835acfe7ab31\",\n" +
            "      \"Title\": \"新机遇新挑战机遇 SNEC亮点提前看\",\n" +
            "      \"Abstract\": \"\",\n" +
            "      \"ImageUrl\": \"http://182.254.152.65:8000/Upload/News/20160523185859083.png\",\n" +
            "      \"PublishDate\": \"2016-05-23\",\n" +
            "      \"Author\": \"admin\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"NewsId\": \"b24b8a3d-9bec-4fdf-84f7-c5dfd68ee81d\",\n" +
            "      \"Title\": \"林洋新能源受邀参加SNEC十周年纪念新闻讲坛会共商光伏行业发展\",\n" +
            "      \"Abstract\": \"\",\n" +
            "      \"ImageUrl\": \"http://182.254.152.65:8000/Upload/News/20160523185841795.png\",\n" +
            "      \"PublishDate\": \"2016-05-23\",\n" +
            "      \"Author\": \"admin\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"NewsId\": \"e8ba87da-b57f-4f02-bce2-e42afefb2321\",\n" +
            "      \"Title\": \"最新数据：日本市场单晶占比继续下滑到29%\",\n" +
            "      \"Abstract\": \"\",\n" +
            "      \"ImageUrl\": \"http://182.254.152.65:8000/Upload/News/20160523185821450.png\",\n" +
            "      \"PublishDate\": \"2016-05-23\",\n" +
            "      \"Author\": \"admin\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"NewsId\": \"59ab7fde-6017-47ec-b749-288a9a0c2770\",\n" +
            "      \"Title\": \"林洋集团总裁陆永华考察浙江同景新能源集团布局农光互补分布式光伏电站战略\",\n" +
            "      \"Abstract\": \"\",\n" +
            "      \"ImageUrl\": \"http://182.254.152.65:8000/Upload/News/20160523185803865.png\",\n" +
            "      \"PublishDate\": \"2016-05-23\",\n" +
            "      \"Author\": \"admin\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"NewsId\": \"82c6ea15-70a5-4b16-be95-a31b121b3eaa\",\n" +
            "      \"Title\": \"林洋集团总裁亲临河南考察光伏电站项目\",\n" +
            "      \"Abstract\": \"\",\n" +
            "      \"ImageUrl\": \"http://182.254.152.65:8000/Upload/News/20160523185749463.png\",\n" +
            "      \"PublishDate\": \"2016-05-23\",\n" +
            "      \"Author\": \"admin\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"Pages\": 3,\n" +
            "  \"ResultCode\": 0,\n" +
            "  \"ResultMessage\": \"\"\n" +
            "}";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        getActivity().setTitle("首页");

        mListView = view.findViewById(android.R.id.list);
        mainAdapter = new MainAdapter(getActivity());

        genItems();
        mListView.setPullLoadEnable(true);
        mListView.setAdapter(mainAdapter);

        return view;
    }

    // finally 在onStart()中成功调用页面跳转
    @Override
    public void onStart() {
        super.onStart();
        mListView = (XListView) getListView();
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //
//                Toast.makeText(MainActivity.this, "i: "+ (i - 1), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    // 生成数据
    private void genItems() {
        Gson gson = new Gson();
        News news = gson.fromJson(s, News.class);
        datas = news.getNewsList();
        mainAdapter.setDatas((ArrayList<News.NewsListBean>) datas);
    }
}
