package com.app.powell_academy.semlei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.app.powell_academy.semlei.adapters.PoliticoAdapter;
import com.app.powell_academy.semlei.api.ApiService;
import com.app.powell_academy.semlei.api.SetupRest;
import com.app.powell_academy.semlei.models.Politico;
import com.app.powell_academy.semlei.models.Politicos;
import com.app.powell_academy.semlei.utils.ConstantsUtils;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPoliticos;
    private PoliticoAdapter politicoAdapter;
    private String TAG = "Lista Politicos";
    private ArrayList<Politico> politicos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        listaPoliticos();


    }


    private void initViews() {
        politicoAdapter = new PoliticoAdapter(this);
        recyclerViewPoliticos = findViewById(R.id.recyclerPoliticos);
        recyclerViewPoliticos.setAdapter(politicoAdapter);
        recyclerViewPoliticos.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewPoliticos.setLayoutManager(linearLayoutManager);
        listaPoliticos();

    }

    private void listaPoliticos() {
        SetupRest.get().getPoliticos().enqueue(new Callback<ArrayList<Politico>>() {
            @Override
            public void onResponse(Call<ArrayList<Politico>> call, Response<ArrayList<Politico>> response) {
                politicos = response.body();
                politicoAdapter.atualiza(politicos);
            }

            @Override
            public void onFailure(Call<ArrayList<Politico>> call, Throwable t) {
                //Não tem muito o que fazer...

            }
        });


    }
}
