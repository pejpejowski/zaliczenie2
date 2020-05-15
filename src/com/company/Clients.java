package com.company;

public enum Clients {
    Krystyna(40000, "Jabłko"),
    Jadwiga(3000, "Banana"),
    Zygmunt(18000, "Marchewkę"),
    Marcin(12000, "Ogórka");

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