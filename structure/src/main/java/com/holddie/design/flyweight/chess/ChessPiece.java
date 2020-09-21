package com.holddie.design.flyweight.chess;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChessPiece {
	private ChessPieceUnit chessPieceUnit;
	private int positionX;
	private int positionY;
}
