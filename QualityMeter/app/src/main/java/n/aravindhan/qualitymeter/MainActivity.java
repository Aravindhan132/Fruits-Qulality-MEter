package n.aravindhan.qualitymeter;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);


    }
public void fresh(View view)
{
    Intent i=new Intent(MainActivity.this,Select.class);
    startActivity(i);
}
    public void harm(View view)
    {
        Intent v=new Intent(MainActivity.this,Harm.class);
        startActivity(v);
    }


    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.account: {
                // do your sign-out stuff
                Toast.makeText(getApplicationContext(),"Account",Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.profile: {
                // do your sign-out stuff
                Toast.makeText(getApplicationContext(),"Profile",Toast.LENGTH_LONG).show();
                break;
            }
            // case blocks for other MenuItems (if any)
        }
        return false;
    }
}
