package executor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_API {

	public static void main(String[] args) {
		/*//to find an integer
		Stream<Integer> s=Stream.of(9,8,7,6,5,4,3,2,1);
		s.forEach(value ->System.out.println(value));
		*/
		/*// to find string
		Stream<String> s=Stream.of("Preetha","surya","saritha","vijayakumar");
		s.forEach(name ->System.out.println(name));
		*/
		/*// to array of integer
		Stream<Integer> stream = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9});
		stream.forEach(System.out::println);
		*/
		/*//to find list of names
		List<String> names = new ArrayList<>();
		names.add("preetha");
		names.add("Akash");
		names.add("Prakash");
		names.add("muruga");
		
		Stream<String> stream = names.stream();
		stream.forEach(System.out::println);
		*/
		/*//to generate random numbers
		Stream<Integer> stream = Stream
				.generate(()->(new Random())
						.nextInt(100));	
		
		stream.limit(20).forEach(System.out::println);
		*/
		/*//to split 
		IntStream stream1 = "12345_abcdef".chars();
		stream1.forEach(System.out::println);
		
		System.out.println("****************");
		
		Stream<String> stream2 = Stream.of("A$B$C".split("\\$"));	
		stream2.forEach(System.out::println);
		*/
		/*//to collect a list into filter
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<10; i++) {
			list.add(i);
		}
		
		Stream<Integer> stream = list.stream();
		
		//stream.forEach(System.out::println);
		
		List<Integer> result = stream
				.filter(i -> i %2 == 0)
				.collect(Collectors.toList());
		
		System.out.println(result);
		*/
		/*//filter array list
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<10; i++) {
			list.add(i);
		}
		
		Stream<Integer> stream = list.stream();
		
		Integer[] result = stream
				.filter(i -> i % 2 == 0)
				.toArray(Integer[]::new);
		
		for(int val:result)
			System.out.println(val);
			*/
		
		
		List<String> members = new ArrayList<>();
		
		
		members.add("Aparana");
		members.add("Surya");
		members.add("preetha");
		members.add("Ajith");
		members.add("Suresh");
		members.add("Ramya");
		members.add("preethi");
		members.add("mercy");
		// filter
				/*
				members.stream()
					.filter((m) -> m.startsWith("A"))
					.forEach(System.out::println);
				*/
				
				// map
				
				/*
				members.stream()
					.map(String::toUpperCase)
					.forEach(System.out::println);
				*/
				
				// sorted
				/*
				members.stream()
					.sorted()
					.forEach(System.out::println);
				*/
				
				// forEach
				
				//members.stream().forEach((m) -> System.out.println(m));
				
				// collect
				
				/*
				List<String> membersUpperCase = members.stream().sorted()
						.map(String::toUpperCase)
						.collect(Collectors.toList());
				
				System.out.println(membersUpperCase);
				*/
		// matching
		
				// anyMatch(), allMatch(), noneMatch()
				
				/*
				boolean matchedResult = members.stream()
						.anyMatch(n -> n.startsWith("A"));
				
				System.out.println(matchedResult);
				
				matchedResult = members.stream()
						.allMatch(n -> n.startsWith("A"));
						
				System.out.println(matchedResult);
				
				matchedResult = members.stream()
						.noneMatch(n -> n.startsWith("P"));
						
				System.out.println(matchedResult);
				*/
				
				// count()
				
				/*
				
				long count1 = members.stream().count();
				
				System.out.println(count1);
				
				long count2 = members.stream()
						.filter(n -> n.startsWith("A"))
						.count();
				
				System.out.println(count2);
				*/
				
				
			}

		

		
		
		
		
		
		
		
		
	}


