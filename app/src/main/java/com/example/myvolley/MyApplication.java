package com.example.myvolley;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/*
    Volley简介：
    volley 是 Goole I/O 2013上发布的网络通信库，使网络通信更快、更简单、更健壮。
    关键词：数据不大但通信频繁

    Volley提供的功能:
    Json，图像等异步下载
    网络请求的排序（scheduling）
    网络请求的优先级处理
    缓存
    多级别取消请求
    和 Activity 的生命周期联动（Activity 结束时同时取消所有网络请求）
    
    Volley 的优点：
    非常适合进行数据量不大，但通信频繁的网络操作
    可直接在主线程调用服务端并处理返回结果
    可以取消请求，容易扩展，面向接口编程
    网络请求线程NetworkDispatcher默认开启了4个，可以优化，通过手机CPU数量
    通过使用标准的HTTP缓存机制保持磁盘和内存响应的一致

    Volley 的缺点：
    使用的是httpclient、HttpURLConnection
    6.0不支持httpclient了，如果想支持得添加org.apache.http.legacy.jar
    对大文件下载 Volley的表现非常糟糕
    只支持http请求
    图片加载性能一般
 */
public class MyApplication extends Application
{
	private static RequestQueue queues;

	@Override
	public void onCreate()
	{
		super.onCreate();
		queues = Volley.newRequestQueue(getApplicationContext());
	}

	public static RequestQueue getHttpQueues()
	{
		return queues;
	}
}
