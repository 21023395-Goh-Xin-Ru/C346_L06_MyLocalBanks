package sg.edu.rp.c346.id21023395.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout dbs;
    LinearLayout ocbc;
    LinearLayout uob;

    TextView tvDBS, tvOCBC, tvUOB;
    String ViewClicked = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbs = findViewById(R.id.DBS);
        ocbc = findViewById(R.id.OCBC);
        uob = findViewById(R.id.UOB);
        registerForContextMenu(dbs);
        registerForContextMenu(ocbc);
        registerForContextMenu(uob);

        tvDBS = findViewById(R.id.tvDBS);
        tvOCBC = findViewById(R.id.tvOCBC);
        tvUOB = findViewById(R.id.tvUOB);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            tvDBS.setText(getString(R.string.dbs));
            tvOCBC.setText(getString(R.string.ocbc));
            tvUOB.setText(getString(R.string.uob));
            return true;
        } else if (id == R.id.ChineseSelection) {
            tvDBS.setText(getString(R.string.dbsCH));
            tvOCBC.setText(getString(R.string.ocbcCH));
            tvUOB.setText(getString(R.string.uobCH));
            return true;
        } else {
            tvDBS.setText("Error translation");
            tvOCBC.setText("Error translation");
            tvUOB.setText("Error translation");
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if (v == dbs){
            ViewClicked = "DBS";
        } else if (v == ocbc){
            ViewClicked = "OCBC";
        } else if (v == uob){
            ViewClicked = "UOB";
        }
        menu.add(0,0,0,getString(R.string.menu_1));
        menu.add(0,1,1,getString(R.string.menu_2));
        menu.add(0,2,2,getString(R.string.menu_3));
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (ViewClicked.equalsIgnoreCase("DBS")) {
            if (item.getItemId() == 0) { //check whether the selected menu is "Website"
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(getString(R.string.dbsUrl)));
                startActivity(intent);
                return true; //menu item successfully handled
            } else if (item.getItemId() == 1) { //check whether the selected menu is "Contact the bank"
                Intent intentCall = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:" + getString(R.string.dbsNum)));
                startActivity(intentCall);
                return true;  //menu item successfully handled
            } else if (item.getItemId() == 2) { //check whether the selected menu is "Toggle Favourite"
                if (tvDBS.getCurrentTextColor() == Color.RED) {
                    tvDBS.setTextColor(Color.BLACK);
                    Drawable drawable = tvDBS.getCompoundDrawables()[0];
                    drawable.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN);
                    tvDBS.setCompoundDrawables(drawable, null, null, null);
                } else if (tvDBS.getCurrentTextColor() == Color.BLACK) {
                    tvDBS.setTextColor(Color.RED);
                    Drawable drawable = tvDBS.getCompoundDrawables()[0];
                    drawable.setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
                    tvDBS.setCompoundDrawables(drawable, null, null, null);
                }
                return true;
            }

        } else if (ViewClicked.equalsIgnoreCase("OCBC")) {
            if (item.getItemId() == 0) { //check whether the selected menu is "Website"
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(getString(R.string.ocbcUrl)));
                startActivity(intent);
                return true; //menu item successfully handled
            } else if (item.getItemId() == 1) { //check whether the selected menu is "Contact the bank"
                Intent intentCall = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:" + getString(R.string.ocbcNum)));
                startActivity(intentCall);
                return true;  //menu item successfully handled
            } else if (item.getItemId() == 2) { //check whether the selected menu is "Toggle Favourite"
                if (tvOCBC.getCurrentTextColor() == Color.RED) {
                    tvOCBC.setTextColor(Color.BLACK);
                    Drawable drawable = tvOCBC.getCompoundDrawables()[0];
                    drawable.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN);
                    tvOCBC.setCompoundDrawables(drawable, null, null, null);
                } else if (tvOCBC.getCurrentTextColor() == Color.BLACK) {
                    tvOCBC.setTextColor(Color.RED);
                    Drawable drawable = tvOCBC.getCompoundDrawables()[0];
                    drawable.setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
                    tvOCBC.setCompoundDrawables(drawable, null, null, null);
                }
                return true;
            }

        } else if (ViewClicked.equalsIgnoreCase("UOB")) {
            if (item.getItemId() == 0) { //check whether the selected menu is "Website"
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(getString(R.string.uobUrl)));
                startActivity(intent);
                return true; //menu item successfully handled
            } else if (item.getItemId() == 1) { //check whether the selected menu is "Contact the bank"
                Intent intentCall = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:" + getString(R.string.uobNum)));
                startActivity(intentCall);
                return true;  //menu item successfully handled
            } else if (item.getItemId() == 2) { //check whether the selected menu is "Toggle Favourite"
                if (tvUOB.getCurrentTextColor() == Color.RED) {
                    tvUOB.setTextColor(Color.BLACK);
                    TextView tvUOB = findViewById(R.id.tvUOB);
                    Drawable drawable = tvUOB.getCompoundDrawables()[0];
                    drawable.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN);
                    tvUOB.setCompoundDrawables(drawable, null, null, null);

                } else if (tvUOB.getCurrentTextColor() == Color.BLACK) {
                    tvUOB.setTextColor(Color.RED);
                    Drawable drawable = tvUOB.getCompoundDrawables()[0];
                    drawable.setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
                    tvUOB.setCompoundDrawables(drawable, null, null, null);
                }
            }
        }

        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }
}