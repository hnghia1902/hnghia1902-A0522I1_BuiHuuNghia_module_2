package ss_06_ke_thua.circle_cylinder;

public class MoveablePoint extends Point2D{
    protected float xSpeed;
    protected float ySpeed;

    public MoveablePoint() {
    }
    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] arr={this.xSpeed,this.ySpeed};
        return arr;
    }
    public void setSpeed(float x,float y) {
        this.xSpeed = x;
        this.ySpeed = y;
    }
    @Override
    public String toString() {
        return super.toString()+
                ",speed=(" + xSpeed +
                "," + ySpeed +
                ')';
    }
    public MoveablePoint move()
    {
        x+=xSpeed;
        y+=ySpeed;
        return this;
    }
}
