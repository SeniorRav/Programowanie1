package ProgPodstawowe_1_10_metods.Person;

public class English extends Person {

    private boolean hasGuardian;
    private String taxNumber;
    private String nationality;

    static{ //przy uruchamianiu JVM i tworzeniu klasy

    }


    {//To jest blok inicjujacy uruchamiany przy tworzeniu nowego obiektu
        this.hasGuardian=false;
        this.nationality="English";
    }

    public English(String firstName, String lastName, String taxNumber) {
        super(firstName, lastName);
        this.taxNumber = taxNumber;
    }

    public English(String firstName, String lastName, String sex, int age, String taxNumber) {
        super(firstName, lastName, sex, age);
        this.taxNumber = taxNumber;
    }

    @Override
    public String getIdentity() {
        return taxNumber;
    }

    @Override
    public boolean canDriveCar() {
        return (getAge()>16 && isDrivingLicense())||(getAge()>14 && hasGuardian);
    }

    @Override
    public boolean canRace() {
        return getAge()>12;
    }
}
