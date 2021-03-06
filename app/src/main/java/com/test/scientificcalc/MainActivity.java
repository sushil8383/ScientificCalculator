package com.test.scientificcalc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView user_input, sign_Box;

    Double num1, num2, answer;
    String sign, val_1, val_2;
    boolean has_Dot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_input = (TextView) findViewById(R.id.input_user);
        sign_Box = (TextView) findViewById(R.id.sign_user);

        has_Dot = false;

    }

    @SuppressLint("SetTextI18n")
    public void btn_0(View view) {
        user_input.setText(user_input.getText() + "0");
    }

    @SuppressLint("SetTextI18n")
    public void btn_1(View view) {
        user_input.setText(user_input.getText() + "1");
    }

    @SuppressLint("SetTextI18n")
    public void btn_2(View view) {
        user_input.setText(user_input.getText() + "2");
    }

    @SuppressLint("SetTextI18n")
    public void btn_3(View view) {
        user_input.setText(user_input.getText() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void btn_4(View view) {
        user_input.setText(user_input.getText() + "4");
    }

    @SuppressLint("SetTextI18n")
    public void btn_5(View view) {
        user_input.setText(user_input.getText() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void btn_6(View view) {
        user_input.setText(user_input.getText() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void btn_7(View view) {
        user_input.setText(user_input.getText() + "7");
    }

    @SuppressLint("SetTextI18n")
    public void btn_8(View view) {
        user_input.setText(user_input.getText() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void btn_9(View view) {
        user_input.setText(user_input.getText() + "9");
    }

    @SuppressLint("SetTextI18n")
    public void btn_dot(View view) {
        if (!has_Dot) {
            if (user_input.getText().equals("")) {

                user_input.setText("0.");
            } else {

                user_input.setText(user_input.getText() + ".");
            }

            has_Dot = true;
        }

    }

    public void btn_add(View view) {
        sign = "+";
        val_1 = user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("+");
        has_Dot = false;
    }

    public void btn_subtract(View view) {
        sign = "-";
        val_1 = user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("-");
        has_Dot = false;
    }

    public void btn_multiply(View view) {
        sign = "*";
        val_1 = user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("×");
        has_Dot = false;
    }

    public void btn_divide(View view) {
        sign = "/";
        val_1 = user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("÷");
        has_Dot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btn_log(View view) {
        sign = "log";
        user_input.setText(null);
        sign_Box.setText("log");
        has_Dot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btn_ln(View view) {
        sign = "ln";
        user_input.setText(null);
        sign_Box.setText("ln");
        has_Dot = false;
    }

    public void btn_power(View view) {
        sign = "power";
        val_1 = user_input.getText().toString();
        user_input.setText(null);
        has_Dot = false;
        sign_Box.setText("xⁿ");
    }

    public void btn_factorial(View view) {
        sign = "factorial";
        user_input.setText(null);
        has_Dot = false;
        sign_Box.setText("!");
    }

    @SuppressLint("SetTextI18n")
    public void btn_sin(View view) {
        sign = "sin";
        user_input.setText(null);
        has_Dot = false;
        sign_Box.setText("sin");
    }

    @SuppressLint("SetTextI18n")
    public void btn_cos(View view) {
        sign = "cos";
        user_input.setText(null);
        has_Dot = false;
        sign_Box.setText("cos");
    }

    @SuppressLint("SetTextI18n")
    public void btn_tan(View view) {
        sign = "tan";
        user_input.setText(null);
        has_Dot = false;
        sign_Box.setText("tan");
    }

    public void btn_root(View view) {
        sign = "root";
        user_input.setText(null);
        has_Dot = false;
        sign_Box.setText("√");
    }

    @SuppressLint("SetTextI18n")
    public void btn_equal(View view) {
        if (sign == null) {
            sign_Box.setText("Error!");
        } else if (user_input.getText().equals("")) {
            sign_Box.setText("Error!");
        } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && val_1.equals("")) {
            sign_Box.setText("Error!");
        } else {
            switch (sign) {
                default:
                    break;
                case "log":
                    val_1 = user_input.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    user_input.setText(Math.log10(num1) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "ln":
                    val_1 = user_input.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    user_input.setText(Math.log(num1) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "power":
                    num1 = Double.parseDouble((val_1));
                    val_2 = user_input.getText().toString();
                    num2 = Double.parseDouble(val_2);
                    user_input.setText(Math.pow(num1, num2) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "root":
                    val_1 = user_input.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    user_input.setText(Math.sqrt(num1) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "factorial":
                    val_1 = user_input.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    int i = Integer.parseInt(val_1) - 1;

                    while (i > 0) {
                        num1 = num1 * i;
                        i--;
                    }

                    user_input.setText(num1 + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "sin":
                    val_1 = user_input.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    user_input.setText(Math.sin(num1) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "cos":
                    val_1 = user_input.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    user_input.setText(Math.cos(num1) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "tan":
                    val_1 = user_input.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    user_input.setText(Math.tan(num1) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "+":
                    val_2 = user_input.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 + num2;
                    user_input.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "-":
                    val_2 = user_input.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 - num2;
                    user_input.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "*":
                    val_2 = user_input.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 * num2;
                    user_input.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "/":
                    val_2 = user_input.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 / num2;
                    user_input.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
            }

        }
    }


    public void btn_delete(View view) {
        if (user_input.getText().equals("")) {
            user_input.setText(null);
        } else {
            int len = user_input.getText().length();
            String s = user_input.getText().toString();
            if (s.charAt(len - 1) == '.') {
                has_Dot = false;
                user_input.setText(user_input.getText().subSequence(0, user_input.getText().length() - 1));

            } else {
                user_input.setText(user_input.getText().subSequence(0, user_input.getText().length() - 1));
            }
        }
    }

    public void btn_clear(View view) {

        user_input.setText(null);
        sign_Box.setText(null);
        val_1 = null;
        val_2 = null;
        sign = null;
        has_Dot = false;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menutoolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId())
        {
            case R.id.follow:
                gotoUrl("https://www.instagram.com/codin_with_sushil");
                break;

            case R.id.python:
                gotoUrl("https://youtu.be/aPYQigOS1-g");
                break;

            case R.id.about:
                intent = new Intent(MainActivity.this,About_dev.class);
                startActivity(intent);
                break;

            case R.id.rate:
                gotoUrl("https://www.amazon.com/dp/B08WL1SZKV/ref=apps_sf_sta");
                break;

            case R.id.share:
                intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,"https://www.amazon.com/dp/B08WL1SZKV/ref=apps_sf_sta");
                startActivity(Intent.createChooser(intent,"Share via"));
                //gotoUrl("https://www.amazon.com/dp/B08WL1SZKV/ref=apps_sf_sta");
                break;





        }
        return true;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }


}
