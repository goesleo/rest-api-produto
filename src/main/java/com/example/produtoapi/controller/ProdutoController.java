package com.example.produtoapi.controller;

import com.example.produtoapi.entity.Produto;
import com.example.produtoapi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/produtos")

public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto ){
        return produtoRepository.save(produto);
    }

    @GetMapping
    public List<Produto> listarProduto(){
        return produtoRepository.findAll();
    }


    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id) {
        produtoRepository.deleteById(id);
    }




}
