package com.nagarro.codingblocks.java.day2;

public class MazePath {

	// Two calls(Right And Down)
	private static void printPath(int cr, int cc, int er, int ec, String path) {
		// TODO Auto-generated method stub

		if (cr > er || cc > ec) {
			return;
		}

		if (cr == er && cc == ec) {
			System.out.println(path);
			return;
		}

		printPath(cr, cc + 1, er, ec, path + 'H');
		printPath(cr + 1, cc, er, ec, path + 'V');
	}

	// Four Directions plus blocked maze
	private static void printPath2(int[][] maze, int cr, int cc, int er, int ec, String path, boolean[][] vis) {
		// TODO Auto-generated method stub

		if (cr < 0 || cc < 0 || cr > er || cc > ec || vis[cr][cc] == true || maze[cr][cc] == 1) {
			return;
		}

		if (cr == er && cc == ec) {
			System.out.println(path);
			return;
		}

		vis[cr][cc] = true;
		printPath2(maze, cr - 1, cc, er, ec, path + 'T', vis);
		printPath2(maze, cr + 1, cc, er, ec, path + 'D', vis);
		printPath2(maze, cr, cc - 1, er, ec, path + 'L', vis);
		printPath2(maze, cr, cc + 1, er, ec, path + 'R', vis);
		vis[cr][cc] = false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 1, 1, 0 } };
		printPath2(maze, 0, 0, 3, 3, "", new boolean[4][4]);
	}
}
