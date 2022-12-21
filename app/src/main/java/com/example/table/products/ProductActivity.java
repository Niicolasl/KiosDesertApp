package com.example.table.products;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.table.R;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {
    ArrayList<Producto> arrayList_productos;
    RecyclerView recyclerView_productos;
    ProductAdapter dataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);


        arrayList_productos = new ArrayList<>();
        recyclerView_productos = findViewById(R.id.id_recyclerview_productos);
        recyclerView_productos.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        recyclerView_productos.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        llenarProductos();
        dataAdapter = new ProductAdapter(arrayList_productos);
        recyclerView_productos.setAdapter(dataAdapter);
    }

    private void llenarProductos() {
        arrayList_productos.add(new Producto("Postre Arbol","$$$",R.drawable.postre_arbol));
        arrayList_productos.add(new Producto("Postre Flor","$$$",R.drawable.postre_flor));
        arrayList_productos.add(new Producto("Postre Moño","$$$",R.drawable.postre_mono));
        arrayList_productos.add(new Producto("Postre Reno","$$$",R.drawable.postre_reno));
        arrayList_productos.add(new Producto("Postre Arbol","$$$",R.drawable.postre_arbol));
        arrayList_productos.add(new Producto("Postre Flor","$$$",R.drawable.postre_flor));
        arrayList_productos.add(new Producto("Postre Moño","$$$",R.drawable.postre_mono));
        arrayList_productos.add(new Producto("Proximamente","Estamos creando nuevas recetas...",R.drawable.postres_collage));
    }
}