package im.ene.lab.gmp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by eneim on 8/14/15.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDefaultMapActivity(View view) {
        Intent intent = new Intent(this, DefaultMapsActivity.class);
        startActivity(intent);
    }

    public void openCustomMapActivity(View view) {
        Intent intent = new Intent(this, CustomMapsActivity.class);
        startActivity(intent);
    }

    public void openMapViewActivity(View view) {
        Intent intent = new Intent(this, MapViewActivity.class);
        startActivity(intent);
    }

    public void openMapViewInFragmentActivity(View view) {
        Intent intent = new Intent(this, MapViewInFragmentActivity.class);
        startActivity(intent);
    }

    public void openMapFragmentInFragmentActivity(View view) {
        Intent intent = new Intent(this, MapFragmentInFragmentActivity.class);
        startActivity(intent);
    }
}
