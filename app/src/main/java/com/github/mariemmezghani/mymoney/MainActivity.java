package com.github.mariemmezghani.mymoney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.github.mariemmezghani.mymoney.Adapter.TransactionsAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private RecyclerView transactionsRecyclerView;
    private FloatingActionButton fab;
    private LinearLayoutManager transactionsLayoutManager;
    private TransactionsAdapter transactionsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        transactionsRecyclerView=(RecyclerView) findViewById(R.id.transactionsrecyclerView);
        fab=(FloatingActionButton) findViewById(R.id.add_fab);
        transactionsLayoutManager = new LinearLayoutManager(this);
        transactionsRecyclerView.setLayoutManager(transactionsLayoutManager);
        transactionsAdapter = new TransactionsAdapter();
        transactionsRecyclerView.setAdapter(transactionsAdapter);
    }
}
