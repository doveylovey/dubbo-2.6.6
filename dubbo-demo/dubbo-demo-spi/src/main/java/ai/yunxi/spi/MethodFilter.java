package ai.yunxi.spi;

/**
 * TODO
 *
 * @author:Five-云析学院
 */
public class MethodFilter implements Filter {

    public void setFilter(Filter filter) {
        System.out.println("set Filter");
    }

    @Override
    public void invoke() {
        System.out.println("is Method Filter.");
    }
}
