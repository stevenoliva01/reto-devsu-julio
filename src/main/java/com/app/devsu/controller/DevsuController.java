package com.app.devsu.controller;

import com.app.devsu.model.DevsuRequest;
import com.app.devsu.model.DevsuResponse;
import com.app.devsu.util.Constantes;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.util.Objects;

@RestController
@RequiredArgsConstructor
@Validated
public class DevsuController {

    @PostMapping("/DevOps")
    @ApiOperation(value = "",notes = "",response = DevsuResponse.class)
    public Mono<ResponseEntity<DevsuResponse>> sendMessageOfTest(@RequestHeader("X-Parse-REST-API-Key") String apiKey,@RequestBody @Valid DevsuRequest devsuRequest) throws Exception {
        if(!apiKey.equals(Constantes.API_KEY)) {
            throw new Exception();
        }
        return Mono.just(new ResponseEntity<>(DevsuResponse.builder()
                .message("Hello " + devsuRequest.getTo() + " your message will be send")
                .build(),HttpStatus.OK));
    }
}
