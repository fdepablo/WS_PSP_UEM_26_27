package main;

import java.util.ArrayList;

import entidades.Direccion;
import entidades.Persona;

public class MainObjetos {

	public static void main(String[] args) {
		{
			Persona p = new Persona();
		}//Aqui morira p
		
		Persona p = new Persona();
		p.setNombre("Tony Stark");
		p.setEdad(45);
		p.setPeso(45.50);
		
		Persona p2 = p;
		
		p2.setNombre("Steve Rogers");
		System.out.println(p.getNombre());
		
		cambiarNombre(p);
		System.out.println(p.getNombre());
		
		ArrayList<Persona> lista = new ArrayList<>();
		lista.add(p);
		lista.add(p2);
		lista.get(1).setNombre("Natasha Romanoff");
		System.out.println(p2.getNombre());
		
		Persona p3 = new Persona();
		lista.add(p3);
		p3.setNombre("Bruce Banner");
		
		lista.get(2).getNombre();
		
		String direccion = "Calle falsa 123 Madrid 28034";
		String direccion2 = "Av Otra 123 22222 Barcelona";
		
		int cp = 0b101011000101010;
		System.out.println(cp);
		
		Persona p4 = new Persona();
		p4.setNombre("Logan");
		//p4.getDireccion().setNombreVia("Calle falsa");
		Direccion d1 = new Direccion();
		p4.setDireccion(d1);
		
		d1.setNombreVia("Gran Via");
		System.out.println(p4.getDireccion().getNombreVia());
		
		//d1 = new Direccion();
		
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(p4);
		
		listaPersonas.get(0).getDireccion().setNombreVia("Plaza Mayor");
		System.out.println(d1.getNombreVia());
		
		/*
		String cadena1 = "Hola";
		String cadena2 = "Hola";
		
		if(cadena1 == cadena2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
		
		cadena1 = new String("Hola");
		cadena2 = new String("Hola");
		
		if(cadena1 == cadena2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}*/
	}
	
	public static void cambiarNombre(Persona p) {
		p.setNombre("Peter Parker");
	}

}
