public class Container {
    String container;
    public void chooseContainer(byte answer){
        if (answer == 1) {
            container = "тенджера";
        }
        if (answer == 2){
            container = "джезве";
        }
        System.out.println(container);
    }
}
