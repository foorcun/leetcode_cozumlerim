package com.example.leetcode_cozumlerim;

import com.example.leetcode_cozumlerim.N_Queens51.Deneme4N;
import com.example.leetcode_cozumlerim.Subsets78.Subsets2;
import com.example.leetcode_cozumlerim.maze.MazeFinder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.leetcode_cozumlerim.CombinationSum39.Solution;


import java.util.Arrays;
import java.util.List;

import static com.example.leetcode_cozumlerim.Subsets78.Subsets.findSubsets;

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


//		// Maze finder
//		MazeFinder mF = new MazeFinder();
//		mF.printTheWorld();
//		boolean b = mF.findPath(0,0);
//		System.out.println(b);
//		mF.printTheMap();

		// subsets
//		List<List<Integer>> result = findSubsets(new int[] { 1, 3 });
//		System.out.println("Here is the list of subsets: " + result);

//		result = findSubsets(new int[] { 1, 5, 3 });
//		List<List<Integer>> result = findSubsets(new int[] { 1, 5, 3 });
//		System.out.println("Here is the list of subsets: " + result);



//		System.out.println(Subsets2.subsets(new int[] {1,5,3}));
		System.out.println(Subsets2.subsets(new int[] {0}));


//		Solution sol = new Solution();
////		var vv =sol.combinationSum(new int[] {2,3,6,7}, 7);
//		var vv =sol.combinationSum(new int[] {2,7,6,3,5,1}, 9);
//		System.out.println(Arrays.deepToString(vv.toArray()));


	}

}
