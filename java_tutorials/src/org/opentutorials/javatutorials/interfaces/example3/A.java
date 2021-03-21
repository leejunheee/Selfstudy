package org.opentutorials.javatutorials.interfaces.example3;

interface I1{
    public void x();
}
 
interface I2{
    public void z();
}
 
class A implements I1, I2{ //하나의 클래스는 복수의 인터페이스 구현 가능.
    public void x(){}
    public void z(){}   
}