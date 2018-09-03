package br.com.vsouzaf.figurinhas.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.vsouzaf.figurinhas.to.ToAbstata;
import br.com.vsouzaf.figurinhas.to.UsuarioTo;

@Document
public class Usuario extends BeanAbstrata {

    @Id
    private String id;

    private String nome;

    private List<Perfil> perfis;

    private int idade;

    private String email;
    
    private String senha;

    public Usuario() {
    }

    public Usuario(Usuario usuario) {
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.senha = usuario.getSenha();
        this.perfis = usuario.getPerfis();
    }

    public Usuario(String nome, List<Perfil> perfis, String email, String senha) {
        this.nome = nome;
        this.perfis = perfis;
        this.email = email;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Perfil> getPerfis() {
        return perfis;
    }

    public void setPerfis(List<Perfil> perfis) {
        this.perfis = perfis;
    }

	@Override
	public ToAbstata converterParaTo() {
		UsuarioTo usuario = new UsuarioTo();
		usuario.setId(id);
		usuario.setEmail(email);
		usuario.setIdade(idade);
		usuario.setNome(nome);
		usuario.setSenha(senha);
		
		return usuario;
	}
}
