package action;

import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String execute() throws Exception{
        if(name.equals("sakura")&&password.equals("333"))
            return SUCCESS;
        else
            return ERROR;

    }
}
