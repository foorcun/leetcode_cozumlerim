package com.example.leetcode_cozumlerim;

import com.example.leetcode_cozumlerim.N_Queens51.Deneme4N;
import com.example.leetcode_cozumlerim.maze.MazeFinder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetcodeCozumlerimApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeetcodeCozumlerimApplication.class, args);

//		Solution sol = new Solution();
//		sol.reorderList();


//		Map<String,Integer> m = new HashMap<>();

//SudokuSolver37
//				Solution sol = new Solution();
////			sol.printTheBoard(sol.input);
//		sol.solveIt(sol.input);

		// N_queen solver
		Deneme4N ddd = new Deneme4N();
//		ddd.printTheBoard();
//		ddd.solveNQueens();


		// Maze finder
		MazeFinder mF = new MazeFinder();
		mF.printTheWorld();
		boolean b = mF.findPath(0,0);
		System.out.println(b);
		mF.printTheMap();



	}

}
