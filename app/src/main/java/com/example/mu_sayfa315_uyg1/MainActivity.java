package com.example.mu_sayfa315_uyg1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText kullaniciEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kullaniciEdit = findViewById(R.id.editTextKullanici);
        SharedPreferences sharedPreferences=this.getPreferences(Context.MODE_PRIVATE);
        String gelenVeri =sharedPreferences.getString("kullanici","");
        if(!gelenVeri.isEmpty()){
            kullaniciEdit.setText(gelenVeri);
        }
    }
    public void Kaydet(View view) {
        String veri;
        veri = kullaniciEdit.getText().toString();
        SharedPreferences sharedPreferences=this.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("kullanici",veri);
        editor.apply();

    }
}