/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nhatk
 */
public class Bill {
    private int IDBill;
    private String Invoice;
    private RegisteredFootballField RegisteredFootballField;
    private RegistFindOpponent RegistFindOpponent;
    private User Account2;
    private ScheduleTournament ScheduleTournament;
    private String PaymentDate;
    private int totalPrice;
    public Bill() {
    }

    public Bill(int IDBill, String Invoice, RegisteredFootballField RegisteredFootballField, RegistFindOpponent RegistFindOpponent, User Account2, ScheduleTournament ScheduleTournament, String PaymentDate, int totalPrice) {
        this.IDBill = IDBill;
        this.Invoice = Invoice;
        this.RegisteredFootballField = RegisteredFootballField;
        this.RegistFindOpponent = RegistFindOpponent;
        this.Account2 = Account2;
        this.ScheduleTournament = ScheduleTournament;
        this.PaymentDate = PaymentDate;
        this.totalPrice = totalPrice;
    }
    

    public Bill(int IDBill, String Invoice, RegisteredFootballField RegisteredFootballField, RegistFindOpponent RegistFindOpponent, User Account2, ScheduleTournament ScheduleTournament, String PaymentDate) {
        this.IDBill = IDBill;
        this.Invoice = Invoice;
        this.RegisteredFootballField = RegisteredFootballField;
        this.RegistFindOpponent = RegistFindOpponent;
        this.Account2 = Account2;
        this.ScheduleTournament = ScheduleTournament;
        this.PaymentDate = PaymentDate;
    }

    public int getIDBill() {
        return IDBill;
    }

    public void setIDBill(int IDBill) {
        this.IDBill = IDBill;
    }

    public String getInvoice() {
        return Invoice;
    }

    public void setInvoice(String Invoice) {
        this.Invoice = Invoice;
    }

    public RegisteredFootballField getRegisteredFootballField() {
        return RegisteredFootballField;
    }

    public void setRegisteredFootballField(RegisteredFootballField RegisteredFootballField) {
        this.RegisteredFootballField = RegisteredFootballField;
    }

    public RegistFindOpponent getRegistFindOpponent() {
        return RegistFindOpponent;
    }

    public void setRegistFindOpponent(RegistFindOpponent RegistFindOpponent) {
        this.RegistFindOpponent = RegistFindOpponent;
    }

    public User getAccount2() {
        return Account2;
    }

    public void setAccount2(User Account2) {
        this.Account2 = Account2;
    }


    public ScheduleTournament getScheduleTournament() {
        return ScheduleTournament;
    }

    public void setScheduleTournament(ScheduleTournament ScheduleTournament) {
        this.ScheduleTournament = ScheduleTournament;
    }

    public String getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(String PaymentDate) {
        this.PaymentDate = PaymentDate;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
    
    
    
}
