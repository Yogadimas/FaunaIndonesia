package com.yogadimas.faunaindonesia;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    public static String CODENAME = "CODENAME";
    public static String SCREENSHOT = "SCREENSHOT";
    public static String DESCRIPTION = "DESCRIPTION";
    public static String KINGDOM = "KINGDOM";
    public static String PHYLUM = "PHYLUM";
    public static String KELAS = "KELAS";
    public static String ORDER = "ORDER";
    public static String FAMILY = "FAMILY";
    public static String GENUS = "GENUS";
    public static String SPECIES = "SPECIES";

    ImageView ivScreenshot;
    TextView description, nameDetail, tvKingdom, tvPhylum, tvOrder, tvFamily, tvGenus, tvKelas, tvSpecies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setupEnv();
    }

    private void setupEnv() {
        String imgPath = getIntent().getStringExtra(SCREENSHOT);
        String desc = getIntent().getStringExtra(DESCRIPTION);
        String name = getIntent().getStringExtra(CODENAME);
        String king = getIntent().getStringExtra(KINGDOM);
        String phy = getIntent().getStringExtra(PHYLUM);
        String klas = getIntent().getStringExtra(KELAS);
        String ord = getIntent().getStringExtra(ORDER);
        String fam = getIntent().getStringExtra(FAMILY);
        String gen = getIntent().getStringExtra(GENUS);
        String spe = getIntent().getStringExtra(SPECIES);

        ivScreenshot = findViewById(R.id.iv_screenshot);
        description = findViewById(R.id.tv_description);
        nameDetail = findViewById(R.id.namedetail);
        tvFamily = findViewById(R.id.tv_family);
        tvKelas = findViewById(R.id.tv_kelas);
        tvKingdom = findViewById(R.id.tv_kingdom);
        tvOrder = findViewById(R.id.tv_order);
        tvSpecies = findViewById(R.id.tv_species);
        tvGenus = findViewById(R.id.tv_genus);
        tvPhylum = findViewById(R.id.tv_phylum);


        assert imgPath != null;
        if (imgPath.isEmpty()) {
            ivScreenshot.setVisibility(View.GONE);
        } else {
            RequestOptions requestOptions = new RequestOptions();
            requestOptions = requestOptions
                    .transform(new CenterCrop(), new RoundedCorners(30));
            Glide.with(this)
                    .load(imgPath)
                    .placeholder(R.drawable.placeholder)
                    .error(R.drawable.imagenotfound)
                    .apply(requestOptions.override(200, 150))
                    .into(ivScreenshot);
        }

        description.setText(desc);
        nameDetail.setText(name);
        tvFamily.setText(fam);
        tvKelas.setText(klas);
        tvKingdom.setText(king);
        tvOrder.setText(ord);
        tvSpecies.setText(spe);
        tvGenus.setText(gen);
        tvPhylum.setText(phy);
    }
}


