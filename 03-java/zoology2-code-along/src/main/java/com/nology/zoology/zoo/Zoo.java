package com.nology.zoology.zoo;

import com.nology.zoology.animal.Crocodile;
import com.nology.zoology.animal.Llama;
import com.nology.zoology.animal.Tiger;

import java.util.ArrayList;


public class Zoo {
//    private int maxTigers = 10;
//    private int tigerCounter = 0;
//    private Tiger[] tigers = new Tiger[maxTigers];

    private ArrayList<Tiger> tigers = new ArrayList<>();
    private ArrayList<Llama> llamas = new ArrayList<>();
    private ArrayList<Crocodile> crocodiles = new ArrayList<>();

    public ArrayList<Boolean> myNums = new ArrayList<Boolean>();

    public void addAnimal(Tiger tiger) {
        this.tigers.add(tiger);
    }
    public void addAnimal(Crocodile croc) {
        this.crocodiles.add(croc);
    }
    public void addAnimal(Llama llama) {
        this.llamas.add(llama);
    }

    public int getAnimalCount() {
        return this.tigers.size() + this.llamas.size() + this.crocodiles.size();
    }

    public void listAnimals() {
        for(Tiger tiger: tigers) {
            System.out.println(tiger.getInformation());
        }
        for(Llama llama: llamas) {
            System.out.println(llama.getInformation());
        }
        for(Crocodile croc: crocodiles) {
            System.out.println(croc.getInformation());
        }
    }


//
//    public void addAnimal(Tiger tiger){
//        if(this.tigerCounter >= this.maxTigers ) {
//            int newMaxTigers = maxTigers * 2;
//            Tiger[] newTigers = new Tiger[newMaxTigers];
//            System.arraycopy(this.tigers, 0, newTigers, 0, this.tigers.length);
//            this.maxTigers = newMaxTigers;
//            this.tigers = newTigers;
//        }
//        this.tigers[tigerCounter++] = tiger;
//    }




}
