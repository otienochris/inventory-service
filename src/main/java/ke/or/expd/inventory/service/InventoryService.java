package ke.or.expd.inventory.service;

import ke.or.expd.inventory.model.dto.InventoryInquiryResponse;

import java.util.List;

public interface InventoryService {
    List<InventoryInquiryResponse> isInStock(List<String> skuCode);
}
