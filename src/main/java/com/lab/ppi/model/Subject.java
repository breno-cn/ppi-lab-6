package com.lab.ppi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Subject {

    private Long id;
    private String name;
    private String description;
    private Long hoursPerWeek;

}
