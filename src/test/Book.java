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
		title = "�����";
		this.pageNum = pageNum;
		this.type = type;
	}
	
	void showInfo(){
		System.out.println("�鱾���ƣ�" + title + "; ҳ��:" + pageNum + "; ����:" + type);
	}

}
