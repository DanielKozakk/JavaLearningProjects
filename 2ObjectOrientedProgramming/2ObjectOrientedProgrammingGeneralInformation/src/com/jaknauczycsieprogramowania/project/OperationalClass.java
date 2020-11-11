package com.jaknauczycsieprogramowania.project;

 class OperationalClass {
    public void swapFunction(IntWrapper a, IntWrapper b) {
        System.out.println("Before swapping(Inside), a = " + a.a + " b = " + b.a);

        // Swap n1 with n2
        IntWrapper c = new IntWrapper(a.a);
        a.a = b.a;
        b.a = c.a;
        System.out.println("After swapping(Inside), a = " + a.a + " b = " + b.a);

    }

    public static class IntWrapper{
        public int a;
        public IntWrapper ( int a ){
            this.a = a;
        }
    }


}