package com.example.appnavigate;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private Context mCtx;
    private List<Items> itemList;

    public ItemAdapter(Context mCtx, List<Items> itemList) {
        this.mCtx = mCtx;
        this.itemList = itemList;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.items, null);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Items item = itemList.get(position);

       holder.textViewTitle.setText(item.getTitle());
       holder.textViewRating.setText(String.valueOf(item.getRating()));
        holder.textViewPrice.setText(String.valueOf(item.getPrice()));

//Log.i("msg",String.valueOf(item.getPrice()));
  ///      Toast.makeText(mCtx,"msg "+String.valueOf(item.getRating()),Toast.LENGTH_LONG).show();
        Glide.with(mCtx).load(item.getImage()).into(holder.imageView);


    }

    @Override
    public int getItemCount()
    {
        return itemList.size();
    }


    class ItemViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle,textViewRating, textViewPrice;;
        ImageView imageView;
        CardView cardView;

        public ItemViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageview);
          /*  cardView = itemView.findViewById(R.id.cardview1);

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(mCtx,Details.class);
                    mCtx.startActivity(i);
                }
            });*/
        }

    }



}
