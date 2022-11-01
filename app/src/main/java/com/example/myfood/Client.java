package com.example.myfood;

public class Client {
    public String prenom;
    public String nom;
    public String email;
    public String num;

    public Client(String prenom, String nom, String email, String num) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.num = num;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
