package com.urancode.design.patterns.template;

/**
 * Created by Enson on 2023/12/20.
 */
public abstract class NetworCourse {

    protected final void createCourse() {
        this.postPreSource();
        this.createPPT();
        this.liveVideo();
        this.postNote();
        this.postSource();

        if (needHomework()) {
            checkHomework();
        }
    }

    abstract void checkHomework();

    //钩子方法，实现流程的微调
    protected boolean needHomework() {
        return false;
    }

    final void postSource() {
        System.out.println("提交源代码");
    }

    final void postNote() {
        System.out.println("提交课件和笔记");
    }

    final void liveVideo() {
        System.out.println("直播授课");
    }

    final void createPPT() {
        System.out.println("创建备课PPT");
    }

    final void postPreSource() {
        System.out.println("分发预习资料");
    }
}
