package managers.commands;

import managers.CollectionManager;
import system.Request;
import system.Response;
import java.io.Serial;
import java.io.Serializable;

/**
 * Команда для добавления нового элемента в коллекцию.
 */
public class Add extends Command implements Serializable {
    @Serial
    private static final long serialVersionUID = -111L;

    public Add(){
        super("add",false);
    }

    /**
     *  Добавляет продукт в коллекцию.
     * @param request запрос
     * @return ответ
     */
    @Override
    public Response execute(Request request) {
        return CollectionManager.add(request.getProduct());
    }
}