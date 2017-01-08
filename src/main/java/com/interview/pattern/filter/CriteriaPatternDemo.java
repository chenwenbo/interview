package com.interview.pattern.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * description : filter pattern
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/08 23:04.
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert","male", "single"));
        persons.add(new Person("John", "male", "married"));
        persons.add(new Person("Laura", "female", "married"));
        persons.add(new Person("Diana", "female", "single"));
        persons.add(new Person("Mike", "male", "single"));
        persons.add(new Person("Bobby", "male", "single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(female, male);
        Criteria singleOrFemale = new OrCriteria(female, female);

        System.out.println("Males: ");
        printPersons(persons.stream().filter(male::match).collect(Collectors.toList()));

        System.out.println("\nFemales: ");
        printPersons(persons.stream().filter(female::match).collect(Collectors.toList()));

        System.out.println("\nSingle: ");
        printPersons(persons.stream().filter(single::match).collect(Collectors.toList()));

        System.out.println("\nSingle And Females: ");
        printPersons(persons.stream().filter(singleMale::match).collect(Collectors.toList()));

        System.out.println("\nSingle Or Females: ");
        printPersons(persons.stream().filter(singleOrFemale::match).collect(Collectors.toList()));
    }

    public static void printPersons(List<Person> persons){

        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }
}
