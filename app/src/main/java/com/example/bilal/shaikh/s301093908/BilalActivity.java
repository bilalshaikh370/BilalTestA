//First Name; Bilal
//Last Name; Shaikh
// ID; 301093908
package com.example.bilal.shaikh.s301093908;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BilalActivity extends AppCompatActivity {

    EditText email, password;
    Button btn_login;
    AlertDialog alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alert = new AlertDialog.Builder(this).create();

        email = (EditText) findViewById(R.id.txtName);
        password = (EditText) findViewById(R.id.txtPassword);
        btn_login = (Button) findViewById(R.id.button);

        btn_login.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString() == "Bilal.Shaikh" && password.getText().toString() == "301093908") {
                    Intent i = new Intent(BilalActivity.this, ShaikhActivity.class);
                    startActivity(i);
                } else {
                    alert.setTitle("Bilal Shaikh s301093908");
                    alert.setMessage("Invalid username/password, please try again.");
                    alert.setButton(Dialog.BUTTON_POSITIVE,"OK",new DialogInterface.OnClickListener(){

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });

                    alert.show();
                }
            }
        });

    }
}