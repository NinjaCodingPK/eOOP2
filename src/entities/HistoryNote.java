package entities;

import java.util.ArrayList;

/**
 * Each setter of this class should modify field "history".
 * Created by wookie on 5/19/16.
 */
public class HistoryNote extends Note implements Cloneable {
    /**
     * array list to monitor history of changing.
     */
    private ArrayList<Note> history = new ArrayList<>();

    public HistoryNote() {

    }

    public HistoryNote(String name, String nick, String email, String icq, String phoneNumber) {
        super(name, nick, email, icq, phoneNumber);
        addHistory();
    }

    public ArrayList<Note> getHistory() {
        return history;
    }

    private void addHistory() {
        history.add(super.clone());
    }

    @Override
    public void setNick(String nick) {
        super.setNick(nick);
        addHistory();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
        addHistory();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
        addHistory();
    }

    @Override
    public void setIcq(String icq) {
        super.setIcq(icq);
        addHistory();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
        addHistory();
    }

    @Override
    public HistoryNote clone()  {

            HistoryNote temp = (HistoryNote) super.clone();
            temp.history = (ArrayList<Note>) this.history.clone();
            temp.history = new ArrayList<>();
            for(Note h : this.history) {
                temp.history.add(h.clone());
            }

            return temp;

    }

    @Override
    public String toString() {
        return "HistoryNote{" + super.toString() +
                "history=" + history.size() +
                '}';
    }
}
