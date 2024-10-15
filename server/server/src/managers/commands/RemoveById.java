package managers.commands;

import exceptions.InvalidInputException;
import managers.CollectionManager;
import system.Request;
import system.Response;

import java.io.Serial;
import java.io.Serializable;

public class RemoveById extends  Command implements Serializable {
    @Serial
    private static final long serialVersionUID = -119L;

    public RemoveById(){
        super("remove_by_id",true);
    }

    /**
     *  Выводит элементы коллекции в порядке убывания цены.
     * @param request запрос
     * @return ответ
     */
    @Override
    public Response execute(Request request) throws InvalidInputException {
        String[] id = request.getArgs();
        return CollectionManager.removeById(id);
    }
}
