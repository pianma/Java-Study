package study.javastudy.interfaceEx02;

public class Project {
    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new DummyAlgorithm();
        System.out.println(algorithm.complexAlgorithm(10,20));
        ComplexAlgorithm realAlgorithm = new RealAlgorithm();
        System.out.println(realAlgorithm.complexAlgorithm(10,20));
    }
}
