package co.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;

import co.edu.unipiloto.advertenciaPaciente.ExpertoPaciente;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBuscar(View view){
        ExpertoPaciente expertoPaciente = new ExpertoPaciente();
        //Declarando el textView
        TextView marcas = findViewById(R.id.tipos);
        //Crear presentacion del spinner
        Spinner tipos = findViewById(R.id.tiposPacientes);
        //Extraer la seleccion en spinner
        String tiposPacientes = String.valueOf(tipos.getSelectedItem());
        //Extraer lista de cervezas
        ArrayList<String> listaPacientes = expertoPaciente.getPatients((tiposPacientes));
        marcas.setText(listaPacientes.toString());
        ArrayList res = listaPacientes;
        System.out.println(res);
    }
}