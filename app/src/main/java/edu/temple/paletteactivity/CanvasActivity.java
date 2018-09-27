package edu.temple.paletteactivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CanvasActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        Intent intent = getIntent();

        String colormessage = intent.getStringExtra(PaletteActivity.EXTRA_MESSAGE);

        ConstraintLayout layout = findViewById(R.id.canvas);

        layout.setBackgroundColor(Color.parseColor(colormessage));



    }
}
