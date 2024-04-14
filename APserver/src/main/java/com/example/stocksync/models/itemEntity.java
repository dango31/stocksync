package com.example.stocksync.models;

import jakarta.persistence.*;

@Entity
@Table(name = "item")
public class itemEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="item_name", length = 30)
    private String itemName;

    @Column(name="expires")
    private boolean expires;

    @Column(name="minimumStock")
    private int minimumStock;

    @Column(name="stockUnit")
    private String stockUnit;
}
