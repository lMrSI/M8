package com.example.ejemplosgraficos;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class EjemploGraficosActivity extends AppCompatActivity {

    @Override
    public void onCreate (Bundle saveInstanceBundle) {
        super.onCreate(saveInstanceBundle);
        setContentView(new EjemploView (this));
    }

    public class EjemploView extends View {
        private Drawable miImagen;
        public EjemploView (Context context){
            super(context);

            //miImagen = ContextCompat.getDrawable(context, R.mipmap.ic_launcher);
            miImagen = ContextCompat.getDrawable(context, R.drawable.estrella);
            miImagen.setBounds(30, 30, 1000, 1000);
            //miImagen = ContextCompat.getDrawable(context, R.drawable.baseline_arrow_drop_up_24);
            //miImagen.setBounds(30,30,1000,1000);
            //miImagen = ContextCompat.getDrawable(context, R.drawable.caesar);
            //miImagen.setBounds(30,30,1000,1000);
        }

        @Override
        protected void onDraw(Canvas canvas){
            miImagen.draw(canvas);
        }

        /*
        Parte1
        @Override
        protected void onDraw(Canvas canvas){
            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(150, 150, 100, pincel);
            //pincel.setColor(Color.argb(127, 255, 0, 0));
            pincel.setColor(EjemploGraficosActivity.this.getColor(R.color.color_circulo));
            canvas.drawCircle(150, 250, 100, pincel);
        }
         */
        /*
        Parte2
        @Override
        protected void onDraw(Canvas canvas){
            Path trazo = new Path();
            trazo.moveTo(50, 100);
            trazo.cubicTo(60, 70, 150, 90, 200, 110);
            trazo.lineTo(300, 200);
            canvas.drawColor(Color.WHITE);
            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Paint.Style.STROKE);
            canvas.drawPath(trazo, pincel);
            pincel.setStrokeWidth(1);
            pincel.setStyle(Paint.Style.FILL);
            pincel.setTextSize(20);
            pincel.setTypeface(Typeface.SANS_SERIF);
            canvas.drawTextOnPath("Desarrollo de aplicaciones móviles con Android", trazo, 0, -40, pincel);
        }
         */


    }
}
