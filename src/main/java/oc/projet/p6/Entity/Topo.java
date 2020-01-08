package oc.projet.p6.Entity;

import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.*;

@Entity
@Table(name = "topo")
public class Topo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int topo_id;

    @Column(name = "name_topo")
    private String name_topo;

    @Column(name = "region")
    private String region;

    @Column(name = "country")
    private String country;

    @Column(name = "topo_status")
    private String topo_status;

    @Column(name = "user_id")
    private String user_id;

    public Topo(String name_topo, String region, String country, String topo_status, String user_id) {
        this.name_topo = name_topo;
        this.region = region;
        this.country = country;
        this.topo_status = topo_status;
        this.user_id = user_id;
    }

    public Topo() {
    }

    public int getTopo_id() {
        return topo_id;
    }

    public void setTopo_id(int topo_id) {
        this.topo_id = topo_id;
    }

    public String getName_topo() {
        return name_topo;
    }

    public void setName_topo(String name_topo) {
        this.name_topo = name_topo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTopo_status() {
        return topo_status;
    }

    public void setTopo_status(String topo_status) {
        this.topo_status = topo_status;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}