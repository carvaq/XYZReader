package com.example.xyzreader.ui;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Carla
 * Date: 03/11/2016
 * Project: XYZReader_app
 */

public class TypefaceHelper {

    public static final String FONT_ROSARIO_REGULAR = "Rosario-Regular.ttf";

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({FONT_ROSARIO_REGULAR})
    public @interface FontName {
    }

    private static Map<String, Typeface> sTypefaceMap = new HashMap<>();

    public  static Typeface getTypeface(Resources resources,@FontName String name) {
        if (!sTypefaceMap.containsKey(name)) {
            sTypefaceMap.put(name, Typeface.createFromAsset(resources.getAssets(), name));
        }
        return sTypefaceMap.get(name);
    }
}
