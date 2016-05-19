package entities;

/**
 * Created by wookie on 5/17/16.
 */
public abstract class Note implements Cloneable {
    protected String name;
    protected String nick;
    protected String phoneNumber;
    protected String email;
    protected String icq;

    protected Note() {

    }

    protected Note(String name, String nick, String email, String icq, String phoneNumber) {
        this.name = name;
        this.nick = nick;
        this.email = email;
        this.icq = icq;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (!getName().equals(note.getName())) return false;
        if (getNick() != null ? !getNick().equals(note.getNick()) : note.getNick() != null) return false;
        if (getPhoneNumber() != null ? !getPhoneNumber().equals(note.getPhoneNumber()) : note.getPhoneNumber() != null)
            return false;
        if (!getEmail().equals(note.getEmail())) return false;
        return getIcq() != null ? getIcq().equals(note.getIcq()) : note.getIcq() == null;

    }

    @Override
    public int hashCode() {
        return getEmail().hashCode();
    }

    @Override
    public String toString() {
        return "Note{" +
                "name='" + name + '\'' +
                ", nick='" + nick + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", icq='" + icq + '\'' +
                '}';
    }

    @Override
    protected Note clone() {
        try {
            return (Note)super.clone();
        } catch (CloneNotSupportedException e) {
            // e.printStackTrace();
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIcq() {
        return icq;
    }

    public void setIcq(String icq) {
        this.icq = icq;
    }
}
