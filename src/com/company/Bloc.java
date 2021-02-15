package com.company;

public class Bloc {
    private String scara;
    private String numeBloc;
    private int numarEtaje;
    private int pretPeEtaj;
    public Bloc(int numEtaj, String scara) {
        this.numarEtaje = numEtaj;
        this.scara = scara;
    }

    public Bloc(int numarEtaje, String scara, String numeBloc) {
        this.scara = scara;
        this.numarEtaje = numarEtaje;
        this.numeBloc = numeBloc;
    }

    public String getAdresa() {
        String adresa = this.numeBloc + " " + this.scara;
        return adresa;
    }

    public void setScara(String scara) {
        this.scara = scara;
    }

    public void setNumeBloc(String numeBloc) {
        this.numeBloc = numeBloc;
    }

    public void setNumarEtaje(int numarEtaje) {
        this.numarEtaje = numarEtaje;
    }

    public void setPretPeEtaj(int pretPeEtaj) {
        this.pretPeEtaj = pretPeEtaj;
    }

    public String getScara() {
        return this.scara;
    }

    public String getNumeBloc() {
        return this.numeBloc;
    }

    public int getNumarEtaje() {
        return this.numarEtaje;
    }

    public int getPretPeEtaj() {
        return this.pretPeEtaj;
    }

    public int pretTotal() {
    int total = this.numarEtaje * this.pretPeEtaj;
    return total;
    }
}
