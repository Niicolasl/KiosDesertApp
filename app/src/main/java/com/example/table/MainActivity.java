package com.example.table;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.table.products.ProductActivity;
import com.example.table.services.ServiceActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
//        La actividad esta creada
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_products:
                Intent intent_Products = new Intent(this, ProductActivity.class);
                startActivity(intent_Products);
                Toast.makeText(this,"Products",Toast.LENGTH_SHORT);
                break;
            case R.id.action_service:
                Intent intent_Service = new Intent(this, ServiceActivity.class);
                startActivity(intent_Service);
                Toast.makeText(this,"Service",Toast.LENGTH_SHORT);
                break;
            case R.id.action_branch:
                Intent intent_Branch = new Intent(this,BranchActivity.class);
                startActivity(intent_Branch);
                Toast.makeText(this,"Branch",Toast.LENGTH_SHORT);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}