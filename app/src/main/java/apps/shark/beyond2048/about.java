package apps.shark.beyond2048;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Harsha on 8/17/2017.
 */

public class about extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        Button moreapps= (Button) findViewById(R.id.moreapps);
        Button shareapp= (Button) findViewById(R.id.shareapps);
        Button rate= (Button) findViewById(R.id.rateapp);
        //Button support= (Button) findViewById(R.id.support);
        Button website= (Button) findViewById(R.id.website);

        moreapps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=SHARK+App+Development")));
                }
                catch (android.content.ActivityNotFoundException anfe) {

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=SHARK+App+Development")));
                }
            }
        });

        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://sharkapps.tk")));
            }
        });

        shareapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "4096");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Now play 4096 : Beyond 2048 click here to visit https://sharkapps.tk/ ");
                startActivity(Intent.createChooser(sharingIntent, "Share via"));

            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=apps.shark.beyond2048")));
                }
                catch (android.content.ActivityNotFoundException anfe) {

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?apps.shark.beyond2048")));
                }
            }
        });

    }
}
