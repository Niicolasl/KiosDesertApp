package com.example.table.services;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.table.R;

import java.util.ArrayList;

public class ServiceActivity extends AppCompatActivity {
    ArrayList<Service> arrayList_services;
    RecyclerView recyclerView_services;
    ServiceAdapter serviceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        arrayList_services = new ArrayList<>();
        recyclerView_services= findViewById(R.id.id_recyclerview_servicios);
        recyclerView_services.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        recyclerView_services.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        llenarServicios();
        serviceAdapter = new ServiceAdapter(arrayList_services);
        recyclerView_services.setAdapter(serviceAdapter);
    }

    private void llenarServicios() {
        arrayList_services.add(new Service("Servicio a domicilio",R.drawable.domicilio));
        arrayList_services.add(new Service("Pago por Nequi",R.drawable.nequi_logo));
        arrayList_services.add(new Service("Proximamente",R.drawable.megafono));
    }
}