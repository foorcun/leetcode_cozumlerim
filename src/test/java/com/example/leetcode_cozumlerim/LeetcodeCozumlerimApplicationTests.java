package com.example.leetcode_cozumlerim;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

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

	@Test
	void array2D(){

		Map<Integer, int[]> hM = new HashMap<>();

		int[][] points = {
				{1,3},
				{-2,2}
		};

//		for(var p : points){
		for(int[] p : points){
			hM.put(p[0],p);

		}

		System.out.println(Arrays.toString(hM.get(1)));

	}

	@Test
	void heapWithArrayData(){
		PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->a[0]-b[0]);

		minHeap.add(new int [] {2,3,4});
		minHeap.add(new int []{1,2,3});

		System.out.println(Arrays.toString(minHeap.poll()));
		System.out.println(Arrays.toString(minHeap.poll()));
	}
}
