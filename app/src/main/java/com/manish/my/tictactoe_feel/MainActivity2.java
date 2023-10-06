package com.manish.my.tictactoe_feel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity2 extends AppCompatActivity {



    ImageView   button_1,back_1,button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9;
   Button  reset_1;
    TextView scover_1,scover_2;
    int count = 0, xCount = 0, oCount = 0;
    String scover = "";




     private int flag = 0;
    String b1 = "",b2 = "",b3 = "",b4 = "",b5 = "",b6 = "",b7 = "",b8 = "",b9 = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);







        button_1 = (ImageView) findViewById(R.id.button_1);
        button_2 = (ImageView) findViewById(R.id.button_2);
        button_3 = (ImageView) findViewById(R.id.button_3);
        button_4 = (ImageView)findViewById(R.id.button_4);
        button_5 = (ImageView) findViewById(R.id.button_5);
        button_6 = (ImageView) findViewById(R.id.button_6);
        button_7 = (ImageView) findViewById(R.id.button_7);
        button_8 = (ImageView) findViewById(R.id.button_8);
        button_9 = (ImageView) findViewById(R.id.button_9);
        reset_1 = (Button) findViewById(R.id.reset_1);
        back_1= (ImageView) findViewById(R.id.back_1);

        scover_1 = (TextView) findViewById(R.id.scover_1);
        scover_2 = (TextView) findViewById(R.id.scover_2);


        //===============================================================================
        back_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });


        //========================================================================


        reSetBut();


        //====================================================================================


        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              if(b1.equals(""))
              {


                  if(flag == 0)
                  {

                      button_1.setImageResource(R.drawable.ic_xxx);
                      flag = 1;
                      b1 = "x";
                      count ++;

                      winnigGame();

                  }
                  else
                  {
                      button_1.setImageResource(R.drawable.ic_ooo);
                      flag = 0;
                      b1 = "o";
                      count ++;
                      winnigGame();

                  }


              }

            }
        });


        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if(b2.equals("")) {

                    if (flag == 0) {
                        button_2.setImageResource(R.drawable.ic_xxx);
                        flag = 1;
                        b2 = "x";

                        count ++;
                        winnigGame();
                    } else {
                        button_2.setImageResource(R.drawable.ic_ooo);
                        flag = 0;
                        b2 = "o";

                        count ++;
                        winnigGame();

                    }
                }



            }
        });



        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(b3.equals("")) {

                    if (flag == 0) {
                        button_3.setImageResource(R.drawable.ic_xxx);
                        flag = 1;
                        b3 = "x";
                        count ++;
                        winnigGame();
                    } else {
                        button_3.setImageResource(R.drawable.ic_ooo);
                        flag = 0;
                        b3 = "o";
                        count ++;
                        winnigGame();

                    }
                }


            }
        });


        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if(b4.equals("")) {

                    if (flag == 0) {
                        button_4.setImageResource(R.drawable.ic_xxx);
                        flag = 1;
                        b4 = "x";
                        count ++;
                        winnigGame();
                    } else {
                        button_4.setImageResource(R.drawable.ic_ooo);
                        flag = 0;
                        b4 = "o";
                        count ++;
                        winnigGame();

                    }
                }


            }
        });


        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(b5.equals("")) {

                    if (flag == 0) {
                        button_5.setImageResource(R.drawable.ic_xxx);
                        flag = 1;
                        b5 = "x";
                        count ++;
                        winnigGame();


                    } else {
                        button_5.setImageResource(R.drawable.ic_ooo);
                        flag = 0;
                        b5 = "o";
                        count ++;
                        winnigGame();

                    }
                }


            }
        });


        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if(b6.equals("")) {

                    if (flag == 0) {
                        button_6.setImageResource(R.drawable.ic_xxx);
                        flag = 1;
                        b6 = "x";
                        count ++;
                        winnigGame();
                    } else {
                        button_6.setImageResource(R.drawable.ic_ooo);
                        flag = 0;
                        b6 = "o";
                        count ++;
                        winnigGame();

                    }
                }


            }
        });


        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(b7.equals("")) {

                    if (flag == 0) {
                        button_7.setImageResource(R.drawable.ic_xxx);
                        flag = 1;
                        b7= "x";
                        count ++;
                        winnigGame();
                    } else {
                        button_7.setImageResource(R.drawable.ic_ooo);
                        flag = 0;
                        b7 = "o";
                        count ++;
                        winnigGame();

                    }
                }


            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(b8.equals("")) {

                    if (flag == 0) {
                        button_8.setImageResource(R.drawable.ic_xxx);
                        flag = 1;
                        b8 = "x";
                        count ++;
                        winnigGame();
                    } else {
                        button_8.setImageResource(R.drawable.ic_ooo);
                        flag = 0;
                        b8 = "o";
                        count ++;
                        winnigGame();

                    }
                }


            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(b9.equals("")) {

                    if (flag == 0) {
                        button_9.setImageResource(R.drawable.ic_xxx);
                        flag = 1;
                        b9 = "x";
                        count ++;
                        winnigGame();
                    } else {
                        button_9.setImageResource(R.drawable.ic_ooo);
                        flag = 0;
                        b9 = "o";
                        count ++;
                        winnigGame();

                    }
                }


            }
        });



    }


    public void winnigGame()
    {

         
        if(count > 4)
        {
            if(b1.equals(b2) && b2.equals(b3) && !b1.equals(""))
            {

                scover = b1;
               alertDilogBox();
                scoverView();



            }
            else if(b4.equals(b5) && b5.equals(b6) && !b4.equals(""))
            {
                scover = b4;
                alertDilogBox();
                scoverView();


            }
            else  if(b7.equals(b8) && b8.equals(b9) && !b7.equals(""))
            {
                scover = b7;
                alertDilogBox();
                scoverView();


            }
            else if (b1.equals(b4) && b4.equals(b7) && !b1.equals(""))
            {
                scover = b1;
                alertDilogBox();
                scoverView();

            }
            else if (b2.equals(b5) && b5.equals(b8) && !b2.equals(""))
            {
                scover = b2;
                alertDilogBox();
                scoverView();


            }
            else if (b3.equals(b6) && b6.equals(b9) && ! b3.equals(""))
            {
                scover = b3;
                alertDilogBox();
                scoverView();

            }
            else if (b1.equals(b5) && b5.equals(b9) && !b1.equals(""))
            {
                scover = b1;
                alertDilogBox();

                scoverView();

            }
            else if (b3.equals(b5) && b5.equals(b7) && !b3.equals(""))
            {
                scover = b3;
                alertDilogBox();
                scoverView();

            }
            else if (!b1.equals("") && !b2.equals("") && !b3.equals("") && !b4.equals("") && !b5.equals("")
                    && !b6.equals("") && !b7.equals("")&& !b8.equals("")&& !b9.equals(""))
            {
                alertDilogDraw();


            }
        }

    }

