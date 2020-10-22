package test;

public class Book {
	private String title,type;
	private int pageNum;
	Book(String title,int pageNum,String type){
		this.title = title;
		this.pageNum = pageNum;
		this.type = type;
	}
	
	Book(int pageNum,String type){
		title = "计算机";
		this.pageNum = pageNum;
		this.type = type;
	}
	
	void showInfo(){
		System.out.println("书本名称：" + title + "; 页数:" + pageNum + "; 种类:" + type);
	}

}
