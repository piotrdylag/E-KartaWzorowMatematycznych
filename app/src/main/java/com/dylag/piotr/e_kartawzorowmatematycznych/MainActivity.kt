package com.dylag.piotr.e_kartawzorowmatematycznych

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import android.provider.AlarmClock.EXTRA_MESSAGE

class MainActivity : AppCompatActivity() {


    private var btnWarBezw: Button? = null
    private var btnPotPier: Button? = null
    private var btnLog: Button? = null
    private var btnSilDwu: Button? = null
    private var btnDwuNew: Button? = null
    private var btnWzSkrMno: Button? = null
    private var btnCiagi: Button? = null
    private var btnFunKwad: Button? = null
    private var btnGeoAna: Button? = null
    private var btnPlan: Button? = null
    private var btnSter: Button? = null
    private var btnTryg: Button? = null
    private var btnKombi: Button? = null
    private var btnRachPraw: Button? = null
    private var btnParDanStat: Button? = null
    private var btnGranCiag: Button? = null
    private var btnPochFun: Button? = null
    private var btnTabWarTryg: Button? = null
    private val textview: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    fun wartoscBezwzgledna(view: View) {

        val intent = Intent(this, wartosc_bezwzgledna::class.java)
        startActivity(intent)

    }


    private fun init() {

        btnWarBezw = findViewById(R.id.btnWartBezw) as Button
        btnPotPier = findViewById(R.id.btnPotPier) as Button
        btnLog = findViewById(R.id.btnLog) as Button
        btnSilDwu = findViewById(R.id.btnSilDwu) as Button
        btnDwuNew = findViewById(R.id.btnDwuNew) as Button
        btnWzSkrMno = findViewById(R.id.btnWzSkrMno) as Button
        btnCiagi = findViewById(R.id.btnCiagi) as Button
        btnFunKwad = findViewById(R.id.btnFunKwad) as Button
        btnGeoAna = findViewById(R.id.btnGeoAna) as Button
        btnPlan = findViewById(R.id.btnPlan) as Button
        btnSter = findViewById(R.id.btnSter) as Button
        btnTryg = findViewById(R.id.btnTryg) as Button
        btnKombi = findViewById(R.id.btnKombi) as Button
        btnRachPraw = findViewById(R.id.btnRachPraw) as Button
        btnParDanStat = findViewById(R.id.btnParDanStat) as Button
        btnGranCiag = findViewById(R.id.btnGranCiag) as Button
        btnPochFun = findViewById(R.id.btnPochFun) as Button
        btnTabWarTryg = findViewById(R.id.btnTabWarTryg) as Button


    }

    fun potegiPierwiastki(view: View) {

        val intentpier = Intent(this, PotegiPierwiastki::class.java)
        startActivity(intentpier)
    }

    fun logarytmy(view: View) {

        val intentlog = Intent(this, Logarytmy::class.java)
        startActivity(intentlog)
    }

    fun SilniaDwumian(view: View) {

        val intentsilniadwumian = Intent(this, SilniaDwumian::class.java)
        startActivity(intentsilniadwumian)
    }

    fun DwumianNew(view: View) {
        val intentdwumiannew = Intent(this, DwumianNew::class.java)
        startActivity(intentdwumiannew)
    }

    fun WzorySkrMnoz(view: View) {
        val intentwzoryskrmnoz = Intent(this, WzorySkrMnoz::class.java)
        startActivity(intentwzoryskrmnoz)
    }


    fun ciagi(view: View) {
        val intentciagi = Intent(this, Ciagi::class.java)
        startActivity(intentciagi)
    }

    fun FunKwad(view: View) {

        val intentfunkwad = Intent(this, FunKwad::class.java)
        startActivity(intentfunkwad)
    }

    fun GeoAna(view: View) {

        val intentgeoana = Intent(this, GeoAna::class.java)
        startActivity(intentgeoana)
    }

    fun Plan(view: View) {

        val intentplan = Intent(this, Plan::class.java)
        startActivity(intentplan)
    }

    fun Ster(view: View) {

        val intentster = Intent(this, Ster::class.java)
        startActivity(intentster)
    }

    fun Tryg(view: View) {

        val intenttryg = Intent(this, Tryg::class.java)
        startActivity(intenttryg)
    }

    fun Kombi(view: View) {

        val intentkombi = Intent(this, Kombi::class.java)
        startActivity(intentkombi)

    }


    fun RachPraw(view: View) {

        val intentrachpraw = Intent(this, Rachpraw::class.java)
        startActivity(intentrachpraw)
    }

    fun ParDanStat(view: View) {

        val intentpardanstat = Intent(this, ParDanStat::class.java)
        startActivity(intentpardanstat)
    }

    fun GranCiag(view: View) {

        val intentgranciag = Intent(this, GranCiag::class.java)
        startActivity(intentgranciag)
    }

    fun PochFun(view: View) {

        val intentpochfun = Intent(this, PochFun::class.java)
        startActivity(intentpochfun)
    }

    fun TabWarFunTryg(view: View) {

        val intenttabwarfuntryg = Intent(this, TabWarFunTryg::class.java)
        startActivity(intenttabwarfuntryg)
    }
}
