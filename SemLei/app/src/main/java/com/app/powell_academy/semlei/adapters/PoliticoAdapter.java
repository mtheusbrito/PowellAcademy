package com.app.powell_academy.semlei.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.powell_academy.semlei.R;
import com.app.powell_academy.semlei.models.Politico;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matheus on 29/01/18.
 */

public class PoliticoAdapter extends RecyclerView.Adapter<PoliticoAdapter.ViewHolder>{
    private Context context ;
    private List<Politico> politicos;


    public PoliticoAdapter(Context context) {
        this.context= context;
        politicos = new ArrayList<>();




    }

    @Override
    public PoliticoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_politico, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PoliticoAdapter.ViewHolder holder, int position) {

        Politico politico = politicos.get(position);
        holder.textViewNome.setText(politico.getNome());
        holder.textViewPartido.setText(politico.getPartido());
        holder.textViewCargo.setText(politico.getCargo());


    }

    public void adiciona(ArrayList<Politico> politicos){
        this.politicos.addAll(politicos);
        this.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return politicos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewNome, textViewPartido, textViewCargo;


         public ViewHolder(View itemView) {
            super(itemView);
            textViewNome = itemView.findViewById(R.id.textViewNome);
            textViewPartido = itemView.findViewById(R.id.textViewPartido);
            textViewCargo = itemView.findViewById(R.id.textViewCargo);

        }
    }
}
