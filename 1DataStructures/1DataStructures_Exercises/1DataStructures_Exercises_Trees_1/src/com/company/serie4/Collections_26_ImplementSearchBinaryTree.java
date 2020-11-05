package com.company.serie4;



public class Collections_26_ImplementSearchBinaryTree {

    int data;
    Collections_26_ImplementSearchBinaryTree left,right;


    public Collections_26_ImplementSearchBinaryTree (int data){

        this.data = data;
    }

    public void insert (int numberToAdd){

        /*

                Metoda rekurencyjna
                jeśli numberToAdd jest mniejsza lub równa this.data to wykonuję na lewym, jeśli nie, na prawym

                jeśli left albo right jest nullem, to tworzę nowego noda z numberToAdd.


         */

        if(numberToAdd <= this.data){

            if(this.left == null){
                this.left = new Collections_26_ImplementSearchBinaryTree(numberToAdd);
            } else {
                this.left.insert(numberToAdd);
            }
        } else {
            if(this.right == null){
                this.right = new Collections_26_ImplementSearchBinaryTree(numberToAdd);
            } else {
                this.right.insert(numberToAdd);
            }
        }


    }

    public boolean contains(int dataToCheck){

        /*

                jeśli dataToCheck jest równa data
                zwracam true

                jesli dataToCheck jest mniejszy od data

                    sprawdza, czy istnieje lewy node
                    jeśli nie - zwróć false
                    jeśli tak - wykonaj funkcję na this.left

                else

                    zróbto samo z right nodem


         */

        if(dataToCheck == this.data){
            return true;
        } else if(dataToCheck < this.data){
            if(this.left == null){
                return false;
            } else {
                return this.left.contains(dataToCheck);
            }
        } else {
            if(this.right == null){
                return false;
            } else {
                return this.right.contains(dataToCheck);
            }
        }
    }

    public void insertInOrder(){

        /*
            jeśli zawiera this.left nie jest nullem
            zrób this.left.insertInOrder

            system.out.println(this.data)

            jeśli this.right nie jest nullem
            zrób na niminsert in order

         */

        if(left != null){
            left.insertInOrder();
        }

        System.out.println(data);

        if(right != null){
            right.insertInOrder();
        }
    }
}
