package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entities.Comment;
import Entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Isso é muito legal");
		Comment c2 = new Comment("Uau, me diz como faz");
		
		Post p1 = new Post(
				 sdf.parse("21/06/2023 13:05:44"), 
				"Navegando pela praia", 
				"Praia de guaruja",
				123
		);
		
		p1.AddComment(c2);
		p1.AddComment(c1);
		
		System.out.println(p1);
	}

}
