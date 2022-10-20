package com.volha.inventoryservice;

import com.volha.inventoryservice.model.Inventory;
import com.volha.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository){
        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("iphone_14");
            inventory.setQuantity(100);

            Inventory inventory2 = new Inventory();
            inventory2.setSkuCode("iphone_14_red");
            inventory2.setQuantity(0);

            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory2);
        };
    }

}
