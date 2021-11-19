package org.geeksforgeeks.programmaticallyclosealertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring and initializing a Builder for the Alert Dialog
        val mBuilder = AlertDialog.Builder(this)
            .setTitle("TITLE")
            .setMessage("MESSAGE")
            .setPositiveButton("Positive", null)
            .setNegativeButton("Negative", null)

        val mAlertDialog = mBuilder.create()
        mAlertDialog.show()

        // Changing Positive Button properties such that something happens on click
        val mPositiveButton = mAlertDialog.getButton(AlertDialog.BUTTON_POSITIVE)
        mPositiveButton.setOnClickListener {
            // Programmatically closing the AlertDialog
            mAlertDialog.cancel()
            Toast.makeText(this, "Exited Alert Dialog", Toast.LENGTH_SHORT).show()
        }
    }
}