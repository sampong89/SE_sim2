import java.util.*;


public class student {
    private static Scanner sc;
    private String name, tel;
    private Date dob; // date of birth
    private String group;
    private String city, country;

    /**
     * 
     * 
     */

    checkfield field = new checkfield();

    public student() {
    }

    public student(String name, String tel, Date dob, String group, String city, String country) 
            throws BirthDateException {
        setName(name);
        setCity(city);
        setCountry(country);
        // setDob(dob);
        setGroup(group);
        setTel(tel);
    }

    public static student inputData() {
        sc = new Scanner(System.in);
        student student = new student();
        System.out.print("Enter the name: ");
        student.setName(sc.nextLine());
        System.out.print("Enter the city: ");
        student.setCity(sc.nextLine());
        System.out.print("Enter the country: ");
        student.setCountry(sc.nextLine());
        //        System.out.print("Enter the date of birth: ");
        //        student.setDob(sc.nextLine());
        System.out.print("Enter the telephone number: ");
        student.setTel(sc.nextLine());
        System.out.print("Enter the group: ");
        student.setGroup(sc.nextLine());

        return student;
    }
    
    @Override
    public String toString() {
        // return "Student{\n" + "name= " + name + " \" " + "\nCity=" + city + "\"" + "\nCountry=" + country + "\""
        //         + "\nDate of birth= " + dob + "\nTelephone= " + tel + "\nGroup= " + group + "\n}";
        return "Student{\n" + "name= \"" + name + " \" " + "\nCity= \" " + city + " \"" + "\nCountry= \" " + country + " \""
                + "\nTelephone= \" " + tel + " \" " + "\nGroup= \" " + group + " \" " +"\n}";
    }

    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        field.checkConditionField(name, "Name");
        this.name = name;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        field.checkConditionField(tel, "Telephone");
        this.tel = tel;
    }

    public Date getDob() {
        return this.dob;
    }

    // public void setDob(Date dob) throws BirthDateException {
    //     Calendar calender = Calendar.getInstance();
    //     calender.set(Calendar.YEAR, calender.get(Calendar.YEAR) - 12);
    //     Date twelveYearOld = calender.getTime();
    //     if (dob.compareTo(twelveYearOld) <= 0) {
    //         this.dob = dob;
    //     } else {
    //         throw new BirthDateException();
    //     }
    // }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        field.checkConditionField(city, "City");
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        field.checkConditionField(country, "Country");
        this.country = country;
    }

    
}
