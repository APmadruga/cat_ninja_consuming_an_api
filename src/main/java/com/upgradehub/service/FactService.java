package com.upgradehub.service;
import com.upgradehub.provider.FactProvider;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FactService {

    private final FactProvider factProvider;

    public String getFact() {
       return factProvider.getFact();
    }
}
