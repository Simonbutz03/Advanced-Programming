package Company;

import Bank.Account;

public class CompanyAccount extends Account {

    public CompanyAccount(String owner, String internalNote, int pin, double balance) {
        super(owner, internalNote, pin, balance);
    }
    public void testAccess() {
        System.out.println(owner);              // ✅ public
        // System.out.println(balance);         // ❌ private → nicht sichtbar, da außerhalb der Account-Klasse
        System.out.println(pin);                // ✅ protected → sichtbar, da CompanyAccount eine Subklasse von Account ist
        // System.out.println(internalNote);    // ❌ package-private → nicht sichtbar außerhalb, da außerhalb des Packages
    }
}

