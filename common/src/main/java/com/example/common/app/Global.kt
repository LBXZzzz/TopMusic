package com.example.common.app

import com.example.common.MusicApi
import com.example.common.net.ApiStore
import com.example.common.net.SetCookiesInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * 全局类，存放一些全局变量
 * */
object Global {

    /**
     * Music Api 的 URL
     * */
    private const val MusicApiHost = "https://sankokomi.top:22222/"

    private val okHttpClient: OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(SetCookiesInterceptor())
            .build()

    internal val retrofit = Retrofit.Builder()
        .baseUrl(MusicApiHost)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()

    /**
     * API 商店，在这里注册和注销 [Retrofit] 动态代理接口
     * */
    @PublishedApi
    internal val apiStore: ApiStore = ApiStore()

}

@Suppress("FunctionName")
inline fun <reified Api : MusicApi> Api(): Api {
    return Global.apiStore.registerApi(Api::class.java)
}