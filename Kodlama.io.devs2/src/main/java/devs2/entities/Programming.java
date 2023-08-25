package devs2.entities;

import javax.annotation.processing.Generated;

@Entity
@Table(name="programs")
public class Programming {
    @İd
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="Sub Technology")
    private String subTech;

    public Programming() {
    }

    public Programming(int id, String name, String subTech) {
        this.id = id;
        this.name = name;
        this.subTech = subTech;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubTech() {
        return subTech;
    }

    public void setSubTech(String subTech) {
        this.subTech = subTech;
    }
}
