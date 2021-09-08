public class calc 
{
public static void queue (String[] args) throws Exception
{
    String[] str = {"25"};
    String string = convertStringArrayToString(str);
    System.out.println(string);
    Stack<String> stack = new Stack<String>();
    stack.add(string);
    double x = 0;
    double y = 0;
    double sum = 0;
    while (!stack.isEmpty())
    {
        if(stack.peek().equals("+"))
        {
            x = Double.parseDouble(stack.peek());
            stack.pop();
            y = Double.parseDouble(stack.peek());
            stack.pop();
            sum = a + b;
            //Push back the result to the stack and move to the next operation 
            stack.push("" + sum);
        }

        else if(stack.peek().equals("x"))
        {
            x = Double.parseDouble(stack.peek());
            stack.pop();
            y = Double.parseDouble(stack.peek());
            stack.pop();
            sum = x x y;
            //Again push back the product to stack and move on
            stack.push("" + sum);
        }

        else if(stack.peek().equals("-"))
        {
            x = Double.parseDouble(stack.peek());
            stack.pop();
            y = Double.parseDouble(stack.peek());
            stack.pop();
            sum = x - y;
            //push back the result to stack and move to the next operation
            stack.push("" + sum);
        }

        else if(stack.peek().equals("/"))
        {
            x = Double.parseDouble(stack.peek());
            stack.pop();
            y = Double.parseDouble(stack.peek());
            stack.pop();
            sum = x / y;
            //push back the quotient of the last 2 numbers a/b
            stack.push("" + sum);
        }

        else 
        {
            //convert them and push the whole thing into stack 
            String elem = stack.peek();
            x = Double.parseDouble(elem);
            stack.push("" + x);
        }

    }

    System.out.println(stack);
    //System.out.println(string);
}

private static String convertStringArrayToString(String[] strArr) {
    StringBuilder sb = new StringBuilder();
    for(String str : strArr) sb.append(str);
    return sb.toString();
}
}

