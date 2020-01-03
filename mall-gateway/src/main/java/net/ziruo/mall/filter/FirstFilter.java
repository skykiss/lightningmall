package net.ziruo.mall.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: october
 * @Date: 2020/1/3 18:20
 * @Description:
 */

@Component
public class FirstFilter extends ZuulFilter {

    @Override
    public String filterType() {
        /*
        pre：可以在请求被路由之前调用
        route：在路由请求时候被调用
        post：在route和error过滤器之后被调用
        error：处理请求时发生错误时被调用
        * */
        // 前置过滤器
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        //// 优先级为0，数字越大，优先级越低
        return 0;
    }
    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        //只过滤OPTIONS 请求
        if(request.getMethod().equals(RequestMethod.OPTIONS.name())){
            return true;
        }

        return false;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletResponse response = ctx.getResponse();
        HttpServletRequest request = ctx.getRequest();
        response.setHeader("Access-Control-Allow-Origin",request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials","true");
        response.setHeader("Access-Control-Allow-Headers","authorization, content-type");
        response.setHeader("Access-Control-Allow-Methods","POST,GET,PUT,DELETE");
        response.setHeader("Access-Control-Expose-Headers","X-forwared-port, X-forwarded-host");
        response.setHeader("Vary","Origin,Access-Control-Request-Method,Access-Control-Request-Headers");
        //不再路由
        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(200);
        return null;
    }

}
