package managers.commands;

import managers.CollectionManager;
import system.Request;
import system.Response;

import java.io.Serial;
import java.io.Serializable;

public class UpdateId extends  Command implements Serializable {
    @Serial
    private static final long serialVersionUID = -1115L;

    public UpdateId(){
        super("update_id",false);
    }

    /**
     *  Выводит элементы коллекции в порядке убывания цены.
     * @param request запрос
     * @return ответ
     */
    @Override
    public Response execute(Request request) {
        String[] id = request.getArgs();
        return CollectionManager.updateId(id);
    }
}
