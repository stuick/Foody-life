package com.example.foodylife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView starterCard;
    CardView mainCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starterCard = findViewById(R.id.card_view_starters);
        mainCard = findViewById(R.id.card_view_main_course);

        starterCard.setOnClickListener(v -> {

            Intent starterActivityIntent = new Intent(
                    MainActivity.this, StartersActivity.class);

            startActivity(starterActivityIntent);
        });

        mainCard.setOnClickListener(v->{
            Intent mainActivityIntent = new Intent(
                    MainActivity.this, MainCoursesActivity.class);
            startActivity(mainActivityIntent);
        });

        TextView emailTextView = findViewById(R.id.text_view_email_address);
        emailTextView.setOnClickListener(v->{
            Intent launchEmailApp = new Intent(Intent.ACTION_SENDTO);
            launchEmailApp.setData(Uri.parse("mailto:stuick@gmail.com")); // Only email apps handle this.
            startActivity(launchEmailApp);
        });

        CardView dessertsCard = findViewById(R.id.card_view_desserts);
        dessertsCard.setOnClickListener(v->{
            Intent dessertActivityIntent = new Intent(
                    MainActivity.this, DessertsActivity.class);
            startActivity(dessertActivityIntent);
        });
    }
}