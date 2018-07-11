package com.engim.svilupposw.profilemanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by svilupposw on 20/03/18.
 */

// creiamo la classe ed estendiamo activity, con ctrl + spazio e importiamo AppCompatActivity
public class ShowProfileActivity extends AppCompatActivity {

    // creiamo gli oggetti view creati nell'xml (e istanziati nell'xml)
    private ImageView profilePhoto;
    private TextView nameText;
    private TextView bioText;
    private TextView telText;
    private TextView emailText;

    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.show_profile_activity);

        toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        profilePhoto = findViewById(R.id.profileImage);
        nameText = findViewById(R.id.nameText);
        bioText = findViewById(R.id.bioText);
        telText = findViewById(R.id.telText);
        emailText = findViewById(R.id.emailText);

        //nameText.setText("Nome");
        //bioText.setText("Sono nato a ...");
        //telText.setText("3296476");
        //emailText.setText("mail@mail.com");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_edit) {
            Intent i = new Intent(getApplicationContext(), EditProfileActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
}
