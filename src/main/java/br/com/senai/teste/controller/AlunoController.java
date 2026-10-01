package br.com.senai.teste.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.teste.service.AlunoService;

@RestController 
@RequestMapping ("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @postMapping
    public ResponseEntity<Aluno> cadastrar(
        @RequesBody Aluno aluno) {
            Aluno alunoCadastro = alunoService.cadastrar(aluno)

            return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(alunoCadastrado);
        }
    
}
