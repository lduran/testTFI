package com.leo.holamundoplus;

import com.leo.holamundoplus.R;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;


public class FrmMensaje extends Activity{
	
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frmmensaje);
		TextView txtMensaje = (TextView)findViewById(R.id.txtMensaje);
		Bundle bundle = getIntent().getExtras();
		txtMensaje.setText("Hola"+ bundle.getString("NOMBRE"));
}
}
