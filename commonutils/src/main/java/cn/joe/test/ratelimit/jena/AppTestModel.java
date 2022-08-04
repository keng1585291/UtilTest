package cn.joe.test.ratelimit.jena;

import com.github.onblog.commoon.entity.RateLimiterRule;
import com.github.onblog.commoon.entity.RateLimiterRuleBuilder;
import com.github.onblog.core.limiter.RateLimiter;
import com.github.onblog.core.limiter.RateLimiterFactory;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AppTestModel {
  Logger logger = LoggerFactory.getLogger(getClass());

  @Test
  public void test1() {
    // 1.配置规则
    RateLimiterRule rateLimiterRule = new RateLimiterRuleBuilder()
        .setLimit(1)
        .setPeriod(1)
        .setUnit(TimeUnit.SECONDS) //每秒令牌数为1
        .build();
    // 2.工厂模式生产限流器
    RateLimiter limiter = RateLimiterFactory.of(rateLimiterRule);
    // 3.使用
    while (true) {
      if (limiter.tryAcquire()) {
        logger.info("ok");
      }
    }
  }
}
