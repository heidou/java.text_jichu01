package text;

/**
 * Created by heidou
 * 2016/5/8.
 */
public class taa {
    public static void main(String[] args){
        Ball ball = new BasketBall();
        ball.execute();
        ball.play();    /**抽象类方法调用**/

        /**接口方法调用**/
        BallService ballService = new BallServiceImpl();
        ballService.play();
        BallService ballService1 = new BallServiceImpl();
        ballService1.excute();

        PlayService playService = new BallServiceImpl();
        playService.skt();
        PlayService playService1 = new BallServiceImpl();
        playService1.excute1();
    }
}
