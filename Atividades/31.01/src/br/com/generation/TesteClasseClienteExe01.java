package br.com.generation;

public class TesteClasseClienteExe01 {
	
	 public static void main(String[] args) {


		    ClasseCliente01 objeto = new ClasseCliente01();
		    ClasseCliente01 objeto1 = new ClasseCliente01();

		    objeto.setNome("Izabela"); 
		    objeto.setIdade(21);
		    objeto.setEndere�o("Rua Paulo Rodrigues Durao 86");
		    objeto.setCpf("24557898014");

		    objeto1.setNome("Larissa"); 
		    objeto1.setIdade(35);
		    objeto1.setEndere�o("Rua Luiza Bocchlieri Ximenes 119");
		    objeto1.setCpf("78054323412");

		    System.out.println("Seu nome �: " + objeto.getNome());
		    System.out.println("A sua idade �: " + objeto.getIdade());
		    System.out.println("Seu endere�o: " + objeto.getEndere�o());
		    System.out.println("Seu CPF: "+ objeto.getCpf());
		    System.out.println();

		    System.out.println("Seu nome �: " + objeto1.getNome());
		    System.out.println("A sua idade �: " + objeto1.getIdade());
		    System.out.println("Seu endere�o �: " + objeto1.getEndere�o());
		    System.out.println("Seu CPF: " + objeto1.getCpf());


		    }
		}


