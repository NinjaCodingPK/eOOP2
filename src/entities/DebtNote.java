package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wookie on 5/19/16.
 */
public class DebtNote extends Note implements Cloneable {
    /**
     * Map shows tha name who has debt and how much money he debts.
     */
    private HashMap<String, Integer> debts = new HashMap<>();

    public DebtNote(){

    }

    public DebtNote(String name, String nick, String email, String icq, String phoneNumber) {
        super(name, nick, email, icq, phoneNumber);
    }

    public DebtNote(String name, String nick, String email, String icq, String phoneNumber, HashMap<String, Integer> debts) {
        super(name, nick, email, icq, phoneNumber);
        setDebts(debts);
    }

    @Override
    public String toString() {
        return "DebtNote {" + super.toString() +
                "debts=" + debts.toString() +
                '}';
    }

    @Override
    public DebtNote clone() {
        DebtNote temp = null;
        try {
            temp = (DebtNote) super.clone();
            temp.debts = (HashMap<String, Integer>) this.debts.clone();

            return temp;
        } catch (CloneNotSupportedException e) {
            //e.printStackTrace();
            return null;
        }
    }

    public void addDebt(String name, int value) {
        this.debts.put(name, value);
    }


    public Map<String, Integer> getDebts() {
        return debts;
    }

    public void setDebts(HashMap<String, Integer> debts) {
        this.debts = (HashMap<String, Integer>) debts.clone();
    }
}
