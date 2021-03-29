package wripolinema.ac.id.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = (EditText) findViewById(R.id.userNameEditText);
        EditText password = (EditText) findViewById(R.id.passwordEditText);
        Button login = (Button) findViewById(R.id.loginButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(MainActivity.this, HomeActivity.class);
                login.putExtra("message", "Anda Berhasil Login");
                login.putExtra("username", username.getText().toString());
                login.putExtra("password", password.getText().toString());
                startActivity(login);
            }
        });
    }

    public void register(View view) {
        Intent register = new Intent(MainActivity.this, Register.class);
        startActivity(register);
    }
}