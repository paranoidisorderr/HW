package lesson;

public enum HeadType {
    HEAD1("LongHead"),
    HEAD2("IronHead"),
    HEAD3("BigHead");

    private final String title;

    HeadType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}