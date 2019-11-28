package com.example.tendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
    }

    public void pedidos (View view){
        Intent pedido = new Intent(this, hacer_pedido.class);
        startActivity(pedido);
    }

    public void tramite (View view){
        Intent tramitadas = new Intent(this, tramite_pedidos.class);
        startActivity(tramitadas);
    }

    public void compra (View view){
        Intent compras = new Intent(this, compras_realizadas.class);
        startActivity(compras);
    }

    public void ver_pedidos (View view){
        Intent ver_p = new Intent(this, ver_pedidos.class);
        startActivity(ver_p);
    }

    public void ver_compras (View view){
        Intent ver_c = new Intent(this, ver_compras.class);
        startActivity(ver_c);
    }

    public void salir (View view){
        super.onBackPressed();
        Intent login = new Intent(this, MainActivity.class);
        login.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(login);
    }
}
