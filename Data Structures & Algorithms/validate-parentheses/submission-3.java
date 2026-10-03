class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        Map<String, String> map = new HashMap<>();
        map.put("(", ")");
        map.put("[", "]");
        map.put("{", "}");

        for (String c : s.split("")) {
            
            if (map.containsKey(c)) {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }
            String popped = stack.pop();
            if (c.equals(map.get(popped))) {
                continue;
            }

            return false;
        }
        
        if (!stack.isEmpty()) {
            return false;
        }

        return true;


        // ({[({  })]})

        //interate through s
            //we check if char ([{
                //append the char of ([{
            
            //, else we check if }])
                // return false if value isn't valid
            //continue 
            
            // { <- needs to find '}' first 
            // [
            // (

        
        
    }
}
