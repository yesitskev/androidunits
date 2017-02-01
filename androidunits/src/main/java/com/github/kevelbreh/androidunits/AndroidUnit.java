package com.github.kevelbreh.androidunits;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * {@code AndroidUnit} is a utility to convert between the different display units used when laying
 * out android views. {@code AndroidUnit} doesn't care about android the {@link Context}.
 */
public enum AndroidUnit {

  PIXELS {
    @Override public float convert(float sourceCount, AndroidUnit sourceUnit) {
      return sourceUnit.toPixels(sourceCount);
    }

    @Override public float toPixels(float count) {
      return count;
    }

    @Override public float toDisplayPixels(float count) {
      return count / DISPLAY_METRICS.density;
    }

    @Override public float toScalePixels(float count) {
      return count / DISPLAY_METRICS.scaledDensity;
    }
  },

  DENSITY_PIXELS {
    @Override public float convert(float sourceCount, AndroidUnit sourceUnit) {
      return sourceUnit.toDisplayPixels(sourceCount);
    }

    @Override public float toPixels(float count) {
      return count * DISPLAY_METRICS.density;
    }

    @Override public float toDisplayPixels(float count) {
      return count;
    }

    @Override public float toScalePixels(float count) {
      return count * (DISPLAY_METRICS.scaledDensity / DISPLAY_METRICS.density);
    }
  },

  SCALE_PIXELS {
    @Override public float convert(float sourceCount, AndroidUnit sourceUnit) {
      return sourceUnit.toScalePixels(sourceCount);
    }

    @Override public float toPixels(float count) {
      return count * DISPLAY_METRICS.scaledDensity;
    }

    @Override public float toDisplayPixels(float count) {
      return count * (DISPLAY_METRICS.density / DISPLAY_METRICS.scaledDensity);
    }

    @Override public float toScalePixels(float count) {
      return count;
    }
  };

  private static final DisplayMetrics DISPLAY_METRICS = Resources.getSystem().getDisplayMetrics();

  /**
   * Converts the given size in the given unit to this unit.
   *
   * @param sourceCount the size in the given {@code sourceUnit}.
   * @param sourceUnit the unit of the {@code sourceCount} argument.
   * @return the converted size of the unit
   */
  public float convert(float sourceCount, AndroidUnit sourceUnit) {
    throw new AbstractMethodError();
  }

  /**
   * Convert from a source unit count to a pixel count
   * @param count the source unit count
   * @return the converted source to a pixel count
   */
  public float toPixels(float count) {
    throw new AbstractMethodError();
  }

  /**
   * Convert from a source unit count to a density independent pixel count
   * @param count the source unit count
   * @return the converted density independent pixel count
   */
  public float toDisplayPixels(float count) {
    throw new AbstractMethodError();
  }

  /**
   * Convert from a source unit count to a scaled independent pixel count
   * @param count the source unit count
   * @return the converted scaled independent pixel count
   */
  public float toScalePixels(float count) {
    throw new AbstractMethodError();
  }
}
