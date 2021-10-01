package com.lab.ppi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Subject {

    private Long id;

    private String name;

    private String description;

    @Min(15)
    @Max(30)
    private Long hoursPerWeek;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date startingDate;

    private String subjectCode;

}
