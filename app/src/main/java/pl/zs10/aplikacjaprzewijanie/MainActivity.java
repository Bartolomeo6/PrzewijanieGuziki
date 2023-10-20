package pl.zs10.aplikacjaprzewijanie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton wGore;
    private ImageButton wDol;

    private Integer punkty = 0;
    private TextView textView;

    /* ------------------------------------ */

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CZAS ZYCIA","Uruchomiona metoda onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CZAS ZYCIA","Uruchomiona metoda onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CZAS ZYCIA","Uruchomiona metoda onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CZAS ZYCIA","Uruchomiona metoda onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CZAS ZYCIA","Uruchomiona metoda onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CZAS ZYCIA","Uruchomiona metoda onStop");
    }

    /* ------------------------------------ */

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("CZAS ZYCIA","Uruchomiona metoda onSaveInstanceState");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("CZAS ZYCIA","Uruchomiona metoda onCreate");

        wGore = findViewById(R.id.imageButton);
        wDol = findViewById(R.id.imageButton2);
        textView = findViewById(R.id.textView);

        wGore.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty++;
                        textView.setText(punkty.toString());
                    }
                }
        );

        wDol.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty--;
                        textView.setText(punkty.toString());
                    }
                }
        );
    }
}