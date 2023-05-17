package modelo.enums;

//Foi necessario importar java.util para, corrigir o erro do metodo stream.
import java.util.*;

public enum TipoUsuario {
	
	PROFESSOR(1,"Professor"),
	ALUNO(2,"Aluno"),
	ADMINISTRADOR(3,"Administrador");
	
	private final int valor;
    private final String descricao;

    private TipoUsuario(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }
    
    
    //recebe o valor e retorna o ENUM
    public static TipoUsuario getByInt(Integer valor) {
        return Arrays.stream(TipoUsuario.values()).filter(tipo -> tipo.getValor() == valor)
                .findFirst().get();
    }
    
    public static TipoUsuario getByString(String descricao) {
        return Arrays.stream(TipoUsuario.values()).filter(tipo -> tipo.getDescricao().equals(descricao)).findFirst().get();
    }
    
    //Retorna o nome do tipo renda
 
    public int getValor() {
        return this.valor;
    }
    public String getDescricao() {
        return this.descricao;
    }
	

}
