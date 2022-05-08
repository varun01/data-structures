package com.learning.interview;

import com.learning.pojo.Address;
import com.learning.pojo.MobileNumber;
import com.learning.pojo.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Java 8 Streams practise
 */
public class Java8 {

    /*
     * Get student with exact match name "Varun"
     */
    private static void matchNameUsingFilters(List<Student> students) {
        System.out.println("Get student with exact match name \"Varun\" ");
        List<Student> result = students.stream().filter(s -> s.getName().equalsIgnoreCase("Varun")).collect(Collectors.toList());
        result.forEach(System.out::println);
        System.out.println("*********************************************");
    }

    /*
     * Get student with matching address "1235"
     */
    private static void matchAddressUsingFilters(List<Student> students) {
        System.out.println("Get student with matching address \"1235\" ");
        List<Student> result = students.stream().filter(s -> s.getAddress().getZipcode().equalsIgnoreCase("1235")).collect(Collectors.toList());
        result.forEach(System.out::println);
        System.out.println("*********************************************");
    }

    /*
     * Get all student having mobile numbers 3333
     */
    private static void matchMobileNumbersUsingFiltersAndAnyMatch(List<Student> students) {
        System.out.println("Get all student having mobile numbers 3333 ");
        List<Student> result = students.stream().filter(s -> s.getMobileNumbers().stream().anyMatch(m -> m.getNumber().equalsIgnoreCase("3333"))).collect(Collectors.toList());
        result.forEach(System.out::println);
        System.out.println("*********************************************");
    }

    /*
     * Get all student having mobile number 1233 and 1234
     */
    private static void matchMobileNumbersUsingFiltersAndAllMatch(List<Student> students) {
        System.out.println("Get all student having mobile numbers 1233 and 1234");
        List<Student> result = students.stream().filter(s -> s.getMobileNumbers().stream().allMatch(m -> m.getNumber().equalsIgnoreCase("1233") || m.getNumber().equalsIgnoreCase("1234"))).collect(Collectors.toList());
        result.forEach(System.out::println);
        System.out.println("*********************************************");
    }

    /*
     * Convert List<Student> to List<String> of student name
     */
    private static void extractNameFromStudentListUsingMap(List<Student> students) {
        System.out.println("Convert List<Student> to List<String> of student name");
        List<String> result = students.stream().map(Student::getName).collect(Collectors.toList());
        result.forEach(System.out::println);
        System.out.println("*********************************************");
    }

    /*
     * Change the case of List<String> of student name
     */
    private static void convertStudentNameToUpperCaseUsingMap(List<Student> students) {
        System.out.println("Convert List<Student> to List<String> of student name");
        List<String> result = students.stream().map(Student::getName).collect(Collectors.toList()).stream().map(String::toUpperCase).collect(Collectors.toList());
        result.forEach(System.out::println);
        System.out.println("*********************************************");
    }

    /*
     * Get all departments of Students
     */
    private static void getAllDepartmentsOfStudentUsingMap(List<Student> students) {
        System.out.println("Get all departments of Students");
        List<String> result = students.stream().map(Student::getDepartment).distinct().collect(Collectors.toList());
        result.forEach(System.out::println);
        System.out.println("*********************************************");
    }

    public static void main(String[] args) {
        Student student1 = new Student(
                "Varun",
                20,
                new Address("1234"),
                Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")), "CSE");

        Student student2 = new Student(
                "Rakesh",
                20,
                new Address("1235"),
                Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")),"CSE");

        Student student3 = new Student(
                "Jason",
                20,
                new Address("1236"),
                Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")),"CSE");

        Student student4 = new Student(
                "Vamsi",
                30,
                new Address("1236"),
                Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")),"ECE");

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        matchNameUsingFilters(students);
        matchAddressUsingFilters(students);
        matchMobileNumbersUsingFiltersAndAnyMatch(students);
        matchMobileNumbersUsingFiltersAndAllMatch(students);
        extractNameFromStudentListUsingMap(students);
        convertStudentNameToUpperCaseUsingMap(students);
        getAllDepartmentsOfStudentUsingMap(students);
    }
}
