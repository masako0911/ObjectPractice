public class ObjectPractice051 extends Person{

        public ObjectPractice051 (String name, String from){
            this.name = name;
            this.from = from;

        }

        @Override
        public void printData(){
            System.out.println("私の名前は" + this.name +"です。"+ this.from +"出身です。");

        }


}
