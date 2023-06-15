package com.example.roommate;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class dashboard extends AppCompatActivity {
    TextView tvR,tvPython;
    PieChart pieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().setTitle("Dashboard");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("Black")));
        getSupportActionBar().show();
        Intent i=getIntent();
        pieChart=findViewById(R.id.piechart);
        tvR=findViewById(R.id.tvR);
        tvPython=findViewById(R.id.tvPython);
        setData();
    }

private void setData()
{

    // Set the percentage of language used
    tvR.setText(Integer.toString(15));
    tvPython.setText(Integer.toString(2));


    // Set the data and color to the pie chart
    pieChart.addPieSlice(
            new PieModel(
                    "Present",
                    Integer.parseInt(tvR.getText().toString()),
                    Color.parseColor("#00FF0A")));
    pieChart.addPieSlice(
            new PieModel(
                    "Absent",
                    Integer.parseInt(tvPython.getText().toString()),
                    Color.parseColor("#FF1100")));


    // To animate the pie chart
    pieChart.startAnimation();
}
}