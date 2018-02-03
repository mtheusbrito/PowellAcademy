package com.app.powell_academy.semlei.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.powell_academy.semlei.R;
import com.app.powell_academy.semlei.models.Lei;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by matheus on 02/02/18.
 */

public class LeiAdapter extends RecyclerView.Adapter<LeiAdapter.ViewHolder> {
    private Context context;
    private List<Lei> leis;


    public LeiAdapter(Context context) {
        this.context = context;
        leis = new ArrayList<>();


    }

    @Override
    public LeiAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lei, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LeiAdapter.ViewHolder holder, int position) {

        Lei lei = leis.get(position);
        holder.textViewNumero.setText(lei.getNumero());
        holder.textViewNome.setText(lei.getNome());
        holder.textViewTipo.setText(lei.getTipo());


    }



    @Override
    public int getItemCount() {
        return leis.size();
    }

    public void atualiza(ArrayList<Lei> leis) {
        this.leis = leis;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewNumero, textViewTipo, textViewNome;


        public ViewHolder(View itemView) {
            super(itemView);
            textViewNumero = itemView.findViewById(R.id.textViewNumero);
            textViewTipo = itemView.findViewById(R.id.textViewTipo);
            textViewNome = itemView.findViewById(R.id.textViewNome);

        }
    }
}
