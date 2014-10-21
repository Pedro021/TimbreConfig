package timbre;


import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;
import timbre.com.timbreconfig.R;

/**
 * Created by Pedro on 15/10/2014.
 */
public class Preference extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preference);

        final SwitchPreference swGral;
        swGral=(SwitchPreference) findPreference("swGral");
        swGral.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(android.preference.Preference preference, Object o) {

                if(!swGral.isChecked())
                {

                    getActivity().startService(new Intent(getActivity(),TimbreService.class));

                }
                else
                {
                    getActivity().stopService(new Intent(getActivity(),TimbreService.class));
                }

                return true;
            }
        });
    }
}
