package modelo;

import java.util.Arrays;

public enum TipoUsuario {
	
	Professor(1,"Professor"),
	Aluno(2,"Aluno"),
	Administrador(3,"Administrador");
	
	private final int valor;
    private final String descricao;

    private TipoUsuario(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }
    
    
    //recebe o valor e retorna o ENUM
    public static TipoUsuario getBy(Integer valor) {
        return Arrays.stream(TipoUsuario .values()).filter(tipo -> tipo.getValor() == valor)
                .findFirst().get();
    }
    
    //Retorna o nome do tipo renda
 
    public int getValor() {
        return this.valor;
    }
    public String getDescricao() {
        return this.descricao;
    }
	

}
