import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.*;

class FileDumper {

	private String path;
	private boolean appendIt = false;

	public FileDumper(String file_path) {

		path = file_path;

	}

	public FileDumper(String file_path, boolean append) {

		path = file_path;
		appendIt = append;

	}

//	public void dumpFile(ArrayList<DefaultContact> linesToWrite) throws IOException {
	public void dumpFile(ArrayList<DefaultContact> myContactList) throws IOException {


		FileWriter outStream = new FileWriter(path, appendIt);
		PrintWriter outBuffer = new PrintWriter(outStream);

		for (DefaultContact line : myContactList) {

			String foo = line.toString();
//			if (foo.contains("First")) {
			outBuffer.print(foo);
		}

		outBuffer.close();

	}

}
