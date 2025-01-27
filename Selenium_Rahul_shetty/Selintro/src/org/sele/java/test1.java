package org.sele.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {

	// @Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhishek");
		names.add("Dinesh");
		names.add("Ankur");
		names.add("Alex");
		names.add("Anshul");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);// 4
	}

	//@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhishek");
		names.add("Dinesh");
		names.add("Ankur");
		names.add("Bittu");
		names.add("Anshul");
		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);
		long d = Stream.of("Abhishek", "Dinesh", "Ankur", "Bittu", "Anshul").filter(s -> {
			s.startsWith("A");
//    		return false;
			return true;

		}).count();
		System.out.println(d);// 0
//		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
//		Abhishek
//		Dinesh
//		Ankur
//		Bittu
//		Anshul
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));//Abhishek

	}
	//@Test
	public void streamMap() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("men");
		names.add("Dinesh");
		names.add("woman");
		
		Stream.of("Abhishek", "Dinesha", "Ankura", "Bittu", "Anshul").filter(s->s.endsWith("a"))
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		List<String> names1=Arrays.asList("Abhishek", "Dinesh", "Ankur", "Bittu", "Anshul");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		Stream<String> newStream=Stream.concat(names.stream(),names1.stream());
		//newStream.sorted().forEach(s->System.out.println("_____"+s));
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Ankur"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	@Test
	public void streamCollect() {
		List<String> ls=Stream.of("Abhishek", "Dinesha", "Alekhya", "Bittu", "Anshul").filter(s->s.endsWith("a"))
				.map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		List<Integer>values=Arrays.asList(3,2,2,7,5,1,9,7);
		values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}

	public static void main(String[] args) {
		test1 test = new test1();
		test.regular();
		test.streamFilter();
		test.streamMap();
		test.streamCollect();
	}
}
