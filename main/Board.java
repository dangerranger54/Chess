package main;

public class Board {
	//Player 
	public String pRook1 = " R1";
	public String pKnight1 = " K1";
	public String pBishop1 = " B1";
	public String pKing = " K";
	public String pQueen = " Q";
	public String pBishop2 = " B2";
	public String pKnight2 = " K2";
	public String pRook2 = " R2";
	public String pPawn1 = " P1";
	public String pPawn2 = " P2";
	public String pPawn3 = " P3";
	public String pPawn4 = " P4";
	public String pPawn5 = " P5";
	public String pPawn6 = " P6";
	public String pPawn7 = " P7";
	public String pPawn8 = " P8";
	
	//Comp 
	public String cRook1 = " cR1";
	public String cKnight1 = " cK1";
	public String cBishop1 = "cB1";
	public String cKing = "cK";
	public String cQueen = "cQ";
	public String cBishop2 = "cB2";
	public String cKnight2 = "cK2";
	public String cRook2 = "cR2";
	public String cPawn1 = "cP1";
	public String cPawn2 = "cP2";
	public String cPawn3 = "cP3";
	public String cPawn4 = "cP4";
	public String cPawn5 = "cP5";
	public String cPawn6 = "cP6";
	public String cPawn7 = "cP7";
	public String cPawn8 = "cP8";
	
	private String[][] board = {{pRook1,pKnight1,pBishop1,pKing,pQueen,pBishop2,pKnight2,pRook2},
								{pPawn1,pPawn2,pPawn3,pPawn4,pPawn5,pPawn6,pPawn7,pPawn8},
								{" -"," -"," -"," -"," -"," -"," -"," -"},
								{" -"," -"," -"," -"," -"," -"," -"," -"},
								{" -"," -"," -"," -"," -"," -"," -"," -"},
								{" -"," -"," -"," -"," -"," -"," -"," -"},};
	
	public void printBoard() {
		for(String[] array : board) {
			for(String res : array) {
				System.out.print(res);
			}
			System.out.println();
		}
	}
	

}
