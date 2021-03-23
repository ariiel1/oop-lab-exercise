package week5;

public class week5 {
    public static void main(String[] args) {
        String[] name = {"Morris", "Weihan",  "Edward", "Hassan", "Monique"};
        String[] colour = {"Violet", "Green",  "Blue", "Red", "Blue"};

        for (int i = 0; i<5; i++)
        {
            for (int j = i+1 ; j<5; j++)
            {
                if (name[i].compareTo(name[j])>0)
                {
                    String tempName = name[i];
                    String tempColour = colour[i];
                    name[i] = name [j];
                    colour[i] = colour [j];
                    name[j] = tempName;
                    colour[j] = tempColour;
                }
            }
        }
        System.out.println("Sort by Name");
        System.out.println("------------");
        for (int i = 0; i<5; i++)
        {
            System.out.print(name[i] + "\t");
            System.out.println(colour[i]);
        }


        for (int i = 0; i<5; i++)
        {
            for (int j = i+1 ; j<5; j++)
            {
                if (colour[i].compareTo(colour[j])>0)
                {
                    String tempName = name[i];
                    String tempColour = colour[i];
                    name[i] = name [j];
                    colour[i] = colour [j];
                    name[j] = tempName;
                    colour[j] = tempColour;
                }
            }
        }

        System.out.println("Sort by Colour");
        System.out.println("------------");
        for (int i = 0; i<5; i++)
        {
            System.out.print(name[i] + "\t");
            System.out.println(colour[i]);
        }

    }
}
