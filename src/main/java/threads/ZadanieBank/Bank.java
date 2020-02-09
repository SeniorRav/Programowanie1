package threads.ZadanieBank;

import java.util.Collections;
import java.util.List;

public class Bank {
    private String nazwaBanku;
    private List<Klient> listaKlientow;
    private List<Rachunek> listaRachunkow;

    public String getNazwa() {
        return nazwaBanku;
    }

    public void setNazwa(String nazwa) {
        this.nazwaBanku = nazwa;
    }

    public List<Klient> getListaKlientow() {
        return listaKlientow;
    }

    public void setListaKlientow(List<Klient> listaKlientow) {
        this.listaKlientow = listaKlientow;
    }

    public List<String> getListaRachunkow() {
        return listaRachunkow;
    }

    public void setListaRachunkow(List<String> listaRachunkow) {
        this.listaRachunkow = listaRachunkow;
    }

    public boolean addTeam(Klient klient){
        if(!listaKlientow.contains(klient)){
            System.out.println("Dodaje "+ klient.getImie()
                    +" "+klient.getNazwisko()+" "+klient.getPesel()+ " do"+ nazwaBanku);
            return listaKlientow.add(klient);
        }
        System.out.println("Klient "+klient.getImie() + " "+klient.getNazwisko()
                +" "+klient.getPesel()+ " jest już zapisany w banku");
        return false;
    }

    public void printTable(){
        Collections.sort(listaKlientow);
        System.out.println(nazwaBanku + " tabela");
        for (Klient klient : listaKlientow){
            System.out.println(klient.getImie()  + " "+klient.getNazwisko()+" "+klient.getPesel());
        }
    }

}
