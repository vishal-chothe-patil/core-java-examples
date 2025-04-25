package com.vishal.markerinterface.custom.sampleclass;

import com.vishal.markerinterface.custom.cmi.Auditable;
import com.vishal.markerinterface.custom.cmi.Secured;

public class AccountService implements Secured, Auditable {

    public void createAccount(String username) {
        System.out.println("Creating account for " + username);
    }

    public void deleteAccount(String username) {
        System.out.println("Deleting account for " + username);
    }
}
