package com.lgcns.swainno.jpa.web.sample1.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@ToString
public class OrderInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String product;

    @Column
    private long price;

    @Column(nullable = false)
    private long member_id;
}
