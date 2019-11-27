package fileComparison;

import java.io.File;
import java.util.List;

public class DuplicateDetectorTest {

	public static void main(String[] args) {
		String root = "src/main/java";
		String suffix = "";
		DuplicateDetector detector = new DuplicateDetector(new File(root), suffix);

		List<File> files = detector.getFiles();
		double[][] comparison = detector.fileComparison(true);

		for (int i = 0; i < files.size(); i++) {
			for (int j = 0; j < files.size(); j++) {
				System.out.println(files.get(i) + ", " + files.get(j) + ", " + comparison[i][j]);
			}
		}
	}

}
