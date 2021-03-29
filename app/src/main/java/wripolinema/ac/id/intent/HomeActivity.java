package wripolinema.ac.id.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView message = (TextView) findViewById(R.id.message);
        TextView username = (TextView) findViewById(R.id.username);
        TextView fullname = (TextView) findViewById(R.id.fullNameTextView);
        TextView email = (TextView) findViewById(R.id.emailTextView);
        TextView user = (TextView) findViewById(R.id.usernameTextView);
        TextView password = (TextView) findViewById(R.id.passwordTextView);

        message.setText(getIntent().getStringExtra("message"));
        username.setText(getIntent().getStringExtra("username"));
        fullname.setText(getIntent().getStringExtra("fullname"));
        email.setText(getIntent().getStringExtra("email"));
        user.setText(getIntent().getStringExtra("username"));
        password.setText(getIntent().getStringExtra("password"));
    }
}