package test;

import com.scythe.PlayerMat;

public class TestMat {

    public static void main(String ... args)
    {
        //** Message d'accueil*/
        System.out.println("##########Bienvenue sur le scythe mat tester######");

        PlayerMat playermat1=new PlayerMat("Agriculture",4,2,2,3,2,2,2,2);
        PlayerMat playermat2=new PlayerMat("Industry",2,3,2,3,2,2,2,2);

        playermat1.display();
        playermat2.display();


        System.out.println("##########On upgrade######");

        /*playermat1.upgrade("moveCount","buildCost");*/

    }

}
