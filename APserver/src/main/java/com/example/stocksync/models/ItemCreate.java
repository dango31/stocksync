package com.example.stocksync.models;

import lombok.Data;

@Data
public class ItemCreate {

    private String itemName;

    private boolean expires;

    private int minimumStock;

    private String stockUnit;
}
