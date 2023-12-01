package com.example.common.net

import com.example.common.MusicApi
import com.example.common.app.Global
import retrofit2.Retrofit

class ApiStore {

    private val musicApis = hashMapOf<String, MusicApi>()

    /**
     * 注册一个基于 [Retrofit] 动态代理服务的 API 接口
     *
     * 如果此前已经创建过，不会重复创建，而是返回此前创建的动态代理对象
     *
     * @param api 要注册的接口
     * @return 注册好的接口
     *
     * @see unregisterApi
     * */
    fun <API : MusicApi> registerApi(api: Class<API>): API {
        var musicApi = musicApis[api.name]
        @Suppress("UNCHECKED_CAST")
        if (musicApi != null) return musicApi as API
        musicApi = Global.retrofit.create(api)
        musicApis[api.name] = musicApi
        return musicApi
    }

}