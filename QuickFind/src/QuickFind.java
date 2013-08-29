public class QuickFind {
    private int[] id;
    
    /* Contructor initializes the Corresponding number to the Id */
    public QuickFind(int N)
    {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }
    
   /* Lets take a sample Input 9,3  
    * || id1=9,id2=3 || 
    * Whenever it sees Id of 9 it replaces with id of 3 (i.e) 3 */  
    
    public void union(int id1, int id2) {
        int id_1 = id[id1];
        int id_2 = id[id2];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == id_1)
            {
                id[i] = id_2;
            } 
        }
    }
    
    public static void main(String[] args) {
        QuickFind q = new QuickFind(10);
        q.union(9, 3);
        q.union(3, 7);
        q.union(7, 1);
        q.union(5, 6);
        q.union(6, 0);
        q.union(4, 5);
        for (int i = 0; i < 10; i++) 
        System.out.print(q.id[i] + " ");
    }
}