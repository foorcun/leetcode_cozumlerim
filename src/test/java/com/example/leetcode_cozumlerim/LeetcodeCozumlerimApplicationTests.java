package com.example.leetcode_cozumlerim;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeetcodeCozumlerimApplicationTests {

	@Test
	void contextLoads() {

		char[][] board =  {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};

		String word = "ABCCED";

		Assertions.assertEquals(board[0][0],word.charAt(0));
		Assertions.assertEquals(true,word.charAt(0)==board[0][0]);
	}

	@Test
	void charString(){

		String s = "adsf";
		String c = String.valueOf(s.charAt(0));
		System.out.println(c);

	}

}
