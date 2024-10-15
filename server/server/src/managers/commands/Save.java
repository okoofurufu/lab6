package managers.commands;

import exceptions.RootException;
import managers.CollectionManager;
import system.Request;
import system.Response;

import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;

public class Save extends  Command implements Serializable {
    @Serial
    private static final long serialVersionUID = -1111L;

    public Save(){
        super("save",false);
    }

    /**
     *  Выводит элементы коллекции в порядке убывания цены.
     * @param request запрос
     * @return ответ
     */
    @Override
    public Response execute(Request request) throws IOException, RootException {
        return CollectionManager.save();
    }
}
