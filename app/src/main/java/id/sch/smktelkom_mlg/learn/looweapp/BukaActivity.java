package id.sch.smktelkom_mlg.learn.looweapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class BukaActivity extends AppCompatActivity {
    TextView tvkat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buka);

        tvkat = (TextView) findViewById(R.id.kate);

        tvkat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BukaActivity.this, MainActivity.class));
            }
        });
    }
}
