package bonusProblems;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Seminar10_02 extends GraphicsProgram {
	public void run() {
		GCompound myChessBoard = chessBoard(20, 12);
		add(myChessBoard, 31, 23);
	}

	private GCompound chessBoard(double cellLength, double numCells) {
		GCompound chessBoard = new GCompound();
		for (int i = 0; i < numCells; i++) {
			for (int j = 0; j < numCells; j++) {
				GRect tile = new GRect(cellLength, cellLength);
				if ((i + j) % 2 == 1) { // I'm proud of this one
					tile.setFilled(true);
					tile.setFillColor(Color.black);
				}
				chessBoard.add(tile, i * cellLength, j * cellLength);
			}
		}
		return chessBoard;
	}
}
