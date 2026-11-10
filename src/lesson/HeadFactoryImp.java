package lesson;

public class HeadFactoryImpl implements HeadFactory {

    @Override
    public Robot.Head createHead(int index) {

        HeadType[] types = HeadType.values();

        if (index < 0 || index >= types.length) {
            throw new IllegalArgumentException("Invalid head index");
        }

        return new Robot.Head(types[index]);
    }
}