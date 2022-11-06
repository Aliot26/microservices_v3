package com.volha.inventoryservice.service.impl;

import com.volha.inventoryservice.dto.InventoryResponse;
import com.volha.inventoryservice.repository.InventoryRepository;
import com.volha.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryServiceImpl implements InventoryService {
    private final InventoryRepository inventoryRepository;


    @Transactional(readOnly = true)
    @SneakyThrows //don't us it in production
    public List<InventoryResponse> isInStock(List<String> skuCode) {
        log.info("Wait started");
        Thread.sleep(10000);
        log.info("Wait ended");
        return inventoryRepository.findBySkuCodeIn(skuCode).stream()
                .map(inventory -> InventoryResponse.builder()
                            .skuCode(inventory.getSkuCode())
                            .isInStock(inventory.getQuantity() > 0)
                            .build()
                ).toList();
    }
}
