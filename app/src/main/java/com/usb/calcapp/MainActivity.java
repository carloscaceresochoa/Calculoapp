package com.usb.calcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.usb.calcapp.calculo.Rectangulo;
import com.usb.calcapp.calculo.Triangulo;

public class MainActivity extends AppCompatActivity {
    private EditText basetext;
    private EditText alttext;
    private TextView resultext;
    private RadioButton rectradio;
    private RadioButton triangradio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        basetext=findViewById(R.id.basetext);
        alttext=findViewById(R.id.alttext);
        resultext=findViewById(R.id.resultext);
        rectradio=findViewById(R.id.rectradio);
        triangradio=findViewById(R.id.triangradio);
    }

    public void calcular(View view){

        if(basetext.getText().toString().length()==0 ||
        alttext.getText().toString().length()==0){
            Toast.makeText(this,"Campo Vacio",Toast.LENGTH_SHORT).show();
         }
        else{
            calcularFigura();
        }

    }

    public void calcularFigura(){
        if(rectradio.isChecked()){
            Rectangulo rectangulo=new Rectangulo(basetext.getText().toString(),
                    alttext.getText().toString());
            resultext.setText(rectangulo.areaString());
        }
        else if (triangradio.isChecked()){
            Triangulo triangulo=new Triangulo(basetext.getText().toString(),
                    alttext.getText().toString());
            resultext.setText(triangulo.areaString());
        }
    }

    public void limpiar(View view){
        basetext.setText("");
        alttext.setText("");
        resultext.setText("");
        rectradio.setChecked(true);
        basetext.requestFocus();

    }
}