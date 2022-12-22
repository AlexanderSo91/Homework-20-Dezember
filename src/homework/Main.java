package homework;

public class Main {
    public static void main(String[] args) {
        Author aleksandrPushkin = new Author("Александр", "Пушкин");
        Author levTolstoy = new Author("Лев","Толстой");
        Book evgeniyOnegin = new Book("Евгений Онегин", aleksandrPushkin, 1867);
        Book warAndPeace = new Book("Война и Мир", levTolstoy, 1867);

        evgeniyOnegin.setYear(1832);

        System.out.println(evgeniyOnegin.getTitle() + " " + evgeniyOnegin.getAuthor().getFirstName()
                + " " + evgeniyOnegin.getAuthor().getLastNAme() + " " + evgeniyOnegin.getYear());

        System.out.println(aleksandrPushkin);
        System.out.println(warAndPeace);
    }
}

