package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity<sharedPreferences> extends AppCompatActivity {
    private EditText edtUserName, edtPassWord;
    private CheckBox ckbRememberPassword;
    private TextView txtMatKhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        AnhXa();
//        KiemTra();
    }


    public void login(View view) {
        Intent intent = new Intent(LoginActivity.this, Navigatio.class);
        startActivity(intent);

    }

    private void KiemTra() {
        String name = edtUserName.getText().toString().trim();
        String pass = edtPassWord.getText().toString().trim();}
//
//        if (name.equals("")){
//            edtUserName.setError(getString(R.string.error_UserName));
//            return;
//        }
//
//        String[] b={"!","~","@","#","$","%","^","&","*","*","(",")","_","-","=","+","[","]",";",":","\\","|","?","/","<",">",".",",","'"};
//        //Toast.makeText(this, ""+b.length, Toast.LENGTH_SHORT).show();
//        for (String aB1 : b) {
//            if (name.indexOf(aB1) > -1) {
//                edtUserName.setError(getString(R.string.error_Ki_Tu_Dac_Bite));
//                return;
//            }
//
//        }
//
//        if (pass.equals("")){
//            edtPassWord.setError(getString(R.string.error_PassWord));
//            return;
//        }
//
//        for (String aB : b) {
//            if (pass.indexOf(aB) > -1) {
//
//                edtPassWord.setError(getString(R.string.error_Ki_Tu_Dac_Bite));
//                return;
//            }
//
//        }
//
//        if (pass.length()<6){
//
//            edtPassWord.setError(getString(R.string.error_PassWord_It_Hon_6Ki_Tu));
//            return;
//        }
//
//
//
//
//    }
//    private void AnhXa(){
//        edtUserName=findViewById(R.id.edtUserNam);
//        edtPassWord=findViewById(R.id.edtPassWord);
//        ckbRememberPassword =  findViewById(R.id.ckbRememberPassword);
//
//    }
//
//
    public void dangky(View view) {
        Intent intent = new Intent(LoginActivity.this,CreateAccount.class);
        startActivity(intent);
        finish();

    }


}
