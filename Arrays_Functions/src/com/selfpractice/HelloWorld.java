package com.selfpractice;

class HelloWorld {
    public static void main(String[] args) {
       StringBuffer s = new StringBuffer();
       System.out.println(s.capacity());
       s.append("hiiiiii");
       System.out.println(s.capacity());
       s.append("hiiiiii jhf  sd sdkfs jkdfsdf s dfsdjfsds");
       System.out.println(s.capacity());
       s.append("hiiiiii jhf");
       System.out.print(s.capacity());
    }
}
