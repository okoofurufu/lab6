package system;



import classes.Product;

import java.io.Serial;
import java.io.Serializable;

public class Request implements Serializable {
    @Serial
    private static final long serialVersionUID = 7460996574894336141L;
    public Product product;
    String[] args;

    //Передавать команды и аргументы стрингом или массивом стрингов

    public Request(Product product){
        this.product = product;
    }

    public Request(Product product,String[] args){
        this.product = product;
        this.args = args;
    }


    public Request(String[] args){
        this.args = args;
    }

    public String[] getArgs() {
        return args;
    }

    public Product getProduct() {
        return product;
    }
}
