package com.thuitema;

import java.util.Scanner;

public class CoinFlipper {

    public static void main(String[] args) {
        int totalHeads = 0;
	int totalTails = 0;
	int headsTemp = 0;
	int tailsTemp = 0;
	int headsRecord = 0;
	int tailsRecord = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("How many flips? ");
        int numFlips = scanner.nextInt();

        // Flip coin
        for (int i = 0; i < numFlips; i++) {
            // Heads
            if (Math.random() >= 0.5) {
                System.out.println(1);
                tailsTemp = 0;
                headsTemp++;
                totalHeads++;

                if (headsTemp > headsRecord) {
                    headsRecord = headsTemp;
                }
            }

            // Tails
            else {
                System.out.println(0);
                headsTemp = 0;
                tailsTemp++;
                totalTails++;

                if (tailsTemp > tailsRecord) {
                    tailsRecord = tailsTemp;
                }
            }
        }

        generateStats(numFlips, totalHeads, totalTails, headsRecord, tailsRecord);
    }

    public static void generateStats(int numFlips, int totalHeads, int totalTails, int headsRecord, int tailsRecord) {
        System.out.println("\nYou flipped " + numFlips + " coins. Here's the stats of those flips: ");
        System.out.println("Heads was flipped " + totalHeads + " times.");
        System.out.println("Tails was flipped " + totalTails + " times.");
        System.out.println("The longest number of heads in a row was: " + headsRecord);
        System.out.println("The longest number of tails in a row was: " + tailsRecord);

    }
}

/*
Sample Output:
How many flips? 10
0
0
1
1
0
1
1
1
0
0

You flipped 10 coins. Here's the stats of those flips:
Heads was flipped 5 times.
Tails was flipped 5 times.
The longest number of heads in a row was: 3
The longest number of tails in a row was: 2

 */
