public class Main{
    public static void main(String[] args){

        Robot robot = new Robot( Direction.UP, 0, 0 );
        System.out.printf("Start position of robot: %d %d",robot.getX(), robot.getY());
        System.out.println(" , direction: " + robot.getDirection() );

        moveRobot(robot, 3, 0);
        System.out.printf("And now position of robot: %d %d",robot.getX(), robot.getY());
        System.out.println(" , direction: " + robot.getDirection() );

        System.out.println();

        Robot robot2 = new Robot( Direction.DOWN, -2, 4 );
        System.out.printf("Start position of robot2: %d %d",robot2.getX(), robot2.getY());
        System.out.println(" , direction: " + robot.getDirection() );

        moveRobot(robot2, 5, -4);
        System.out.printf("And now position of robot2: %d %d",robot2.getX(), robot2.getY());
        System.out.println(" , direction: " + robot2.getDirection() );

    }

    public static void moveRobot(Robot robot, int toX, int toY){

        if(toX != robot.getX() ){
            // find first direction
            if(toX > robot.getX()){
                while(!robot.getDirection().equals( Direction.RIGHT )){
                    robot.turnRight();
                }
                for(int i = robot.getX(); i < toX; i++){
                    robot.stepForward();
                }
            } else if(toX < robot.getX()) {
                while( !robot.getDirection().equals( Direction.LEFT ) ){
                    robot.turnLeft();
                }
                for(int i = robot.getX(); i > toX; i--){
                    robot.stepForward();
                }
            }
        }

        // find second direction
        if(toY != robot.getY()){
            if(toY > robot.getY()){
                while( !robot.getDirection().equals(Direction.UP) ){
                    robot.turnLeft();
                }
                for(int i = robot.getY(); i < toY; i++){
                    robot.stepForward();
                }
            } else if ( toY < robot.getY() ) {
                while( !robot.getDirection().equals(Direction.DOWN)){
                    robot.turnRight();
                }
                for(int i = robot.getY(); i > toY; i-- ){
                    robot.stepForward();
                }
            }
        }
    }
}

