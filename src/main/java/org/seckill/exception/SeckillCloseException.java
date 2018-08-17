package org.seckill.exception;

/**
 * 秒杀关闭异常
 * @author stary
 * @date 2018/7/25 下午3:00
 */
public class SeckillCloseException extends SeckillException{

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
