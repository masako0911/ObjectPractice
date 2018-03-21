public class ObjectPractice03 {

    public static void main(String[] args) {
//円の名前を丸3にして、詳細を説明（サークルの半径はcircle.javaで指定している。
        //今回は、半径を20にする



        Circle maru3 = new Circle(20);


        //丸3の面積を出す
        maru3.getArea();

        //丸3の円周を出す。
        maru3.getCircumference();




        System.out.println(maru3.getArea());
        System.out.println(maru3.getCircumference());

    }
}



