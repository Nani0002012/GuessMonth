public class MonthGamble {

	public static void main(String[] args) {
		
		double player1WinRate, drawRate;
		
		for(int player1=1; player1<=12; player1++)
		{
			int player1Win=0, player2Win=0, draw=0;
			
			for(int ans=1; ans<=12; ans++)
			{	
				for(int player2=1; player2<=12; player2++)
				{
					if(Math.abs(player1-ans)<Math.abs(player2-ans))
					{
						player1Win++;
						//System.out.println("Player 1 wins");
					}
					else
					{
						if(Math.abs(player1-ans)>Math.abs(player2-ans))
						{
							player2Win++;
							//System.out.println("Player 1 loses");
						}
						else
						{
							draw++;
							//System.out.println("Draw");
						}
					}
				}
			}
			
			player1WinRate=(double)(player1Win)/144;
			drawRate=(double)draw/144;
			
			System.out.println("If player1 chooses "+player1+", then player1's win rate is "+player1WinRate);
		}
		
	}

}