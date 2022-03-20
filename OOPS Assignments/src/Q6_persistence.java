abstract public class Q6_persistence {
    abstract public String persist();
    public static class FilePersist extends Q6_persistence{
        public String persist(){
            return "saved as a file";
        }
    }
    public static class DatabasePersist extends Q6_persistence{
        public String persist(){
            return "saved in database";
        }
    }
    public static void main(String[] args) {
        //Q6_persistence entity = new Q6_persistence();
        Q6_persistence client = new Q6_persistence(){
            public String persist(){
                return "instantiating before saving ";
            }
        };

        Q6_persistence.FilePersist file = new Q6_persistence.FilePersist();

        System.out.println(client.hashCode());
        System.out.println(file.hashCode());
    }
    
}
