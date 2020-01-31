package ai.yunxi.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * TODO
 *
 * @author:Five-云析学院
 */
public class Demo {
    public static void main(String[] args) {
        ExtensionLoader<Filter> extensionLoader = ExtensionLoader.getExtensionLoader(Filter.class);
        Filter url = extensionLoader.getExtension("method");
        url.invoke();
    }
}
