package oc.projet.p6.Entity;

import javax.persistence.*;

@Entity
@Table(name = "way")
public class Way {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "way_id")
    private int id;

    @Column(name = "name")
    private String nameWay;

    @Column(name = "cotation")
    private String difficulty;

    @Column(name = "number_points")
    private int points;



    @ManyToOne
    @JoinColumn(name = "sector_id", referencedColumnName = "sector_id")
    private Sector sector;


    public Way() {
    }

    public Way(String nameWay, String difficulty, int points, int sectorId, Sector sector) {
        this.nameWay = nameWay;
        this.difficulty = difficulty;
        this.points = points;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameWay() {
        return nameWay;
    }

    public void setNameWay(String nameWay) {
        this.nameWay = nameWay;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Way{" +
                "way_id=" + id +
                ", name_way='" + nameWay + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", points=" + points +
                '}';
    }
}
