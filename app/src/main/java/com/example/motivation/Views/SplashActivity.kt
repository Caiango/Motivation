package com.example.motivation.Views

//importar esses pacotes para o evento de click
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.motivation.R
import com.example.motivation.util.Motivation_Constants
import com.example.motivation.util.Security_Preferences
import kotlinx.android.synthetic.main.activity_splash.*

//View.OnClickListener para evento de click
class SplashActivity : AppCompatActivity(), View.OnClickListener {

    // variável de acesso a classe Security Preferences, inicia depois qd eu der um valor
    private lateinit var mSecurity: Security_Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        mSecurity = Security_Preferences(this)

        buttonSave.setOnClickListener(this)
    }

    //    função para evento de click
    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.buttonSave) {
            handleSave()
        }
    }

    //    chamando a função salvarString de Security Preferences e colocando o nome lá
    private fun handleSave() {
        val name: String = editName.text.toString()

        if (name == "") {
//        mostrar mensagem na tela de "erro"
            Toast.makeText(this, "Por favor informe seu nome", Toast.LENGTH_LONG).show()
        } else {
            mSecurity.salvarString(Motivation_Constants.KEY.PERSON_NAME, name)


//  chamando outra activity
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
//        Impede qe eu volte para essa activity, não consigo voltar para ele
//        finish()


        }
    }


}
