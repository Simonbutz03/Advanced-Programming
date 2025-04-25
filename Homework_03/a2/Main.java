public class Main {
    public static void main(String[] args) {
        Message m1 = new Email ();
        Message m2 = new SMS ();
        System .out. println (m1. getType ());
        System .out. println (m2. getType ());
       //  m1.send(); -> Compiler Fehler, da m1 ein Message objekt ist, kann m1 nicht auf send() zugreifen
    }
    //What is the static type of m1? What is its dynamic type?
    // static Type m1 = Message
    // dynamic Type m1 = Email

    // Which method is called? Why?
    // Die methode in Email wird aufgerufen, wegen Dynamic Binding, die Methode der konkrete Objekt Klasse wird aufgerufen ( überschriebene Klasse)
    // und nicht die Methode in der Referenzklasse Message

    // Why can’t send() be called directly?
    // weil static Type von m1 Message ist, und Message enthält keine Methode send()

    //How could you safely call send() anyway (e.g. instanceof)?
    // Durch eine Type-Check mit hilfe von Instance
    //if (m1 instanceof Email) {
    //    ((Email) m1).send(); // Cast auf Email, jetzt ist send() sichtbar
    //}

}
