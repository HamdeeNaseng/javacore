package com.java.javacore.dao.hw.template.utils.mail.impl;

import com.java.javacore.dao.hw.template.utils.mail.MailSender;

public class DefaultMailSender implements MailSender {


    private static DefaultMailSender instance;

    private DefaultMailSender() {};


    public static DefaultMailSender getInstance() {
        if (instance == null) {
            instance = new DefaultMailSender();
        }
        return instance;
    }

    @Override
    public void sendEmail(String sendTo, String messageToSend) {
        // sending email here
    }

}