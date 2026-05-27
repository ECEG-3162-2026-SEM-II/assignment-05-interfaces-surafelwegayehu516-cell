package com.jju;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PaymentMethod> payments = new ArrayList<>();

        payments.add(new CreditCard("8630-9541-8732-7567"));
        payments.add(new PayPal("surafelwegayehu519@gmail.com"));

        for (PaymentMethod payment : payments) {
            payment.processPayment(99.99);
        }
    }
}