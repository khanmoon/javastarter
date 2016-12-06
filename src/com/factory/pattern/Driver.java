package com.factory.pattern;

import javax.swing.JOptionPane;

public class Driver {
	public static void main(String[] args) {
		String ans;
		Animal an=null;
		Factory f=new Factory();
		ans = JOptionPane.showInputDialog("input enter");
		an=f.name(ans);
		an.behaviour.behaviour();
	}
}
