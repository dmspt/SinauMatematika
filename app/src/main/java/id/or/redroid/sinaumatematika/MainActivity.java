package id.or.redroid.sinaumatematika;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_materi = (Button) findViewById(R.id.btn_materi);
        Button btn_istilah = (Button) findViewById(R.id.btn_istilah);
        Button btn_sejarah = (Button) findViewById(R.id.btn_sejarah);
        Button btn_info = (Button) findViewById(R.id.btn_info);

        btn_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent movee = new Intent(MainActivity.this, MateriActivity.class);
                startActivity(movee);
            }
        });

        btn_istilah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(MainActivity.this, IstilahActivity.class);
                startActivity(move);
            }
        });

        btn_sejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveee = new Intent(MainActivity.this, SejarahActivity.class);
                startActivity(moveee);
            }
        });

        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent movve = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(movve);
            }
        });
    }
}
