package com.aviral.cryptocurrency.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.aviral.cryptocurrency.Adapter.RecyclerViewAdapter;
import com.aviral.cryptocurrency.Models.CryptoWallet;
import com.aviral.cryptocurrency.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewWallet();
    }

    private void recyclerViewWallet() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false
        );

        recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<CryptoWallet> cryptoWalletArrayList = new ArrayList<>();
        ArrayList<Integer> dataLines = new ArrayList<>();
        dataLines.add(1000);
        dataLines.add(900);
        dataLines.add(1300);
        dataLines.add(1200);

        ArrayList<Integer> dataLines2 = new ArrayList<>();
        dataLines2.add(2100);
        dataLines2.add(1900);
        dataLines2.add(2000);
        dataLines2.add(1700);

        ArrayList<Integer> dataLines3 = new ArrayList<>();
        dataLines3.add(1000);
        dataLines3.add(700);
        dataLines3.add(1500);
        dataLines3.add(1200);

        cryptoWalletArrayList.add(new CryptoWallet(
                "bitcoin",
                "BTX",
                1234.12,
                2.32,
                dataLines,
                1234.56,
                0.12345
        ));

        cryptoWalletArrayList.add(new CryptoWallet(
                "ethereum",
                "ETH",
                2134.56,
                -1.13,
                dataLines2,
                6456.45,
                0.05016
        ));

        cryptoWalletArrayList.add(new CryptoWallet(
                "trox",
                "ROX",
                1046.15,
                3.17,
                dataLines3,
                7182.95,
                0.03056
        ));

        adapter = new RecyclerViewAdapter(cryptoWalletArrayList);

        recyclerView.setAdapter(adapter);

    }
}