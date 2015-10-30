package com.system_process.hellostudio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.asus.amax.hellostudio.R;

public class DynamicActivity extends Activity implements View.OnClickListener {
    EditText edit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a TableLayout and set it as main content view of this Activity
        TableLayout table = new TableLayout(this);
        super.setContentView(table);

        // Create a EditText and clean it to TableLayout
        edit = new EditText(this);
        edit.setText("EditText");
        table.addView(edit);

        // Create a Button with onClick event and clean it to TableLayout
        Button clean = new Button(this);
        clean.setText("C");
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText("");
            }
        });
        table.addView(clean);


        // Instantiates the operator.xml layout file into its corresponding View objects.
        View operators = getLayoutInflater().inflate(R.layout.operators, null);
// Now we can add it to a ViewGroup
        table.addView(operators);

        // More Buttons
        int i = 1;
        for (int row = 0; row <= 2; row++) {
            TableRow tr = new TableRow(this);
            for (int col = 0; col <= 2; col++) {
                Button button = new Button(this);
                button.setText("" + i++);
                button.setOnClickListener(this);
                tr.addView(button);
            }
            table.addView(tr);
        }

        // 取得傳遞過來的資料
        Intent intent = this.getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", 36); // 預設值為36
        edit.setText(name + " is " + age + " years old");
    }

    // Activity can implement onClick event as well,
    // the same onClick callback can be used for a couple of Buttons
    public void onClick(View view) {
        Button button = (Button) view;
        edit.append(button.getText());

        // 回送資料
        Intent intentResult = getIntent();
        Bundle bundle = new Bundle();
        bundle.putString("fullname", "Eaway Lu");
        intentResult.putExtras(bundle);
        setResult(RESULT_OK, intentResult);
        finish();
    }
}