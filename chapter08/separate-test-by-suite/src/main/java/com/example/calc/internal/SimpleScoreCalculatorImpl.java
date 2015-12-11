package com.example.calc.internal;

import com.example.calc.Calculator;

public class SimpleScoreCalculatorImpl implements Calculator {
	
	public SimpleScoreCalculatorImpl() {
		System.out.println("created");
	}
	
    private static final int[][] SCORE_TABLES = {
        {-1,   -1, 1300, 2600, 5200, 8000},
        {-1, 1000, 2000, 3900, 7700, 8000},
        {-1, 1300, 2600, 5200, 8000, 8000},
        {-1, 1600, 3200, 6400, 8000, 8000},
        {-1, 2000, 3900, 7700, 8000, 8000},
        {-1, 2300, 4500, 8000, 8000, 8000},
        {-1, 2600, 5200, 8000, 8000, 8000}
    };

    public int calculate(int code, int hansu, boolean tsumo, boolean peace) {
	    
	    validateParams(code, hansu, tsumo, peace);
	    
	    int index = getIndexOfCode(code);
	    
	    return SCORE_TABLES[index][hansu];
    }

	void validateParams(int code, int hansu, boolean tsumo, boolean peace) {
	    if(code < 20 || 80 < code) {
	        // error
	    }
	    if(hansu < 1 || 5 <hansu) {
	        // error
	    }
	    
	    if(tsumo && peace) {
	        if(hansu < 2 || code != 20) {
	            //error
	        }
	    }
	}
	
	int getIndexOfCode(int code) {
	    if(code == 20) {
	        return 0;
	    } else if(20 < code && code <= 30) {
	        return 1;
	    } else if(30 < code && code <= 40) {
	        return 2;
	    } else if(40 < code && code <= 50) {
	        return 3;
	    } else if(50 < code && code <= 60) {
	        return 4;
	    } else if(60 < code && code <= 70) {
	        return 5;
	    } else if(70 < code && code <= 80) {
	        return 6;
	    } else {
	        return -1;
	    }
	}
}
