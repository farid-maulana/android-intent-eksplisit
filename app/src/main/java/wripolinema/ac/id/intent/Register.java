package wripolinema.ac.id.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText fullname = (EditText) findViewById(R.id.fullNameEditText);
        EditText email = (EditText) findViewById(R.id.emailEditText);
        EditText username = (EditText) findViewById(R.id.userNameEditText);
        EditText password = (EditText) findViewById(R.id.passwordEditText);
        Button register = (Button) findViewById(R.id.registerButton);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register = new Intent(Register.this, HomeActivity.class);
                register.putExtra("message", "Register berhasil");
                register.putExtra("fullname", fullname.getText().toString());
                register.putExtra("email", email.getText().toString());
                register.putExtra("username", username.getText().toString());
                register.putExtra("password", password.getText().toString());
                startActivity(register);
            }
        });
    }

    public void login(View view) {
        Intent login = new Intent(Register.this, MainActivity.class);
        startActivity(login);
    }
}