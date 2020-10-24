package com.example.currencyconverter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.currencyconverter.R;

public class MainActivity extends AppCompatActivity {
    String[] currencyNames = {"USD", "EGP", "EUR", "KWD", "SAR"};

    String[] currencyDescriptions = {"US Dollar", "EG Pound", "EU Euro", "KW Dinar", "Saudi Riyal"};

    int[] images = {R.drawable.usd, R.drawable.eg, R.drawable.eur,
            R.drawable.kw, R.drawable.sa};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);


        final EditText ed = (EditText) findViewById(R.id.amounte);
        final Spinner sourceSpanner = (Spinner) findViewById(R.id.currencySourceSpinner);
        final Spinner fromspinner = (Spinner) findViewById(R.id.currencyFromSpinner);
        final TextView finalamount = findViewById(R.id.finals_currency);
        CurrencyAdapter currencySourceAdapter = new CurrencyAdapter(MainActivity.this, R.layout.spinner_item, currencyNames);
        sourceSpanner.setAdapter(currencySourceAdapter);

        CurrencyAdapter currencyfromAdapter = new CurrencyAdapter(MainActivity.this, R.layout.spinner_item, currencyNames);
        fromspinner.setAdapter(currencyfromAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double conv;
                double amount = Double.parseDouble(ed.getText().toString());
                if (sourceSpanner.getSelectedItem().toString().equals("EGP") && fromspinner.getSelectedItem().toString().equals("USD")) {
                    conv = amount * 0.064;
                    finalamount.setText(conv + " $");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("EGP") && fromspinner.getSelectedItem().toString().equals("EGP")) {
                    conv = amount;
                    finalamount.setText(conv + " EGP");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("EGP") && fromspinner.getSelectedItem().toString().equals("EUR")) {
                    conv = amount * 0.054;
                    finalamount.setText(conv + " €");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("EGP") && fromspinner.getSelectedItem().toString().equals("KWD")) {
                    conv = amount * 0.23;
                    finalamount.setText(conv + " KD");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("EGP") && fromspinner.getSelectedItem().toString().equals("SAR")) {
                    conv = amount * 0.24;
                    finalamount.setText(conv + " SAR");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("USD") && fromspinner.getSelectedItem().toString().equals("USD")) {
                    conv = amount;
                    finalamount.setText(conv + " $");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("USD") && fromspinner.getSelectedItem().toString().equals("EGP")) {
                    conv = amount * 15.71;
                    finalamount.setText(conv + " EGP");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("USD") && fromspinner.getSelectedItem().toString().equals("EUR")) {
                    conv = amount * 0.84;
                    finalamount.setText(conv + " €");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("USD") && fromspinner.getSelectedItem().toString().equals("KWD")) {
                    conv = amount * 0.31;
                    finalamount.setText(conv + " KD");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("USD") && fromspinner.getSelectedItem().toString().equals("SAR")) {
                    conv = amount * 3.75;
                    finalamount.setText(conv + " SAR");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("EUR") && fromspinner.getSelectedItem().toString().equals("EUR")) {
                    conv = amount;
                    finalamount.setText(conv + " €");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("EUR") && fromspinner.getSelectedItem().toString().equals("EGP")) {
                    conv = amount * 18.63;
                    finalamount.setText(conv + " EGP");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("EUR") && fromspinner.getSelectedItem().toString().equals("USD")) {
                    conv = amount * 1.19;
                    finalamount.setText(conv + " $");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("EUR") && fromspinner.getSelectedItem().toString().equals("KWD")) {
                    conv = amount * 0.36;
                    finalamount.setText(conv + " KD");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("EUR") && fromspinner.getSelectedItem().toString().equals("SAR")) {
                    conv = amount * 4.45;
                    finalamount.setText(conv + " SAR");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("KWD") && fromspinner.getSelectedItem().toString().equals("KWD")) {
                    conv = amount;
                    finalamount.setText(conv + " KWD");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("KWD") && fromspinner.getSelectedItem().toString().equals("EGP")) {
                    conv = amount * 51.41;
                    finalamount.setText(conv + " EGP");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("KWD") && fromspinner.getSelectedItem().toString().equals("USD")) {
                    conv = amount * 3.27;
                    finalamount.setText(conv + " $");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("KWD") && fromspinner.getSelectedItem().toString().equals("EUR")) {
                    conv = amount * 2.76;
                    finalamount.setText(conv + " €");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("KWD") && fromspinner.getSelectedItem().toString().equals("SAR")) {
                    conv = amount * 12.27;
                    finalamount.setText(conv + " SAR");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("SAR") && fromspinner.getSelectedItem().toString().equals("SAR")) {
                    conv = amount;
                    finalamount.setText(conv + " SAR");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("SAR") && fromspinner.getSelectedItem().toString().equals("EGP")) {
                    conv = amount * 4.19;
                    finalamount.setText(conv + "  EGP");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("SAR") && fromspinner.getSelectedItem().toString().equals("USD")) {
                    conv = amount * 0.27;
                    finalamount.setText(conv + " $");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("SAR") && fromspinner.getSelectedItem().toString().equals("EUR")) {
                    conv = amount * 0.22;
                    finalamount.setText(conv + " €");
                }
                if (sourceSpanner.getSelectedItem().toString().equals("SAR") && fromspinner.getSelectedItem().toString().equals("KWD")) {
                    conv = amount * 0.081;
                    finalamount.setText(conv + " KWD");
                }
            }
        });


    }


    public class CurrencyAdapter extends ArrayAdapter<String> {

        LayoutInflater inflater;
        int groupid;

        public CurrencyAdapter(Context context, int groupid, String[] objects) {
            super(context, groupid, objects);

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.groupid = groupid;
        }

        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        public View getCustomView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = getLayoutInflater();
            View row = inflater.inflate(R.layout.spinner_item, parent, false);
            TextView tvName = (TextView) row.findViewById(R.id.name);
            tvName.setText(currencyNames[position]);

            TextView tvDesc = (TextView) row.findViewById(R.id.desc);
            tvDesc.setText(currencyDescriptions[position]);

            ImageView icon = (ImageView) row.findViewById(R.id.image);
            icon.setImageResource(images[position]);

            return row;
        }
    }

}