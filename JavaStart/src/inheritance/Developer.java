package inheritance;
// Employee 선조
// Developer 후손
public class Developer extends Employee{
    private String mainLanguage;
    public void coding() {
        System.out.println(this.name+"님이 " + this.mainLanguage+"를 개발합니다.");
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }
}
