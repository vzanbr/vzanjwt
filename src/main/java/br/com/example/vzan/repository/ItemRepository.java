package br.com.example.vzan.repository;

import br.com.example.vzan.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}
