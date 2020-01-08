package oc.projet.p6.Entity;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int comment_id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "member_id")
    private int member_id;

    @Column(name = "topo_id")
    private int topo_id;

    @Column(name = "comment_status")
    private String comment_status;
}