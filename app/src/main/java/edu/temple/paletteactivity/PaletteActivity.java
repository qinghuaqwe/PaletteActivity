package edu.temple.paletteactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PaletteActivity extends Activity {

    Spinner spinner;
    public static final String EXTRA_MESSAGE = "Color";
    boolean qwe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        qwe = true;

        spinner = findViewById(R.id.spinner);

        String[] Colors = {"White","Red", "Green", "Blue", "Gray", "Yellow"};

        ColorAdapter adapter = new ColorAdapter(PaletteActivity.this, Colors);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                
                if(qwe){
                    qwe = false;
                }

                else {
                    Intent startActivityIntent = new Intent(PaletteActivity.this, CanvasActivity.class);
                    String chosencolor = parent.getItemAtPosition(position).toString();
                    startActivityIntent.putExtra(EXTRA_MESSAGE, chosencolor);
                    startActivity(startActivityIntent);
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

}
