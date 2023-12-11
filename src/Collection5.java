import java.util.HashSet;

import java.util.Set;
public class Collection5 {

    static class User {
        private String name;
        private int age;
        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public int hashCode() {
            char[] array = name.toCharArray();
            int sum = 0;
            for (int i =0; i< array.length-1;i++){
                int n = array[i];
                sum += n;
            }
            return sum+age;
        }

        @Override
        public boolean equals(Object obj) {
            return hashCode() == this.hashCode();
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User("Max", 27));
        users.add(new User("Veronika", 20));
        users.add(new User("Denis", 30));
        users.add(new User("Max", 27));
        if (users.size() == 3) {
            System.out.println("System works well!");
        } else {
            throw new RuntimeException("Users set size should be 3!");
            }
    }
}

