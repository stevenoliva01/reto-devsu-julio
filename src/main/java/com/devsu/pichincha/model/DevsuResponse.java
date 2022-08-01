package com.devsu.pichincha.model;

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
public class DevsuResponse {
  
  private String mensaje;

}
