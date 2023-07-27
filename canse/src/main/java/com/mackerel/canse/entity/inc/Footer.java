package com.mackerel.canse.entity.inc;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Footer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String picto1;
    private String linkPicto1;
    private String picto2;
    private String linkPicto2;
    private String picto3;
    private String linkPicto3;
    private String picto4;
    private String linkPicto4;
    private String txtInfo1;
    private String txtInfo2;


}
