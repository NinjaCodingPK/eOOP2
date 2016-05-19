package main;

import entities.DebtNote;
/**
 * Created by wookie on 5/17/16.
 */
public class Main {
    public static void main(String[] args) {
        DebtNote note = new DebtNote("Name", "Nick", "email", "icq", "phone");
        note.addDebt("Someone", 1000);
        System.out.println(note);

        DebtNote clone = note.clone();
        clone.addDebt("Else", 200);
        clone.setName("Me");
        System.out.println(note);
        System.out.println(clone);
    }
}
