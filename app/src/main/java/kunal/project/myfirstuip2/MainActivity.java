package kunal.project.myfirstuip2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mcount = 0;
    private TextView mshowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowCount = findViewById(R.id.Show_count);
    }

    public void showToast(View view) {
        Context context = getApplicationContext();
        Toast text = Toast.makeText(context, R.string.Toast_message, Toast.LENGTH_LONG);
        showToast();
    }

    private void showToast() {
    }

    public void countup(View view) {
        mcount++;
        if (mshowCount !=null) {
            mshowCount.setText(Integer.toString(mcount));
        }
    }
}