package com.example.panduapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etNik: EditText
    private lateinit var etPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etNik = findViewById(R.id.edt_nik)
        etPassword = findViewById(R.id.edt_password)


        val btnLogin: Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_login -> {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 49a6c03 (final-project)
                val nik = etNik.text.toString()
                var isEmpety = false
                if (
                    nik.isEmpty()
                ){
                    isEmpety = true
                    etNik.error = "NIK harus diisi"
<<<<<<< HEAD
=======
=======
                val pw = etPassword.text.toString()
                val nik = etNik.text.toString()
                var isEmpety = false
                if (
                    nik.isEmpty() && pw.isEmpty()
                )
                {
                    isEmpety = true
                    etNik.error = "NIK harus diisi"
                    etPassword.error = "Password harus diisi"
>>>>>>> 9ab19c1 (final-project)
>>>>>>> 49a6c03 (final-project)
                }

                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intent)

            }
        }
    }


}