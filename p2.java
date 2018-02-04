package pointlessprojects;

public class p2
{
    public static void main(String[] args)
    {
        int[] f = {0, 1};
        int total = 0;
        while (f[f.length -1] < 4000000)
        {
            int f2 = f[0] + f[1];
            f[0] = f[1];
            f[1] = f2;
            if (f2 % 2 == 0){total += f2;}
        }
        System.out.println(total);
    }
}

