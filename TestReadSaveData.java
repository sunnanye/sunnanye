package com.runoob.text;

public class TestReadSaveData {
	public static void main(String[] args) {
		BusinessA businessA=new BusinessA(new ReadSaveTextFile());
		businessA.saveData("���浽�ı��ļ���");
		BusinessB businessB=new BusinessB(new ReadSaveWordFile());
		businessB.saveData("���浽word�ļ���");
	}
}
