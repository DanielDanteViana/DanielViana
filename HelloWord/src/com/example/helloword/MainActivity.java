package com.example.helloword;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
 
 public class MainActivity extends Activity {

	 private EditText nomeEditText;
	 private TextView saudacaoText;
	 private String saudacao;
	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
       TextView view = new TextView(this);
       view.setText(R.id.teste);
       setContentView(R.layout.activity_main);
       
       this.nomeEditText = (EditText)findViewById(R.id.nomeInformado);
       
       this.saudacaoText = (TextView)findViewById(R.id.saudacao);
       
       this.saudacao = getResources().getString(R.string.saudacao);
       
       
       
    }

    
    public void informaNome(View v){
    	
    	String nome = this.nomeEditText.getText().toString();
    	
    	String texto = this.saudacao+" "+nome;
    	
    	this.saudacaoText.setText(texto);
    	
    	
    	
    	
    	
    }

 /*   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
   */
    
}
