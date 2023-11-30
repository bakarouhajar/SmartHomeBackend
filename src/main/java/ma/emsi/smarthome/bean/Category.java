package ma.emsi.smarthome.bean;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    private String label ;
    private String description;

    public long getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @OneToMany(targetEntity = Appareil.class , mappedBy = "category" , fetch = FetchType.LAZY)
    private List<Appareil> appareils ;

}
