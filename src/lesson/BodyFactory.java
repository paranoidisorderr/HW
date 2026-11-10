package lesson;

public class BodyFactory {

    @Override
    public Robot.Body createBody(int index) {

        BodyType[] types = BodyType.values();

        if (index < 0 || index >= types.length) {
            throw new IllegalArgumentException("Invalid body index");
        }

        return new Robot.Body(types[index]);
    }
}