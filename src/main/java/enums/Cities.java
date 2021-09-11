package enums;

public enum Cities {

    YOSHKAR_OLA("Йошкар-Ола"),
    KAZAN("Казань"),
    NIZHNY_NOVGOROD("Нижний Новгород");

    private String city;

    Cities(String city) {
        this.city = city;
    }

    public String getValue() {
        return city;
    }
}
