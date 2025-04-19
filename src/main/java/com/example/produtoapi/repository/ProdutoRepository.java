package com.example.produtoapi.repository;

import com.example.produtoapi.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
