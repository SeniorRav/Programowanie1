package sampleIO;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.*;

public class ReadWriteFile {

   public static void main(String[] args) {
    ReadWriteFile readWriteFile = new ReadWriteFile();
    readWriteFile.simpleWriteToFile();
    readWriteFile.writeToFileWhitResources();
    readWriteFile.readFileSimple();
    List<DataStorage>storage = new ArrayList<>();
    storage.add(new DataStorage(0,"Adam","Nowak"));
    storage.add(new DataStorage(1,"Jan","Kowalski"));
    storage.add(new DataStorage(2,"Maria","Paluch"));



    try {
        readWriteFile.writeWithBufferedWriter(storage);

    } catch (IOException e){
        e.printStackTrace();
    } finally {
        System.out.println("Finally zawsze sie wykona, przy wyjatku też");
    }

    Map<Integer, DataStorage> content =
            readWriteFile.readWithBufferedReader();
    content.values().stream().forEach(s->System.out.println(
            s.getIndex() + " "+ s.getData1() + " " +s.getData2()
    ));
    //offtopic
       System.out.println("varargs example");
       System.out.println(readWriteFile.varargsSum(3,10));
       System.out.println(readWriteFile.varargsSum(3));
       System.out.println(readWriteFile.varargsSum(3,10,20));
       System.out.println(readWriteFile.varargsSum(3,10,20,30));
       System.out.println(readWriteFile.varargsSum(3,10,10,10,10));


   }

    public boolean simpleWriteToFile() {
        try {
            FileWriter fileWriter = new FileWriter("SampleFile.txt");
            fileWriter.write("Sample line one");
            fileWriter.write("Sample line two");

            fileWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
       public boolean writeToFileWhitResources() {
           final String lineDelimiter = "\n";
           try(FileWriter fileWriter = new FileWriter("AnotherFile.txt")){
               fileWriter.write("First line"+lineDelimiter);
               fileWriter.write("Second Line");
               return true;
           } catch (IOException e){
               e.printStackTrace();
           }
           return false;





    }


    public boolean readFileSimple() {
        String fileName = "SampleFile.txt";
        File file = new File(fileName);
        Scanner scanner = null;

        try {
            scanner = new Scanner (new FileReader(file.getName()));
            scanner.useDelimiter("\n");
            System.out.println("Reading file :" + fileName);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("pliku nie znaleziono");
            e.printStackTrace();
        } catch (ArithmeticException e){
            System.out.println("blad w obliczeniach");
        }
        return false;
    }

    public boolean writeWithBufferedWriter(List<DataStorage> dataToWrite)
    throws IOException{
       String fieldSeparator = ";";
       String lineSeparator = "\n";
       BufferedWriter file = new BufferedWriter(
               new FileWriter("DataList.txt")
       );
       for (DataStorage storage : dataToWrite){
           file.write(storage.getIndex()+fieldSeparator
           + storage.getData1()+fieldSeparator
           + storage.getData2()+lineSeparator);
       }

       file.close();


       return false;
    }

    public Map readWithBufferedReader(){
       try(BufferedReader reader = new BufferedReader(new FileReader("DataList.txt"))){
           String input;
           String fieldSeparator = ";";
           Map<Integer, DataStorage>dataStorageMap = new HashMap<>();
           while((input = reader.readLine()) !=null){
               String[] dataLine = input.split(fieldSeparator);
               int index = Integer.parseInt(dataLine[0]);
               DataStorage storage = new DataStorage(index
               ,dataLine[1],dataLine[2]);
               dataStorageMap.put(index, storage);
           }
           return dataStorageMap;
       }catch (FileNotFoundException e){
           e.printStackTrace();
       }catch (IOException e){
           e.printStackTrace();
       }
       return null;
    }

    //offtopic
    private int varargsSum(int a, int...b){
       int suma = a;
       for(int i = 0; i<b.length; i++){
           suma += b[i];
       }
       return suma;
    }
}
