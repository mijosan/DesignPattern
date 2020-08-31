package designpattern.composite;

public class Main {

	public static void main(String[] args) {
		Folder
		root = new Folder("root"),
		home = new Folder("home"),
		taesan = new Folder("taesan"),
		music = new Folder("music"),
		picture = new Folder("picture"),
		doc = new Folder("doc"),
		usr = new Folder("usr");
		
		File
		track1 = new File("track1"),
		track2 = new File("track2"),
		pic1 = new File("pic1"),
		doc1 = new File("doc1"),
		java = new File("java");
		
		root.addComponent(home);
			home.addComponent(taesan);
				taesan.addComponent(music);
					music.addComponent(track1);
					music.addComponent(track2);
				taesan.addComponent(picture);
					picture.addComponent(pic1);
				taesan.addComponent(doc1);
					doc.addComponent(doc1);
					
		root.addComponent(usr);
			usr.addComponent(java);
			
		show(root);
	}
	
	/*
	 * 클래스 이름 | 객체 이름
	 * 재귀적으로 호출해서 출력한다.
	 */
	private static void show(Component component) {
		System.out.println(component.getClass().getName() + "|" + component.getName());
		if(component instanceof Folder) {
			for(Component c : ((Folder)component).getChildren()) {
				show(c);
			}
		}
	}

}
