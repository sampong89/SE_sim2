import java.io.File;

public class student {
    private String name, date, dob;// Date of birth
    private String tel;
    field field = new field();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        field.checkNullEmptyBlank(name, "Name");
        this.name = name;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        field.checkNullEmptyBlank(dob, "Dob");
        this.dob = dob;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        field.checkNullEmptyBlank(tel, "Tel");
        this.tel = tel;
    }
}
