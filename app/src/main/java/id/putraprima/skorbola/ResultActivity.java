package id.putraprima.skorbola;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private TextView winTeamText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        winTeamText = findViewById(R.id.textView3);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            winTeamText.setText(extras.getString(MatchActivity.WIN_KEY));
        }
    }
}