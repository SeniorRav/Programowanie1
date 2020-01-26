package ProgPodstawowe_1_10_metods.Person;

import java.util.Objects;

public class Polish extends Person implements Driver {

    private String nationality;
    private int children;
    private String pesel;

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Polish() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polish polish = (Polish) o;
        return Objects.equals(pesel, polish.pesel) && Objects.equals(getLastName()+getFirstName(),polish.getLastName()+polish.getFirstName());

    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel+getLastName()+getFirstName());
    }

    public String getPesel() {
        return pesel;
    }

    public Polish(String firstName, String lastName, String sex, int age, int children) {
        super(firstName, lastName, sex, age);
        this.nationality = "Polish";
        this.children = children;
    }

    @Override
    public boolean isRetired() {
        if(getSexShortName() ==Sex.Man.getShortName() && getAge()>65)return true;
        if(getSexShortName() ==Sex.Woman.getShortName() && getAge()>60)return true;
        return false;
    }

    public boolean enableKdr ()
    {
        return children >= 3 ? true : false;
    }

    @Override
    public String toString() {
        return "Polish{" + super.toString()+
                " nationality='" + nationality + '\'' +
                ", children=" + children + (enableKdr() ? " Kdr" : "") +'}';
    }

    @Override
    public String getIdentity() {
        return pesel;
    }

    @Override
    public boolean canDriveCar() {

        return getAge()>16 && isDrivingLicense();
    }

    @Override
    public boolean canRace() {
        return getAge()>10;
    }
}


