package org.seckill.exception;

/**
 * 秒杀相关业务异常
 * @author stary
 * @date 2018/7/25 下午3:02
 */
public class SeckillException extends RuntimeException{

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
