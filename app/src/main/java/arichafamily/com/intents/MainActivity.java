package arichafamily.com.intents;

import android.content.Intent;
import android.net.Uri;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_USER_NAME = "UserName";
    EditText etName;
    Button btnYnet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.etName);
        btnYnet = (Button) findViewById(R.id.btnYnet);
    }

    public void toDetails(View view){
        Intent detailsIntent = new Intent(this, DetailsActivity.class);

        detailsIntent.putExtra(EXTRA_USER_NAME, etName.getText().toString());
        detailsIntent.putExtra("Age", 12);

        startActivity(detailsIntent);
    }

    public void toYnet(View view){
        String u = "http://www.ynet.co.il/home/0,7340,L-8,00.html";
        Uri uri = Uri.parse(u);
        Intent ynetIntent = new Intent(Intent.ACTION_VIEW, uri);

        startActivity(ynetIntent);
    }

    public void dial(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0523133559"));
        startActivity(intent);
    }

    public void setAlarm(View view){
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);

        intent.putExtra(AlarmClock.EXTRA_HOUR, 20);
        intent.putExtra(AlarmClock.EXTRA_MINUTES, 30);
        intent.putExtra(AlarmClock.EXTRA_MESSAGE, "Wake up");

        startActivity(intent);
    }

    public void timePicker(View view){
        Intent intent = new Intent(this, timePicker.class);
        startActivity(intent);
    }
}
