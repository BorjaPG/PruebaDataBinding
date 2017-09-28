package com.bp.pruebadatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bp.pruebadatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* Vincula los datos a la vista */
        ActivityMainBinding binding = DataBindingUtil.
        setContentView(this, R.layout.activity_main);

        Modelo modelo = new Modelo("Borja","Portillo","González");
        binding.setModelo(modelo);
    }
}
