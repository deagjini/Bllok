// The "Bllok" class.
import java.awt.*;
import hsa.Console;
import javax.swing.*;
public class Bllok
{
    static Console c;

	//generate new console
    public static void main (String[] args) throws InterruptedException
    {
	c = new Console (35, 85);
	intro ();
    }

	//intro graphics 
    public static void intro () throws InterruptedException
    {
	Font hello = new Font ("Sanserif", 3, 26);

	Color blue = new Color (161, 195, 209);
	Color purple = new Color (179, 155, 200);
	Color white = new Color (240, 235, 244);
	Color pink = new Color (241, 114, 161);
	Color darkPink = new Color (230, 67, 152);
	Color grey = new Color (168, 168, 168);

	c.setColor (white); //background
	c.fillRect (5, 5, 950, 850);

	int count = 0;
	char play = ' ';

	//selection graphics
	c.setColor (pink);
	c.fillRoundRect (190, 280, 320, 70, 30, 30);
	c.fillRoundRect (190, 370, 320, 70, 30, 30);
	c.setFont (hello);
	c.setColor (Color.white);
	c.drawString ("Press A to Play", 255, 325);
	c.drawString ("Press H for How to Play", 202, 415);

	//title graphics
	//b
	do
	{
	    Thread.sleep (200);
	    for (int i = 100 ; i < 205 ; i += 15) //column 1
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (60, i, 15, 15);
	    }
	    for (int i = 100 ; i < 220 ; i += 15) //column 2
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (75, i, 15, 15);
	    }
	    for (int i = 90 ; i < 150 ; i += 15) //row 1
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 145, 15, 15);
	    }
	    for (int i = 90 ; i < 150 ; i += 15) //row 2
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 205, 15, 15);
	    }
	    for (int i = 135 ; i < 165 ; i += 15) //column 3 and 4
	    {
		for (int j = 160 ; j < 200 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    //l
	    for (int i = 195 ; i < 285 ; i += 15) //base
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 205, 15, 15);
	    }
	    for (int i = 210 ; i < 255 ; i += 15) //top
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 100, 15, 15);
	    }
	    for (int i = 225 ; i < 255 ; i += 15) //column
	    {
		for (int j = 115 ; j < 200 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    //l
	    for (int i = 305 ; i < 395 ; i += 15) //base
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 205, 15, 15);
	    }
	    for (int i = 320 ; i < 365 ; i += 15) //top
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 100, 15, 15);
	    }
	    for (int i = 335 ; i < 365 ; i += 15) //column
	    {
		for (int j = 115 ; j < 200 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    //o
	    for (int i = 425 ; i < 500 ; i += 15) //row 1
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 130, 15, 15);
	    }
	    for (int i = 425 ; i < 500 ; i += 15) //row 2
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 205, 15, 15);
	    }
	    for (int i = 410 ; i < 440 ; i += 15) //column 1
	    {
		for (int j = 145 ; j < 205 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    for (int i = 485 ; i < 515 ; i += 15) //column 2
	    {
		for (int j = 145 ; j < 205 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    //k
	    for (int i = 530 ; i < 560 ; i += 15) //column 1 and 2
	    {
		for (int j = 100 ; j < 220 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    for (int i = 560 ; i < 605 ; i += 15) //row
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 175, 15, 15);
	    }
	    count++;
	    pickColor (count, blue, purple, pink, darkPink);
	    c.fillRect (590, 160, 15, 15);

	    count++;
	    pickColor (count, blue, purple, pink, darkPink);
	    c.fillRect (605, 160, 15, 15);

	    count++;
	    pickColor (count, blue, purple, pink, darkPink);
	    c.fillRect (605, 145, 15, 15);

	    count++;
	    pickColor (count, blue, purple, pink, darkPink);
	    c.fillRect (605, 190, 15, 15);

	    count++;
	    pickColor (count, blue, purple, pink, darkPink);
	    c.fillRect (605, 205, 15, 15);

	    count++;
	    pickColor (count, blue, purple, pink, darkPink);
	    c.fillRect (620, 205, 15, 15);
	}
	while (count < 1000);

	do
	{
	    play = c.getChar ();

	    if (play == 'a' || play == 'A')
	    {
		c.clear ();
		Levels (white, blue, purple, pink, darkPink, hello);
	    }
	    else if (play == 'H' || play == 'h')
	    {
		c.clear ();
		HowToPlay (white, pink, blue, purple, darkPink, grey);
	    }
	}
	while (play != 'a' || play != 'H' || play != 'h' || play != 'A');
    }


    public static void HowToPlay (Color white, Color pink, Color blue, Color purple, Color darkPink, Color grey) throws InterruptedException
    {
	char choose = ' ';
	Font title = new Font ("Sansserif", 1, 60);
	Font back = new Font ("Sanserif", 1, 30);
	Font instructions = new Font ("Sanserif", 1, 19);

	c.setColor (white); //background
	c.fillRect (5, 5, 950, 850);

	c.setColor (darkPink); //title
	c.setFont (title);
	c.drawString ("How to Play", 170, 100);

	c.fillOval (70, 581, 70, 70); //back circle
	c.setColor (blue);
	c.setFont (back);
	c.drawString ("Press B to go back", 163, 628);
	c.drawString ("GOAL:", 65, 146); //subtitles
	c.drawString ("SPECIAL SQUARES:", 65, 480);

	c.setFont (instructions);
	c.setColor (Color.white);
	int[] x = {85, 104, 104, 120, 120, 104, 104};
	int[] y = {613, 596, 608, 608, 621, 621, 634};
	c.fillPolygon (x, y, 7); //arrow at the bottom

	c.fillRect (441, 200, 180, 180); //example map
	c.setColor (grey);
	for (int j = 208 ; j < 350 ; j += 57)
	{
	    for (int i = 450 ; i < 606 ; i += 57)
	    {
		if (i == 450 && j > 300)
		{
		    c.setColor (purple);
		    c.fillRect (i, j, 50, 50);
		    c.setColor (Color.black);
		    c.drawString ("5", i + 20, j + 30);
		}
		else if (i == 507 && j == 208)
		{
		    c.setColor (pink);
		    c.fillRect (i, j, 50, 50);
		    c.setColor (Color.black);
		    c.drawString ("9", i + 20, j + 30);
		}
		else
		{
		    c.setColor (grey);
		    c.fillRect (i, j, 50, 50);
		}
	    }
	}
	c.setColor (Color.white); //special square
	c.drawString ("+2", 521, 355);
	c.setColor (blue); //arrow
	c.fillRect (486, 340, 50, 5);
	c.fillRect (531, 250, 5, 90);
	int[] x2 = {524, 533, 541};
	int[] y2 = {250, 240, 250};
	c.fillPolygon (x2, y2, 3);

	c.setColor (pink); //instructions
	c.drawString ("Move your starting number so that it reaches the position", 65, 176);
	c.drawString ("and value of the pink number!", 65, 198);
	c.drawString ("You can move right left, down, or up", 65, 220);
	c.drawString ("into a box beside you IF it is empty", 65, 242);
	c.drawString ("or your previous number.", 65, 264);
	c.drawString ("Moving into a plain grey box increases", 65, 286);
	c.drawString ("your number's value by one.", 65, 308);
	c.drawString ("When you move back, the box you are", 65, 330);
	c.drawString ("currently on turns back to grey.", 65, 352);
	c.drawString ("You can only move within the map! If", 65, 374);
	c.drawString ("you try to move outside of it or into", 65, 396);
	c.drawString ("a box that isn't grey nor your previous number, don't worry,", 65, 418);
	c.drawString ("it does not count as a move.", 65, 440);
	c.drawString ("If you see a box with a special sign, (ie. +4),", 65, 508);
	c.drawString ("it means that your number changes by that value not by one!", 65, 530);
	c.drawString ("If you go back, your number still returns to the previous value.", 65, 552);

	choose = c.getChar ();
	do
	{
	    if (choose == 'B' || choose == 'b')
	    {
		c.clear ();
		intro ();
	    }
	}
	while (choose != 'B' || choose != 'b');
    }


    public static void pickColor (int count, Color blue, Color purple, Color pink, Color darkPink)
    {
	if (count % 4 == 0)
	{
	    c.setColor (darkPink);
	}
	else if (count % 3 == 0)
	{
	    c.setColor (pink);
	}
	else if (count % 2 == 0)
	{
	    c.setColor (purple);
	}
	else
	{
	    c.setColor (blue);
	}
    }


    public static void Levels (Color white, Color blue, Color purple, Color pink, Color darkPink, Font hello) throws InterruptedException
    {
	char play;
	Font bye = new Font ("Sanserif", 3, 80);
	int count = 0;

	c.setColor (white);
	c.fillRect (5, 5, 950, 850);
	c.setColor (blue);
	c.setFont (bye);
	c.drawString ("Levels", 225, 150);

	c.setColor (pink); //rectangles
	c.fillRoundRect (190, 185, 320, 60, 30, 30);
	c.fillRoundRect (190, 260, 320, 60, 30, 30);
	c.fillRoundRect (190, 335, 320, 60, 30, 30);
	c.fillRoundRect (190, 410, 320, 60, 30, 30);
	c.fillRoundRect (190, 485, 320, 60, 30, 30);

	c.setColor (Color.white); //levels graphics
	c.setFont (hello);
	c.drawString ("Press G for G-mode", 225, 225);
	c.drawString ("Press 1 for Level 1", 230, 300);
	c.drawString ("Press 2 for Level 2", 230, 375);
	c.drawString ("Press 3 for Level 3", 230, 450);
	c.drawString ("Press L for L-mode", 225, 525);

	c.setColor (Color.white); //border
	c.fillRect (40, 30, 600, 20);
	c.fillRect (40, 630, 600, 20);
	c.fillRect (40, 50, 20, 600);
	c.fillRect (620, 50, 20, 600);

	do
	{
	    play = c.getChar (); // depending on what user inputs, it runs the corresponding program
	    //c.clear ();
	    if (play == 'G' || play == 'g')
	    {
		Load (white, blue, purple, pink, darkPink, hello);
		GModeLog (white, pink, darkPink, blue, purple);
	    }

	    if (play == '1')
	    {
		Load (white, blue, purple, pink, darkPink, hello);
		Level1Log (white, pink, darkPink, blue, purple);
	    }

	    if (play == '2')
	    {
		Load (white, blue, purple, pink, darkPink, hello);
		Level2Log (white, pink, darkPink, blue, purple);
	    }

	    if (play == '3')
	    {
		Load (white, blue, purple, pink, darkPink, hello);
		Level3Log (white, pink, darkPink, blue, purple);
	    }

	    if (play == 'L' || play == 'l')
	    {
		Load (white, blue, purple, pink, darkPink, hello);
		LModeLog (white, pink, darkPink, blue, purple);
	    }
	}
	while (play != 'L' || play != 'l' || play != '3' || play != '2' || play != '1' || play != 'G' || play != 'g');
    }


    public static void Load (Color white, Color blue, Color purple, Color pink, Color darkPink, Font hello) throws InterruptedException
    {
	c.setColor (blue);
	c.fillRect (5, 5, 950, 850);
	c.setColor (Color.white);
	c.fillRect (120, 300, 475, 75);
	Font heee = new Font ("Sanserif", 3, 60);
	c.setFont (heee);
	c.drawString ("Loading...", 210, 275);

	c.setColor (pink);
	for (int i = 130 ; i < 530 ; i += 5)
	{
	    Thread.sleep (40);
	    c.fillRect (i, 310, 55, 55);
	}
	c.clear ();
    }


    public static String move (String move)  //this is the code for the dropbox, what the user presses
    {
	Object[] options = {"UP",
	    "DOWN",
	    "LEFT",
	    "RIGHT"};

	int n = JOptionPane.showOptionDialog (null,
		"Choose the Direction",
		"Moves",
		JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null,
		options,
		options [2]);
	do
	{
	    if (n == -1) //ask user for value again
	    {
		n = JOptionPane.showOptionDialog (null,
			"Choose the Direction",
			"Moves",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			options,
			options [2]);
	    }
	    if (n == 0) //depending on what the user inputs, the move string changes
	    {
		move = "UP";
		return move;
	    }
	    if (n == 1)
	    {
		move = "DOWN";
		return move;
	    }
	    if (n == 2)
	    {
		move = "LEFT";
		return move;
	    }
	    if (n == 3)
	    {
		move = "RIGHT";
		return move;
	    }
	}
	while (n == -1);
	return move;
    }


    public static void GModeLog (Color white, Color pink, Color darkPink, Color blue, Color purple) throws InterruptedException
    {
	int y = 2, x = 0, num = 1, count = 5, win = 0, winNum = 5, winX = 2, winY = 0, cooX = 125, cooY = 35;
	int[] [] map = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
	map [0] [2] = 5;
	map [y] [x] = num;
	String move = "";

	while (count > 0 && win == 0) //count down
	{
	    display (white, map, num, y, x, winY, winX, winNum, cooX, cooY, count, pink, darkPink, blue, purple);
	    move = move (move); //dropbox
	    if (move.equals ("UP")) //depending on the string value, the y or x coordinate changes
	    {
		y--;
	    }
	    if (move.equals ("DOWN"))
	    {
		y++;
	    }
	    if (move.equals ("LEFT"))
	    {
		x--;
	    }
	    if (move.equals ("RIGHT"))
	    {
		x++;
	    }

	    if (x <= 2 && x >= 0 && y <= 2 && y >= 0) //boundaries of the map
	    {
		if (map [y] [x] == 0 || map [y] [x] == num - 1 || (map [y] [x] == 5 && y == 0 && x == 2 && num == 4)) //valid moves
		{
		    count = count - 1;
		    num = Moves (x, y, num, map, move);
		    map [y] [x] = num;
		}
	    }

	    if (x == 3) //if the user goes out of bounds, reset the values of x or y (depends on move)
	    {
		x--;
	    }
	    if (y == 3)
	    {
		y--;
	    }
	    if (x == -1)
	    {
		x++;
	    }
	    if (y == -1)
	    {
		y++;
	    }
	    c.clear ();
	    win = CheckWin (win, num, y, x, winNum, winY, winX); //check if the user won, if they won exit loop and display win screen
	}

	if (num == 5) //if the user won
	{
	    if (map [y] [x] == 5 && y == 0 && x == 2)
	    {
		Win ();
	    }
	}
	if (count == 0 && num != 5) //if the user lost
	{
	    Lose ();
	}
    }


    public static void display (Color white, int[] [] map, int num, int y, int x, int winY, int winX, int winNum, int cooX, int cooY, int count, Color pink, Color darkPink, Color blue, Color purple)
    {
	String stringNum = "" + num;
	String stringWinNum = "" + winNum;
	int gridX = 120, gridY = 0, d = 0, e = 0, space = 0, f = 133, g = 3, numSpace = 0, numSpace2 = 0;
	Font gmode = new Font ("SansSerif", 1, 50);
	Font level1 = new Font ("SansSerif", 1, 40);
	Font level2 = new Font ("SansSerif", 1, 35);
	Font level3 = new Font ("SansSerif", 1, 30);
	Font lmode = new Font ("SansSerif", 1, 20);
	Font moves = new Font ("Sanserif", 1, 50);
	Color grey = new Color (168, 168, 168);

	c.setColor (white); //background
	c.fillRect (5, 5, 950, 850);

	c.setColor (Color.black); //moves graphics
	c.setFont (moves);
	c.drawString ("Moves", 270, 60);
	c.drawString ("" + count, 325, 110);

	c.setColor (Color.white);
	if (winNum == 5) //setting number locations depending on level selected
	{
	    gridY = 126;
	    d = 150;
	    e = 5;
	    space = 20;
	    numSpace = 50;
	    numSpace2 = 80;
	    c.setFont (gmode);
	}
	else if (winNum == 14)
	{
	    gridX = 123;
	    gridY = 128;
	    d = 115;
	    e = 2;
	    space = 15;
	    numSpace = 40;
	    numSpace2 = 65;
	    c.setFont (level1);
	}
	else if (winNum == 22)
	{
	    gridY = 125;
	    d = 90;
	    e = 3;
	    space = 16;
	    numSpace = 25;
	    numSpace2 = 46;
	    c.setFont (level2);
	}
	else if (winNum == 42)
	{
	    gridY = 126;
	    d = 75;
	    e = 2;
	    space = 15;
	    numSpace = 23;
	    numSpace2 = 42;
	    c.setFont (level3);

	}
	else if (winNum == 85)
	{
	    gridX = 90;
	    gridY = 120;
	    d = 55;
	    e = 1;
	    f = 100;
	    g = 27;
	    space = 8;
	    numSpace = 22;
	    numSpace2 = 30;
	    c.setFont (lmode);
	}
	c.fillRect (gridX, gridY, d * map.length, d * map [0].length); //base square

	for (int i = 0 ; i < map.length ; i++)
	{
	    for (int j = 0 ; j < map [i].length ; j++) //setting color
	    {
		if (map [j] [i] == 0)
		{
		    c.setColor (grey);
		}
		else if (map [j] [i] == num && j == y && i == x)
		{
		    c.setColor (purple);
		}
		else if (map [j] [i] == winNum && j == winY && i == winX)
		{
		    c.setColor (pink);
		}
		else if (map [j] [i] > 0 && (map [j] [i] != num || (map [j] [i] == num && j != y && i != x)))
		{
		    c.setColor (blue);
		}

		for (int a = d - e ; a < d * 2 ; a += d + e * 2)
		{
		    for (int b = d - e ; b < d * 2 ; b += d + e * 2)
		    {
			c.fillRect (i * a + f, j * b + f + g, d - space, d - space); //small block graphic
		    }
		}
	    }

	    for (int j = 0 ; j < map [i].length ; j++)
	    {
		c.setColor (Color.black);
		for (int a = d - e ; a < d * 2 ; a += d + e * 2)
		{
		    for (int b = d - e ; b < d * 2 ; b += d + e * 2)
		    {
			int z = 0, q = 0;
			if (num > 9)
			{
			    q = 11;
			}
			if (map [j] [i] == winNum && j == winY && i == winX)
			{
			    if (winNum > 9)
			    {
				q = 11;
			    }
			    c.drawString (stringWinNum, i * a + f + numSpace - q, j * b + f + g + numSpace2); //display winning number
			}
			else if (map [j] [i] == num && j == y && i == x)
			{
			    c.drawString (stringNum, i * a + f + numSpace - q, j * b + f + g + numSpace2); //display user's number
			}
			else if (map [j] [i] > 0 && (map [j] [i] != num || (map [j] [i] == num && j != y && i != x)) && (j != cooY && i != cooX))
			{
			    int PreNum = map [j] [i];
			    String stringPreNum = "" + PreNum;

			    if (PreNum > 9)
			    {
				z = 11;
			    }
			    c.drawString (stringPreNum, i * a + f + numSpace - z, j * b + f + g + numSpace2); //display previous number
			}
		    }
		}
	    }
	}
    }


    public static int Moves (int x, int y, int num, int[] [] map, String move)  //the code for the moves of Gmode
    {
	int px = 0, py = 0;

	if (map [y] [x] == 0 || (map [y] [x] == 5 && y == 0 && x == 2)) //num increases by 1 if it meets these
	{
	    num = num + 1;
	}
	else if (map [y] [x] > 0) //else it decreases
	{
	    if (map [y] [x] == num - 1)
	    {
		num--;

		if (move.equals ("UP"))
		{
		    py = y + 1;
		    px = x;
		}
		if (move.equals ("DOWN"))
		{
		    py = y - 1;
		    px = x;
		}
		if (move.equals ("LEFT"))
		{
		    px = x + 1;
		    py = y;
		}
		if (move.equals ("RIGHT"))
		{
		    px = x - 1;
		    py = y;
		}
		map [py] [px] = 0;
	    }
	}
	return num;
    }


    public static void Win () throws InterruptedException //win display screen
    {
	char choose;
	int count = 0;
	char play = ' ';

	Color blue = new Color (161, 195, 209);
	Color purple = new Color (179, 155, 200);
	Color white = new Color (240, 235, 244);
	Color pink = new Color (241, 114, 161);
	Color darkPink = new Color (230, 67, 152);

	c.setColor (white); //background
	c.fillRect (5, 5, 950, 850);
	c.setColor (Color.white); //border
	c.fillRect (40, 30, 600, 20);
	c.fillRect (40, 630, 600, 20);
	c.fillRect (40, 50, 20, 600);
	c.fillRect (620, 50, 20, 600);

	//selection graphics
	Font back = new Font ("Sanserif", 1, 30);
	c.setFont (back);
	c.setColor (blue);
	c.drawString ("Press D to return to main menu", 130, 440);
	//title graphics
	do
	{
	    Thread.sleep (200);
	    //Y
	    for (int i = 150 ; i < 195 ; i += 15) //column 1
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (150, i, 15, 15);
	    }
	    for (int i = 150 ; i < 195 ; i += 15) //column 2
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (165, i, 15, 15);
	    }
	    for (int i = 165 ; i < 225 ; i += 15) //row 1
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 195, 15, 15);
	    }
	    for (int i = 210 ; i < 255 ; i += 15) //column 3
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (180, i, 15, 15);
	    }
	    for (int i = 210 ; i < 255 ; i += 15) //column 4
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (195, i, 15, 15);
	    }
	    for (int i = 150 ; i < 195 ; i += 15) //column 5
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (210, i, 15, 15);
	    }
	    for (int i = 150 ; i < 195 ; i += 15) //column 6
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (225, i, 15, 15);
	    }
	    //o
	    for (int i = 270 ; i < 345 ; i += 15) //row 1
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 310, 15, 15);
	    }
	    for (int i = 270 ; i < 345 ; i += 15) //row 2
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 370, 15, 15);
	    }
	    for (int i = 255 ; i < 285 ; i += 15) //column 1
	    {
		for (int j = 325 ; j < 370 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    for (int i = 330 ; i < 360 ; i += 15) //column 2
	    {
		for (int j = 325 ; j < 370 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    //u
	    for (int i = 375 ; i < 405 ; i += 15) //column 1
	    {
		for (int j = 180 ; j < 240 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    for (int i = 450 ; i < 480 ; i += 15) //column 2
	    {
		for (int j = 180 ; j < 240 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    for (int i = 390 ; i < 480 ; i += 15) //row 1
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 240, 15, 15);
	    }
	    //W
	    for (int i = 135 ; i < 165 ; i += 15) //column 1
	    {
		for (int j = 280 ; j < 370 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    for (int i = 210 ; i < 240 ; i += 15) //column 2
	    {
		for (int j = 280 ; j < 370 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    for (int i = 280 ; i < 355 ; i += 15) //column 3
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (180, i, 15, 15);
	    }
	    for (int i = 340 ; i < 370 ; i += 15) //column 4
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (165, i, 15, 15);
	    }
	    for (int i = 340 ; i < 370 ; i += 15) //column 5
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (195, i, 15, 15);
	    }
	    count++;
	    pickColor (count, blue, purple, pink, darkPink);
	    c.fillRect (150, 370, 15, 15);

	    count++;
	    pickColor (count, blue, purple, pink, darkPink);
	    c.fillRect (210, 370, 15, 15);
	    //o
	    for (int i = 270 ; i < 345 ; i += 15) //row 1
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 180, 15, 15);
	    }
	    for (int i = 270 ; i < 345 ; i += 15) //row 2
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 240, 15, 15);
	    }
	    for (int i = 255 ; i < 285 ; i += 15) //column 1
	    {
		for (int j = 195 ; j < 240 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    for (int i = 330 ; i < 360 ; i += 15) //column 2
	    {
		for (int j = 195 ; j < 240 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    //n
	    for (int i = 375 ; i < 405 ; i += 15) //column 1
	    {
		for (int j = 325 ; j < 380 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    for (int i = 450 ; i < 480 ; i += 15) //column 2
	    {
		for (int j = 325 ; j < 380 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    for (int i = 375 ; i < 465 ; i += 15) //row 1
	    {
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 310, 15, 15);
	    }
	    //!
	    for (int i = 510 ; i < 540 ; i += 15) //rectangle
	    {
		for (int j = 280 ; j < 350 ; j += 15)
		{
		    count++;
		    pickColor (count, blue, purple, pink, darkPink);
		    c.fillRect (i, j, 15, 15);
		}
	    }
	    for (int i = 510 ; i < 540 ; i += 15) //square
	    {
		//for (int j = 305 ; j < 335 ; j += 15)
		//{
		count++;
		pickColor (count, blue, purple, pink, darkPink);
		c.fillRect (i, 370, 15, 15);
		//}
	    }
	}
	while (count < 2000);

	do
	{
	    choose = c.getChar ();
	    if (choose == 'D' || choose == 'd')
	    {
		c.clear ();
		intro ();
	    }
	    c.clear ();
	}
	while (choose != 'D' || choose != 'd');
    }


    public static void Lose () throws InterruptedException //lose screen
    {
	char choose;
	Font lost = new Font ("Sanserif", 1, 75);
	Font back = new Font ("Sanserif", 1, 25);
	Color grey = new Color (168, 168, 168);

	c.setColor (grey);
	c.fillRect (5, 5, 950, 850);
	c.setColor (Color.white);
	c.setFont (lost);
	c.drawString ("Oh no!", 230, 350);
	c.drawString ("You Lost!", 180, 425);

	c.setColor (Color.white); //border
	c.fillRect (40, 30, 600, 20);
	c.fillRect (40, 630, 600, 20);
	c.fillRect (40, 50, 20, 600);
	c.fillRect (620, 50, 20, 600);

	//sad face
	c.fillRect (300, 150, 20, 20);
	c.fillRect (375, 150, 20, 20);
	c.fillRect (300, 210, 95, 20);
	c.fillRect (280, 230, 20, 20);
	c.fillRect (395, 230, 20, 20);
	c.fillRect (265, 250, 20, 20);
	c.fillRect (410, 250, 20, 20);

	c.setColor (Color.black);
	c.setFont (back);
	c.drawString ("Press A to return to main menu", 170, 470);

	choose = c.getChar ();
	do
	{
	    if (choose == 'A' || choose == 'a')
	    {
		c.clear ();
		intro ();
	    }
	}
	while (choose != 'A' || choose != 'a');
    }


    public static void Level1Log (Color white, Color pink, Color darkPink, Color blue, Color purple) throws InterruptedException //code for level 1
    {
	int y = 3, x = 1, num = 4, count = 15, win = 0, winNum = 14, winX = 0, winY = 0, cooX = 15, cooY = 35;
	int[] [] map = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
	String move = "";
	map [0] [0] = 14;
	map [y] [x] = num;

	while (count > 0 && win == 0)
	{
	    display (white, map, num, y, x, winY, winX, winNum, cooX, cooY, count, pink, darkPink, blue, purple);
	    move = move (move); //dropbox

	    if (move.equals ("UP"))
	    {
		y--;
	    }
	    if (move.equals ("DOWN"))
	    {
		y++;
	    }
	    if (move.equals ("LEFT"))
	    {
		x--;
	    }
	    if (move.equals ("RIGHT"))
	    {
		x++;
	    }

	    if (x <= 3 && x >= 0 && y <= 3 && y >= 0) //boundaries of the 2D array
	    {
		if (map [y] [x] == 0 || map [y] [x] == num - 1 || (map [y] [x] == 14 && y == 0 && x == 0 && num == 13)) //valid moves
		{
		    c.clear ();
		    num = Moves1 (x, y, num, map, move);
		    map [y] [x] = num;
		    count = count - 1;
		}
		else
		{
		    if (move.equals ("UP"))
		    {
			y++;
		    }
		    if (move.equals ("DOWN"))
		    {
			y--;
		    }
		    if (move.equals ("LEFT"))
		    {
			x++;
		    }
		    if (move.equals ("RIGHT"))
		    {
			x--;
		    }
		}
	    }

	    if (x == 4) //reset x or y values if the user goes out of bounds
	    {
		x--;
	    }
	    if (y == 4)
	    {
		y--;
	    }
	    if (x == -1)
	    {
		x++;
	    }
	    if (y == -1)
	    {
		y++;
	    }
	    c.clear ();
	    win = CheckWin (win, num, y, x, winNum, winY, winX);
	}

	if (num == 14)
	{
	    if (map [y] [x] == 14 && y == 0 && x == 0)
	    {
		Win ();
	    }
	}
	if (count == 0)
	{
	    Lose ();
	}
    }


    public static int Moves1 (int x, int y, int num, int[] [] map, String move)  //same thing as moves bacially but with different restrictions because its level 1
    {
	int px = 0, py = 0;

	if (map [y] [x] == 0 || (map [0] [1] == 13 && y == 0 && x == 0) || (map [1] [0] == 13 && y == 0 && x == 0)) // if user moves forward
	{
	    num = num + 1;
	}
	else if (map [y] [x] > 0) //if user moves back
	{
	    if (map [y] [x] == num - 1)
	    {
		num--;

		if (move.equals ("UP"))
		{
		    py = y + 1;
		    px = x;
		}
		if (move.equals ("DOWN"))
		{
		    py = y - 1;
		    px = x;
		}
		if (move.equals ("LEFT"))
		{
		    px = x + 1;
		    py = y;
		}
		if (move.equals ("RIGHT"))
		{
		    px = x - 1;
		    py = y;
		}
		map [py] [px] = 0; //reset the previous square, change its value back to 0
	    }
	}
	return num;
    }


    public static void Level2Log (Color white, Color pink, Color darkPink, Color blue, Color purple) throws InterruptedException
    {
	int y = 4, x = 2, num = 3, count = 20, win = 0, winNum = 22, winX = 0, winY = 0, cooX = 15, cooY = 35;
	String specialSquare = "+4";
	int[] [] map = new int [5] [5];
	String move = "";
	map [0] [0] = 22;
	map [y] [x] = num;

	while (count > 0 && win == 0)
	{
	    display (white, map, num, y, x, winY, winX, winNum, cooX, cooY, count, pink, darkPink, blue, purple);

	    if (map [2] [3] == 0) //display of the special square
	    {
		c.setColor (Color.white);
		c.drawString (specialSquare, 410, 360);
	    }
	    move = move (move); //dropbox

	    if (move.equals ("UP")) //change y or x value
	    {
		y--;
	    }
	    if (move.equals ("DOWN"))
	    {
		y++;
	    }
	    if (move.equals ("LEFT"))
	    {
		x--;
	    }
	    if (move.equals ("RIGHT"))
	    {
		x++;
	    }
	    if (x <= 4 && x >= 0 && y <= 4 && y >= 0) //boundaries of the array
	    {
		if (map [y] [x] == 0 || map [y] [x] == num - 1 || (map [y] [x] == num - 4 && map [2] [3] == num) || (map [y] [x] == 22 && y == 0 && x == 0 && num == 21)) //valid moves
		{
		    c.clear ();
		    num = Moves2 (x, y, num, map, move);
		    map [y] [x] = num;
		    count = count - 1;
		}
		else //reset x or y if move is invalid
		{
		    if (move.equals ("UP"))
		    {
			y++;
		    }
		    if (move.equals ("DOWN"))
		    {
			y--;
		    }
		    if (move.equals ("LEFT"))
		    {
			x++;
		    }
		    if (move.equals ("RIGHT"))
		    {
			x--;
		    }
		}
	    }
	    if (x == 5) //reset values if move is invalid
	    {
		x--;
	    }
	    if (y == 5)
	    {
		y--;
	    }
	    if (x == -1)
	    {
		x++;
	    }
	    if (y == -1)
	    {
		y++;
	    }
	    c.clear ();
	    win = CheckWin (win, num, y, x, winNum, winY, winX); //check if the user won
	}

	if (num == 22) //check if the user won
	{
	    if (map [y] [x] == 22 && y == 0 && x == 0)
	    {
		Win (); //display win screen
	    }
	}
	if (count == 0)
	{
	    Lose (); //if the user lost display lose screen
	}
    }


    public static int Moves2 (int x, int y, int num, int[] [] map, String move)
    {
	int px = 0, py = 0;

	if (map [y] [x] == 0 || (map [y] [x] == 22 && y == 0 && x == 0)) //if the user is moving forward into an square they havent been in
	{
	    if (y == 2 && x == 3)
	    {
		num = num + 4;
	    }
	    else
	    {
		num = num + 1;
	    }
	}
	else if (map [y] [x] > 0) //if the user is going back to the previous square
	{
	    if (move.equals ("UP"))
	    {
		py = y + 1;
		px = x;
	    }
	    if (move.equals ("DOWN"))
	    {
		py = y - 1;
		px = x;
	    }
	    if (move.equals ("LEFT"))
	    {
		px = x + 1;
		py = y;
	    }
	    if (move.equals ("RIGHT"))
	    {
		px = x - 1;
		py = y;
	    }
	    map [py] [px] = 0; //reset the previous square, change its value back to 0

	    if (map [y] [x] == num - 4) //special square
	    {
		num = num - 4;
	    }
	    else
	    {
		num = num - 1;
	    }
	}
	return num;
    }


    public static void Level3Log (Color white, Color pink, Color darkPink, Color blue, Color purple) throws InterruptedException
    {
	int y = 4, x = 4, num = 12, count = 20, win = 0, winNum = 42, winY = 1, winX = 3, cooX = 170, cooY = 85;
	int[] [] map = new int [6] [6];
	String move = "", specialSquare = "+2", specialSquare2 = "x2";
	map [1] [3] = 42;
	map [y] [x] = num;

	while (count > 0 && win == 0)
	{
	    display (white, map, num, y, x, winY, winX, winNum, cooX, cooY, count, pink, darkPink, blue, purple);

	    //display the 2 special squares
	    if (map [2] [3] == 0)
	    {
		c.setColor (Color.white);
		c.drawString (specialSquare, 360, 320);
	    }
	    if (map [3] [1] == 0)
	    {
		c.setColor (Color.white);
		c.drawString (specialSquare2, 215, 395);
	    }
	    move = move (move); //dropbox

	    if (move.equals ("UP")) //change y or x value
	    {
		y--;
	    }
	    if (move.equals ("DOWN"))
	    {
		y++;
	    }
	    if (move.equals ("LEFT"))
	    {
		x--;
	    }
	    if (move.equals ("RIGHT"))
	    {
		x++;
	    }
	    if (x <= 5 && x >= 0 && y <= 5 && y >= 0) //boundaries of the array
	    {
		if (map [y] [x] == 0 || map [y] [x] == num - 1 || (map [y] [x] == num - 2 && map [2] [3] == num) || (map [y] [x] == num / 2 && map [3] [1] == num) || (map [y] [x] == 42 && x == 3 && y == 1 && num == 41)) //valid movements
		{
		    c.clear ();
		    num = Moves3 (x, y, num, map, move);
		    map [y] [x] = num;
		    count = count - 1;
		}
		else //reset the y or x values if the move is invalid
		{
		    if (move.equals ("UP"))
		    {
			y++;
		    }
		    if (move.equals ("DOWN"))
		    {
			y--;
		    }
		    if (move.equals ("LEFT"))
		    {
			x++;
		    }
		    if (move.equals ("RIGHT"))
		    {
			x--;
		    }
		}
	    }
	    if (x == 6) //reset x or y values if the move is out of bounds
	    {
		x--;
	    }
	    if (y == 6)
	    {
		y--;
	    }
	    if (x == -1)
	    {
		x++;
	    }
	    if (y == -1)
	    {
		y++;
	    }
	    c.clear ();
	    win = CheckWin (win, num, y, x, winNum, winY, winX);
	}

	if (num == 42)
	{
	    if (map [y] [x] == 42 && y == 1 && x == 3)
	    {
		Win ();
	    }
	}
	if (count == 0)
	{
	    Lose ();
	}
    }


    public static int Moves3 (int x, int y, int num, int[] [] map, String move)
    {
	int px = 0, py = 0;

	if (map [y] [x] == 0 || (map [y] [x] == 42 && x == 3 && y == 1))
	{
	    //special square uno
	    if (y == 2 && x == 3)
	    {
		num = num + 2;
	    }
	    //special square duo
	    else if (y == 3 && x == 1)
	    {
		num = num * 2;
	    }
	    // not special
	    else
	    {
		num = num + 1;
	    }
	}
	else if (map [y] [x] > 0)
	{
	    if (move.equals ("UP"))
	    {
		py = y + 1;
		px = x;
	    }
	    if (move.equals ("DOWN"))
	    {
		py = y - 1;
		px = x;
	    }
	    if (move.equals ("LEFT"))
	    {
		px = x + 1;
		py = y;
	    }
	    if (move.equals ("RIGHT"))
	    {
		px = x - 1;
		py = y;
	    }
	    map [py] [px] = 0; //make the previous square 0 again

	    if (map [y] [x] == num - 2) //reset the values if the user goes backwards
	    {
		num = num - 2;
	    }
	    else if (map [y] [x] == num / 2)
	    {
		num = num / 2;
	    }
	    else if (map [y] [x] == num - 1)
	    {
		num = num - 1;
	    }
	}
	return num;
    }


    public static void LModeLog (Color white, Color pink, Color darkPink, Color blue, Color purple) throws InterruptedException
    {
	int y = 9, x = 4, num = 10, count = 40, win = 0, winNum = 85, winY = 1, winX = 8, cooX = 425, cooY = 85;
	int[] [] map = new int [10] [10];
	String move = "", specialSquare = "+7", specialSquare2 = "+16", specialSquare3 = "x2", specialSquare4 = "+5", specialSquare5 = "-8", specialSquare6 = "-2", specialSquare7 = "x3";
	map [1] [8] = 85;
	map [y] [x] = num;

	while (count > 0 && win == 0)
	{
	    display (white, map, num, y, x, winY, winX, winNum, cooX, cooY, count, pink, darkPink, blue, purple);

	    //all the special squares
	    if (map [0] [6] == 0)
	    {
		c.setColor (Color.white);
		c.drawString (specialSquare, 435, 155);
	    }
	    if (map [1] [1] == 0)
	    {
		c.setColor (Color.white);
		c.drawString (specialSquare2, 160, 210);
	    }
	    if (map [2] [5] == 0)
	    {
		c.setColor (Color.white);
		c.drawString (specialSquare3, 380, 265);
	    }
	    if (map [3] [3] == 0)
	    {
		c.setColor (Color.white);
		c.drawString (specialSquare4, 275, 320);
	    }
	    if (map [3] [8] == 0)
	    {
		c.setColor (Color.white);
		c.drawString (specialSquare5, 545, 320);
	    }
	    if (map [5] [1] == 0)
	    {
		c.setColor (Color.white);
		c.drawString (specialSquare6, 175, 425);
	    }
	    if (map [6] [6] == 0)
	    {
		c.setColor (Color.white);
		c.drawString (specialSquare7, 435, 480);
	    }
	    move = move (move); //dropbox

	    if (move.equals ("UP")) //move y or x
	    {
		y--;
	    }
	    if (move.equals ("DOWN"))
	    {
		y++;
	    }
	    if (move.equals ("LEFT"))
	    {
		x--;
	    }
	    if (move.equals ("RIGHT"))
	    {
		x++;
	    }
	    if (x <= 9 && x >= 0 && y <= 9 && y >= 0) //boundaries
	    {
		if (map [y] [x] == 0 || map [y] [x] == num - 1 || (map [y] [x] == num - 7 && map [0] [6] == num) || (map [y] [x] == num - 16 && map [1] [1] == num) || (map [y] [x] == num / 2 && map [2] [5] == num) || (map [y] [x] == num - 5 && map [3] [3] == num) || (map [y] [x] == num + 8 && map [3] [8] == num) || (map [y] [x] == num + 2 && map [5] [1] == num) || (map [y] [x] == num / 3 && map [6] [6] == num) || (map [y] [x] == 85 && x == 8 && y == 1 && num == 84)) //restrictions going backwards or forwards; player can only go into an empty square or their previous square
		{
		    c.clear ();
		    num = Moves4 (x, y, num, map, move);
		    map [y] [x] = num;
		    count = count - 1;
		}
		else //reset coordiante if it doesn't meet resrictions, if player tried to move into a square that wasnt 0 or their previous number
		{
		    if (move.equals ("UP"))
		    {
			y++;
		    }
		    if (move.equals ("DOWN"))
		    {
			y--;
		    }
		    if (move.equals ("LEFT"))
		    {
			x++;
		    }
		    if (move.equals ("RIGHT"))
		    {
			x--;
		    }
		}
	    }
	    if (x == 10) //reset coordinates if the player went out of bounds
	    {
		x--;
	    }
	    if (y == 10)
	    {
		y--;
	    }
	    if (x == -1)
	    {
		x++;
	    }
	    if (y == -1)
	    {
		y++;
	    }
	    c.clear ();
	    win = CheckWin (win, num, y, x, winNum, winY, winX);
	}

	if (num == 85)
	{
	    if (map [y] [x] == 85 && y == 1 && x == 8)
	    {
		Win ();
	    }
	}
	else
	{
	    Lose ();
	}
    }


    public static int Moves4 (int x, int y, int num, int[] [] map, String move)
    {
	int px = 0, py = 0;

	if (map [y] [x] == 0 || (map [y] [x] == 85 && x == 8 && y == 1))
	{
	    //special square uno
	    if (y == 0 && x == 6)
	    {
		num = num + 7;
	    }
	    //special square duo
	    else if (y == 1 && x == 1)
	    {
		num = num + 16;
	    }
	    //special square 3
	    else if (y == 2 && x == 5)
	    {
		num = num * 2;
	    }
	    //special square 4
	    else if (y == 3 && x == 3)
	    {
		num = num + 5;
	    }
	    //special square 5
	    else if (y == 3 && x == 8)
	    {
		num = num - 8;
	    }
	    //special square 6
	    else if (y == 5 && x == 1)
	    {
		num = num - 2;
	    }
	    //special square 7
	    else if (y == 6 && x == 6)
	    {
		num = num * 3;
	    }
	    // not special
	    else
	    {
		num = num + 1;
	    }
	}
	else if (map [y] [x] > 0) //if the user goes into the previous square
	{

	    if (move.equals ("UP"))
	    {
		py = y + 1;
		px = x;
	    }
	    if (move.equals ("DOWN"))
	    {
		py = y - 1;
		px = x;
	    }
	    if (move.equals ("LEFT"))
	    {
		px = x + 1;
		py = y;
	    }
	    if (move.equals ("RIGHT"))
	    {
		px = x - 1;
		py = y;
	    }
	    map [py] [px] = 0; //make their current square 0 again

	    //SPECIAL 1
	    if (map [y] [x] == num - 7)
	    {
		num = num - 7;
	    }
	    //SPECIAL 2
	    else if (map [y] [x] == num - 16)
	    {
		num = num - 16;
	    }
	    //SPECIAL 3
	    else if (map [y] [x] == num / 2)
	    {
		num = num / 2;
	    }
	    //SPECIAL 4
	    else if (map [y] [x] == num - 5)
	    {
		num = num - 5;
	    }
	    //SPECIAL 5
	    else if (map [y] [x] == num + 8)
	    {
		num = num + 8;
	    }
	    //SPECIAL 6
	    else if (map [y] [x] == num + 2)
	    {
		num = num + 2;
	    }
	    //SPECIAL 7
	    else if (map [y] [x] == num / 3)
	    {
		num = num / 3;
	    }
	    //not special
	    else if (map [y] [x] == num - 1)
	    {
		num = num - 1;
	    }
	}
	return num;
    }


    public static int CheckWin (int win, int num, int y, int x, int winNum, int winY, int winX)  //check if the user won
    {
	if (num == winNum && y == winY && x == winX)
	{
	    win = 1;
	}
	return win;
    }
}
