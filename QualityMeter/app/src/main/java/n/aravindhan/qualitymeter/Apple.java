package n.aravindhan.qualitymeter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Apple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);
    }
    public void function(View view){
        Intent i=new Intent(Apple.this,Chat.class);
        startActivity(i);
    }
}
