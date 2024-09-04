package ex.java;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
    private final static long serialVersionUID = 12213344L;
    private String name;
    private int id;
    private String city;
    private double gpa;
    private transient String password;

    public Employee() {
        // Default constructor is required for Externalizable
    }


    public Employee(String name, int id, String city, double gpa, String password) {
        this.name = name;
        this.id = id;
        this.city = city;
        this.gpa = gpa;
        this.password = password;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(id);
        out.writeObject(city);
        out.writeDouble(gpa);
        out.writeObject(password);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        id = in.readInt();
        city = (String) in.readObject();
        gpa = in.readDouble();
        password = (String) in.readObject();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", city='" + city + '\'' +
                ", gpa=" + gpa +
                ", password='" + password + '\'' +
                '}';
    }
}
