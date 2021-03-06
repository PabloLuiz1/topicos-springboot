package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "produtos", path = "produtos")
public interface ProdutoRepositorio extends JpaRepository<Produto, Long>{

}
