
package com.android.settings.razor;

import android.os.Bundle;

import com.android.settings.InstrumentedFragment;
import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class RazorSettings extends SettingsPreferenceFragment {

     @Override
     public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);

          addPreferencesFromResource(R.xml.razor_settings);
     }

     @Override
     protected int getMetricsCategory() {
         return InstrumentedFragment.RAZORSETTINGS;
     }
 }
