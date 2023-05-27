package error;

//自定义异常类
public class TryDemoMyDef extends Exception {
    public TryDemoMyDef(){
        super("18岁以下或者80岁以上必须由亲友陪同入住");
    }

}
