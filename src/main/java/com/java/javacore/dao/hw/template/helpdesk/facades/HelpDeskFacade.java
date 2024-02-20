package com.java.javacore.dao.hw.template.helpdesk.facades;

import com.java.javacore.dao.hw.template.helpdesk.SupportTicket;

public interface HelpDeskFacade {

    void addNewSupportTicket(SupportTicket supportTicket);

    SupportTicket getNextSupportTicket();

    /**
     * @return amount of tickets that are not processed
     */
    int getNumberOfTickets();
}