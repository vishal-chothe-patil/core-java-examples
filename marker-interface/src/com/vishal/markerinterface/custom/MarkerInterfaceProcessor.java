package com.vishal.markerinterface.custom;

import com.vishal.markerinterface.custom.cmi.Auditable;
import com.vishal.markerinterface.custom.cmi.Secured;
import com.vishal.markerinterface.custom.sampleclass.AccountService;

public class MarkerInterfaceProcessor {

    public static void main(String[] args) throws Exception {
        AccountService service = new AccountService();
        Class<?> clazz = service.getClass();

        if (service instanceof Secured) {
            System.out.println("Security check enabled for: " + clazz.getSimpleName());
        }

        if (service instanceof Auditable) {
            System.out.println("Auditing enabled for: " + clazz.getSimpleName());
        }

        // Simulate method-level behavior manually
        System.out.println("Logging: createAccount()");
        System.out.println("Validating inputs for: createAccount()");
        service.createAccount("demoUser");

        System.out.println("Logging: deleteAccount()");
        service.deleteAccount("demoUser");
    }
}
