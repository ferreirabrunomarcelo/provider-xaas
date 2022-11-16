package com.xaas.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping
    public String provider() {
        return "Provider Azure Aula";
    }

}
