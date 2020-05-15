package com.company;

public enum Clients {
    Krystyna(40000, "Galaxy"),
    Jadwiga(3000, "Seincento"),
    Zygmunt(18000, "Tipo"),
    Marcin(12000, "Fiesta");

    final private double moneys;
    final public String buyings;
    final public static String info;

    static {
        info = "clients";
    }


    Clients(double moneys, String buyings) {
        this.moneys = moneys;
        this.buyings = buyings;
    }

    public double getMoneys() {
        return moneys;
    }
    public String info() {
        return super.toString()+" has "+ moneys +"$$.";
    }

    public void buy(){
        System.out.println(toString()+ " wants to buy " + buyings +".");
    }
}