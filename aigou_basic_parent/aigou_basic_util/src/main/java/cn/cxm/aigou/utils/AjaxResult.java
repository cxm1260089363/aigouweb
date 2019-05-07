package cn.cxm.aigou.utils;

public class AjaxResult {
//    定义一个布尔类型的变量，初始值为true
    private boolean success=true;
//    定义一个返回信息的变量，初始值显示操作成功
    private String msg="操作成功";
//    准备一个对象值，为我们在返回前台时提供一个对象
    private Object object;//返回的数据

    //    准备一个静态的方法，主线程启动的时候跟着运行
    public static  AjaxResult me(){
        return new AjaxResult();
    }
    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
   /* //    链式编程
    public static void main(String[] args){
        AjaxResult ajaxResult = AjaxResult.me().setSuccess(true).setMsg("登录成功").setObject("ssdf");
        System.out.println(ajaxResult);
    }*/

}
