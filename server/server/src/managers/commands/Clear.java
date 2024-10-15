package managers.commands;

import classes.Product;
import managers.CollectionManager;
import system.Request;
import system.Response;

import java.io.Serializable;
import java.util.LinkedList;

public class Clear extends Command implements Serializable {
    private static final long serialVersionUID = -112L;

    public Clear(){
        super("clear", false);
    }

    /**
     *  Очищает коллекцию
     * @param request запрос
     * @return ответ
     */
    @Override
    public Response execute(Request request) {
        return CollectionManager.clearCollection();

    }
}
