package Curso4.conceptos;

import Curso4.cinebox.series.Series;

public class Equals {
    public static void main(String[] args) {
        Series theBigBangTheory = new Series("The Big Bang Theory", "comedy", 45, 12, 5);
        Series vikings = new Series("vikings", "Action and Adventures", 45, 15, 7);

        if(theBigBangTheory ==vikings)

        {
            System.out.println("The Big Bang Theory and Vikings are the same");
        }else

        {
            System.out.println("The Big Bang Theory and Vikings are different");
        }

        Series vikings2 = new Series("vikings", "Action and Adventures", 45, 15, 7);

        if(vikings2.equals(vikings))

        {
            System.out.println("vikings and vikings2 are the same");
        }else

        {
            System.out.println("vikings and vikings2 are different");
        }

        Series vikingsEquals = new Series("vikings", "Action and Adventures", 45, 15, 7);

        if(vikingsEquals.equals(vikings))

        {
            System.out.println("vikings and vikingsEquals are the same");
        }else

        {
            System.out.println("vikings and vikingsEquals are different");
        }
    }

}
