package lesson;

public class Robot {

    private String name;
    private HeadType head;
    private BodyType body;

    public static class Head {
        private HeadType type;

        public Head(HeadType head)  {
            this.type = type;
        }
    }

    public static class Body {
        private static BodyType type;

        Body(BodyType type) {
            this.type = type;
        }
    }

    Robot(String name, HeadType head, BodyType body) {
        this.name = name;
        this.head = head;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BodyType getBody() {
        return body;
    }

    public void setBody(BodyType body) {
        this.body = body;
    }

    public HeadType getHead() {
        return head;
    }

    public void setHead(HeadType head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "robot: " + name + ", head: " + head + ", body: " + body;
    }

}