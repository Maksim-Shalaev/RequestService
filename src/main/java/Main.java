public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Maksim";
        post.passport = "0001 # 123456";
        post.patronymic = "Gennadievich";
        post.phone = "+357 97 579799";
        post.surname = "Shalaev";
        post.subscription = true;

        post.birthsday = new FormDate();
        post.birthsday.day = 11;
        post.birthsday.month = "November";
        post.birthsday.year = 1985;

        System.out.println(post.name + " " + post.patronymic + " " + post.surname);
        System.out.println("Паспортные данные: " + " " + post.passport + " " + "Номер телефона: " + " " + post.phone);
        System.out.println("Дата рождения: " + " " + post.birthsday.day + " " + post.birthsday.month + " " + post.birthsday.year);
    }
}
