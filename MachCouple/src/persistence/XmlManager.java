package persistence;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import model.Affinity;
import model.Egender;
import model.User;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import utility.Utility;

public class XmlManager {
	
	/**
	 * Este metodo lee una archivo Xml de la raiz del programa, esta contiene todos los objetos User y los devuelve
	 * en una arrayList de user
	 * @return
	 */
	public static ArrayList<User> readXml(){
		ArrayList<User> users = new ArrayList<User>();
		SAXBuilder builder = new SAXBuilder();
		File file = new File("data/UsersXML.xml");
		try {
			Document doc = builder.build(file);
			Element root = doc.getRootElement();
			for (int i = 0; i < root.getChildren("user").size(); i++) {
				int id = Integer.valueOf(root.getChildren("user").get(i).getChildText("id"));
				String name = root.getChildren("user").get(i).getChildText("name");
				int age = Integer.valueOf(root.getChildren("user").get(i).getChildText("age"));
				Egender egender = validateGender(root.getChildren("user").get(i).getChildText("gender"));
				String likeSport = root.getChildren("user").get(i).getChildText("likeSport").toString();
				String likeKids = root.getChildren("user").get(i).getChildText("likeKids").toString();
				users.add(new User(id,name,(byte)age,egender,new Affinity(Utility.isFalse(likeSport),Utility.isFalse(likeKids))));
			}
		} catch (JDOMException | IOException e) {
			
			
		}
		
		return users;
	}
	/**
	 * Este metodo guarda en el archivo Xml un user que entra por parametro
	 * @param user user a guardar en el Xml
	 */
	public static void SaveXmlPlayer(User user){
		ArrayList<User> arrayUsers = new ArrayList<User>();
		File file = new File("data/UsersXML.xml");
		if(file.exists()){
		     arrayUsers = XmlManager.readXml();
			arrayUsers.add(user);
			SaveXmlGroup(arrayUsers);
		}else{
			arrayUsers.add(user);
			SaveXmlGroup(arrayUsers);
		}
	}
	/**
	 * Este metodo recibe un arrayList de user y lo guarda en un Xml
	 * @param Users Array a guardar
	 */
	public static void SaveXmlGroup(ArrayList<User> Users){
		
		try{
		File file = new File("data/UsersXML.xml");
		
			FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		Document doc = new Document();
		Element theRoot = new Element("Users");
		doc.setRootElement(theRoot);
		
		
		for (User user: Users) {
			Element userXml = new Element("user");
			Element id = new Element("id");
			Element name = new Element("name");
			Element age = new Element("age");
			Element gender = new Element("gender");
			Element likeSport =  new Element("likeSport");
			Element likeKids = new Element("likeKids");
			
			id.addContent(""+user.getId());
			name.addContent(user.getName());
			age.addContent(""+user.getAge());
			gender.addContent(""+user.getGender().name());
			likeSport.addContent(""+user.getAffinity().isLikeSport());
			likeKids.addContent(""+ user.getAffinity().isLikeKids());
			
			
			userXml.addContent(id);
			userXml.addContent(name);
			userXml.addContent(age);
			userXml.addContent(gender);
			userXml.addContent(likeSport);
			userXml.addContent(likeKids);
	
			

			theRoot.addContent(userXml);
		}
		
		XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());
		xmlOutput.output(doc, fileOutputStream);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static Egender validateGender(String string){
		if(string.equals("MALE"))
			return Egender.MALE;
		else{
			return Egender.FEMALE;
		}
	}
}
