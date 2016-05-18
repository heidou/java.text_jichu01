package text;

/**
 * Created by heidou
 * 2016/5/8.
 */

public class BallServiceImpl implements BallService,PlayService{
    @Override
    public void play() {
        System.out.println("BallService play......");  /**调用接口方法**/
        InnerBall innerBall = new InnerBall();    /**内部类方法调用**/
        innerBall.flf();
    }

    @Override
    public void skt() {

    }

    @Override
    public void excute1() {
        System.out.println("woquwoqu");
    }

    @Override
    public void excute() {
         System.out.println("sdsjdfjlajd");
    }
    /**内部类**/
    private  class    InnerBall{
        public  void flf(){
            System.out.println("ios");   /**内部类方法定义**/
        }
    }

}
