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


    public void addDebt(String name, int value) {
        this.debts.put(name, value);
    }


    public Map<String, Integer> getDebts() {
        return debts;
    }

    public void setDebts(HashMap<String, Integer> debts) {
        this.debts = (HashMap<String, Integer>) debts.clone();
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
            temp = (DebtNote) super.clone();
            temp.debts = (HashMap<String, Integer>) this.debts.clone();

            return temp;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DebtNote debtNote = (DebtNote) o;

        return getDebts() != null ? getDebts().equals(debtNote.getDebts()) : debtNote.getDebts() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getDebts() != null ? getDebts().hashCode() : 0);
        return result + super.hashCode();
    }
}
