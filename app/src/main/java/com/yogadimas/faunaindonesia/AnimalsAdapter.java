package com.yogadimas.faunaindonesia;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class AnimalsAdapter extends RecyclerView.Adapter<AnimalsAdapter.ViewHolder> {

    private List<Animals> list;

    public AnimalsAdapter(List<Animals> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_animals, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(list.get(position));
        final Animals animals = list.get(position);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions = requestOptions.transform(new CenterCrop(), new RoundedCorners(43));
        Glide.with(holder.itemView.getContext())
                .load(animals.getPicture())
                .apply(requestOptions.override(150, 120))
                .into(holder.picture);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageButton btnDetail;
        ImageView picture;
        TextView codename;
        TextView nameIlmiah;

        public ViewHolder(View itemView) {
            super(itemView);
            picture = itemView.findViewById(R.id.img_item_photo);
            codename = itemView.findViewById(R.id.tv_codename);
            nameIlmiah = itemView.findViewById(R.id.tv_item_ilmiah);
            btnDetail = itemView.findViewById(R.id.btn_set_detail);
        }

        public void bind(final Animals item) {

            codename.setText(item.getCodename());
            nameIlmiah.setText(item.getIlmiah());

            btnDetail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(), DetailActivity.class);
                    intent.putExtra(DetailActivity.SCREENSHOT, item.getScreenshot());
                    intent.putExtra(DetailActivity.DESCRIPTION, item.getDescription());
                    intent.putExtra(DetailActivity.CODENAME, item.getCodename());
                    intent.putExtra(DetailActivity.KINGDOM, item.getKingdom());
                    intent.putExtra(DetailActivity.PHYLUM, item.getPhylum());
                    intent.putExtra(DetailActivity.KELAS, item.getKelas());
                    intent.putExtra(DetailActivity.ORDER, item.getOrder());
                    intent.putExtra(DetailActivity.FAMILY, item.getFamily());
                    intent.putExtra(DetailActivity.GENUS, item.getGenus());
                    intent.putExtra(DetailActivity.SPECIES, item.getSpecies());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
