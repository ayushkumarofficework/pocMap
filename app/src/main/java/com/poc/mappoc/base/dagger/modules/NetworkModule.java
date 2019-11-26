package com.poc.mappoc.base.dagger.modules;


import com.poc.mappoc.BuildConfig;
import com.poc.mappoc.scopeannotations.ApplicationScoped;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;


@Module
public class NetworkModule {
    @Provides
    @ApplicationScoped
    public OkHttpClient provideOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor){
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();

        okHttpClientBuilder.writeTimeout(10, TimeUnit.SECONDS);
        okHttpClientBuilder.readTimeout(3,TimeUnit.SECONDS);
        if(!BuildConfig.DEBUG){
            if(!okHttpClientBuilder.interceptors().contains(httpLoggingInterceptor)){
                okHttpClientBuilder.addInterceptor(httpLoggingInterceptor);
            }
        }
        return okHttpClientBuilder.build();
    }
}
