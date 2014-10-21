package timbre.com.timbreconfig;

import android.app.Activity;
import android.os.Bundle;

import timbre.Preference;

public  class Configuracion extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display the fragment as the main content.
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content,new Preference())
                .commit();

    }
}
