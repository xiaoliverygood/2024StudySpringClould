package org.datasource.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @TableName book
 */

@Data
public class Book implements Serializable {
    /**
     * 
     */

    private String bid;

    /**
     * 
     */

    private String bookName;

    /**
     * 
     */

    private BigDecimal price;

}