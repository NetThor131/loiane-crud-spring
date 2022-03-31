package com.jneto.crudspring.controller;

import java.util.List;

import com.jneto.crudspring.model.Curso;
import com.jneto.crudspring.repository.CursoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cursos")
@AllArgsConstructor
public class CursoController {

  private final CursoRepository cursoRepository;

  // @RequestMapping(method = RequestMethod.GET)
  @GetMapping
  public List<Curso> list() {
    return cursoRepository.findAll();
  }
}
