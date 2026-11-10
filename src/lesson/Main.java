package lesson;

public class Main {

    public static void main(String[] args) {

        HeadFactory headFactory = new HeadFactoryImp();
        BodyFactory bodyFactory = new BodyFactoryImp();

        Robot.Head head = headFactory.createHead(0);
        Robot.Body body = bodyFactory.createBody(1);

        Robot robot = new Robot("Robo-1", head, body);

        System.out.println(robot);

        Robot robot2 = new Robot(
                "Robo-2",
                headFactory.createHead(2),
                bodyFactory.createBody(0)
        );

        System.out.println(robot2);
    }
}