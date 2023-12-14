package com.example.asteroides;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.EditTextPreference;
import androidx.preference.PreferenceFragmentCompat;

public class Preferencias extends AppCompatActivity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        MyPreferenceFragment mPF = new MyPreferenceFragment();
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, mPF).commit();
        getSupportFragmentManager().executePendingTransactions();

        final EditTextPreference fragmentos = mPF.findPreference("fragmentos");
        fragmentos.setOnPreferenceChangeListener((preference, newValue) -> {
            int valor;
            try {
                valor = Integer.parseInt((String) newValue);
            } catch (Exception e) {
                Toast.makeText(context, "Ha ser un número", Toast.LENGTH_SHORT).show();
                return false;
            }
            if (valor >= 0 && valor <= 9) {
                fragmentos.setSummary("En cuántos trozos se divide un asteroide (" + valor + ")");
                return true;
            } else {
                Toast.makeText(context, "Máximo de fragmentos 9", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    public static class MyPreferenceFragment extends PreferenceFragmentCompat {
        public void onCreate(final Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferencias);
        }
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {

        }
    }
}
