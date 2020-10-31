package ru.geekbrains;

public class Staff {

    private String name;
    private String position;
    private String mail;
    private int phone;
    private int income;
    private int age;

    public String getName() {
        return name;
    }
    public String getPosition() {return position; }
    public String getMail() {return mail; }
    public int getPhone() {return phone;}
    public int setPhone(int phone) {
        if (phone != 5642) {
            System.out.println("Вы ошиблись номером!");
        } return phone;
    }
    public int getIncome() {return income;}
    public int setIncome(int i) {
        if (income > 7000) {
            System.out.println("Ура! Подняли ЗП!");
        } return income;
    }
    public int getAge() {return age;}

    public Staff(String name, String position, String mail, int phone, int income, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.income = income;
        this.age = age;

    }

    public boolean isTooOld() {
        if (getAge() > 40) { return true;
        } else return false;
    }

    public String toString() {
        return "Имя: " + name + " Должность: " + position + " Эл.почта: " + mail + " Тел.номер: " + phone + " З/П: " + income + " Возраст: " + age + " лет";
    }
}
