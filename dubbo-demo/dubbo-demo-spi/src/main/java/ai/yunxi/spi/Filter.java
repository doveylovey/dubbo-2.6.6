package ai.yunxi.spi;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * TODO
 *
 * @author:Five-云析学院
 */
@SPI("method")
public interface Filter {
    void invoke();
}
