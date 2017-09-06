package com.company;

/**
 * Created by gcl713 on 2017/9/6.
 */
public class Operate {
    private String info[];
    public Operate(String info[])
    {
        this.info=info;
    }
    public String login()
    {
        Check check =new Check();
        this.isExit();
        String name=this.info[0];
        String password=this.info[1];
        String str=null;
        if (check.vaildate(name,password))
        {
            str="WELCOME"+name;
        }
        else
        {
            str="WRONG PASSWORD OR ACCOUNT"
        }
        return str;
    }
    public void isExit()
    {
        if (this.info.length!=2)
        {
            System.out.println("参数错误，系统退出");
            System.exit(1);
        }

    }
}
