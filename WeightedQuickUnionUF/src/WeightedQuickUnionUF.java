public class WeightedQuickUnionUF
{
    private int[] id;     
    private int[] sz;     
    private int count;    

    
    public WeightedQuickUnionUF(int N) {
        count = N;
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int count() {
        return count;
    }

    public int find(int p) {
        while (p != id[p])
            p = id[p];
        return p;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
 
    public void union(int p, int q)
    {
        int i = find(p);
        int j = find(q);
        if (i == j) return;

         
        if   (sz[i] < sz[j])
        { 
            id[i] = j; sz[j] += sz[i];
        }
        else               
        { 
            id[j] = i; sz[i] += sz[j];
        }
        count--;
    }
       
    public static void main(String args[])
 
    {
     WeightedQuickUnionUF q=new WeightedQuickUnionUF(10);
        q.union(5,2);
        q.union(4,8);
        q.union(9,3);
        q.union(5,4);
        q.union(0,3);
        q.union(3,1);
        q.union(0,7);
        q.union(5,6);
        q.union(0,5);
        for (int i = 0; i < 10; i++) 
    {
        System.out.print(q.id[i]+ " ");
    }
  }
 }
