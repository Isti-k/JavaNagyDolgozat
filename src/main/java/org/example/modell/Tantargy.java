package org.example.modell;

public class Tantargy implements Comparable<Tantargy> {
    private String nev, tanar1, tanar2, csak_vizsga;
    private int kredit, felev;

    public Tantargy(String nev, String tanar1, String tanar2, int kredit, String csak_vizsga, int felev) {
        this.nev = nev;
        this.tanar1 = tanar1;
        this.tanar2 = tanar2;
        this.kredit = kredit;
        this.csak_vizsga = csak_vizsga;
        this.felev = felev;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getTanar1() {
        return tanar1;
    }

    public void setTanar1(String tanar1) {
        this.tanar1 = tanar1;
    }

    public String getTanar2() {
        return tanar2;
    }

    public void setTanar2(String tanar2) {
        this.tanar2 = tanar2;
    }

    public String getCsak_vizsga() {
        return csak_vizsga;
    }

    public void setCsak_vizsga(String csak_vizsga) {
        this.csak_vizsga = csak_vizsga;
    }

    public int getFelev() {
        return felev;
    }

    public void setFelev(int felev) {
        this.felev = felev;
    }

    public int getKredit() {
        return kredit;
    }

    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    @Override
    public String toString() {
        return "Tantargy{" +
                "nev='" + nev + '\'' +
                ", tanar1='" + tanar1 + '\'' +
                ", tanar2='" + tanar2 + '\'' +
                ", csak_vizsga='" + csak_vizsga + '\'' +
                ", kredit=" + kredit +
                ", felev=" + felev +
                '}';
    }



    @Override
    public int compareTo(Tantargy o) {
        return 0;
    }


    
}
