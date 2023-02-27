package edu.fra.uas.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "barchart")
public class Barchart {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "lable")
    private String Label;

    @Column(name = "wert")
    private Integer Wert;


    public Barchart() {

    }
    public Barchart(String label, Integer Wert) {
        super();
        Label = label;
        this.Wert = Wert;
    }
    public String getLabel() {
        return Label;
    }
    public void setLabel(String label) {
        Label = label;
    }
    public Integer getwert() {
        return Wert;
    }
    public void setwert(Integer value) {
        this.Wert = value;
    }
    public long getId() {
        return id;
    }

}