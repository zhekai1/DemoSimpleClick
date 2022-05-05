package sg.edu.rp.c346.id21024750.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {



    Button btnCLickMe;
    EditText etInput;
    TextView tv;
    ToggleButton tbtn;
    RadioGroup rgGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCLickMe = findViewById(R.id.btnClickMe);
        tv = findViewById(R.id.tv);
        etInput = findViewById(R.id.etInput);
        tbtn = findViewById(R.id.toggleButton);
        rgGender = findViewById(R.id.rgGender);

        btnCLickMe.setOnClickListener(new View.OnClickListener(){;
            @Override
            public void onClick (View view){
                if (tbtn.isChecked() == true) {
                    String data = etInput.getText().toString();
                    int selectedId = rgGender.getCheckedRadioButtonId();

                    if (selectedId == R.id.rbMale){
                        tv.setText("Hi Mr, \n" + data);
                    } else {
                        tv.setText("Hi Ms, \n" + data);
                    }
                }
        }
    });

        tbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (tbtn.isChecked() == true) {
                    btnCLickMe.setEnabled(true);
                } else {
                    btnCLickMe.setEnabled(false);

                }
            }
        });

    }
}