package observerexample;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

class ConcreteObserverA extends Observer {
    
     ConcreteObserverA(Subject subject){
         subject_=subject;
        subject_.registerObserver(this);
    }
     
     @Override
    public void update(){
        System.out.println("ConcreteObserverB::notify\n");
    }
 private   Subject subject_;
};
