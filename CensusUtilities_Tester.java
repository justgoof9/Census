public class CensusUtilities_Tester {
    public static void main ( String [] args ){
       CensusUtilities c1=new CensusUtilities();
       // converting letters to numbers
       System.out.println("******converting letters to numbers******");
 
       System.out.println("converting b...."+c1.letterToNumber("b"));//1
       System.out.println("converting B...."+c1.letterToNumber("B"));//1
       System.out.println("converting k...."+c1.letterToNumber("k"));//2
       System.out.println("converting X...."+c1.letterToNumber("X"));//2
       System.out.println("converting d...."+c1.letterToNumber("d"));//3
       System.out.println("converting l...."+c1.letterToNumber("l"));//4
       System.out.println("converting M...."+c1.letterToNumber("M"));//5
       System.out.println("converting r...."+c1.letterToNumber("r"));//6
       System.out.println("converting Y...."+c1.letterToNumber("Y"));//-1
       
      // getting the last name
      System.out.println("\n  Getting the last name    ");
      String hh1= "George W Nifong\t28\tM\tMissouri\nElizabeth Nifong\t26\tF\tMissouri\nCatharine Nifong\t7\tF\tMissouri\nMary Nifong\t5\tF\tMissouri\nEmily Nifong\t1\tF\tMissouri";
      System.out.println (c1.getFirstSurname(hh1)); //Nifong 
      String hh2= "John Walker D. Right\t56\tM\tNewYork\nBetty Right\t44\tF\tMissouri\nKate Right\t7\tF\tMissouri"; 
      String hh3= "Jack Robert Right\t34\tM\tNewYork\nBetty Right\t44"; 
      System.out.println (c1.getFirstSurname(hh2));//Right

           // getting Soundex code
     System.out.println("\n--------SOUNDEX CODE-------------");
     System.out.println("Robert is "+c1.getSoundex("Robert"));//Robert R163
     System.out.println("Rupert is "+c1.getSoundex("Rupert"));//Rupert R163
     System.out.println("Honeyman is "+c1.getSoundex("Honeyman"));//Honeyman H555
     System.out.println("Kate is "+c1.getSoundex("Kate"));//Kate    K300
     System.out.println("Alex is "+c1.getSoundex("Alex"));//Alex A420
     System.out.println("CCCCCCCCC is "+c1.getSoundex("CCCCCCCCCCC"));// C222
     System.out.println("Empty string is "+c1.getSoundex(""));// null
    }
 }