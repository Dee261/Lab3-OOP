package Assignment;

import Assignment.BasketballPlayer;

public class ProBasketballPlayer extends BasketballPlayer {
        private final int yearsInLeague;
        private final String role;


        ProBasketballPlayer()
        {
            super();
            yearsInLeague = 0;
            role = "bench";
        }

        ProBasketballPlayer(String name, String position, String team)
        {
            super(name, position, team);
            yearsInLeague = 0;
            role = "bench";
        }

        ProBasketballPlayer(String name, String position, String team, int height, int weight, int agility,
                            int speed, int ballHandling, int yearsInLeague, String role)
        {
            super(name, position, team, height, weight, agility, speed, ballHandling);
            this.yearsInLeague = yearsInLeague;
            this.role = role;
        }


        int getYearsInLeague()
        {
            return yearsInLeague;
        }


        String getRole()
        {
            return role;
        }


        public String toString()
        {
            return super.toString() + "\n Years In League: " + yearsInLeague +
                    "\t Role: " + role;
        }


        int newContractValue() {
            int amt = -1;
            if (yearsInLeague < 3)
                amt = 0;

            if (role.equalsIgnoreCase("Starter")) {
                if (super.getValue() > 8 && yearsInLeague >= 10)
                    amt = 12000000;

                else if (super.getValue() > 7) {
                    if (yearsInLeague >= 8)
                        amt = 10000000;

                    else if (yearsInLeague >= 5)
                        amt = 8000000;
                } else if (super.getValue() > 5) {
                    if (yearsInLeague >= 10)
                        amt = 6000000;

                    else if (yearsInLeague >= 5)
                        amt = 2000000;
                } else
                    amt = 1000000;

            } else if (role.equalsIgnoreCase("Bench")) {
                if (super.getValue() > 8 && yearsInLeague >= 10)
                    amt = 7500000;

                else if (super.getValue() > 7 && yearsInLeague >= 8)
                    amt = 5000000;

                else if (super.getValue() > 5) {
                    if (yearsInLeague >= 10)
                        amt = 4500000;

                    else if (yearsInLeague >= 7)
                        amt = 200000;
                } else
                    amt = 5000000;
            } else
                System.out.println("\n Invalid Position.");

            return amt;

        }
    }

