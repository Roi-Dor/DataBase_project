import java.io.Serializable;

/**
 * @author Daniel Grigoriev
 * @version 1.2
 */
public class Answer implements Serializable {//infeaiubfuaek
    private String answer;

    public Answer(String answer) {
        this.answer = answer;
    }

    public String toString() {
        return answer;
    }
}
