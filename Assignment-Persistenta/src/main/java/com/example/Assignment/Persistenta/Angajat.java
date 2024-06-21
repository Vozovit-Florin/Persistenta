package com.example.Assignment.Persistenta;

import jakarta.persistence.*;

@Entity
@Table(name = "angajat")
public class Angajat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String prenume;
    private String adresa;
    private int varsta;
    private double salariu;

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }
}
