package com.example.leetcode_cozumlerim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.leetcode_cozumlerim.SudokuSolver37.Solution;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class LeetcodeCozumlerimApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeetcodeCozumlerimApplication.class, args);

//		Solution sol = new Solution();
//		sol.reorderList();


//		Map<String,Integer> m = new HashMap<>();

//SudokuSolver37
				Solution sol = new Solution();
//			sol.printTheBoard(sol.input);

		sol.solveIt(sol.input);


	}

}
