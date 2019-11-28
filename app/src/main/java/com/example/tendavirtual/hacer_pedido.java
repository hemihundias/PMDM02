package com.example.tendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class hacer_pedido extends AppCompatActivity {

    private Spinner categorias, articulos, cantidad;
    public static String Categoria, Articulo, Cantidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hacer_pedido);

        List<String> listInfor = new ArrayList<String>();
        listInfor.add("Pc Sobremesa");
        listInfor.add("Portátil");
        listInfor.add("Monitor");
        final ArrayAdapter<String> infor = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listInfor);
        infor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        List<String> listElec = new ArrayList<String>();
        listElec.add("Televisión");
        listElec.add("DVD");
        final ArrayAdapter<String> elec = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listElec);
        elec.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        List<String> listMov = new ArrayList<String>();
        listMov.add("Pixel");
        listMov.add("Galaxy");
        listMov.add("Iphone");
        listMov.add("Xiaomi");
        final ArrayAdapter<String> mov = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listMov);
        mov.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        this.categorias = (Spinner)findViewById(R.id.spinnerCat);
        this.articulos = (Spinner)findViewById(R.id.spinnerArt);
        this.cantidad = (Spinner)findViewById(R.id.spinnerCant);

        categorias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {

                switch (i){
                    case 0:
                        articulos.setAdapter(infor);
                        break;
                    case 1:
                        articulos.setAdapter(elec);
                        break;
                    case 2:
                        articulos.setAdapter(mov);
                        break;
                    default:
                        articulos.setAdapter(null);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }



    public void siguiente (View view){
        Intent siguiente = new Intent(this, Direccion.class);

        String cat = categorias.getSelectedItem().toString();
        String art = articulos.getSelectedItem().toString();
        String can = cantidad.getSelectedItem().toString();

        siguiente.putExtra(Categoria, cat);
        siguiente.putExtra(Articulo, art);
        siguiente.putExtra(Cantidad, can);

        startActivity(siguiente);
    }


}
