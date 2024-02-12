package study.javastudy.stringbuffer;

public class StringBufferEx {
    /*
        StringBuffer클래스는 지정된 문자열 변경이 가능하다.
        내부적으로 문자열 편집을 위한 버퍼(buffer)를 가지고 있으며, StringBuffer 인스턴스를 생성할 때 그 크기를 지정할 수 있다.
        편집할 문자열의 길이를 고려하여 버퍼의 길이를 충분히 잡아주는 것이 좋다.
        편집 중인 문자열이 버퍼의 길이를 넘어서면 버퍼의 길이를 늘려주는 작업이 추가적으로 수행되어야하기 때문에 작업효율이 떨어진다.
        멀티쓰레드에 안전(thread safe)하도록 동기화 되어 있다.
     */

    /*
        동기화가 StringBuffer의 성능을 떨어뜨린다.
        그래서 StringBuffer의 쓰레드의 동기화만 뺀 StringBuilder가 새로 추가되었다.
        StringBuilder는 StringBuffer와 완전히 똑같은 기능으로 작성되어 있어서, 소스코드에서 buffer대신 builder만 쓰면 된다.
     */



    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        sb.append("123");
        System.out.println(sb);

        StringBuffer sb2 = sb.append("zz");
        System.out.println(sb2);

        //비교
        StringBuffer sb3 = new StringBuffer("abc");
        StringBuffer sb4 = new StringBuffer("abc");

        System.out.println(sb3==sb4); //false
        System.out.println(sb3.equals(sb4)); //false
        String s = sb3.toString();
        String s2 = sb4.toString();

        System.out.println(s.equals(s2)); //true

        //제거
        StringBuffer sb5 = new StringBuffer("0123456");
        sb5.delete(0,3);
        System.out.println(sb5);

        //삽입
        StringBuffer sb6 = new StringBuffer("0123456");
        sb6.insert(3, ".");
        System.out.println(sb6);

        //교체
        StringBuffer sb7 = new StringBuffer("0123456");
        sb7.replace(0,3,"AB");
        System.out.println(sb7);

        //거꾸로 나열
        StringBuffer sb8 = new StringBuffer("0123456");
        sb8.reverse();
        System.out.println(sb8);
    }

}
