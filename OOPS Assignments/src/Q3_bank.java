public class Q3_bank{
    public int Totalcash(int[] bill){
        int sum = 0;
        for(int i=0;i<bill.length;i++){
            sum+=bill[i];
        }
        return sum;
    }
    public int getcash(){

        return 0;
    }
    public static class CurrentAccount extends Q3_bank {
        int totaldeposit = 10000;
        int creditlimit = 2000;
        @Override
        public int getcash(){
            return totaldeposit;
        }
    }
    public static class SavingAccount extends Q3_bank {
        int totaldeposit = 10000;
        int fixed_deposit = 5000;
        @Override
        public int getcash(){
            return totaldeposit-fixed_deposit;
        }
    }

    public static void main(String[] args) {
        Q3_bank.CurrentAccount me = new Q3_bank.CurrentAccount();
        Q3_bank.SavingAccount you = new Q3_bank.SavingAccount();
        int[] arr = {23,43,75};
        System.out.println(me.getcash());
        System.out.println(you.getcash());
        System.out.println(me.Totalcash(arr));

    }
}