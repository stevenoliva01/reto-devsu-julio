package com.devsu.pichincha.controller;

import com.devsu.pichincha.model.DevsuRequest;
import com.devsu.pichincha.model.DevsuResponse;
import com.devsu.pichincha.util.Constantes;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@Validated
public class DevsuController {

    @PostMapping("/DevOps")
    @ApiOperation(value = "",notes = "",response = DevsuResponse.class)
    public Mono<ResponseEntity<DevsuResponse>> sendMessageOfTest(
        @RequestHeader("X-Parse-REST-API-Key") String apiKey,
        @RequestBody @Valid DevsuRequest devsuRequest){
      return Mono.just(
          new ResponseEntity<>(
              DevsuResponse.builder()
                  .mensaje(Constantes.MENSAJE_PARTE1 + devsuRequest.getTo() + Constantes.MENSAJE_PARTE2)
                  .build(),HttpStatus.OK
            ));
    }
}