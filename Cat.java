class Cat extends Animal {
    int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    public void bark() {
        System.out.println("야옹");
    }

    public String toString() {
        return age + "살의 " + getName();
    }
}
