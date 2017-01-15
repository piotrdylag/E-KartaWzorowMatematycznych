package com.dylag.piotr.e_kartawzorowmatematycznych;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {


    private Button btnWarBezw, btnPotPier, btnLog, btnSilDwu, btnDwuNew, btnWzSkrMno, btnCiagi, btnFunKwad, btnGeoAna, btnPlan, btnSter, btnTryg, btnKombi, btnRachPraw, btnParDanStat, btnGranCiag, btnPochFun, btnTabWarTryg;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void WartoscBezwzgledna(View view){

        Intent intent = new Intent(this, wartosc_bezwzgledna.class);
       // EditText editText = (EditText) findViewById(R.id.edit_message);
       // String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }


    private void init() {

        btnWarBezw = (Button) findViewById(R.id.btnWartBezw);
        btnPotPier = (Button) findViewById(R.id.btnPotPier);
        btnLog = (Button) findViewById(R.id.btnLog);
        btnSilDwu = (Button)findViewById(R.id.btnSilDwu);
        btnDwuNew = (Button) findViewById(R.id.btnDwuNew);
        btnWzSkrMno = (Button) findViewById(R.id.btnWzSkrMno);
        btnCiagi = (Button) findViewById(R.id.btnCiagi);
        btnFunKwad = (Button) findViewById(R.id.btnFunKwad);
        btnGeoAna = (Button) findViewById(R.id.btnGeoAna);
        btnPlan = (Button) findViewById(R.id.btnPlan);
        btnSter = (Button) findViewById(R.id.btnSter);
        btnTryg = (Button) findViewById(R.id.btnTryg);
        btnKombi = (Button) findViewById(R.id.btnKombi);
        btnRachPraw = (Button) findViewById(R.id.btnRachPraw);
        btnParDanStat = (Button) findViewById(R.id.btnParDanStat);
        btnGranCiag = (Button)findViewById(R.id.btnGranCiag);
        btnPochFun = (Button) findViewById(R.id.btnPochFun);
        btnTabWarTryg = (Button) findViewById(R.id.btnTabWarTryg);


    }

}
