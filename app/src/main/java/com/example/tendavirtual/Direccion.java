package com.example.tendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Direccion extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direccion);
    }

    public void cliente2 (View view){
        Intent cliente2 = new Intent(this, cliente.class);

        Context context = getApplicationContext();

        EditText etDir = findViewById(R.id.editTextDir);
        EditText etCiu = findViewById(R.id.editTextCiu);
        EditText etCp = findViewById(R.id.editTextCp);

        Intent intent = getIntent();
        String categoria = intent.getStringExtra(hacer_pedido.Categoria);
        String articulo = intent.getStringExtra(hacer_pedido.Articulo);
        String cantidad = intent.getStringExtra(hacer_pedido.Cantidad);
        String direccion = etDir.getText().toString();
        String ciudad = etCiu.getText().toString();
        String cp = etCp.getText().toString();

        CharSequence text = "Pedido: " + categoria + " - " + articulo + " - "
                + " (" + cantidad + ")\n" + "Dirección: " + direccion + " (" + cp + ") " + ciudad;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent Cliente = new Intent(this, cliente.class);
        Cliente.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(Cliente);

    }
}
