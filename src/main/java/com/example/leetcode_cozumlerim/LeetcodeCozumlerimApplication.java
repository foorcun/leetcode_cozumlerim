package com.example.leetcode_cozumlerim;

import com.example.leetcode_cozumlerim.ReorderList143.Solution;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class LeetcodeCozumlerimApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeetcodeCozumlerimApplication.class, args);

		Solution sol = new Solution();
		sol.reorderList();


		Map<String,Integer> m = new HashMap<>();
	}

}
