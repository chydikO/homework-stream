package org.itstep;

import java.util.Arrays;
import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsHomework {

    final static Collection<Student> students = Arrays.asList(
            new Student("Вася", 16, Gender.MAN),
            new Student("Петя", 23, Gender.MAN),
            new Student("Соня", 18, Gender.WOMEN),
            new Student("Виктор Петрович", 65, Gender.MAN),
            new Student("Дима", 25, Gender.MAN),
            new Student("Катя", 21, Gender.WOMEN),
            new Student("Семен", 33, Gender.MAN),
            new Student("Елена", 42, Gender.WOMEN),
            new Student("Иван Иванович", 69, Gender.MAN)
    );
    
    static List<Student> ex01() {
    	// TODO: Задание 1
        // выбрать всех мужчин от 18-27 лет включительно
        return students.stream()
                .filter(student -> student.getAge() >= 18 && student.getAge() <= 27 && student.getGender() == Gender.MAN)
                .collect(Collectors.toList());
    }
    
    static double ex02() {
    	// TODO: Задание 2
    	// Найти средний возраст всех мужчин
        IntSummaryStatistics stats = students.stream()
                .filter(student -> student.getGender() == Gender.MAN)
                .mapToInt((student) -> student.getAge())
                .summaryStatistics();
    	return stats.getAverage();
    }
    static long ex03() {
    	// TODO: Задание 3
    	// Найти кол-во потенциально работоспособных 
    	// студентов в выборке (т.е. от 18 лет и учитывая 
    	// что женщины выходят в 55 лет, а мужчина в 60)
    	return 0;
    }
    
    static List<Student> ex04() {
    	// TODO: Задание 4    	
    	// Отсортировать студентов по имени в обратном алфавитном порядке
    	return null;
    }
    
    static Student ex05() {
    	//  TODO: Задание 5
    	//  найти самого старшего студента
    	return null;
    }
    
    static Student ex06() {
    	// TODO: Задание 6
    	// Найти самого младшего студента
    	return null;
    }
    
    public static void main(String[] args) {
		// TODO: тестировать здесь
        	System.out.println(ex04());
    }
} 