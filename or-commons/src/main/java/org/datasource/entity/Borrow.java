package org.datasource.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName borrow
 */

@Data
public class Borrow implements Serializable {
    /**
     * 
     */

    private String id;

    /**
     * 
     */

    private String sid;

    /**
     * 
     */

    private String bid;


}