package Bank;

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNote;

    public Account(String owner, String internalNote, int pin, double balance) {
        this.owner = owner;
        this.internalNote = internalNote;
        this.pin = pin;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void changePin(int currentPin, int newPin) {
        if(currentPin == pin) {
            this.pin = newPin;
        System.out.println("Pin has been changed");
        }
        else {
            System.out.println("incorrect pin");
        }
    }

    //Alternative
    // Getter und Setter benutzen und Attribute als private Deklarieren

    // Bsp:
    // private pin

    // public int getpin(){
    //      return pin;
    //      }
    // public void setpin(int newpin){
    //      this.pin = newpin;
    //      }

    // Unterschied Protected vs. Private + Getter

    // Protected : erlaubt direkten Zugriff von Subklasse und anderen Packages
    // -> nicht so sicher, da direkt auf die Attribute zugegriffen werden kann -> kann ausgenutzt werden

    // Private : erlaubt Zugriff ausschließlich in eigener Klasse -> Subklassen + andere Packages haben keinen Zugriff
    // -> sicherer, da Zugriff besser kontrolliert werden kann über Getter und Setter, man kann entscheiden was erlaubt ist

}
