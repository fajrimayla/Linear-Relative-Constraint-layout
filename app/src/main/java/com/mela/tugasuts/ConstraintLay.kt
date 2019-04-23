package com.mela.tugasuts

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_constraint_lay.*

class ConstraintLay : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_lay)

        val dataid = findViewById(R.id.edit_id) as EditText
        val button = findViewById(R.id.update_id) as Button
        button.setOnClickListener {
            val i = Intent(this@ConstraintLay, WithData::class.java)
            i.putExtra("name", dataid.text.toString())
            startActivity(i)
        }

        back_id.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
