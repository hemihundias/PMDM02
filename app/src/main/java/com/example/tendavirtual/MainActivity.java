package com.example.tendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNombre, editTextPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNombre = (EditText) findViewById(R.id.editTextNombre);
        editTextPass = (EditText) findViewById(R.id.editTextPass);

    }

    public void login(View view){
        Intent cliente = new Intent(this, cliente.class);
        Intent admin = new Intent(this, admin.class);
        if (editTextNombre.getText().toString().equalsIgnoreCase("admin") && editTextPass.getText().toString().equals("abc123.")){
            editTextNombre.setText("");
            editTextPass.setText("");
            startActivity(admin);
        }else if (editTextNombre.getText().toString().equalsIgnoreCase("cliente1") && editTextPass.getText().toString().equals("abc123.")){
            editTextNombre.setText("");
            editTextPass.setText("");
            startActivity(cliente);
        }else{
            Toast.makeText(this, "Valores introducidos incorrectos, inténtelo de nuevo.",Toast.LENGTH_LONG).show();
            editTextNombre.setText("");
            editTextPass.setText("");
        }
    }
}
