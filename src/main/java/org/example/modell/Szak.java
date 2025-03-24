package org.example.modell;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class Szak implements Serializable {
    private static final String fajl = "targyak.dat";
    private static final String fajl2 = "statisztika.txt";
    private String nev;
    private UUID id;
    private ArrayList<String> targyak;

    public Szak(String nev) {
        this.nev = nev;
        ujIdGeneralas();
        try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream(fajl2))){
            ArrayList<Tantargy> tantargy = (ArrayList<Tantargy>) obj.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void ujIdGeneralas() {
        id = UUID.randomUUID();
    }

    public void szakKiirasa(){
        Szak szak;
        targyak = new ArrayList<>();
        targyak.add("Történelem: \n");
        targyak.add("informatika: \n");
        targyak.add("matematika: \n");
        targyak.add("irodalom: ");
        try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(fajl))){
            obj.writeObject(targyak);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void szakBeolvasasa() throws FileNotFoundException {
        try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream(fajl2))){
            Szak szak;
            szak = (Szak) obj.readObject();
            ujIdGeneralas();
            System.out.println("Eslő:");
            System.out.println(szak);
            szak = (Szak) obj.readObject();
            System.out.println("Második");
            System.out.println(szak);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Tantargy> getTargyakNevSzerint(){
        return List.of();
    }

    public List<Tantargy> getTargyakKreditSzerint(){
        return List.of();
    }

    public void statisztika(){
        System.out.println("Különböző tárgyak: ");
        System.out.println("Vizsga tárgyak: ");
        System.out.println("Összes kredit: ");
        System.out.println("Min kredit: ");
        System.out.println("Max kredit: ");
        System.out.println("Tárgyakat tanítók: ");
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Szak{" +
                "nev='" + nev + '\'' +
                ", id=" + id +
                '}';
    }

}

