package modles;

import java.util.Arrays;
import java.util.List;

public class student {
    private String fName;
    private String LName;
    private int sNumber;
    private String fActivities;

    /**
     *
     * @param fName
     * @param LName
     * @param sNumber
     * @param fActivities
     */
    public student(String fName, String LName, int sNumber, String fActivities) {
        this.fName = fName;
        this.LName = LName;
        this.sNumber = sNumber;
        this.fActivities = fActivities;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        if (fName.length() >= 2) {
            this.fName = fName;
            fName.toUpperCase();
        }else{
            throw new IllegalArgumentException("Your first name cannot be less then 2 letters");
        }
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        if (LName.length() >= 2) {
            this.LName = LName;
            LName.toUpperCase();
        }else{
            throw new IllegalArgumentException("Your last name can't be less then 2 letters");
        }
    }

    public int getsNumber() {
        return sNumber;
    }

    public void setsNumber(int sNumber) {
        if (100000 < sNumber && sNumber < 9999999) {
            this.sNumber = sNumber;
        }
        else throw new IllegalArgumentException("Student number must be between 1,000,000 and 9,999,999");
    }

    public String getfActivities() {
        return fActivities;
    }

    public void setfActivities(String fActivities) {
        this.fActivities = fActivities;
    }
}
