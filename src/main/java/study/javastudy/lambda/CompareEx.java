package study.javastudy.lambda;

import study.javastudy.lambda.LambdaEx;

public class CompareEx {
    public static void exec(LambdaEx lambdaEx){
        int k = 10;
        int m = 20;
        int value = lambdaEx.compareTo(k,m);
    }

    public static void main(String[] args) {
        exec((i,j)->{
            return i-j;
        });
    }
}
