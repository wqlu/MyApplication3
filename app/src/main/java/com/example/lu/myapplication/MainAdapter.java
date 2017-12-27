package com.example.lu.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class MainAdapter extends BaseAdapter implements AdapterView.OnItemClickListener {

    private Context context;
    private ArrayList<News.NewsListBean> datas;

    public MainAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(ArrayList<News.NewsListBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return datas != null ? datas.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MyViewHolder myViewHolder = null;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false);
            myViewHolder = new MyViewHolder(view);
            view.setTag(myViewHolder);
        } else {
            myViewHolder = (MyViewHolder) view.getTag();
        }

        // 设置item文字数据 -- title
        myViewHolder.textView.setText(datas.get(i).getTitle());
        // 设置author, date
        myViewHolder.textView2.setText("作者："+ datas.get(i).getAuthor() + " 发布时间" + datas.get(i).getPublishDate());
        // 获取图片
        try {
            byte[] imagedata = ImageServce.getNetImage(datas.get(i).getImageUrl());
            Bitmap bitmap = BitmapFactory.decodeByteArray(imagedata,0, imagedata.length);

            myViewHolder.imageView.setImageBitmap(bitmap);
        } catch (Exception e) {
            // Toast.makeText(GetImageActivity.this, R.string.error, 1).show(); // 显示错误信息
            Log.e(TAG, e.toString()); // 生成异常日志
        }
        return view;
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(context, Main2Activity.class);
        context.startActivity(intent);
    }

    class MyViewHolder {

        private TextView textView;
        private TextView textView2;
        private ImageView imageView;

        MyViewHolder(View itemView) {
            textView = (TextView) itemView.findViewById(R.id.list_item_textview);
            textView2 = (TextView) itemView.findViewById(R.id.list_item_textview_2);
            imageView = (ImageView) itemView.findViewById(R.id.list_item_imageview);
        }
    }
}
