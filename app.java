package br.eapg.com.reflections;

public class app {
	
	public static void main(String[] args) {
        
		        
		        Class<?> clienteClass = Cliente.class;
		        
		        
		        if (clienteClass.isAnnotationPresent(Tabela.class)) {
		            
		            Tabela tabela = clienteClass.getAnnotation(Tabela.class);

		            System.out.println("Nome da tabela: " + tabela.nome());
		        } else {
		            System.out.println("A anotação @Tabela não foi encontrada na classe.");
		        }
		    }

}
