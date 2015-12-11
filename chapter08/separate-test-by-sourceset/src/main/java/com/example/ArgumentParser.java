package com.example;

import java.util.regex.Pattern;

public class ArgumentParser {
	
	public Parameter parse(String[] args) {
		Parameter param = new Parameter();
		for(String arg : args) {
			if(Pattern.matches("\\d{2}+", arg)) {
				param.code = Integer.parseInt(arg);
				continue;
			}
			if("ピンフ".equals(arg) || "ピン".equals(arg)) {
				param.peace = true;
			}
			if("ツモ".equals(arg)) {
				param.tsumo = true;
			}
			param.hansu ++;
		}
		if(!param.peace && param.tsumo) {
			param.code += 2;
		}
		return param;
	}
}
