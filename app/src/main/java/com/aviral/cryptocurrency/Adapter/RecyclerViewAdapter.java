package com.aviral.cryptocurrency.Adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aviral.cryptocurrency.Models.CryptoWallet;
import com.aviral.cryptocurrency.R;
import com.bumptech.glide.Glide;
import com.majorik.sparklinelibrary.SparkLineLayout;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    private final ArrayList<CryptoWallet> cryptoWalletArrayList;

    private DecimalFormat decimalFormat;

    public RecyclerViewAdapter(ArrayList<CryptoWallet> cryptoWalletArrayList) {
        this.cryptoWalletArrayList = cryptoWalletArrayList;
        decimalFormat = new DecimalFormat("###,###,###,###");
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_snippet_recycler_view,
                        parent,
                        false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.cryptoName.setText(cryptoWalletArrayList.get(position).getCryptoName());
        holder.cryptoPrice.setText(String.format("$%s", decimalFormat.format(cryptoWalletArrayList.get(position).getCryptoPrice())));
        holder.changePercentage.setText(String.format("%s%%", cryptoWalletArrayList.get(position).getChangePercentage()));
        holder.propertyAmount.setText(String.format("$%s", decimalFormat.format(cryptoWalletArrayList.get(position).getPropertyAmount())));
        holder.propertySize.setText(String.valueOf(cryptoWalletArrayList.get(position).getPropertySize()));
        holder.sparkLineLayout.setData(cryptoWalletArrayList.get(position).getLineDate());

        if (cryptoWalletArrayList.get(position).getChangePercentage() > 0) {
            holder.changePercentage.setTextColor(Color.parseColor("#12c727"));
            holder.sparkLineLayout.setSparkLineColor(Color.parseColor("#12c727"));
        } else if (cryptoWalletArrayList.get(position).getChangePercentage() < 0) {
            holder.changePercentage.setTextColor(Color.parseColor("#fc0000"));
            holder.sparkLineLayout.setSparkLineColor(Color.parseColor("#fc0000"));
        } else {
            holder.changePercentage.setTextColor(Color.parseColor("#ffffff"));
            holder.sparkLineLayout.setSparkLineColor(Color.parseColor("#ffffff"));
        }

        int drawableResourceId = holder.itemView.getResources().getIdentifier(
                cryptoWalletArrayList.get(position).getCryptoName(),
                "drawable",
                holder.itemView.getContext().getPackageName()
        );

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.cryptoImage);

    }

    @Override
    public int getItemCount() {
        return cryptoWalletArrayList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView cryptoImage;
        private final TextView cryptoName;
        private final TextView cryptoPrice;
        private final TextView changePercentage;
        private final TextView propertyAmount;
        private final TextView propertySize;
        private final SparkLineLayout sparkLineLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cryptoImage = itemView.findViewById(R.id.logoImg);
            cryptoName = itemView.findViewById(R.id.cryptoNameTxt);
            cryptoPrice = itemView.findViewById(R.id.cryptoPriceTxt);
            changePercentage = itemView.findViewById(R.id.changePercentTxt);
            propertyAmount = itemView.findViewById(R.id.propertyAmountTxt);
            propertySize = itemView.findViewById(R.id.propertySizeTxt);
            sparkLineLayout = itemView.findViewById(R.id.spaeklineLayout);

        }
    }

}
