public class Post<birthday> {
    public String name;
    public String passport;
    public String patronymic;
    public String phone;
    public String surname;
    public Boolean subscription;

    FormDate birthday = new FormDate();

    public FormDate getBirthday() {
        return birthday;
    }
}







