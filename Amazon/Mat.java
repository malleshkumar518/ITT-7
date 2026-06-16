import java.util.*;

public class Main {
    public static int check(int[][] mat,int x,int n,int m)
    {
    for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          {
              if(x==mat[i][j])
              {
                  return 1;
              }
          }
      }
      return 0;
    }
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int m=s.nextInt();
      int[][] mat=new int[n][m];
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          {
              mat[i][j]=s.nextInt();
          }
      }
      int x=s.nextInt();
      System.out.println(check(mat,x,n,m));
    }
}
