package ProgPodstawowe_1_10_metods.Person;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.apache.log4j.Logger;

public class Main {
    final static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Person person1 = new Polish();
        person1.setFirstName("Maria");
        person1.setLastName("Jakas");
        person1.setSex(Sex.Woman);
        person1.setAge(30);
        Person person2 = new Polish("Jan","Kowalski","M",22,2);
        Person polish1 = new Polish("Jacek","Janicki","M",28,3);


        System.out.println("Person 1 : "+ person1);
        System.out.println("Person 2 : "+ person2);
        System.out.println("Polish 1 : "+ polish1);

        Polish polish2 = new Polish("Janek","Kowalski","M",40,2);
        System.out.println("Polish 2 : "+ polish2);

        Race race1 = new Race("gokarty", 10);
        Race race2 = new Race("F1 Monte Carlo", 18);
        Race race3 = new Race("F1 Le Mans ", 18);
        Race race4 = new Race("F1 MonteCarlo", 18);
        race1.setRaceYear(2019);
        race2.setRaceYear(2019);
        race3.setRaceYear(2019);
        race4.setRaceYear(2020);

        List<Race> races = new LinkedList<>();
        races.add(race1);
        races.add(race2);
        races.add(race3);
        races.add(race4);

        System.out.println("-----------------");
        System.out.println("Wydruk wyscigow bez sortowania");
        for (Race race : races) {
            System.out.println(race.getRaceName() + " "+race.getRaceYear());
        }

        System.out.println("-----------------");
        System.out.println("Wydruk wyscigow z sortowaniem");
        Collections.sort(races);
        for (Race race : races) {
            System.out.println(race.getRaceName() + " "+race.getRaceYear());
        }

        System.out.println("-----------------");
        System.out.println("Wydruk wyscigow z sortowaniem po wieku i nazwie");
        Collections.sort(races, new RaceSortByMinAgeAndName());
        for (Race race : races) {
            System.out.println(race.getRaceName() + " "+race.getRaceYear());
        }

        System.out.println("-----------------");
        Set<Race> racesSet = new HashSet();
        racesSet.add(race1);
        racesSet.add(race2);
        racesSet.add(race3);
        racesSet.add(race4);
        racesSet.add(race1);
        for (Race race : races) {
            System.out.println(race.getRaceName() + " "+race.getRaceYear());
        }
        System.out.println("-----------------");
        Map<String, Race> raceMap = new HashMap();
        raceMap.put(race1.getRaceName(),race1);
        raceMap.put(race2.getRaceName(),race2);
        raceMap.put(race3.getRaceName(),race3);
        raceMap.put(race4.getRaceName(),race4);

        System.out.println("-----------------");
        System.out.println("Mapa po wartosciach");
        for (Race race : raceMap.values()) {
            System.out.println(race.getRaceName() + " "+race.getRaceYear());
        }
        System.out.println("-----------------");
        System.out.println("Mapa po kluczach");
        for (String key : raceMap.keySet()) {
            System.out.println(raceMap.get(key).getRaceName()+" "+ raceMap.get(key).getRaceYear());
        }

        Map<RaceKey, Race> racesMap2 = new HashMap<>();
        racesMap2.put(new RaceKey(race1.getRaceName(),race1.getRaceYear()),race1);
                racesMap2.put(new RaceKey(race2.getRaceName(),race2.getRaceYear()),race2);
                racesMap2.put(new RaceKey(race3.getRaceName(),race3.getRaceYear()),race3);
                racesMap2.put(new RaceKey(race4.getRaceName(),race4.getRaceYear()),race4);
        System.out.println("-----------------");
        System.out.println("Mapa 2 po kluczach");
        for (RaceKey raceKey : racesMap2.keySet()) {
            System.out.println(racesMap2.get(raceKey).getRaceName()+" "+ racesMap2.get(raceKey).getRaceYear());
        }
        //set z zawartosci listy
        Set<Race> setFromList = new HashSet<>(races);

        LOGGER.error("This is error message");
        LOGGER.warn("This is warning");
        LOGGER.fatal("This is fatal error");
        LOGGER.debug("This is debug message");
        LOGGER.info ("This is info message");

        if(LOGGER.isInfoEnabled()){
            LOGGER.info("Info po sprawdzeniu");
        }
        Main mainTest = new Main();
        try{
            mainTest.divide(10,0);
        }catch(ArithmeticException ex){
            LOGGER.error("Something's wrong:",ex);
        }
    }

    private void divide(int a, int b){
        int i = a/b;

    }
}
