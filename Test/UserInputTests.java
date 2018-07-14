import com.company.UserInput;
import org.junit.Assert;
import org.junit.Test;

public class UserInputTests {

    UserInput.TextInput textInput = new UserInput.TextInput();
    UserInput.TextInput numericInput = new UserInput.NumericInput();
    String result = "";

    @Test
    public void textInputOne(){
        textInput.add('1');
        textInput.add('a');
        textInput.add('0');
        result = textInput.getValue();
        Assert.assertEquals("1a0", result);
    }

    @Test
    public void textInputTwo(){
        textInput.add('1');
        textInput.add('a');
        textInput.add('0');
        textInput.add('2');
        textInput.add('?');
        result = textInput.getValue();
        Assert.assertEquals("1a02?", result);
    }

    @Test
    public void nonNumericInputOne(){
        numericInput.add('1');
        numericInput.add('a');
        numericInput.add('0');
        numericInput.add('2');
        numericInput.add('?');
        result = numericInput.getValue();
        Assert.assertEquals("102", result);
    }

    @Test
    public void nonNumericInputTwo(){
        numericInput.add('1');
        numericInput.add('a');
        numericInput.add('0');
        result = numericInput.getValue();
        Assert.assertEquals("10", result);
    }
}
