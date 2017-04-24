package arichafamily.com.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();

        String userName = intent.getStringExtra(MainActivity.EXTRA_USER_NAME);
        Toast.makeText(this, "Hello, " + userName, Toast.LENGTH_SHORT).show();
    }
}
