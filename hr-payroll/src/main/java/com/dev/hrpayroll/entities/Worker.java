package com.dev.hrpayroll.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Worker implements Serializable {

   private Long id;
    private String name;
    private Double dailyIncome;
}
