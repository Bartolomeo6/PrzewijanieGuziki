package pl.zs10.aplikacjaprzewijanie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton wGore;
    private ImageButton wDol;

    private Integer punkty = 0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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