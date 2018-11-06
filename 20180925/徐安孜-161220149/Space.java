public class Space{
    private int length,width;
    private Creature map[][];

    Space(int l,int w){
        length = l;
        width = w;
        map = new Creature[length][width];
        for(int i=0;i<13;i++)
            for(int j=0;j<13;j++)
                map[i][j]=null;
    }
    boolean validation(int x,int y){
        return (map[x][y]==null && x<width && y<length);
    }
    void display(){
        for(int i=0;i<width;i++) {
            for (int j = 0; j < length; j++) {
                if (map[i][j] != null)
                    System.out.print(map[i][j].symbol);
                else
                    System.out.print("□");
            }
            System.out.println();
        }
        System.out.println();
    }
    void characterEnterSpace(Creature c, int x, int y){
        map[x][y]=c;
    }
    void characterLeaveSpace(int x,int y){
        map[x][y]=null;
    }
}

