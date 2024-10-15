package managers.commands;

import system.Request;
import system.Response;

import java.io.Serial;
import java.io.Serializable;

public class Help extends Command implements Serializable {

    /**
     * Executes the "help" command, displaying information about available commands and their usage.
     * @param args Command-line arguments (not used in this implementation).
     */
    @Serial
    private static final long serialVersionUID = -116L;
    public Help(){
        super("help", false);
    }
    @Override
    public Response execute(Request request) {
        return new Response("\n+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\n" +
                "help - вывести справку по доступным командам\n" +
                "info - вывести информацию о коллекции\n" +
                "show - вывести все элементы коллекции в строковом представлении\n" +
                "clear - очистить коллекцию\n" +
                "print_descending - вывести значения элементов коллекции в порядке убывания\n" +
                "remove_first - удалить первый элемент из коллекции\n" +
                "shuffle - перемешать элементы коллекции\n" +
                "sort - отсортировать коллекцию в порядке возрастания\n" +
                "add {element} - добавить новый элемент в коллекцию\n" +
                "update id {element} - обновить значение элемента коллекции, id которого равен задванному\n" +
                "remove_by_id id - удалить элемент из коллекции по его id\n" +
                "save - сохранить коллекцию в файл\n" +
                "execute_script file_name - считать и исполнить скрипт из указанного файла\n" +
                "filter_contains_name name - вывести элементы коллекции, значение поля name которых содержит заданную подстроку\n" +
                "count_by_unit_of_measure unit - вывести количество элементов коллекции, значение поля unit которых равно заданному\n");
    }
}
