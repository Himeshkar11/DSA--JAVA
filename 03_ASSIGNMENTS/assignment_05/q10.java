public class q10{
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;
        if (ruleKey == "type") {
           // search in colum 0 
           for (int i = 0; i < items.size(); i++) {
            if(items.get(i).get(0).equals(ruleValue)){

                count++;
            }
           } 
        }
        if(ruleKey == "color"){
           // search in colum 1 
           for (int i = 0; i < items.size(); i++) {
            if(items.get(i).get(1).equals(ruleValue)){

                count++;
            }
           }   
        }
         if(ruleKey == "name"){
           // search in colum 2
           for (int i = 0; i < items.size(); i++) {
            if(items.get(i).get(2).equals(ruleValue)){
                count++;
            }
           } 
        }
        return count;
    }

    
}