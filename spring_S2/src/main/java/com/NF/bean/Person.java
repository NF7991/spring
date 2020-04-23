package com.NF.bean;


import java.util.*;

public class Person {
    private int id;
    private String name;
    private Integer age;
    private String gender;
    private String[] hobbios;
    private Address address;

    private List<Address> lists;
    private Set<String> sets;
    private Map<String,Object> maps;
    private Properties properties;

    public void init() {
        //编写N行逻辑代码完成初始化功能
        System.out.println("person对象初始化完城");
    }

    public void destory() {
        System.out.println("person对象销毁");
    }


    //无参构造
    public Person(){
        System.out.println("person被创建");
    }
    //有参构造
    public Person(int id, String name, Integer age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Person(int id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("age...");

    }
    public Person(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        System.out.println("gendre...");
    }

//    public Person(int id, String name, Address address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }
    public Person(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getHobbios() {
        return hobbios;
    }

    public void setHobbios(String[] hobbios) {
        this.hobbios = hobbios;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Address> getLists() {
        return lists;
    }

    public void setLists(List<Address> lists) {
        this.lists = lists;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", hobbios=" + Arrays.toString(hobbios) +
                ", address=" + address +
                ", lists=" + lists +
                ", sets=" + sets +
                ", maps=" + maps +
                ", properties=" + properties +
                '}';
    }


}
