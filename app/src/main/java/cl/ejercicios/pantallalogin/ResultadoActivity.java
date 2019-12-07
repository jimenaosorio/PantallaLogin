package cl.ejercicios.pantallalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        String usuario=getIntent().getStringExtra("usuario");
        TextView tv=(TextView) findViewById(R.id.tv);
        tv.setText(tv.getText().toString()+usuario);
    }
}
