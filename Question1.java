import java.util.Stack;
import java.util.List;

public class Question1
{
    public static boolean rearrange(int arrarLength, List<Integer> elements) {
        Stack<Integer> stack = new Stack<>();
        int sortedOrder = 1;
        int k;

        while(elements.size() != 0)
        {
            k = elements.get(0);
            elements.remove(0);

            if(k == sortedOrder)
            {
                sortedOrder++;
            }

            else
            {
                if(stack.size() == 0)
                {
                    stack.push(k);
                }
                else if(stack.size() != 0 && stack.peek() < k)
                {
                    return false;
                }
                else
                {
                stack.push(k);
                }
            }

            while(stack.size() != 0 && stack.peek() == sortedOrder)
            {
                stack.pop();
                sortedOrder++;
            }
        }
        if(sortedOrder - 1 == arrarLength && stack.size() == 0)
        return true;

        return false;

    }

    }


