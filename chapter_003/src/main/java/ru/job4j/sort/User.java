package ru.job4j.sort;

public class User implements Comparable<User> {
        private int age;
        private String name;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

//        public String getName() {
//            return this.name;
//        }
//
//        public int getAge() {
//            return this.age;
//        }

        public int compareTo(User user) {

//            if (this.age == user.age) {
//                return 0;
//            } else if(this.age < user.age) {
//                return -1;
//            } else {
//                return 1;
//            }
            return this.name.compareTo(user.name);
        }
}
