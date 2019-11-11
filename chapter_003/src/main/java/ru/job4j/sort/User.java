package ru.job4j.sort;

public class User implements Comparable<User> {
        private int age;
        private String name;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public int compareTo(User user) {
            return Integer.compare(this.age, user.age);
        }
}
