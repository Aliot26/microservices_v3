package com.volha.inventoryservice.controller;

import com.volha.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/{skucode}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@PathVariable("skucode") String skuCode){
        return inventoryService.isInStock(skuCode);
    }
}
