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

    public void PotegiPierwiastki(View view) {

        Intent intentpier = new Intent(this, PotegiPierwiastki.class);
        startActivity(intentpier);
    }

    public void logarytmy(View view) {

        Intent intentlog = new Intent(this, Logarytmy.class);
        startActivity(intentlog);
    }

    public void SilniaDwumian(View view) {

        Intent intentsilniadwumian = new Intent(this, SilniaDwumian.class);
        startActivity(intentsilniadwumian);
    }

    public void DwumianNew(View view) {
        Intent intentdwumiannew = new Intent(this, DwumianNew.class);
        startActivity(intentdwumiannew);
    }

    public void WzorySkrMnoz(View view) {
        Intent intentwzoryskrmnoz = new Intent(this, WzorySkrMnoz.class);
        startActivity(intentwzoryskrmnoz);
    }


    public void ciagi(View view) {
        Intent intentciagi = new Intent(this, Ciagi.class);
        startActivity(intentciagi);
    }

    public void FunKwad(View view) {

        Intent intentfunkwad = new Intent(this, FunKwad.class);
        startActivity(intentfunkwad);
    }

    public void GeoAna(View view) {

        Intent intentgeoana = new Intent(this, GeoAna.class);
        startActivity(intentgeoana);
    }

    public void Plan(View view) {

        Intent intentplan = new Intent(this, Plan.class);
        startActivity(intentplan);
    }

    public void Ster(View view) {

        Intent intentster = new Intent(this, Ster.class);
        startActivity(intentster);
    }

    public void Tryg(View view) {

        Intent intenttryg = new Intent(this, Tryg.class);
        startActivity(intenttryg);
    }

    public void Kombi(View view) {

        Intent intentkombi = new Intent(this, Kombi.class);
        startActivity(intentkombi);

    }


    public void RachPraw(View view) {

        Intent intentrachpraw = new Intent(this, Rachpraw.class);
        startActivity(intentrachpraw);
    }

    public void ParDanStat(View view) {

        Intent intentpardanstat = new Intent(this, ParDanStat.class);
        startActivity(intentpardanstat);
    }

    public void GranCiag(View view) {

        Intent intentgranciag = new Intent(this, GranCiag.class);
        startActivity(intentgranciag);
    }

    public void PochFun(View view) {

        Intent intentpochfun = new Intent(this, PochFun.class);
        startActivity(intentpochfun);
    }

    public void TabWarFunTryg(View view) {

        Intent intenttabwarfuntryg = new Intent(this, TabWarFunTryg.class);
        startActivity(intenttabwarfuntryg);
    }
}
