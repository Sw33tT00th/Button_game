package com.example.button_game;

import java.util.Date;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Chronometer;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean firstButtonPressed = false;
    private int lastRunTime = 0;
    private int bestRunTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Chronometer timer = (Chronometer) findViewById(R.id.timer);
        timer.setText("00");

        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(this);

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);

        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(this);

        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(this);

        Button btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(this);

        Button btn6 = (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(this);

        Button btn7 = (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(this);

        Button btn8 = (Button) findViewById(R.id.button8);
        btn8.setOnClickListener(this);

        Button btn9 = (Button) findViewById(R.id.button9);
        btn9.setOnClickListener(this);

        Button btn10 = (Button) findViewById(R.id.button10);
        btn10.setOnClickListener(this);

        Button btn11 = (Button) findViewById(R.id.button11);
        btn11.setOnClickListener(this);

        Button btn12 = (Button) findViewById(R.id.button12);
        btn12.setOnClickListener(this);

        Button btn13 = (Button) findViewById(R.id.button13);
        btn13.setOnClickListener(this);

        Button btn14 = (Button) findViewById(R.id.button14);
        btn14.setOnClickListener(this);

        Button btn15 = (Button) findViewById(R.id.button15);
        btn15.setOnClickListener(this);

        Button btn16 = (Button) findViewById(R.id.button16);
        btn16.setOnClickListener(this);

        Button btn17 = (Button) findViewById(R.id.button17);
        btn17.setOnClickListener(this);

        Button btn18 = (Button) findViewById(R.id.button18);
        btn18.setOnClickListener(this);

        Button resetBtn = (Button) findViewById(R.id.ResetButton);
        resetBtn.setOnClickListener(new resetAction());
    }

    @Override
    public void onClick(View v) {
        // if timer isn't going start it
        Chronometer timer = (Chronometer) findViewById(R.id.timer);
        if(!firstButtonPressed) {
            timer.setBase(SystemClock.elapsedRealtime());
            timer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
                @Override
                public void onChronometerTick(Chronometer timer) {
                    long time = SystemClock.elapsedRealtime() - timer.getBase();
                    Date date = new Date(time);
                    java.text.DateFormat formatter = new java.text.SimpleDateFormat("ss");
                    String dateFormatted = formatter.format(date);
                    timer.setText(dateFormatted);
                }
            });
            timer.start();
            firstButtonPressed = true;
        }
        v.setVisibility(View.INVISIBLE);
        if(isComplete()) {
            // stop the timer and save the scores
            timer.stop();
            lastRunTime = Integer.parseInt(timer.getText().toString());
            TextView lastTime = (TextView) findViewById(R.id.textView2);
            lastTime.setText("Last Time: " + lastRunTime + "s");
            if(bestRunTime == 0 || bestRunTime > lastRunTime) {
                bestRunTime = lastRunTime;
                TextView bestTime = (TextView) findViewById(R.id.textView3);
                bestTime.setText("Fastest Time: " + bestRunTime + "s");
            }
        }
    }

    private boolean isComplete() {
        Button btn;

        btn = (Button) findViewById(R.id.button1);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button2);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button3);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button4);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button5);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button6);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button7);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button8);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button9);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button10);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button11);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button12);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button13);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button14);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button15);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button16);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button17);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        btn = (Button) findViewById(R.id.button18);
        if (btn.getVisibility() == View.VISIBLE) {
            return false;
        }

        return true;
    }

    private class resetAction implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Button btn;

            btn = (Button) findViewById(R.id.button1);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button2);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button3);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button4);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button5);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button6);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button7);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button8);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button9);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button10);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button11);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button12);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button13);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button14);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button15);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button16);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button17);
            btn.setVisibility(View.VISIBLE);

            btn = (Button) findViewById(R.id.button18);
            btn.setVisibility(View.VISIBLE);

            Chronometer timer = (Chronometer) findViewById(R.id.timer);
            timer.stop();
            timer.setBase(SystemClock.elapsedRealtime());
            timer.setText("00");
            firstButtonPressed = false;

        }
    }


}
