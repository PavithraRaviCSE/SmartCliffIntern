package selfpractice;
import java.util.*;

class LinkedListPractice {
    private LinkedList<Student> list;

    public LinkedListPractice() {
        list = new LinkedList<>();
    }

    public void add(String name, int age, String grade) {
        list.add(new Student(name, age, grade));
    }

    public boolean removeByName(String name) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean removeByAge(int age) {
        boolean removed = false;
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getAge() == age) {
                iterator.remove();
                removed = true;
            }
        }
        return removed;
    }

    public boolean search(String name) {
        for (Student s : list) {
            if (s.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void listStudents() {
        for (Student s : list) {
            System.out.println(s);
        }
    }

    public int size() {
        return list.size();
    }

    public void iterate() {
        for (Student s : list) {
            System.out.println(s);
        }
    }

    public String[] toArray() {
        String[] names = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            names[i] = list.get(i).getName();
        }
        return names;
    }

    public Iterator<Student> specialIterator() {
        return list.iterator();
    }

    public Iterator<Student> descendingIterator() {
        return list.descendingIterator();
    }

    public void sortByName() {
        list.sort(Comparator.comparing(Student::getName));
    }

    public void sortByAge() {
        list.sort(Comparator.comparingInt(Student::getAge));
    }

    // Additional Functionality
    public void updateStudent(String name, int newAge, String newGrade) {
        for (Student s : list) {
            if (s.getName().equalsIgnoreCase(name)) {
                s.setAge(newAge);
                s.setGrade(newGrade);
                return;
            }
        }
        System.out.println("No such student exists");
    }

    public void clear() {
        list.clear();
    }
}

class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

