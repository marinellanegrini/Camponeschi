package univaq.progetto.adapter;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import univaq.progetto.R;

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.ViewHolder> {

    private int[] data;
    private ItemClickListener clickListener;

    public AdapterRecycler(int[] data) {
        this.data = data;

    }

    @NonNull
    @Override
    public AdapterRecycler.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecycler.ViewHolder viewHolder, int i) {
        int n = this.data[i];
        viewHolder.image.setImageResource(n);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }



    public void setClickListener(ItemClickListener itemClickListener){
        this.clickListener=itemClickListener;
    }


    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView image;

        public ViewHolder(@NonNull final View view) {
            super(view);

            image = view.findViewById(R.id.item);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view)
        {
            if(clickListener!=null)
                clickListener.onClick(view,getAdapterPosition());
        }

    }


}

