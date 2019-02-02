package br.com.ktempconverter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    lateinit var edtTemp: EditText
    lateinit var rbCelcius: RadioButton
    lateinit var rbFahreinheit: RadioButton
    lateinit var btnConverter: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtTemp = findViewById(R.id.edt_valor_temp)

        rbCelcius = findViewById(R.id.rb_celcius)
        rbFahreinheit = findViewById(R.id.rb_fahreinheit)

        btnConverter = findViewById(R.id.btn_converter)
        btnConverter.setOnClickListener { converter(it) }
    }

    private fun converter(view: View) {
        var temp: Double = edtTemp.text.toString().toDouble()

        if (rbCelcius.isChecked) {
            temp = (temp - 32) * 5/9
        }

        if (rbFahreinheit.isChecked) {
            temp = temp * 9/5 + 32
        }

        edtTemp.setText(temp.toString())
    }
}
