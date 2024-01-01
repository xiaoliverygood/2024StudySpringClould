package org.datasource.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName student
 */

@Data
public class Student implements Serializable {
    /**
     * 
     */

    private String sid;

    /**
     * 
     */

    private String name;

    /**
     * 
     */

    private String className;


}