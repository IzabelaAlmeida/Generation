package br.com.generation;

public class TesteClasseClienteExe01 {
	
	 public static void main(String[] args) {


		    ClasseCliente01 objeto = new ClasseCliente01();
		    ClasseCliente01 objeto1 = new ClasseCliente01();

		    objeto.setNome("Izabela"); 
		    objeto.setIdade(21);
		    objeto.setEndereço("Rua Paulo Rodrigues Durao 86");
		    objeto.setCpf("24557898014");

		    objeto1.setNome("Larissa"); 
		    objeto1.setIdade(35);
		    objeto1.setEndereço("Rua Luiza Bocchlieri Ximenes 119");
		    objeto1.setCpf("78054323412");

		    System.out.println("Seu nome é: " + objeto.getNome());
		    System.out.println("A sua idade é: " + objeto.getIdade());
		    System.out.println("Seu endereço: " + objeto.getEndereço());
		    System.out.println("Seu CPF: "+ objeto.getCpf());
		    System.out.println();

		    System.out.println("Seu nome é: " + objeto1.getNome());
		    System.out.println("A sua idade é: " + objeto1.getIdade());
		    System.out.println("Seu endereço é: " + objeto1.getEndereço());
		    System.out.println("Seu CPF: " + objeto1.getCpf());


		    }
		}


