package com.immomo.mls.wrapper.callback;

import com.immomo.mls.wrapper.GlobalsContainer;

/**
 * Created by Xiong.Fangyu on 2019/3/21
 *
 * 封装{@link org.luaj.vm2.LuaFunction}的接口
 *
 * 回调Lua方法，返回值为int数字类型
 */
public interface IIntCallback extends Destroyable, GlobalsContainer {
    /**
     * 回调lua方法
     * @param params 参数
     */
    int callback(Object... params) throws IllegalStateException;

    /**
     * 回调lua方法，调用之后，将不能再次使用此回调
     * @param params 参数
     */
    int callbackAndDestroy(Object... params) throws IllegalStateException;
}