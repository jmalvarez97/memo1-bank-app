package com.aninfo.model;

import javax.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double mountTransaction;

    private Long cbu;

    private String type;

    public Transaction(){
    }

    public Transaction(Long _id, Double _mountTransaction, Long _cbu, String _type) {
        this.id = _id;
        this.mountTransaction = _mountTransaction;
        this.cbu = _cbu;
        this.type = _type;
    }

    public void setId(Long _id){
        this.id = _id;
    }

    public Long getId() {return this.id;}

    public Long getCbu() {
        return this.cbu;
    }

    public void setCbu(Long _cbu) {
        this.cbu = _cbu;
    }

    public Double getMountTransaction() { return this.mountTransaction;}

    public void setMountTransaction(double _mountTransaction) { this.mountTransaction = _mountTransaction;}

    public String getType() { return this.type;};

    public void setType(String _type) { this.type = _type;}
}
