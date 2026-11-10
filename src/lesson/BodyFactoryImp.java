package lesson;

public class BodyFactoryImp implements BodyFactory {

    @Override
    public Robot.Body createHead(int index) {

        HeadType[] types = HeadType.values();

        if (index < 0 || index >= types.length) {
            throw new IllegalArgumentException("Invalid head index");
        }

        return new Robot.Body(types[index]);
    }
}