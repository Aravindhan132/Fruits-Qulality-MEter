package n.aravindhan.qualitymeter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Fresh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresh);
        DataHelper dataHelper=new DataHelper(this);
        dataHelper.insertinformation(" Select the Fruit You Want");
        dataHelper.insertinformation("");
        dataHelper.insertinformation("Orange");
        dataHelper.insertinformation("Mango");
        ArrayList<String> listpro=dataHelper.getAllproviciences();
        final Spinner spinner=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.spin_layout,R.id.txt,listpro);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(getApplicationContext(),"Select Valid Fruit",Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Intent i=new Intent(Fresh.this,Apple.class);
                        startActivity(i);
                        break;
                    case 2:
                        Intent j=new Intent(Fresh.this,Orange.class);
                        startActivity(j);
                        break;
                    case 3:
                        Intent k=new Intent(Fresh.this,Mango.class);
                        startActivity(k);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
