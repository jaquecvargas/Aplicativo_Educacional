package com.book.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class EscolherUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher_usuario);

    }

    public void setUsuario1(View view) {

        Toast.makeText(this, "Você escolheu o usuário 1", Toast.LENGTH_LONG).show();
    }

    public void setUsuario2(View view) {
        Toast.makeText(this, "Você escolheu o usuário 2", Toast.LENGTH_LONG).show();
    }

    public void setUsuario3(View view) {
        Toast.makeText(this, "Você escolheu o usuário 3", Toast.LENGTH_LONG).show();
    }
}
