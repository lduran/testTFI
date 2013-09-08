package com.leo.holamundoplus;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class HolaMundoPlus extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo_plus);
        final EditText txtNombre=(EditText)findViewById(R.id.txtNombre);
        final EditText txtEdad=(EditText)findViewById(R.id.txtEdad);
        final Button btnHola=(Button)findViewById(R.id.btnHola);
        btnHola.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		Intent intent = new Intent(HolaMundoPlus.this, FrmMensaje.class);
        		Bundle bundle = new Bundle();
        		bundle.putString("NOMBRE", txtNombre.getText().toString());
        		intent.putExtras(bundle);
        		startActivity(intent);
        	}
        });
    }


 
    
}
