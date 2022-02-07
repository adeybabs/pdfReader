package com.trial.pdfReader.entities;

import java.math.BigDecimal;

/**
 * This data structure will represent each of the transaction line found in the PDF passed.
 *
 * @author chriseteka
 */
public class Transaction {

    private int serialNumber;
    private String paymentScheme;
    private String SchemeType;
    private BigDecimal debitAmount;
    private BigDecimal creditAmount;

    public Transaction() {
    }

    //All args constructor
    public Transaction(int serialNumber, String paymentScheme, String schemeType,
                       BigDecimal debitAmount, BigDecimal creditAmount) {
        this.serialNumber = serialNumber;
        this.paymentScheme = paymentScheme;
        this.SchemeType = schemeType;
        this.debitAmount = debitAmount;
        this.creditAmount = creditAmount;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPaymentScheme() {
        return paymentScheme;
    }

    public void setPaymentScheme(String paymentScheme) {
        this.paymentScheme = paymentScheme;
    }

    public String getSchemeType() {
        return SchemeType;
    }

    public void setSchemeType(String schemeType) {
        SchemeType = schemeType;
    }

    public BigDecimal getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(BigDecimal debitAmount) {
        this.debitAmount = debitAmount;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     * This is in assumption that you will be dealing with just these currencies, in case of more,, sort your self out
     */
    public enum Currency {
        NGN, USD, EUR, GBP
    }
}
