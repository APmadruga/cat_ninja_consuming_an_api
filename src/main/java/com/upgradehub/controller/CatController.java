package com.upgradehub.controller;
import com.upgradehub.provider.FactResponse;
import com.upgradehub.service.FactService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CatController {

    private final FactService factService;

    @GetMapping("/cat/fact")
    public ResponseEntity<FactResponse> getCatFact(){
        final var response = factService.getFact();
        return ResponseEntity.ok(new FactResponse(response));
    }
}

