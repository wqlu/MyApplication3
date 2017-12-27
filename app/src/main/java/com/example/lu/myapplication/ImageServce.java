package com.example.lu.myapplication;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageServce {
    private final static int ONE_SECOND = 1000; // 定义一秒
//    private final static String URL_HTTP = "http://a.hiphotos.bdimg.com/album/s%3D740%3Bq%3D90/sign=493c3a7f9e82d158bf825bb5b03168e5/1c950a7b02087bf492e4eb78f0d3572c11dfcf13.jpg";


    public static byte[] getNetImage(String path) throws Exception {

        // 给定一条网络路径
        URL url = new URL(path);
        HttpURLConnection huconn = (HttpURLConnection) url.openConnection(); // url用openConnection()打开连接
        huconn.setRequestMethod("GET"); // 设置用GET请求命令将被发送到远程HTTP服务器

        huconn.setConnectTimeout(5 * ONE_SECOND); // 设置超时时间5秒

        InputStream inStream = huconn.getInputStream(); // 通过输入流输入图片数据
        return StreamTool.getNetImage(inStream);
    }
}
