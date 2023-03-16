package com.stanislav.spring;

/**
 * @author Stanislav Hlova
 */
public class Currency implements Comparable<Currency> {
    private int r030;
    private String txt;
    private double rate;
    private String cc;
    private String exchangeDate;

    public int getR030() {
        return r030;
    }

    public void setR030(int r030) {
        this.r030 = r030;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getExchangeDate() {
        return exchangeDate;
    }

    public void setExchangeDate(String exchangeDate) {
        this.exchangeDate = exchangeDate;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "r030=" + r030 +
                ", txt='" + txt + '\'' +
                ", rate=" + rate +
                ", cc='" + cc + '\'' +
                ", exchangeDate='" + exchangeDate + '\'' +
                '}';
    }

    @Override
    public int compareTo(Currency o) {
        return Double.compare(this.rate, o.rate);
    }
}
