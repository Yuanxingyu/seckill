package org.seckill.exception;

/**
 * 重复秒杀异常（运行期异常）
 * @author stary
 * @date 2018/7/25 下午2:58
 */
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
