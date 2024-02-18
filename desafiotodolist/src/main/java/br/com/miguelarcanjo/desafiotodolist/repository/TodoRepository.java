package br.com.miguelarcanjo.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.miguelarcanjo.desafiotodolist.entity.Todo;

public interface TodoRepository  extends JpaRepository<Todo, Long>{
    
}
