import java.util.ArrayList;
import java.util.List;

class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo(int indent) {
        System.out.println(" ".repeat(indent) + "File: " + name);
    }
}

class Folder {
    private String name;
    private List<File> files;
    private List<Folder> subfolders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subfolders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<Folder> getSubfolders() {
        return subfolders;
    }

    public void setSubfolders(List<Folder> subfolders) {
        this.subfolders = subfolders;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addSubfolder(Folder subfolder) {
        subfolders.add(subfolder);
    }

    public void printStructure(int indent) {
        System.out.println(" ".repeat(indent) + "Folder: " + name);
        for (File file : files) {
            file.printInfo(indent + 2);
        }
        for (Folder subfolder : subfolders) {
            subfolder.printStructure(indent + 2);
        }
    }

    public boolean deleteFolder(String folderName) {
        for (Folder subfolder : subfolders) {
            if (subfolder.name.equals(folderName)) {
                subfolders.remove(subfolder);
                return true;
            } else if (subfolder.deleteFolder(folderName)) {
                return true;
            }
        }
        return false;
    }
}

public class FileSystemDriver {
    public static void main(String[] args) {
        // Creating the file system structure
        Folder phpDemo1 = new Folder("phpDemo1");

        Folder sourceFiles = new Folder("sourceFiles");
        phpDemo1.addSubfolder(sourceFiles);

        Folder phplcon = new Folder(".phplcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        sourceFiles.addSubfolder(phplcon);
        sourceFiles.addSubfolder(app);
        app.addSubfolder(config);
        app.addSubfolder(controllers);
        app.addSubfolder(library);
        app.addSubfolder(migrations);
        app.addSubfolder(models);
        app.addSubfolder(views);

        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        sourceFiles.addSubfolder(cache);
        sourceFiles.addSubfolder(publicFolder);

        File htaccess = new File(".htaccess");
        File htrouterPhp = new File(".htrouter.php");
        File indexHtml = new File("index.html");
        sourceFiles.addFile(htaccess);
        sourceFiles.addFile(htrouterPhp);
        sourceFiles.addFile(indexHtml);

        Folder includePath = new Folder("includePath");
        Folder remoteFiles = new Folder("remoteFiles");
        phpDemo1.addSubfolder(includePath);
        phpDemo1.addSubfolder(remoteFiles);

        // Printing the initial structure
        System.out.println("Initial Structure:");
        phpDemo1.printStructure(0);
        System.out.println("\n-------------------------------------------------");

        // Deleting the folder 'app' and printing the updated structure
        phpDemo1.deleteFolder("app");
        System.out.println("\nStructure after deleting 'app' folder:");
        phpDemo1.printStructure(0);
        System.out.println("\n-------------------------------------------------");

        // Deleting the folder 'public' and printing the updated structure
        phpDemo1.deleteFolder("public");
        System.out.println("\nStructure after deleting 'public' folder:");
        phpDemo1.printStructure(0);
    }
}
