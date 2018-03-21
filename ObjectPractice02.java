public class ObjectPractice02 {
 int radius = 10;

    public static void main(String[] args) {
//円の名前を丸2にして、詳細を説明（サークルの半径はcircle.javaで指定している。
        //今回は、半径を10にする



        Circle maru2 = new Circle(10);


        //丸2の面積を出す
        maru2.getArea();

        //丸2の円周を出す。
        maru2.getCircumference();




        System.out.println(maru2.getArea());
        System.out.println(maru2.getCircumference());

    }
}



