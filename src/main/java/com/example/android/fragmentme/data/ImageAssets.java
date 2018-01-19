package com.example.android.fragmentme.data;

import com.example.android.fragmentme.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fifiv on 19/01/2018.
 */

public class ImageAssets {

    // List of all images

    private static final List<Integer> fitnessStickers = new ArrayList<Integer>() {{
        add(R.drawable.fitness_stickers_01);
        add(R.drawable.fitness_stickers_02);
        add(R.drawable.fitness_stickers_03);
        add(R.drawable.fitness_stickers_04);
        add(R.drawable.fitness_stickers_05);
        add(R.drawable.fitness_stickers_06);
        add(R.drawable.fitness_stickers_07);
        add(R.drawable.fitness_stickers_08);
        add(R.drawable.fitness_stickers_09);
        add(R.drawable.fitness_stickers_10);
        add(R.drawable.fitness_stickers_11);
        add(R.drawable.fitness_stickers_12);
        add(R.drawable.fitness_stickers_13);
        add(R.drawable.fitness_stickers_14);
        add(R.drawable.fitness_stickers_15);
        add(R.drawable.fitness_stickers_16);
        add(R.drawable.fitness_stickers_17);
        add(R.drawable.fitness_stickers_18);
        add(R.drawable.fitness_stickers_19);
        add(R.drawable.fitness_stickers_20);
    }};

    private static final List<Integer> catStickers = new ArrayList<Integer>() {{
        add(R.drawable.cat_stickers_1);
        add(R.drawable.cat_stickers_2);
        add(R.drawable.cat_stickers_3);
        add(R.drawable.cat_stickers_4);
        add(R.drawable.cat_stickers_5);
        add(R.drawable.cat_stickers_6);
        add(R.drawable.cat_stickers_7);
        add(R.drawable.cat_stickers_8);
        add(R.drawable.cat_stickers_9);
        add(R.drawable.cat_stickers_10);
        add(R.drawable.cat_stickers_11);
        add(R.drawable.cat_stickers_12);
    }};

    private static final List<Integer> all = new ArrayList<Integer>() {{
        addAll(fitnessStickers);
        addAll(catStickers);
    }};

    // Getter methods that return lists of all fitness stickers and cat stickers
    public static List<Integer> getFitnessStickers() {
        return fitnessStickers;
    }

    public static List<Integer> getCatStickers() {
        return catStickers;
    }

    // Return a list of all images combined
    public static List<Integer> getAll() {
        return all;
    }
}
