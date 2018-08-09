package com.responsiveweb.leandro.atmconsultoria

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show()

        // método para navegar entre activitys
        btn_contato.setOnClickListener {

            // exemplo de Toast
            //Toast.makeText(this, "Olá manolo!", Toast.LENGTH_LONG).show()


            val intent = Intent(this, DetalheContatoActivity::class.java)
            startActivity(intent)

        }

        btn_cliente.setOnClickListener {
            val intent = Intent(this, DetalheClienteActivity::class.java)
            startActivity(intent)
        }

        btn_empresa.setOnClickListener{
            val intent = Intent(this, DetalheEmpresaActivity::class.java)
            startActivity(intent)
        }

        btn_servicos.setOnClickListener{
            val intent = Intent(this, DetalheServicosActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "OnStart", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "OnResume", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "OnPause", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "OnStop", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "OnRestart", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_LONG).show()
    }
}
