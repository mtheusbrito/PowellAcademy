package com.app.powell_academy.semlei.api;

import com.app.powell_academy.semlei.utils.ConstantsUtils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by raphaelramos on 31/01/2018.
 */

public class SetupRest {

    private static HttpLoggingInterceptor.Level level;
    private static String url;
    private static ApiService REST_CLIENT;

    static {
        level = HttpLoggingInterceptor.Level.BODY;
        url = ConstantsUtils.BASE_URL;
        setupRestClient();
    }

    private SetupRest() {}

    public static ApiService get() {
        return REST_CLIENT;
    }

    private static void setupRestClient() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(level);

        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        REST_CLIENT = retrofit.create(ApiService.class);
    }
}
