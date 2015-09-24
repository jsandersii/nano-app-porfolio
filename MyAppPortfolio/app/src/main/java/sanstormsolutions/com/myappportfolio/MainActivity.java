package sanstormsolutions.com.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name)); // Set toolbar text to app label

        // Create a Button listener
        View.OnClickListener OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strToast = getResources().getString(R.string.toastMessage);
                switch (view.getId()) {
                    case R.id.content_main_btnSpotify:
                        Toast.makeText(MainActivity.this, strToast + " Spotify App!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.content_main_btnScores:
                        Toast.makeText(MainActivity.this, strToast + " Scores App!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.content_main_btnLibrary:
                        Toast.makeText(MainActivity.this, strToast + " Library App!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.content_main_btnBigger:
                        Toast.makeText(MainActivity.this, strToast + " Build it Bigger App!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.content_main_btnXYZ:
                        Toast.makeText(MainActivity.this, strToast + " XYZ Reader App!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.content_main_btnCapstone:
                        Toast.makeText(MainActivity.this, strToast + " Capstone App!", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };

        // Find Button Views & set Onclick listeners
        Button spotify = (Button) findViewById(R.id.content_main_btnSpotify);
        spotify.setOnClickListener(OnClickListener);
        Button scores = (Button) findViewById(R.id.content_main_btnScores);
        scores.setOnClickListener(OnClickListener);
        Button library = (Button) findViewById(R.id.content_main_btnLibrary);
        library.setOnClickListener(OnClickListener);
        Button bigger = (Button) findViewById(R.id.content_main_btnBigger);
        bigger.setOnClickListener(OnClickListener);
        Button xyz = (Button) findViewById(R.id.content_main_btnXYZ);
        xyz.setOnClickListener(OnClickListener);
        Button capstone = (Button) findViewById(R.id.content_main_btnCapstone);
        capstone.setOnClickListener(OnClickListener);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
