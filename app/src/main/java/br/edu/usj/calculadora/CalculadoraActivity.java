package br.edu.usj.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.renderscript.Double2;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by rafael on 13/09/17.
 */

public class CalculadoraActivity extends Activity {

    private EditText valor1Edit, valor2Edit, opEdit;
    private TextView resultadoEdit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_calculadora);
        valor1Edit = (EditText) findViewById(R.id.valor1EditText);
        valor2Edit = (EditText) findViewById(R.id.valor2EditText);
        opEdit = (EditText) findViewById(R.id.opEditText);
        resultadoEdit = (TextView) findViewById((R.id.resultadoTextView));
    }

    public void calcular (View view){
        double valor1 = Double.parseDouble(valor1Edit.getText().toString());
        double valor2 = Double.parseDouble(valor2Edit.getText().toString());
        String op = opEdit.getText().toString();

        double resultado = 0;

        switch (op){
            case "+":
                resultado = valor1 + valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                break;
            case  "*":
                resultado = valor1 * valor2;
                break;
            case "/":
                resultado = valor1/ valor2;
                break;
            default:
                resultado = 0;
        }

        if (resultado != 0){
            resultadoEdit.setText(String.valueOf(resultado));
        }
        else{
            resultadoEdit.setText(getString(R.string.operacao_incorreta));
        }
    }
}
