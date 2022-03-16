package com.company;

public class History implements SkillsHistory{
    boolean startStory = false;
    @Override
    public void beginning() {
        System.out.println("История начинается");
        startStory = true;
    }

    @Override
    public void ending() {
        System.out.println("История заканчивается");
    }
}
