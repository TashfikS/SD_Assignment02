package com.example.tasfi.sd_assignment02;

import android.annotation.SuppressLint;
import android.arch.lifecycle.ViewModelProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText,idEditText;
    private TextView nameTextView,idTextView;
    private TableLayout tableLayout;
    private TableRow tableRow;
    private Button button;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText=findViewById(R.id.editTextName);
        idEditText=findViewById(R.id.editTextID);
        button=findViewById(R.id.addButton);
        tableLayout=findViewById(R.id.tablerowid);
        nameTextView=findViewById(R.id.nameTextView);
        idTextView=findViewById(R.id.idTextView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name,id;

                id=idEditText.getText().toString();
                name=nameEditText.getText().toString();


                nameTextView.setText(name);
                idTextView.setText(id);

                tableRow.addView(nameTextView);
                tableRow.addView(idTextView);


            }
        });
    }


}

