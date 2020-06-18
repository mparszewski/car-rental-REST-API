package com.mparszewski.carrental.dto;

import com.mparszewski.carrental.model.Category;
import com.mparszewski.carrental.model.DrivingLicense;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DrivingLicenseDTO {

    private String drivingLicenseNumber;
    private Date releaseDate;
    private Date expirationDate;
    private Category category;
    private String restrictions;
    private String issuingAuthority;
    private int clientId;

    public DrivingLicense createDrivingLicense() {
        DrivingLicense drivingLicense = new DrivingLicense();
        drivingLicense.setCategory(this.category);
        drivingLicense.setDrivingLicenseNumber(this.drivingLicenseNumber);
        drivingLicense.setExpirationDate(this.expirationDate);
        drivingLicense.setCategory(this.category);
        drivingLicense.setRestrictions(this.restrictions);
        drivingLicense.setIssuingAuthority(this.issuingAuthority);
        drivingLicense.setReleaseDate(this.releaseDate);
        return drivingLicense;
    }
}
