package br.com.example.vzan.domain.item;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ItemRequestDTO (
    @NotBlank
    String name,

    @NotNull
    Integer price
){

}
