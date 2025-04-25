package Bank;

public class AccountManager {
   public void Test( Account acc){
       System.out.println(acc.owner);          // ✅ public → sichtbar
       // System.out.println(acc.balance);     // ❌ private → nicht sichtbar da außerhalb der Account-Klasse
       System.out.println(acc.pin);            // ✅ protected → sichtbar, da im gleichen Package
       System.out.println(acc.internalNote);   // ✅ package-private → sichtbar, da im gleichen Package
   }
}
