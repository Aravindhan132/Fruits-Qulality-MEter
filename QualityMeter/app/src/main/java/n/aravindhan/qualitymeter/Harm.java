package n.aravindhan.qualitymeter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

import n.aravindhan.qualitymeter.R;

public class Harm extends Activity implements AdapterView.OnItemSelectedListener{

    LinearLayout list;
    TextView tv1;
    protected int splashTime = 3000;
    String[] name = {"A", "N", "D", "R", "O", "I", "D"};
    int timer = 0;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harm);
        spinner = (Spinner) findViewById(R.id.spinner);
        list = (LinearLayout)findViewById(R.id.list);

        ArrayAdapter<CharSequence> adapterSpinner = ArrayAdapter.createFromResource(this,
                R.array.number, android.R.layout.simple_spinner_item);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapterSpinner);
        tv1 = (TextView) findViewById(R.id.textView1);
        spinner.setOnItemSelectedListener(this);
    }

    public void addButton(int number){
        list.removeAllViews();
        for(int i = 0; i<number; i++){
            Button button = new Button(getApplicationContext());
            button.setText("Add Time");
            list.addView(button);
        }
    }
    public void apple(){
        list.removeAllViews();
      Button button1=new Button(getApplicationContext());
        Button button2=new Button(getApplicationContext());
        Button button3=new Button(getApplicationContext());
        button1.setText("Chlorpyrifos");
        button2.setText("Monocrotophos");
        button3.setText("Quilalophos");
        final TextView text=new TextView(getApplicationContext());
        list.addView(button1);
        list.addView(button2);
        list.addView(button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();

                int  n = rand.nextInt(50) + 1;
                text.setText("The Value is :"+n);
                list.addView(text);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();

                int  n = rand.nextInt(50) + 1;
                text.setText("The Value is :"+n);
                list.addView(text);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();

                int  n = rand.nextInt(50) + 1;
                text.setText("The Value is :"+n);
                list.addView(text);
            }
        });

    }
    public void orange(){
        list.removeAllViews();
        Button button1=new Button(getApplicationContext());
        Button button2=new Button(getApplicationContext());
        Button button3=new Button(getApplicationContext());
        TextView text=new TextView(getApplicationContext());
        text.setText("Chlorpyrifos");
        button1.setText("Monocrotophos");
        button2.setText("Quilalophos");
    text.setTextSize(30);
        list.addView(button1);
        list.addView(button2);
        list.addView(text);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i){
            case 0:
                apple();
                break;
            case 1:
               orange();
                break;
            case 2:
                addButton(3);
                break;
            case 3:
                addButton(4);
                break;
            case 4:
                addButton(5);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}