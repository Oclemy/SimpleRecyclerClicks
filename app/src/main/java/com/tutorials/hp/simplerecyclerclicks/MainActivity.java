package com.tutorials.hp.simplerecyclerclicks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.jaychang.srv.SimpleCell;
import com.jaychang.srv.SimpleRecyclerView;
import java.util.ArrayList;
import java.util.List;
/*
- Our MainActivity class.
- Derives from AppCompatActivity.
- bindData will bind data to our recyclerview.
 */
public class MainActivity extends AppCompatActivity {

    SimpleRecyclerView simpleRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleRecyclerView=findViewById(R.id.recyclerView);
        this.bindData();
    }

    /*
    - BIND DATA
    - Loop through data source creating cells.
     */
    private void bindData() {

        List<Galaxy> galaxies = getData();
        List<GalaxyCell> cells = new ArrayList<>();

        for (Galaxy Galaxy : galaxies) {
            GalaxyCell cell = new GalaxyCell(Galaxy);

            // HANDLE ONCLICK LISTENER
            cell.setOnCellClickListener2(new SimpleCell.OnCellClickListener2<GalaxyCell, GalaxyCell.ViewHolder, Galaxy>() {
                @Override
                public void onCellClicked(GalaxyCell GalaxyCell, GalaxyCell.ViewHolder viewHolder, Galaxy item) {
                    Toast.makeText(MainActivity.this, item.getName(), Toast.LENGTH_SHORT).show();
                }
            });

            //HANDLE ONLONGCLICK
            cell.setOnCellLongClickListener2(new SimpleCell.OnCellLongClickListener2<GalaxyCell, GalaxyCell.ViewHolder, Galaxy>() {
                @Override
                public void onCellLongClicked(GalaxyCell GalaxyCell, GalaxyCell.ViewHolder viewHolder, Galaxy item) {
                    Toast.makeText(MainActivity.this, item.getDescription(), Toast.LENGTH_SHORT).show();
                }
            });

            //ADD CELL
            cells.add(cell);
        }
		simpleRecyclerView.addCells(cells);
    }

    /*
    - Data Source
     */
    private ArrayList<Galaxy> getData()
    {
        ArrayList<Galaxy> galaxies=new ArrayList<>();

        Galaxy g=new Galaxy("Whirlpool",
                "The Whirlpool Galaxy, also known as Messier 51a, M51a, and NGC 5194, is an interacting grand-design spiral Galaxy with a Seyfert 2 active galactic nucleus in the constellation Canes Venatici.",
                R.drawable.whirlpool);
        galaxies.add(g);

        g=new Galaxy("Triangulumn",
                "The Triangulum Galaxy is a spiral Galaxy approximately 3 million light-years from Earth in the constellation Triangulum",
                R.drawable.triangulum);
        galaxies.add(g);

        g=new Galaxy("Milky Way",
                "The Milky Way is the Galaxy that contains our Solar System." +
                        " The descriptive milky is derived from the appearance from Earth of the Galaxy – a band of light seen in the night sky formed from stars",
                R.drawable.milkyway);
        galaxies.add(g);

        g=new Galaxy("Andromeda",
                "The Andromeda Galaxy, also known as Messier 31, M31, or NGC 224, is a spiral Galaxy approximately 780 kiloparsecs from Earth. It is the nearest major Galaxy to the Milky Way and was often referred to as the Great Andromeda Nebula in older texts.",
                R.drawable.andromeda);
        galaxies.add(g);

        g=new Galaxy("Messier 81",
                "Messier 81 is a spiral Galaxy about 12 million light-years away in the constellation Ursa Major. Due to its proximity to Earth, large size and active galactic nucleus, Messier 81 has been studied extensively by professional astronomers.",
                R.drawable.messier81);
        galaxies.add(g);

        g=new Galaxy("Cosmos Redshift",
                "Cosmos Redshift 7 is a high-redshift Lyman-alpha emitter Galaxy, in the constellation Sextans, about 12.9 billion light travel distance years from Earth, reported to contain the first stars —formed ",
                R.drawable.cosmosredshift);
        galaxies.add(g);

        g=new Galaxy("StarBust",
                "A starburst Galaxy is a Galaxy undergoing an exceptionally high rate of star formation, as compared to the long-term average rate of star formation in the Galaxy or the star formation rate observed in most other galaxies. ",
                R.drawable.starbust);
        galaxies.add(g);

        g=new Galaxy("Sombrero",
                "Sombrero Galaxy is an unbarred spiral galaxy in the constellation Virgo located 31 million light-years from Earth. The galaxy has a diameter of approximately 50,000 light-years, 30% the size of the Milky Way.",
                R.drawable.sombrero);
        galaxies.add(g);

        g=new Galaxy("Pinwheel",
                "The Pinwheel Galaxy is a face-on spiral galaxy distanced 21 million light-years away from earth in the constellation Ursa Major. ",
                R.drawable.pinwheel);
        galaxies.add(g);


        g=new Galaxy("Canis Majos Overdensity",
                "The Canis Major Dwarf Galaxy or Canis Major Overdensity is a disputed dwarf irregular galaxy in the Local Group, located in the same part of the sky as the constellation Canis Major. ",
                R.drawable.canismajoroverdensity);
        galaxies.add(g);

        return galaxies;
    }

    }
