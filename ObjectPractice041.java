public class ObjectPractice041 extends Person{

    public ObjectPractice041 (String name, String from){
        this.name = name;
        this.from = from;

    }

    @Override
    public void printData(){
        System.out.println("私の名前は" + this.name +"です。"+ this.from +"出身です。");

    }

}