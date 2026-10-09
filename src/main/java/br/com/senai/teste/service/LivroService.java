package br.com.senai.teste.service;

import org.springframework.stereotype.Service;

import br.com.senai.teste.model.Livro;
import br.com.senai.teste.repository.LivroRepository;

@Service 
public class LivroService {
    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public Livro cadastrar(Livro livro) {
        return livroRepository.save(livro);
    }
}
