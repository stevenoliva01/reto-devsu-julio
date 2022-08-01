package com.app.devsu.model;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@AllArgsConstructor
@Data
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class DevsuRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotBlank
    private String message;

    @NotBlank
    private String to;

    @NotBlank
    private String from;

    private Integer timeToLifeSec;
}
