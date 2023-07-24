import java.util.LinkedList;

public class Maze {
	// x = column y=row Position(row,col)
	// maze[rand][column] maze[y][x]
	static int[][] maze = { 
			{ 0, 0, 0, 1, 0 ,1,0,0,0}, 
			{ 0, 1, 1, 1, 0 ,1,1,1,0},
			{ 1, 1, 0, 1, 0 ,1,0,1,0}, 
			{ 1, 0, 1, 1, 1 ,0,1,1,0},
			{ 2, 0, 0, 0, 1 ,1,0,1,1}, 
			{ 0, 0, 0, 0, 0 ,1,0,1,0},
			{ 0, 0, 0, 0, 0 ,1,1,1,0}, 
			{ 0, 0, 0, 0, 0 ,0,0,0,0}
			};

	static LinkedList<Position> path = new LinkedList<>();

	public static void main(String[] args) {

		Position p = new Position(0, 5);
		path.push(p);


		

		while (true) {
			int x = path.peek().x;
			int y = path.peek().y;

			maze[y][x] = 0;
// down
	  if(IsValid(y+1,x)) {
	
			if(maze[y+1][x]==2) {
				System.out.println("Move Down.You've won");
				return;
			}
				else
					if(maze[y+1][x]==1) {
					
				   System.out.println("Moved Down");
					path.push(new Position(y+1,x));
					
					continue;
					}
		  
	  }

		
	      if(IsValid(y,x-1)) {		
	// left
				if(maze[y][x-1]==2) {
					System.out.println("Move Left.You've won");
					return;
				}
					else
						if(maze[y][x-1]==1) {
					
					   System.out.println("Moved Left");
						path.push(new Position(y,x-1));
						
						continue;
						}
	      }
	      if(IsValid(y-1,x)) {
	// up
				if(maze[y-1][x]==2) {
					System.out.println("Move Up.You've won");
					return;
				}
					else
						if(maze[y-1][x]==1) {
						
					   System.out.println("Moved Up");
						path.push(new Position(y-1,x));
						
						continue;
						}
	      }
	      if(IsValid(y,x+1)) {
		// right
				if(maze[y][x+1]==2) {
					System.out.println("Move right.You've won");
					return;
				}
					else
						if(maze[y][x+1]==1) {
						
					   System.out.println("Moved right ");
						path.push(new Position(y,x+1));
						
						continue;
						}
	      }
	
	      
	      path.poll();System.out.println("Move Back");
	      if(path.size()<=0)
	    	  {
	    	  System.out.println("No Path");
	    	  
	    	  return;
	    	  }
	    	  
	      
		}
			
		}

	

	static void print() {
		for (int[] element : maze) {
			for (int j = 0; j < element.length; j++) {
				System.out.print(element[j] + " ");
			}
			System.out.println();

		}
	}

	static boolean IsValid(int y, int x) {
		if (y < 0 || y >= maze.length || x < 0 || x >= maze[y].length)

			return false;

		return true;
	}

}
