package com.github.kevelbreh.androidunits;

import android.content.res.Resources;
import android.support.test.runner.AndroidJUnit4;

import android.util.DisplayMetrics;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

  @Test public void conversions() throws Exception {
    DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();

    for (float s = 0; s < 999; s++) {
      assertEquals(s, AndroidUnit.PIXELS.toPixels(s), 0);
      assertEquals(s / metrics.density, AndroidUnit.PIXELS.toDisplayPixels(s), 0);
      assertEquals(s / metrics.scaledDensity, AndroidUnit.PIXELS.toScalePixels(s), 0);

      assertEquals(s * metrics.density, AndroidUnit.DENSITY_PIXELS.toPixels(s), 0);
      assertEquals(s, AndroidUnit.DENSITY_PIXELS.toDisplayPixels(s), 0);
      assertEquals(s * (metrics.density / metrics.scaledDensity),
          AndroidUnit.DENSITY_PIXELS.toScalePixels(s), 0);

      assertEquals(s * metrics.scaledDensity, AndroidUnit.SCALE_PIXELS.toPixels(s), 0);
      assertEquals(s * (metrics.scaledDensity / metrics.density),
          AndroidUnit.SCALE_PIXELS.toDisplayPixels(s), 0);
      assertEquals(s, AndroidUnit.SCALE_PIXELS.toScalePixels(s), 0);
    }
  }
}
