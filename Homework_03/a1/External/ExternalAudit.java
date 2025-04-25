package External;

import Bank.Account;

public class ExternalAudit {
    public void Test (Account acc) {
        System.out.println(acc.owner);          // ✅ public → sichtbar
        // System.out.println(acc.balance);     // ❌ private → nicht sichtbar da außerhalb der Account-Klasse
        // System.out.println(acc.pin);         // ❌ protected → nicht sichtbar, da außerhalb des Packages
        // System.out.println(acc.internalNote);// ❌ package-private → nicht sichtbar außerhalb des Packages
    }
}
