package tutorialPackage;
import java.util.Scanner;
public class TicTacToeProject {
	
	 /**
  	Checks if player has won tic-tac-toe along diagonal lines.
  	@param board a 3x3 array that contains the tokens (x or o) played
  	@param player the player to check for a winning sequence of marks
  	@return true if player won, false otherwise
   */
   public static boolean wonDiagonal(char[][] board, char token)	{
	   boolean condition = false;
	   if	(token == 'x')
		   for	(int i = 0;i<board[1].length;i++)
			   for	(int u = 0;u<board[0].length;u++) {
			    if (board[i][board[0].length-1] == 'x')	{
				   	if (board[i][u] == 'x')	{
				   		
				   	}
				   	else	{
				   		break;
				   	}
				   	condition = true;
			     }
			   }
	   else if (token == 'o')	{
		   for	(int i = 0;i<board[1].length;i++)
			   for	(int u = 0;u<board[0].length;u++) {
			    if (board[i][board[0].length-1] == 'o')	{
				   	if (board[i][u] == 'o')	{
				   		
				   	}
				   	else	{
				   		break;
				   	}
				   	condition = true;
			     }
			   }
	   }
	   return condition;
   }//end method
 
   /**
  	Checks if player has won tic-tac-toe along straight lines.
  	@param board a 3x3 array that contains the tokens (x or o) played
  	@param player the player to check for a winning sequence of marks
  	@return true if player won, false otherwise
   */
   public static boolean wonStraightLines(char[][] board, char token)	{
	   boolean condition = false;
	   if (token == 'x')	{
		   for	(int u = 0;u<board[0].length;u++)
			   for	(int i = 0;i<board[1].length;i++) {
			    if (board[u][board[1].length-1] == 'x')	{
				   	if (board[u][i] == 'x')	{
				   		
				   	}
				   	else	{
				   		break;
				   	}
			     }
			   }
		   condition = true;
	   }
	   else if	(token == 'o')	{
		   for	(int u = 0;u<board[0].length;u++)
			   for	(int i = 0;i<board[1].length;i++) {
			    if (board[u][board[1].length-1] == 'o')	{
				   	if (board[u][i] == 'o')	{
				   		
				   	}
				   	else	{
				   		break;
				   	}
			     }
			   }
		   condition = true;
	   }
	   return condition;
   }//end of method
 
   /**
  	Checks if player has won. Calls the wonDiagonal and wonStraightLines methods
  	@param board a 3x3 array that contains the tokens (x or o) played
  	@param player the player to check for a winning sequence of marks
  	@return true if player won, false otherwise
   */
   public static boolean win(char[][] board, char token)	{
	   boolean condition = false;
	   System.out.println(board);
	   if (wonStraightLines(board,token) == true)	{
		   condition = true;
	   }
	   else if (wonDiagonal(board,token) == true) {
		   condition = true;
	   }
	   return condition;
   }
 
   /**
  	Draws gameboard, player 1 is X, player 2 is O.
  	@param board the gameboard filled with 0, 1, or 2s
   */
   public static void drawBoard(char[][] board)	{
	   for	(int row=0;row<board.length;row++)	{
			for (int col = 0; col<board[row].length;col++)	{
				 System.out.print(board[row][col]);
			}
			System.out.println();
	   }
   }
  
//comment each line of the main method
   public static void main(String[] args)	{
  	Scanner in = new Scanner(System.in);
  	char[][] board = new char[3][3];
 
  	char player = 2;
 
  	drawBoard(board);
  	while (!win(board, player))
  	{
     	  if (player == 1)
     	  {
        	    player = 2;
     	  }
     	else
     	{
        	  player = 1;
     	}
 
     	 System.out.println("Player " + player + " choose a row: ");
      	int row = in.nextInt();
    	System.out.println("Player " + player + " choose a column: ");
      	int column = in.nextInt();

      	if(player == 1){
	     board[row][column] = 'x';
		 }else if(player == 2){
		     board[row][column] = 'o';
		 }
      	drawBoard(board);
   	}//end while


  	System.out.println("Player " + player + " wins!");
   }//end main


}
