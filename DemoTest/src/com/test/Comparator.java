package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Developer> listDev = new ArrayList<Developer>();
		
		listDev.add(new Developer("Praveen", "Kumar", 700000, 30));
		listDev.add(new Developer("Prashant", "Kumar", 9700000, 32));
		listDev.add(new Developer("Vijay", "ss", 70000, 20));
		listDev.add(new Developer("Ajay", "dsdd", 3000, 18));
		listDev.add(new Developer("Ziddi", "xyz", 200, 60));
		listDev.add(new Developer("Ziddi", "abcd", 200, 40));
		
		listDev.forEach(list -> System.out.println(list.getName() +" "+list.getAge() +" "+list.getSalary()));

		listDev.sort((Developer d1, Developer d2)-> d1.getAge() - d2.getAge());
		System.out.println("=======  After Sort  =======");
		
		listDev.forEach(list -> System.out.println(list.getName() +" "+list.getAge() +" "+list.getSalary()));
		
		
		Collections.sort(listDev, (de1, de2)->de2.getName().compareTo(de1.getName()));
		
		java.util.Comparator<Developer> byName = java.util.Comparator.comparing(Developer :: getName).thenComparing(Developer :: getLastName);
		Collections.sort(listDev, byName.reversed());
		
		//listDev.sort(java.util.Comparator.comparing(d11 -> d11.getName()));
		
		System.out.println("=======  Sort by Name  =======");
		
		listDev.forEach(list -> System.out.println(list.getName() +" "+list.getLastName()+" "+ list.getAge() +" "+list.getSalary()));
		
		
		//Filter in java 8
		
		List<Developer> result = listDev.stream().filter(dev -> "Praveen".equals(dev.getName())).collect(Collectors.toList());
		
		result.forEach(res->System.out.println(res.getName()+" "+res.getLastName()+" "+res.getAge()+" "+res.getSalary()));
		
		Map<Developer, Long> items = listDev.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Map<String, Long> items11 = listDev.stream().collect(Collectors.groupingBy(Developer::getName, Collectors.counting()));
		System.out.println(items11);
		
	}

}
