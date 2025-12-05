package com.nnk.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import java.sql.Date;
import java.sql.Timestamp;
@Entity
@Table(name = "bidlist")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BidList {
    // TODO: Map columns in data table BIDLIST with corresponding java fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer BidListId;

    @Column(length = 30,nullable = false)
    @NotBlank(message = "Account is mandatory")
    private String account;

    @Column(length = 30)
    @NotBlank(message = "Type is mandatory")
    private String type;

    private Double bidQuantity;

    private Double askQuantity;

    private Double bid;

    private Double ask;

    @Column(length = 125)
    private String benchmark;

    private Timestamp bidListDate;

    @Column(length = 125)
    private String commentary;

    @Column(length = 125)
    private String security;

    @Column(length = 10)
    private String status;

    @Column(length = 125)
    private String trader;

    @Column(length = 125)
    private String book;

    @Column(length = 125)
    private String creationName;

    private Timestamp creationDate;

    @Column(length = 125)
    private String revisionName;

    private Timestamp revisionDate;

    @Column(length = 125)
    private String dealName;

    @Column(length = 125)
    private String dealType;

    @Column(length = 125)
    private String sourceListId;

    @Column(length = 125)
    private String side;
}
