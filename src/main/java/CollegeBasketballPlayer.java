public class CollegeBasketballPlayer extends BasketballPlayer{
    private  int eligibilityRemaining;
    private final String role;

    CollegeBasketballPlayer()
    {
        super();
       int eligibilityRemaining = 0;
        role = "unknown";
    }

    CollegeBasketballPlayer(String name, String position, String team)
    {
        super(name, position, team);
        int eligibilityRemaining = 4;
        role = "bench";
    }

    CollegeBasketballPlayer(String name, String position, String team, int height, int weight, int agility,
                            int speed, int ballHandling, int eligibilityRemaining, String role)
    {
        super(name, position, team, height, weight, agility, speed, ballHandling);
        this.eligibilityRemaining = eligibilityRemaining;
        this.role = role;
    }

   public int getEligibilityRemaining()
    {
        return eligibilityRemaining;
    }

   public String getRole()
    {
        return role;
    }

    public String toString()
    {
        return super.toString() + "\n Eligibility Remaining: " + eligibilityRemaining +
                "\t Role: " + role;
    }


    boolean draftable()
    {
        if(role.equalsIgnoreCase("bench") && super.getValue() >= 8)
            return true;

        else {
            if (role.equalsIgnoreCase("starter"))
                return super.getValue() > 4;
            return false;
        }
    }



}
