package Composition;

import java.util.ArrayList;

public class Folder 
{
    private String name;
    private final ArrayList<File> files = new ArrayList<>();
    private final ArrayList<Folder> subFolders = new ArrayList<>();

    public Folder(String name) 
    {
        this.name = name;
    }

    public String getName() 
    { 
        return name;
    }

    public void setName(String name) 
    { 
        this.name = name; 
    }

    public ArrayList<File> getFiles() 
    { 
        return files; 
    }

    public ArrayList<Folder> getSubFolders() 
    { 
        return subFolders; 
    }

    public File addFile(String fileName) 
    {
        File f = new File(fileName);
        files.add(f);
        return f;
    }

    public Folder addFolder(String folderName) 
    {
        Folder f = new Folder(folderName);
        subFolders.add(f);
        return f;
    }

    private void destroy() 
    {
        for (Folder f : subFolders) 
        {
            f.destroy();
        }
        subFolders.clear();
        files.clear();
    }

    public boolean deleteFolder(String folderName) 
    {
        for (int i = 0; i < subFolders.size(); i++) 
        {
            Folder f = subFolders.get(i);
            if (f.getName().equals(folderName)) 
            {
                f.destroy();
                subFolders.remove(i);
                return true;
            }
            if (f.deleteFolder(folderName)) 
            {
                return true;
            }
        }
        return false;
    }

    public void print() 
    {
        print("");
    }

    public void print(String indent) 
    {
        System.out.println(indent + "[" + name + "]");
        for (Folder f : subFolders) 
        {
            f.print(indent + "    ");
        }
        for (File f : files) 
        {
            f.print(indent + "    ");
        }
    }
}