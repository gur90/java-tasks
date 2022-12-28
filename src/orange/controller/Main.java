package orange.controller;

import orange.model.Farmer;

import orange.model.OrangeTree;

public class Main {
    public static void main(String[] args) {
        OrangeTree orangeTree = new OrangeTree();
        System.out.println(orangeTree);


        Farmer johanes = new Farmer("Johanes");

        System.out.println("------");
        for (int i = 0; i < 110; i++) {
            orangeTree.passGrowingSeason(); // גûחûגאול
            System.out.println(orangeTree);
            System.out.println(johanes.countAverageOrangeDiameter(orangeTree));
        }
    }
}
