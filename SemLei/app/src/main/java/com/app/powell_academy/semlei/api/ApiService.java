package com.app.powell_academy.semlei.api;

import com.app.powell_academy.semlei.models.Politico;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by matheus on 29/01/18.
 */

public interface ApiService {


    @GET("politicos")
    Call<Politico> obterListaPoliticos();
}
