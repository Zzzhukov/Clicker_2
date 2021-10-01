package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer baget = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("baget", baget);
    }

    public void onClickBtnAddStudents(View view) {
        TextView bagetView = (TextView)findViewById(R.id.baget);
        baget++;
        if (baget > 100){
            bagetView.setTextSize(45);
        }
        if (baget > 1000){
            bagetView.setTextSize(40);
        }
        if (baget > 10000){
            bagetView.setTextSize(35);
        }
        if (baget > 100000){
            bagetView.setTextSize(30);
        }
        if (baget > 1000000){
            bagetView.setTextSize(25);
        }
            bagetView.setText(baget.toString());
    }
    private void resetUI() {
        ((TextView) findViewById(R.id.baget)).setText(baget.toString());
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("coin")) {
            baget = savedInstanceState.getInt("coin");
        }
        resetUI();
    }

}