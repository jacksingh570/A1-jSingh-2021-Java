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
        this.fName = fName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public int getsNumber() {
        return sNumber;
    }

    public void setsNumber(int sNumber) {
        this.sNumber = sNumber;
    }

    public String getfActivities() {
        return fActivities;
    }

    public void setfActivities(String fActivities) {
        this.fActivities = fActivities;
    }
}
