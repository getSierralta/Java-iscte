package aula11JavaCollectors;

import aula10InterfacesComparadores.Student;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentsPredicate {
    public Predicate<Student> isMale() {
        return p -> p.getGender().equalsIgnoreCase("M");
    }

    public Predicate<Student> isFemale() {
        return p -> p.getGender().equalsIgnoreCase("F");
    }

    public Predicate<Student> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }
    public List<Student> filterAlunos(List<Student> students,
                                             Predicate<Student> predicate)
    {
        return students.stream()
                .filter( predicate )
                .collect(Collectors.<Student>toList());
    }
}
