import java.util.ArrayList;
import java.util.LinkedList;

public class Maze {
	// x = column y=row Position(row,col)
	// maze[rand][column] maze[y][x]
	

	
	


	public static void main(String[] args) {
    ArrayList<Maz> mazes = new ArrayList<>();
	Maz m = new Maz();
	
	int[][] maze = { 
			{ 0, 0, 0, 1, 0 , 0, 0, 0, 0}, 
			{ 0, 1, 1, 1, 0 , 1, 1, 1, 0},
			{ 1, 1, 0, 1, 0 , 1, 0, 1, 0}, 
			{ 1, 0, 1, 1, 1 , 0, 1, 1, 0},
			{ 1, 1, 0, 0, 1 , 1, 0, 1, 1}, 
			{ 1, 1, 1, 1, 0 , 1, 0, 1, 0},
			{ 0, 1, 0, 1, 0 , 1, 1, 1, 0}, 
			{ 0, 0, 2, 1, 0 , 0, 0, 0, 0}
			};
	m.maze=maze;
	m.start = new Position(0,6);
	m.path  = new LinkedList<Position>();
	 
	
	Maz n =new Maz();
		
	int[][] n_maze = { 
			{ 0, 0, 0, 1, 0 , 0, 0, 0, 0}, 
			{ 0, 1, 1, 1, 0 , 1, 1, 1, 0},
			{ 1, 1, 0, 1, 0 , 1, 0, 1, 0}, 
			{ 1, 0, 1, 1, 1 , 0, 1, 1, 0},
			{ 1, 1, 0, 0, 1 , 1, 0, 1, 1}, 
			{ 1, 1, 1, 1, 0 , 1, 0, 1, 0},
			{ 0, 1, 0, 1, 0 , 1, 1, 1, 0}, 
			{ 0, 0, 2, 1, 0 , 0, 0, 0, 0}
			};
	n.maze=n_maze;
	n.start = new Position(0,6);
	n.path  = new LinkedList<Position>();
		
	mazes.add(m);
	mazes.add(n);
		
	int i=0;
	while(i<mazes.size()) {
		if(solveMaze(mazes.get(i)))
			System.out.println("You won");
		else System.out.println("No path");
		i++;
		
	}
		

			
		}




	static boolean IsValid(int y, int x,Maz m) {
		if (y < 0 || y >= m.maze.length || x < 0 || x >= m.maze[y].length)

			return false;

		return true;
	}
	static boolean solveMaze(Maz m) {
		Position p = m.start;
		
		m.path.push(p);


while (true) {
	int x = m.path.peek().x;
	int y = m.path.peek().y;

	m.maze[y][x] = 0;
// down
  if(IsValid(y+1,x,m)) {

		if(m.maze[y+1][x]==2) {
			System.out.println("Move Down!");
		return true;
	}
		else
			if(m.maze[y+1][x]==1) {
			
		   System.out.println("Moved Down");
				m.path.push(new Position(y+1,x));
				
				continue;
				}
	  
  }

	
      if(IsValid(y,x-1,m)) {		
// left
		if(m.maze[y][x-1]==2) {
			System.out.println("Move Left.");
			return true;
		}
			else
				if(m.maze[y][x-1]==1) {
			
			   System.out.println("Moved Left");
				m.path.push(new Position(y,x-1));
				
				continue;
				}
  }
  if(IsValid(y-1,x,m)) {
// up
		if(m.maze[y-1][x]==2) {
			System.out.println("Move Up");
			return true;
		}
			else
				if(m.maze[y-1][x]==1) {
				
			   System.out.println("Moved Up");
				m.path.push(new Position(y-1,x));
				
				continue;
				}
  }
  if(IsValid(y,x+1,m)) {
// right
		if(m.maze[y][x+1]==2) {
			System.out.println("Move right.");
			return true;
		}
			else
				if(m.maze[y][x+1]==1) {
				
			   System.out.println("Moved right ");
				m.path.push(new Position(y,x+1));
				
				continue;
				}
  }

  
  m.path.poll();System.out.println("Move Back");
	      if(m.path.size()<=0) 	 
	    	  return false;
	    	
	    	  
	      
		}	
		
		
		
		
		
	}
	
	
	
	
	
	
}

