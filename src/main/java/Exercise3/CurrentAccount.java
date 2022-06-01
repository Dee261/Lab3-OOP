package Exercise3;
    public class CurrentAccount extends Account {
        protected double overDraftLimit;

        public CurrentAccount(int a, double overDraftLimit) {
            super(a);
            this.overDraftLimit = overDraftLimit;
        }

        @Override
        public String toString() {
            return super.toString() + " " + "over draft limit = " + " " + overDraftLimit;
        }

        public void getLetter() {
            if (getBalance() <= overDraftLimit) {
                System.out.println("You have reached your over draft limit");
            }
        }
    }
