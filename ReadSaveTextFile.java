package com.runoob.text;

public class ReadSaveTextFile implements IReadSaveData {

	@Override
	public void saveData(String data) {
		// TODO Auto-generated method stub
       System.out.println("将数据保存到了文本文件中");
}
	@Override
	public String getData() {
		// TODO Auto-generated method stub
		System.out.println("从文本文件中读取了数据");
		return null;
	}
}
