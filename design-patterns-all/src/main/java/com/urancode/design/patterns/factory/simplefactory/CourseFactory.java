package com.urancode.design.patterns.factory.simplefactory;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Enson on 2023/12/7.
 */
public class CourseFactory {
    //业务扩展，create方法需要修改代码，不符合开闭原则
    public ICoures create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("python".equals(name)) {
            return new PhthonCourse();
        } else {
            return null;
        }
    }

    //优化后，反射实现类
    public ICoures createV2(String className) {
        try {
            if (StringUtils.isNotBlank(className)) {
                return (ICoures) Class.forName(className).newInstance();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ICoures createV3(Class<? extends ICoures> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
