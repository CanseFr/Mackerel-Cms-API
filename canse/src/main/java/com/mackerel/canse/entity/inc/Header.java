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
public class Header {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String pageSelect1;
    private String bgSelect1;

    private String pageSelect2;
    private String bgSelect2;

    private String pageSelect3;
    private String bgSelect3;

    private String pageSelect4;
    private String bgSelect4;

    private String pageSelect5;
    private String bgSelect5;

    private String pageSelect6;
    private String bgSelect6;

    private String btn1;
    private String btn2;

}
