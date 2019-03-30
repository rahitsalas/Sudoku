package com.example.tecsup.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn[];
    boolean flagcito = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = new Button[9];
        for (int i=1; i<=btn.length; i++){
            String buton = "btn"+Integer.toString(i);
            int resID = getResources().getIdentifier(buton, "id", getPackageName());
            btn[i-1] = (Button)findViewById(resID);
        }


        for (int i = 0; i < btn.length; i++) {
            final Button botoncito = btn[i];

            botoncito.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (botoncito.getText().equals("-") && flagcito==true) {
                        botoncito.setText("X");
                        flagcito = false;
                    }
                    else
                        if (botoncito.getText().equals("-") && flagcito==false) {
                        botoncito.setText("O");
                            flagcito = true;
                        }
                        else {
                        Toast.makeText(getApplicationContext(), "Casilla Ocupada", Toast.LENGTH_LONG).show();
                        }

                }

            });
        }



}
    public static void ganador(Button[] botones){
        if(botones[0].getText().equals(botones[1]) && botones[1].getText().equals(botones[2])){

        }
        if(botones[3].getText().equals(botones[4]) && botones[5].getText().equals(botones[2])){

        }
        if(botones[0].getText().equals(botones[1]) && botones[1].getText().equals(botones[2])){

        }
        if(botones[0].getText().equals(botones[1]) && botones[1].getText().equals(botones[2])){

        }
        if(botones[0].getText().equals(botones[1]) && botones[1].getText().equals(botones[2])){

        }
        if(botones[0].getText().equals(botones[1]) && botones[1].getText().equals(botones[2])){

        }
        if(botones[0].getText().equals(botones[1]) && botones[1].getText().equals(botones[2])){

        }
        if(botones[0].getText().equals(botones[1]) && botones[1].getText().equals(botones[2])){

        }
        if(botones[0].getText().equals(botones[1]) && botones[1].getText().equals(botones[2])){

        }
        if(botones[0].getText().equals(botones[1]) && botones[1].getText().equals(botones[2])){

        }
    }
}
