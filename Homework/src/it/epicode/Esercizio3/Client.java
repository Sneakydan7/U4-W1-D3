package it.epicode.Esercizio3;

import java.util.Date;

public class Client {

    private int clientId;

    private String name;

    private String lastName;

    private String email;

    private Date dateOfSignup;

    public Client(int _clientId, String _name, String _lastname, String _email, Date _dateOfSignup) {
        this.clientId = _clientId;
        this.name = _name;
        this.lastName = _lastname;
        this.email = _email;
        this.dateOfSignup = _dateOfSignup;
    }
}
