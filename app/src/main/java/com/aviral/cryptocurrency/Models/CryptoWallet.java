package com.aviral.cryptocurrency.Models;

import java.util.ArrayList;

public class CryptoWallet {

    private String cryptoName;
    private String cryptoSymbol;
    private Double cryptoPrice;
    private Double changePercentage;
    private ArrayList<Integer> lineDate;
    private Double propertyAmount;
    private Double propertySize;

    public CryptoWallet(String cryptoName,
                        String cryptoSymbol,
                        Double cryptoPrice,
                        Double changePercentage,
                        ArrayList<Integer> lineDate,
                        Double propertyAmount,
                        Double propertySize) {
        this.cryptoName = cryptoName;
        this.cryptoSymbol = cryptoSymbol;
        this.cryptoPrice = cryptoPrice;
        this.changePercentage = changePercentage;
        this.lineDate = lineDate;
        this.propertyAmount = propertyAmount;
        this.propertySize = propertySize;
    }

    public String getCryptoName() {
        return cryptoName;
    }

    public void setCryptoName(String cryptoName) {
        this.cryptoName = cryptoName;
    }

    public String getCryptoSymbol() {
        return cryptoSymbol;
    }

    public void setCryptoSymbol(String cryptoSymbol) {
        this.cryptoSymbol = cryptoSymbol;
    }

    public Double getCryptoPrice() {
        return cryptoPrice;
    }

    public void setCryptoPrice(Double cryptoPrice) {
        this.cryptoPrice = cryptoPrice;
    }

    public Double getChangePercentage() {
        return changePercentage;
    }

    public void setChangePercentage(Double changePercentage) {
        this.changePercentage = changePercentage;
    }

    public ArrayList<Integer> getLineDate() {
        return lineDate;
    }

    public void setLineDate(ArrayList<Integer> lineDate) {
        this.lineDate = lineDate;
    }

    public Double getPropertyAmount() {
        return propertyAmount;
    }

    public void setPropertyAmount(Double propertyAmount) {
        this.propertyAmount = propertyAmount;
    }

    public Double getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(Double propertySize) {
        this.propertySize = propertySize;
    }
}
