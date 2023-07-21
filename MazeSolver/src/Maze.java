import java.util.LinkedList;

public class Maze {
	 // x = column y=row Position(row,col)
	// maze[row][column]
	static  int[][] maze= {
			  {2,1,0,1},  
			  {0,1,1,0},
			  {2,0,2,0}
	  };

	static LinkedList<Position> path = new LinkedList<>();
	public static void main(String[] args) {

        Position p = new Position(0,1);
        path.push(p);
        int x = path.peek().x;
        int y = path.peek().y;        
        
        maze[x][y]=0;
	while(true)	
	{
		//System.out.println();
	    // down
	       if(maze[x+1][y]==2)
	          {
	    	   System.out.println("Moved down. You won");
	    	   print();
	    	   return;
	          }
	       else if(maze[x+1][y]==1)
	       { 
	            x = x+1;
	    	   path.push(new Position(x,y));
	           maze[x][y]=0;  
	           System.out.println("Moved Down");
	           continue;
	       }	
	       
	       
		    // left
	       if(maze[x][y-1]==2)
	          {
	    	   System.out.println("Moved Left. You won");
	    	   print();
	    	   return;
	          }
	       else if(maze[x][y-1]==1)
	       { 
	            y = y-1;
	    	   path.push(new Position(x,y));
	           maze[x][y]=0;  
	           System.out.println("Moved Left");
	           continue;
	       }
	       
		    // right
	       if(maze[x][y+1]==2)
	          {
	    	   System.out.println("Moved right. You won");
	    	   print();
	    	   return;
	          }
	       else if(maze[x][y+1]==1)
	       { 
	            y = y+1;
	    	   path.push(new Position(x,y));
	           maze[x][y]=0;  
	           System.out.println("Moved right");
	           continue;
	       }
	       
		    // up
	       if(maze[x-1][y]==2)
	          {
	    	   System.out.println("Moved up. You won");
	    	   print();
	    	   return;
	          }
	       else if(maze[x-1][y]==1)
	       { 
	            x= x-1;
	    	   path.push(new Position(x,y));
	           maze[x][y]=0;  
	           System.out.println("Moved up");
	           continue;
	       }   
	       
	       
		
	}


   

	}
static void print() {
	for(int i=0;i<maze.length;i++) {
		for(int j=0;j<maze[i].length;j++)
			{
			System.out.print(maze[i][j]+" ");
			}
		System.out.println();
		
	}
}
}