//=================================================================================================
    public void alertDilogBox()
    {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.pngeggmy);
        builder.setTitle("player  "+scover + " win");
        builder.setCancelable(false);



         builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                 resetAll();


            }
       });

        builder.show();

    }


    //=========================================================================================

    public void alertDilogDraw()
    {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Match draw");
        builder.setCancelable(false);
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                resetAll();


            }
        });

        builder.show();

    }
    //===========================================================================================

    public void scoverView()
    {
        if(scover.equals("x"))
        {
            xCount++;
            scover_1.setText(String.valueOf(xCount));

        }
        else
        {
            oCount++;
            scover_2.setText(String.valueOf(oCount));
        }

    }


//======================================================================================
    private void reSetBut()
    {

        reset_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                button_1.setImageDrawable(null);
                button_2.setImageDrawable(null);
                button_3.setImageDrawable(null);
                button_4.setImageDrawable(null);
                button_5.setImageDrawable(null);
                button_6.setImageDrawable(null);
                button_7.setImageDrawable(null);
                button_8.setImageDrawable(null);
                button_9.setImageDrawable(null);


                xCount = 0;
                oCount =0;
                scover ="";
                scover_1.setText(String.valueOf(0));
                scover_2.setText(String.valueOf(0));
                count = 0;
                flag = 0;
                b1 = "";
                b2 = "";
                b3 = "";
                b4 = "";
                b5 = "";
                b6 = "";
                b7 = "";
                b8 = "";
                b9 = "";
            }
        });





    }
//================================================================================================

    public  void resetAll()
    {
        button_1.setImageDrawable(null);
        button_2.setImageDrawable(null);
        button_3.setImageDrawable(null);
        button_4.setImageDrawable(null);
        button_5.setImageDrawable(null);
        button_6.setImageDrawable(null);
        button_7.setImageDrawable(null);
        button_8.setImageDrawable(null);
        button_9.setImageDrawable(null);


        scover ="";
        count = 0;
        flag = 0;
        b1 = "";
        b2 = "";
        b3 = "";
        b4 = "";
        b5 = "";
        b6 = "";
        b7 = "";
        b8 = "";
        b9 = "";

    }


}