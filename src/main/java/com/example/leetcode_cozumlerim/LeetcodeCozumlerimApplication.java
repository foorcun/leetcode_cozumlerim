package com.example.leetcode_cozumlerim;

import com.example.leetcode_cozumlerim.Backtracking.N_Queens51.Deneme4Nver2;
import com.example.leetcode_cozumlerim.Backtracking.Temeller.Temel1;
import com.example.leetcode_cozumlerim.Backtracking.Temeller.Temel2;
import com.example.leetcode_cozumlerim.Backtracking.Temeller.Temel3;
import com.example.leetcode_cozumlerim.Backtracking.Temeller.Temel4;
import com.example.leetcode_cozumlerim.RecursionDeneme.RecursionDeneme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import com.example.leetcode_cozumlerim.Backtracking.CombinationSum39.Solution;
import com.example.leetcode_cozumlerim.Backtracking.LetterCombinationsofaPhoneNumber17.Solution;

import java.util.Arrays;

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
//		Deneme4N ddd = new Deneme4N();
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
//		System.out.println(Subsets2.subsets(new int[] {0}));


//		Solution sol = new Solution();
//		var vv =sol.combinationSum(new int[] {2,3,6,7}, 7);
////		var vv =sol.combinationSum(new int[] {2,7,6,3,5,1}, 9);
//		System.out.println(Arrays.deepToString(vv.toArray()));

//		SolutionPermutations sol = new SolutionPermutations();
//		var result = sol.permute(new int[] {1,2,3});
//		System.out.println(Arrays.deepToString(result.toArray()));

//		WSSolution ws = new WSSolution();
//
//		System.out.println(ws.exist());

//		Solution sol = new Solution();
//		sol.letterCombinations("23");

//		RecursionDeneme rd = new RecursionDeneme();
//		rd.doIt();

//		Temel1 t = new Temel1();
//		t.doIt();

//		Temel1.doIt();
//		Temel2.doIt();

//		Temel3.doIt();

//		Deneme4Nver2 ddd= new Deneme4Nver2();
//		ddd.doIt();

		Temel4.permute();

	}

}
