package com.tibaes.layoutsexamples;

import android.support.annotation.BoolRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GridActivity extends AppCompatActivity {


    TextView txtNumber;
    Double num1 = 0.0, num2 = 0.0;
    Boolean aux = true; // não tem números na memória
    int op;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        txtNumber = (TextView) findViewById(R.id.txt_number);

        Button btnZero = (Button) findViewById(R.id.btn_zero);
        btnZero.setOnClickListener(new View.OnClickListener() {
               /**
                * Called when a view has been clicked.
                *
                * @param v The view that was clicked.
                */
               @Override
               public void onClick(View v) {
                   String aux = txtNumber.getText().toString();
                   txtNumber.setText(aux + "0");
               }
           }
        );

        Button btnOne = (Button) findViewById(R.id.btn_one);
        btnOne.setOnClickListener(new View.OnClickListener() {
                                       /**
                                        * Called when a view has been clicked.
                                        *
                                        * @param v The view that was clicked.
                                        */
                                       @Override
                                       public void onClick(View v) {
                                           String aux = txtNumber.getText().toString();
                                           txtNumber.setText(aux + "1");
                                       }
                                   }
        );

        Button btnTwo = (Button) findViewById(R.id.btn_two);
        btnTwo.setOnClickListener(new View.OnClickListener() {
                                       /**
                                        * Called when a view has been clicked.
                                        *
                                        * @param v The view that was clicked.
                                        */
                                       @Override
                                       public void onClick(View v) {
                                           String aux = txtNumber.getText().toString();
                                           txtNumber.setText(aux + "2");
                                       }
                                   }
        );

        Button btnThree = (Button) findViewById(R.id.btn_three);
        btnThree.setOnClickListener(new View.OnClickListener() {
                                       /**
                                        * Called when a view has been clicked.
                                        *
                                        * @param v The view that was clicked.
                                        */
                                       @Override
                                       public void onClick(View v) {
                                           String aux = txtNumber.getText().toString();
                                           txtNumber.setText(aux + "3");
                                       }
                                   }
        );

        Button btnFour = (Button) findViewById(R.id.btn_four);
        btnFour.setOnClickListener(new View.OnClickListener() {
                                       /**
                                        * Called when a view has been clicked.
                                        *
                                        * @param v The view that was clicked.
                                        */
                                       @Override
                                       public void onClick(View v) {
                                           String aux = txtNumber.getText().toString();
                                           txtNumber.setText(aux + "4");
                                       }
                                   }
        );

        Button btnFive = (Button) findViewById(R.id.btn_five);
        btnFive.setOnClickListener(new View.OnClickListener() {
                                       /**
                                        * Called when a view has been clicked.
                                        *
                                        * @param v The view that was clicked.
                                        */
                                       @Override
                                       public void onClick(View v) {
                                           String aux = txtNumber.getText().toString();
                                           txtNumber.setText(aux + "5");
                                       }
                                   }
        );

        Button btnSix = (Button) findViewById(R.id.btn_six);
        btnSix.setOnClickListener(new View.OnClickListener() {
                                       /**
                                        * Called when a view has been clicked.
                                        *
                                        * @param v The view that was clicked.
                                        */
                                       @Override
                                       public void onClick(View v) {
                                           String aux = txtNumber.getText().toString();
                                           txtNumber.setText(aux + "6");
                                       }
                                   }
        );

        Button btnSeven = (Button) findViewById(R.id.btn_seven);
        btnSeven.setOnClickListener(new View.OnClickListener() {
                                       /**
                                        * Called when a view has been clicked.
                                        *
                                        * @param v The view that was clicked.
                                        */
                                       @Override
                                       public void onClick(View v) {
                                           String aux = txtNumber.getText().toString();
                                           txtNumber.setText(aux + "7");
                                       }
                                   }
        );

        Button btnEight = (Button) findViewById(R.id.btn_eight);
        btnEight.setOnClickListener(new View.OnClickListener() {
                                       /**
                                        * Called when a view has been clicked.
                                        *
                                        * @param v The view that was clicked.
                                        */
                                       @Override
                                       public void onClick(View v) {
                                           String aux = txtNumber.getText().toString();
                                           txtNumber.setText(aux + "8");
                                       }
                                   }
        );

        Button btnNine = (Button) findViewById(R.id.btn_nine);
        btnNine.setOnClickListener(new View.OnClickListener() {
                                       /**
                                        * Called when a view has been clicked.
                                        *
                                        * @param v The view that was clicked.
                                        */
                                       @Override
                                       public void onClick(View v) {
                                           String aux = txtNumber.getText().toString();
                                           txtNumber.setText(aux + "9");
                                       }
                                   }
        );

        Button btnClear = (Button) findViewById(R.id.btn_clear);
        btnClear.setOnClickListener(new View.OnClickListener() {
                                       /**
                                        * Called when a view has been clicked.
                                        *
                                        * @param v The view that was clicked.
                                        */
                                       @Override
                                       public void onClick(View v) {

                                           txtNumber.setText("");
                                           num1 = 0.0;
                                           num2 = 0.0;
                                           aux = true;
                                       }
                                   }
        );

        // fim números da calculadora

        // início resultado
        Button btnEqual = (Button) findViewById(R.id.btn_equal);
        btnEqual.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                num2 = Double.parseDouble(txtNumber.getText().toString());
                //Toast.makeText(GridActivity.this, txtNumber.getText().toString(), Toast.LENGTH_LONG).show();
                Double result = 0.0;

                if(aux == false){
                    switch (op){
                        case 1: // +
                            result = num1 + num2;
                            break;
                        case 2: // -
                            result = num1 - num2;
                            break;
                        case 3: // *
                            result = num1 * num2;
                            break;
                        case 4: // /
                            result = num1 / num2;
                            break;
                    }
                    txtNumber.setText(result.toString());

                    aux = true;
                }
            }
        });
        // fim resultado

        // início operadores

        Button btnSum = (Button) findViewById(R.id.btn_sum);
        btnSum.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                op = 1;
                if (aux == true){
                    num1 = Double.parseDouble(txtNumber.getText().toString());
                    aux = false;
                    txtNumber.setText("");
                }
            }
        });

        Button btnSubtraction = (Button) findViewById(R.id.btn_subtraction);
        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                op = 2;
                if (aux == true){
                    num1 = Double.parseDouble(txtNumber.getText().toString());
                    aux = false;
                    txtNumber.setText("");
                }
            }
        });

        Button btnDivision = (Button) findViewById(R.id.btn_division);
        btnDivision.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                op = 4;
                if (aux == true){
                    num1 = Double.parseDouble(txtNumber.getText().toString());
                    aux = false;
                    txtNumber.setText("");
                }
            }
        });

        Button btnMultication = (Button) findViewById(R.id.btn_multication);
        btnMultication.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                op = 3;
                if (aux == true){
                    num1 = Double.parseDouble(txtNumber.getText().toString());
                    aux = false;
                    txtNumber.setText("");
                }
            }
        });
        // fim operadores

    }
}
