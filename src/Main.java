public class Main {
    public static void main(String[] args) {
       import java.util.Scanner;

        public class Main {
            public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Aukeratu eragiketa bat:");
                System.out.println("1. Batuketa \t 2. Kenketa");
                System.out.println("3. Biderketa \t 4. Zatiketa");
                int aukera = sc.nextInt();
                if (aukera < 1 || aukera > 6)
                {
                    System.out.println("Sartu duzun aukera ez da egokia.");
                }
                else
                {
                    System.out.println("Sartu lehen zenbakia (hamartarra izan daiteke):");
                    double zenb1 = sc.nextFloat();
                    System.out.println("Sartu bigarren zenbakia (hamartarra izan daiteke):");
                    double zenb2 = sc.nextFloat();
                    if (zenb2 == 0 && (aukera == 4 || aukera == 6))
                    {
                        System.out.println("Ezin da zati 0 egin.");
                    }
                    else
                    {
                        double emaitza = 0;
                        switch (aukera)
                        {
                            case 1:
                                emaitza = zenb1 + zenb2;
                                break;
                            case 2:
                                emaitza = zenb1 - zenb2;
                                break;
                            case 3:
                                emaitza = zenb1* zenb2;
                                break;
                            case 4:
                                emaitza = zenb1 / zenb2;
                                break;

                        }
                        System.out.println("Eragiketaren emaitza " + emaitza + " da.");
                    }
                }
                sc.close();
            }
        }
    }
}