package com.ayalamart.administrador;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class Act_Ingredientes extends AppCompatActivity {
	private AutoCompleteTextView nombre_ingr; 
	private AutoCompleteTextView tipo_ingrediente; 
	private EditText descr_ingrediente; 
	private AutoCompleteTextView precio;
	private AutoCompleteTextView cantidad;
	
	
	
	String URL_AGREG_INGREDS = "http://10.10.0.99:8080/Restaurante/rest/ingrediente/createIngrediente";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_act__ingredientes);
	
	nombre_ingr = (AutoCompleteTextView)findViewById(R.id.nombre_ingrediente);
	tipo_ingrediente = (AutoCompleteTextView)findViewById(R.id.tipo_ingrediente);
	descr_ingrediente = (EditText)findViewById(R.id.descripcion_ingrediente);
	precio = (AutoCompleteTextView)findViewById(R.id.precio_ingrediente);
	cantidad = (AutoCompleteTextView)findViewById(R.id.cantidad_ingrediente);
	
	Button butt_submit = (Button) findViewById(R.id.but_submit);
	butt_submit.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		}
	});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.act__ingredientes, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
