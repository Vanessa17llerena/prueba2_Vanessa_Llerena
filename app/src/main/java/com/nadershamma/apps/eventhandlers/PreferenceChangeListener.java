package com.nadershamma.apps.eventhandlers;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.widget.Toast;

import com.nadershamma.apps.androidfunwithflags.MainActivity_VELLC;
import com.nadershamma.apps.androidfunwithflags.R;

import java.util.Set;

public class PreferenceChangeListener implements OnSharedPreferenceChangeListener {
    private MainActivity_VELLC mainActivityVELLC;

    public PreferenceChangeListener(MainActivity_VELLC mainActivityVELLC) {
        this.mainActivityVELLC = mainActivityVELLC;
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        this.mainActivityVELLC.setPreferencesChanged(true);

        if (key.equals(this.mainActivityVELLC.getREGIONS())) {
            this.mainActivityVELLC.getQuizViewModel().setGuessRows(sharedPreferences.getString(
                    MainActivity_VELLC.CHOICES, null));
            this.mainActivityVELLC.getQuizFragment().resetQuiz();
        } else if (key.equals(this.mainActivityVELLC.getCHOICES())) {
            Set<String> regions = sharedPreferences.getStringSet(this.mainActivityVELLC.getREGIONS(),
                    null);
            if (regions != null && regions.size() > 0) {
                this.mainActivityVELLC.getQuizViewModel().setRegionsSet(regions);
                this.mainActivityVELLC.getQuizFragment().resetQuiz();
            } else {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                regions.add(this.mainActivityVELLC.getString(R.string.default_region));
                editor.putStringSet(this.mainActivityVELLC.getREGIONS(), regions);
                editor.apply();
                Toast.makeText(this.mainActivityVELLC, R.string.default_region_message,
                        Toast.LENGTH_LONG).show();
            }
        }

        Toast.makeText(this.mainActivityVELLC, R.string.restarting_quiz,
                Toast.LENGTH_SHORT).show();
    }
}
