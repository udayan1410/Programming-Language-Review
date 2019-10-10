package com.codecenter1430gmail.programminglanguagereview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class Main3Activity extends AppCompatActivity {

    CardView cd1,cd2,cd3,cd4;
    Intent i;
    boolean connected = false;
    ConnectivityManager connectivityManager;
    AlertDialog.Builder alertDialogBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        setContentView(R.layout.activity_main3);

        getSupportActionBar().setTitle("Select Language");
        getSupportActionBar().hide();
        cd1 = (CardView)findViewById(R.id.cd1);
        cd2 = (CardView)findViewById(R.id.cd2);
        cd3 = (CardView)findViewById(R.id.cd3);
        cd4=(CardView)findViewById(R.id.olcompiler);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(),R.color.Statusbar));
        }

        ImageView bgimg = (ImageView)findViewById(R.id.bgimg);
        Picasso.with(getApplicationContext()).load(R.drawable.proga).into(bgimg);

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(getApplicationContext(),Specialise.class);
                i.putExtra("language","C");
                startActivity(i);
            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(getApplicationContext(),Specialise.class);
                i.putExtra("language","C++");
                startActivity(i);
            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(getApplicationContext(),Specialise.class);
                i.putExtra("language","Java");
                startActivity(i);
            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                connectivityManager = (ConnectivityManager)getSystemService(getApplicationContext().CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    connected = true;
                    i = new Intent(getApplicationContext(),OnlineCompiler.class);
                    startActivity(i);

                }
                else {
                    connected = false;
                    alertDialogBuilder = new AlertDialog.Builder(Main3Activity.this);
                    alertDialogBuilder.setMessage("No Internet Detected. Loading previos images").setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
                    AlertDialog builder = alertDialogBuilder.create();
                    builder.show();

                }

            }
        });

    }
}
