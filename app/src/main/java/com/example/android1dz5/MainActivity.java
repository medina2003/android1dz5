package com.example.android1dz5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private NameAdapter adapter;
private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        ArrayList<String> names=new ArrayList<>();
        names.add("Гульмира");
        names.add("Фатима");
        names.add("Асан");
        names.add("Адыл");
        names.add("Азим");
        names.add("Медина");
        names.add("Гульзина");
        names.add("Акыл");
        names.add("Диана");
        names.add("Дмитрий");
        names.add("Сагын");
        names.add("Дмитрий");
        names.add("Жамшут");
        names.add("Медер");
        names.add("Дмитрий");
        names.add("Усон");
        names.add("Дмитрий");
        names.add("Дилан");

        adapter=new NameAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}