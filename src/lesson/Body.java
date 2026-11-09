package lesson;

public enum BodyType {
    BODY1("LongBody"),
    BODY2("IronBody"),
    BODY3("BigBody");

    private final String title;

    BodyType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
