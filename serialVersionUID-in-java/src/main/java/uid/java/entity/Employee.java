package uid.java.entity;

import java.io.Serializable;

public class Employee  implements Serializable
{

    private int id ;
    private String name;
    private  String city;
    private transient String password;

}
