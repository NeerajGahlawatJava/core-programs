package com.app.java.core;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Features {

    public static void main(String... s){
        List<Integer> integerList = Arrays.asList(25,45,89,35,65,45,28,12,25,9);
        List<String> stringList = Arrays.asList("nbm", "mhb","zon","gfn","abc","uio","chi");

        Map<String, Integer> map = new HashMap<>();
        map.put("z", 10);
        map.put("m", 5);
        map.put("a", 6);
        map.put("a", 20);
        map.put("d", 1);
        map.put("e", 7);
        map.put("y", 8);
        map.put("n", 99);
        map.put("g", 50);
        map.put("m", 2);
        map.put("f", 9);

        List<Employee> employees = Arrays.asList(new Employee(14, "Neeraj", 34, 190000, "M", "IT", "Active"),
                new Employee(05, "Vedant", 22, 180000, "M", "HR", "Inactive"),
                new Employee(03, "Digu", 32, 170000, "F", "IT", "Active"),
                new Employee(19, "Reena", 37, 150000, "F", "FI", "Inactive"),
                new Employee(14, "Abu", 25, 120000, "M", "RE", "Active"),
                new Employee(02, "Pushti", 19, 110000, "F", "IT","Inactive"),
                new Employee(01, "Bablu", 44, 180000, "M", "HR", "Active")
        );

        //integerList.stream().sorted((i1,i2)->i1>i2?-1:i1<i2?1:0).collect(Collectors.toList()).forEach(System.out::println);

        //stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

        //stringList.stream().sorted((s1, s2)->s2.compareTo(s1)).collect(Collectors.toList()).forEach(System.out::println);

        LinkedHashMap<String, Integer> linkedHashMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k,v)->k, LinkedHashMap::new));
        //linkedHashMap.entrySet().forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry.getKey() +" "+stringIntegerEntry.getValue()));

       /* employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList()).forEach(employee -> System.out.println(employee.getEmpId()
                        +" "+employee.getName()+" "+employee.getDept()+" "+ employee.getSalary()));*/

        /*HashSet<Integer> hashSet = new HashSet<>();
        integerList.stream().filter(integer -> !hashSet.add(integer))
                .collect(Collectors.toList()).forEach(System.out::println);*/

       /* String str = "Neeraj Gahlawat Yashasvi Gahlawat Vedant Gahlawat";
        List<String> strings = Arrays.asList(str.split(" "));
       Map<String, Long> strCount = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       strCount.entrySet().stream().forEach(stringLongEntry -> System.out.println(stringLongEntry.getKey()+" "+stringLongEntry.getValue()));*/

       Map<String, List<Employee>> stringListMap = employees.stream().collect(Collectors.groupingBy(Employee::getDept));

       /*stringListMap.entrySet().stream().forEach(stringListEntry -> {
           System.out.println(stringListEntry.getKey());
           System.out.println("----------------------------------------------");
           stringListEntry.getValue().stream().forEach(emp->System.out.println(emp.getEmpId() +" "+emp.getName()+" "+emp.getStatus()));
       });*/

        Map<String, Long> stringLongMap = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

       //stringLongMap.entrySet().forEach(stringLongEntry -> System.out.println(stringLongEntry.getKey()+" "+stringLongEntry.getValue()));

        Optional<Employee> employee = employees.stream().min(Comparator.comparingDouble(Employee::getSalary));
        /*if(employee.isPresent()){
            System.out.println(employee.get().getEmpId()+" "+employee.get().getName() +" "+employee.get().getSalary());
        }*/

        Map<String, Double> stringEmployeeMap= employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingInt(Employee::getAge)));
        stringEmployeeMap.entrySet().stream().forEach(stringOptionalEntry -> System.out.println(stringOptionalEntry.getKey()+" "+stringOptionalEntry.getValue()));

        //employees.stream().map(employee1 -> employee1.getDept()).distinct().collect(Collectors.toList()).stream().forEach(System.out::println);
    }
}
