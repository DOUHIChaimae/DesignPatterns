package td1.exercice1.templatemethod;

public class Test {
    public static void main(String[] args) {
        TemplateClass templateClass = new TemplateImpl1();
        System.out.println(templateClass.getSum(2, 6));
    }
}
