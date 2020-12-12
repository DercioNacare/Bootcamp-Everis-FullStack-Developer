package com.dn.code.dio.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList 
{
	public static void main(String[] args) 
	{
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Juliana");
		nomes.add("Maria");
		nomes.add("Anderson");
		nomes.add("João");
		
		
		System.out.println(nomes);
		nomes.set(2, "Larissa");
		
		System.out.println(nomes);
		
		Collections.sort(nomes);
		
		nomes.set(2, "Wesley");
		
		System.out.println(nomes);
		
		nomes.remove(4);
		
		System.out.println(nomes);
		
		nomes.remove("Wesley");
		
		System.out.println(nomes);
		
		System.out.println(nomes.get(1));
		
		System.out.println(nomes.size());
		
		System.out.println(nomes.indexOf("Carlos"));
		
		System.out.println(nomes.indexOf("Wesley"));
		
		nomes.remove("Larissa");
		
		System.out.println(nomes.size());
		
		System.out.println(nomes.contains("Anderson"));
		
		System.out.println(nomes.contains("Fernando"));
		
		System.out.println(nomes.isEmpty());
		
		
		Iterator<String> iterator = nomes.iterator();
	
		while(iterator.hasNext())
		{
			System.out.println("--> " + iterator.next());
		}
		
		
		for(String nome: nomes)
		{
			System.out.println("----> " + nome);
		}
		nomes.clear();
		
		System.out.println(nomes.isEmpty());
	
	
		
	}
}
