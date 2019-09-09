package com.example.student.xtg_cau1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder dialog;
    Button btnDangnhap,btnThoat;
    EditText edTk,edMK;
    CheckBox cb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDangnhap = findViewById(R.id.btnDangNhap);
        edTk = findViewById(R.id.edTK);
        edMK = findViewById(R.id.edMK);
        cb = findViewById(R.id.checkBox);
        btnThoat = findViewById(R.id.btnThoat);

        final Toast toast = Toast.makeText(this,"",Toast.LENGTH_SHORT);

        btnDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edTk.getText().toString().trim().isEmpty()){
                    toast.setText("Vui lòng nhập tên đăng nhập!");
                    toast.show();
                }else if (edMK.getText().toString().trim().isEmpty()){
                    toast.setText("Vui lòng nhập Mật khẩu!");
                    toast.show();
                }else if (cb.isChecked()){
                    toast.setText("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                    toast.show();
                    }
                    else{
                        toast.setText("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
                        toast.show();
                     }
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thoat();
            }
        });
    }

    private void thoat(){
        dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("Thông báo");
        dialog.setMessage("Bạn có muốn thoát không?");
        dialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        dialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        dialog.show();
    }

}
