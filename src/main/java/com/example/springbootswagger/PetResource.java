package com.example.springbootswagger;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/pets")
public class PetResource {

    @ApiOperation(value = "This Resource fetch all reserved pets")
    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<PetDto> pets() {
        return new ArrayList<>();
    }

    @ApiOperation(value = "This Resource fetch a pet by id")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Id supplied", response = ErrorDto.class), @ApiResponse(code = 404, message = "Pet not found")})
    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public PetDto pet(@PathVariable int id) {
        return new PetDto(1, "dog", "pochi");
    }

    @PutMapping("{id}")
    public void updatePet(@PathVariable int id, @RequestBody PetDto pet) {
        return;
    }

    @PostMapping
    public int insertPet(@RequestBody PetDto pet) {
        return 1;
    }

    @DeleteMapping("{id}")
    public void deletePet(@PathVariable int id) {
        return;
    }
}
