package com.example.amitai.squereortringle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class tringle{

        private boolean istringle(int num){
            int index = 1;
            int triglenum = 1;
            while(triglenum < num){
                index++;
                triglenum += index;
            }
            if(num == triglenum){
                return true;
            }
            else {
                return false;
            }
        }
    }
    class squerenum{

        private boolean issquere(int num){
            int index = 0;
            int squere = 0;
            while (squere < num){
                index++;
                squere = index * index;
            }
            if(squere == num){
                return true;
            }
            else {
                return false;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void check(View view) {
        String str = "";
        EditText edit = (EditText) findViewById(R.id.editText);
        if (edit.getText().toString().isEmpty()) {
            str = "please enter a number";
        }
        else {
            squerenum squere = new squerenum();
            tringle tri = new tringle();
            int num = Integer.parseInt(edit.getText().toString());
            boolean issq = squere.issquere(num);
            boolean istri = tri.istringle(num);

            if (issq == true && istri == true) {
                str = "the number is tringle and squere";
            } else if (issq == true && istri == false) {
                str = "the number is squere";
            } else if (issq == false && istri) {
                str = "the number is tringle";
            } else {
                str = "the number is not tringle and not squere";
            }

        }
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();
    }
}
