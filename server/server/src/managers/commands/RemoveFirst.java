package managers.commands;

import managers.CollectionManager;
import system.Request;
import system.Response;

import java.io.Serial;
import java.io.Serializable;

public class RemoveFirst extends Command implements Serializable{
    @Serial
    private static final long serialVersionUID = -1110L;

    public RemoveFirst(){
        super("remove_first",false);
    }

    /**
     *  Добавляет продукт в коллекцию.
     * @param request запрос
     * @return ответ
     */
    @Override
    public Response execute(Request request) {
        return CollectionManager.removeFirst();
    }
}
