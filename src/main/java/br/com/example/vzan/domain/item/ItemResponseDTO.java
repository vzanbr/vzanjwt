package br.com.example.vzan.domain.item;

public record ItemResponseDTO(String id, String name, Integer price) {
    public ItemResponseDTO(Item item)
    {this(item.getId(), item.getName(), item.getPrice());
    }
}
