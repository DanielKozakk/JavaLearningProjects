package com.company.serie2;

import java.util.HashMap;

public class Collections_31_PrefixTreeImplementation {

            /*
                Dwa konstrktory :
                Jeden bez parametrów
                Drugi posiadający character.

                Flaga isNodeVisited
             */
    /*


            HashMapa of children



     */


    /*
            funkcja addChild (ch)

                childrenHashMap.add(ch, new Collections_31_PrefixTreeImplementation(ch));

     */

    /*
            funckcja addWord

            jedna to publiczna :
            public addWorD(String s)

            która wywołuje funkcję prywatna

            addWord(String s, int index)

                char ch = s.charAt(index)
                Collections_31 child = children.get(ch)

                if(child == null){
                    addChild(ch)
                    child = children.get(ch)
                    child.addWord(s, index+ 1 )
                } else {

                    child.addWord(s, index + 1)
                }

     */

    /*

            funkcja contains
            jedna publiczna, druga prywatna

            prywatna (s, index)



            exception oznacza false
            ch = s.charAt(index)
            child = getChild(ch)

            if(child == null)
                return false;
            else if(s.length - 1 == index)
                return true
            else
                child.contains(s, index +1)
     */

    HashMap<Character, Collections_31_PrefixTreeImplementation> childrenHashMap = new HashMap<>();
    public Character charOfNode;
    boolean isNodeVisited = false;


    Collections_31_PrefixTreeImplementation(Character charOfNode) {
        this.charOfNode = charOfNode;
    }

    public Collections_31_PrefixTreeImplementation() {
    }

    private void addChildToChildrenHashMap(char ch) {
        childrenHashMap.put(ch, new Collections_31_PrefixTreeImplementation(ch));
    }

    public void addWord(String string) {
        addWord(string, 0);
    }

    private void addWord(String s, int index) {
        if (s.length() == index) {
            return;
        }
        char ch = s.charAt(index);

        Collections_31_PrefixTreeImplementation child = childrenHashMap.get(ch);

        if (child == null) {
            addChildToChildrenHashMap(ch);
            child = childrenHashMap.get(ch);
        }
        child.addWord(s, index + 1);
    }

    public boolean contains(String word) {
        return contains(word, 0);
    }

    private boolean contains(String word, int index) {

        char ch;

        try {
            ch = word.charAt(index);
        } catch (StringIndexOutOfBoundsException e) {
            return false;
        }

        Collections_31_PrefixTreeImplementation child = childrenHashMap.get(ch);

        if(child == null){
            return false;
        } else if(word.length() == index + 1){
            return true;
        } else {
            return child.contains(word, index +1);
        }
    }

}
