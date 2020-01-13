package l3;

public class Main {

	public static void main(String[] args) throws Exception {
		
		/*Section cap11 = new Section("Capitolul 1");
		cap11.add(new Paragraph("Moto capitol"));
		cap11.add(new Paragraph("Another One"));
		cap11.add(new Paragraph("Another Two"));
		cap11.add(new Paragraph("Another Three"));
		DocumentManager.getInstance().setSectiune(cap11);
		System.out.println("Book Content: ");
		DocumentManager.getInstance().getSectiune().print();

		new DeleteCommand().Execute();
		System.out.println("Book Content after the first delete: ");
		DocumentManager.getInstance().getSectiune().print();
		new DeleteCommand().Execute();
		System.out.println("Book Content after the second delete: ");
		DocumentManager.getInstance().getSectiune().print();

		Command undoCommand = new UndoCommand();
		undoCommand.Execute();
		System.out.println("Book Content after first undo: ");
		DocumentManager.getInstance().getSectiune().print();
		undoCommand.Execute();
		System.out.println("Book Content after second undo: ");
		DocumentManager.getInstance().getSectiune().print();
		*/
		/*Book noapteBuna = new Book("Noapte buna, copii!");
		Author rpGheo = new Author("Radu Pavel Gheo");
		noapteBuna.addAuthor(rpGheo);
		Section cap1 = new Section("Capitolul 1");
		Section cap11 = new Section("Capitolul 1.1");
		Section cap111 = new Section("Capitolul 1.1.1");
		Section cap1111 = new Section("Subchapter 1.1.1.1");
		noapteBuna.addContent(new Paragraph("Multumesc celor care au facut posibila......"));
		noapteBuna.addContent(cap1);

		cap1.add(new Paragraph("Moto capitol"));
		cap1.add(cap11);
		cap11.add(new Paragraph("Text from subchapter 1.1"));
		cap11.add(cap111);
		cap111.add(new Paragraph("Text from subchapter 1.1.1"));
		cap111.add(cap1111);
		cap1111.add(new Image("Image subchapter 1.1.1.1"));
		noapteBuna.print();
		*/
		/*
		long startTime = System.currentTimeMillis();
		ImageProxy img1 = new ImageProxy("Pamela Anderson");
		ImageProxy img2 = new ImageProxy("Kim Kardashian");
		ImageProxy img3 = new ImageProxy("Kirby Griffin");
		Section playboyS1 = new Section("Front Cover");
		playboyS1.add(img1);
		Section playboyS2 = new Section("Summer Girls");
		playboyS2.add(img2);
		playboyS2.add(img3);
		Book playboy = new Book("Playboy");
		playboy.addContent(playboyS1);
		playboy.addContent(playboyS2);
		long endTime = System.currentTimeMillis();
		System.out.println("Creation of the content took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing of the section 1 took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing again the section 1 took " + (endTime -
		startTime) + " milliseconds");
		*/
		/*
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		System.out.println("Printing without Alignment");

		System.out.println();
		cap1.print();
		p1.setAlignStrategy(new Center());
		p2.setAlignStrategy(new Right());
		p3.setAlignStrategy(new Left());
		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();
		*/
		/*
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		BookStatistics stats = new BookStatistics();
		cap1.accept(stats);
		stats.printStatistics();
		*/
		/*
		Builder jsonBuilder = new JSONBuilder();
		jsonBuilder.Build();
		Element myBook = jsonBuilder.GetResult();
		myBook.print();
		*/
		/*
		Command cmd1 = new OpenCommand("book.json");
		cmd1.Execute();
		Command cmd2 = new StatisticCommand();
		cmd2.Execute();
		DocumentManager.GetBook().print();
		*/
		/*
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		FirstObserver firstObserver = new FirstObserver();
		SecondObserver secondObserver = new SecondObserver();
		cap1.addObserver(firstObserver);
		cap1.addObserver(secondObserver);
		p1.addObserver(firstObserver);
		p1.addObserver(secondObserver);
		p2.addObserver(firstObserver);
		cap1.setNewValue("CHAPTER 1");
		p1.setNewValue("PARAGRAPH 2");
		p2.setNewValue("PARAGRAPH 3");
		cap1.removeObserver(firstObserver);
		cap1.setNewValue("CHAPTER 1.1");
		*/
		
	}

}
