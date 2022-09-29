package UE08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Lecture {
	
	private String number = "";
	private String title = "";
	private String shortTitle = "";
	private String semester = "";
	private List<Lecturer> lecturers = new ArrayList<>();
	private List<Date> schedule = new ArrayList<>();

	public Lecture(String number, String title, String shortTitle, String semester) {
		super();
		this.number = number;
		this.title = title;
		this.shortTitle = shortTitle;
		this.semester = semester;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortTitle() {
		return shortTitle;
	}

	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public List<Lecturer> getLecturers() {
		return lecturers;
	}

	public List<Date> getSchedule() {
		return schedule;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(number);
		result.append(": ");
		result.append(title);
		result.append(" (");
		result.append(shortTitle);
		result.append("), ");
		result.append(semester);
		result.append("\n\t");
		for (int i = 0; i < lecturers.size(); i++) {
			if (i > 0) {
				result.append(", ");
			}
			result.append(lecturers.get(i));
		}
		for (Date date : schedule) {
			result.append("\n\t- ");
			result.append(date);
		}
		result.append("\n");
		return result.toString();
	}
	
	public static Lecture load(String filename) throws IOException {
		Lecture result = null;
		InputStream in = null;
		try {
			in = new FileInputStream(filename);
			result = load(in);
		} finally {
			if (in != null) {
				in.close();
			}
		}
		return result;
	}

	public static Lecture load(InputStream in) throws IOException {

		DataInputStream input = null;
		Lecture lecture;
		try{
		input = new DataInputStream(new BufferedInputStream(in));
		Lecture lectureTmp = new Lecture(input.readUTF(), input.readUTF(), input.readUTF(), input.readUTF());
		int lecturerSize = input.readInt();
		for(int i = 0; i < lecturerSize; i++){
		lectureTmp.lecturers.add(new Lecturer(input.readUTF(),input.readUTF()));
		}
		int scheduleSize = input.readInt();
		for(int i = 0; i < scheduleSize; i++){
		lectureTmp.schedule.add(new Date(input.readInt(), input.readInt(),input.readInt(),input.readInt(), input.readUTF()));

		int topicsSize = input.readInt();
			for(int ind = 0; ind < topicsSize; ind++){
				lectureTmp.schedule.get(i).getTopics().add(input.readUTF());
			}


		}

		lecture = lectureTmp;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	return lecture;
	}


	public static void saveText(String filename, Lecture data) throws IOException {	// task 2 a)
	try{

	DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\Users\\jan-a\\IdeaProjects\\OMP\\src\\UE08\\" + filename)));		// path to copy to

	String nl = System.getProperty("line.separator");		// workaround for a new line because \n doesn't work with DataOutputStream and corrupts the textfile
	out.writeUTF( "number:" + data.getNumber() + nl);		// write all attributes to txt file
	out.writeUTF("title:" + data.getTitle() + nl);
	out.writeUTF("short title:" + data.getShortTitle() + nl);
	out.writeUTF("semester:" + data.getSemester() + nl);
	out.writeUTF("lecturer:");

	for(int i = 0; i < data.getLecturers().size(); i++){			// loop to get all lecturers
	out.writeUTF(data.getLecturers().get(i).getFirstName() + " " + data.getLecturers().get(i).getLastName() + ",");
	}
	out.writeUTF("date:");
	int topicsSize;
			for(int i = 0; i < data.schedule.size(); i++){			// loop to write all dates (if multiples exist)
			out.writeInt(data.schedule.get(i).getYear());
			out.writeInt(data.schedule.get(i).getMonth());
			out.writeInt(data.schedule.get(i).getDay());
			out.writeInt(data.schedule.get(i).getHour());
			out.writeUTF(data.schedule.get(i).getLectureHall());
			topicsSize = data.schedule.get(i).getTopics().size();
			for(int ind = 0; ind < topicsSize; ind++){				// loop through all topics
			out.writeUTF(data.schedule.get(i).getTopics().get(ind));
			}

			}
	//out.writeUTF(data.toString()); // takes given overriden String method to instantly put everything in the text file
	out.close();	//close stream
	} catch (IOException e){
	}

	}

	}



	//public static Lecture loadText(String filename) throws IOException {
		//TODO: implement this (task 2)
	//}
//}
