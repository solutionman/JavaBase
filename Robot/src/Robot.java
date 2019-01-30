public class Robot{
    private Direction direction;
    private int X;
    private int Y;

    public Robot(Direction direction, int X, int Y){
        this.direction = direction;
        this.X = X;
        this.Y = Y;
    }

    public Direction getDirection(){
        return direction;
    }

    public void setDirection(Direction direction){
        this.direction = direction;
    }

    public int getX(){
        return X;
    }

    public int getY(){
        return Y;
    }

    public void turnLeft(){
        int i = - 1;
        if(direction.ordinal() == 0){
            i = 3;
        }
        this.direction = direction.values()[direction.ordinal() + i];
    }

    public void turnRight(){
        int i = 1;
        if(direction.ordinal() == 3){
            i = -3;
        }
        this.direction = direction.values()[direction.ordinal() + i];
    }

    public void stepForward(){
        if(direction.equals( Direction.UP ) ){
            this.Y++;
        }
        if(direction.equals( Direction.RIGHT )){
            this.X++;
        }
        if(direction.equals( Direction.DOWN )){
            this.Y--;
        }
        if(direction.equals( Direction.LEFT )){
            this.X--;
        }
    }

}
