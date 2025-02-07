package com.calculator2.appium.drivers.utils;

public class TargetEnvirontment {
    public static final String CALCULATOR = "calculator";
    public static final String GOOGLE_CALCULATOR = "google-calculator";
    public static final String ECOMMERCE = "ecommerce";
  
    // prevent instance
    private TargetEnvirontment() {
      throw new UnsupportedOperationException("Class ini hanya boleh mengakses konstanta");
    }
  }