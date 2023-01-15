package ke.or.expd.inventory.controller;

import ke.or.expd.inventory.model.dto.InventoryInquiryResponse;
import ke.or.expd.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/inventories")
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    public ResponseEntity<List<InventoryInquiryResponse>> isInStock(@RequestParam List<String> skuCode) {
        return ResponseEntity.ok().body(inventoryService.isInStock(skuCode));
    }
}
