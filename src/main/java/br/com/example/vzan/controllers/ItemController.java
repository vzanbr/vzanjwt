package br.com.example.vzan.controllers;

import br.com.example.vzan.domain.item.Item;
import br.com.example.vzan.domain.item.ItemRequestDTO;
import br.com.example.vzan.domain.item.ItemResponseDTO;
import br.com.example.vzan.repository.ItemRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("item")
public class ItemController {

    @Autowired
    ItemRepository repository;

    @PostMapping
    public ResponseEntity postItem(@RequestBody @Valid ItemRequestDTO body){
        Item newItem = new Item(body);

        this.repository.save(newItem);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getAllItem(){
        List<ItemResponseDTO> itemList = this.repository.findAll().stream().map(ItemResponseDTO::new).toList();

        return ResponseEntity.ok(itemList);
    }
}
