package com.devsu.pichincha.model;


import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
