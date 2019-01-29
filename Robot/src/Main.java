public class Main{
    public static void main(String[] args){

        Robot robot = new Robot( Direction.UP, 0, 0 );
        System.out.printf("Start position of robot: %d %d",robot.getX(), robot.getY());
        System.out.println(" , direction: " + robot.getDirection() );

        moveRobot(robot, 3, 0);
        System.out.printf("And now position of robot: %d %d",robot.getX(), robot.getY());
        System.out.println(" , direction: " + robot.getDirection() );
    }

    public static void moveRobot(Robot robot, int toX, int toY){

        if(toX != 0 ){
            // find first direction
            if(toX > 0){
                while(!robot.getDirection().equals( Direction.RIGHT )){
                    robot.turnRight();
                }
                for(int i = 0; i < toX; i++){
                    robot.stepForward();
                }
            } else {
                while( !robot.getDirection().equals( Direction.LEFT ) ){
                    robot.turnLeft();
                }
                for(int i = 0; i > toX; i--){
                    robot.stepForward();
                }
            }
        }

        // find second direction
        if(toY != 0){
            if(toY > 0){
                while( !robot.getDirection().equals(Direction.UP) ){
                    robot.turnLeft();
                }
                for(int i = 0; i < toY; i++){
                    robot.stepForward();
                }
            } else {
                while( !robot.getDirection().equals(Direction.DOWN)){
                    robot.turnRight();
                }
                for(int i = 0; i > toY; i-- ){
                    robot.stepForward();
                }
            }
        }
        //robot.turnRight();
        //robot.turnLeft();
        //robot.stepForward();
        //robot.stepForward();
        //robot.stepForward();

    }
}

