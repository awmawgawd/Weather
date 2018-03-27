package com.example.android.weather.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private String createWeatherMessage(int temperature, String cityName) {
        return "Welcome to San Francisco where the temperature is " + temperature + "°F.";
    }
    public void displayMessage(View view){
        String message = createWeatherMessage(77, "San Francisco");
        TextView text = (TextView) findViewById(R.id.weatherTV);
        text.setText(message);
    }
}
