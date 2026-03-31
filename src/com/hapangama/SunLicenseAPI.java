package com.hapangama;

public class SunLicenseAPI {
    private String licenseKey;
    private int productId;
    private String productVersion;

    public SunLicenseAPI(String licenseKey, int productId, String productVersion, String unused1, int unused2) {
        this.licenseKey = licenseKey;
        this.productId = productId;
        this.productVersion = productVersion;
    }

    public SunLicenseResponse checkLicense() {
        return new SunLicenseResponse();
    }

    public String getLicenseKey() { return this.licenseKey; }
    public int getProductId() { return this.productId; }
    public String getProductVersion() { return this.productVersion; }
    public String getIp() { return "127.0.0.1"; }
    public String getHwid() { return "ARIS-NETWORK-BYPASS"; }

    public class SunLicenseResponse {
        public boolean isValid() { return true; }
        public String getStatus() { return "SUCCESS"; }
        public String getMessage() { return "Licensed by Aris Network"; }
        public String getError() { return null; }
    }
      }
