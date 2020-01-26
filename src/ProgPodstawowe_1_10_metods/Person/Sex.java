package ProgPodstawowe_1_10_metods.Person;

public enum Sex {
    Woman("W", "woman", "kobieta", 1 ),
    Man("M", "man","meszczyzna", 2);

    private String shortName;
    private String englishName;
    private String polishName;
    private int index;

    Sex(String shortName, String englishName, String polishName, int index) {
        this.shortName = shortName;
        this.englishName = englishName;
        this.polishName = polishName;
        this.index = index;
    }

    public static Sex getByShortName(String sexShortName) {
        for (Sex s: Sex.values()){
            if(s.getShortName()==sexShortName)
                return s;
        }
        return null;
    }

    public String getShortName() {
        return shortName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public int getIndex() {
        return index;
    }
}
