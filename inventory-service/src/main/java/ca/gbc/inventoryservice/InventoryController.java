package ca.gbc.inventoryservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @GetMapping("/{id}")
    public String getInventory(@PathVariable("id") String id) {
        return "Inventory for Item ID: " + id;
    }
}
