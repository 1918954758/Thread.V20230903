package com.zichen.t2.innerStaicClass;

/**
 * @Name: PublicClass
 * @Description: 内置类与静态内置类
 * @User: xdSun
 * @Date: 2023/04/22 14:14:50
 * @Version: 1.0
 **/
public class PublicClass {
    static private String username;
    static private String password;

    static class PrivateClass {
        private String age;
        private String address;
        public String getAge() {
            return age;
        }
        public void setAge(String age) {
            this.age = age;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public void printPublicProperty() {
            System.out.println(username + " " + password);
        }
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}