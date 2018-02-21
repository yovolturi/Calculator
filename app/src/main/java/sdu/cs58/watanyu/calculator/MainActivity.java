package sdu.cs58.watanyu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    ///Explicit
    EditText number1EditText, number2EditText;
    Button addButton,delButton,PlusButton, DivButton;
    TextView resultTextView;
    int num1,num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2. Initial view ผูกตัวเเฟรบนjava
        number1EditText = findViewById(R.id.edtNumber1);
        number2EditText = findViewById(R.id.edtNumber2);
        addButton = findViewById(R.id.btnAdd);
        delButton = findViewById(R.id.btnDel);
        PlusButton = findViewById(R.id.btnPlus);
        DivButton = findViewById(R.id.btnDivide);
        resultTextView = findViewById(R.id.txvResult);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //แปรคาจาก edittextเป็นint
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result = num1 + num2;



                //เเสดงผลรับการคำนวน
                resultTextView.setText(result + "");

            }
        });//end OnClickListener
        delButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result = num1 - num2;

                resultTextView.setText(result +"");
            }
        });

        PlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result = num1 * num2;

                resultTextView.setText(result + "");
            }
        });
        DivButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result = num1 / num2;

                resultTextView.setText(result + "");
            }
        });


    }//end Method onCreate
}//end class
