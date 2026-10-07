package Composition;

public class Driver 
{
    public static void main(String[] args) 
    {
        Folder root = new Folder("php_demo1");

        Folder source = root.addFolder("Source Files");
        source.addFolder(".phalcon");

        Folder app = source.addFolder("app");
        app.addFolder("config");
        app.addFolder("controllers");
        app.addFolder("library");
        app.addFolder("migrations");
        app.addFolder("models");
        app.addFolder("views");

        source.addFolder("cache");
        source.addFolder("public");
        source.addFile(".htaccess");
        source.addFile(".htrouter.php");
        source.addFile("index.html");

        root.addFolder("Include Path");
        root.addFolder("Remote Files");

        System.out.println("=== Full structure ===");
        root.print();

        System.out.println("\n=== After deleting 'app' ===");
        root.deleteFolder("app");
        root.print();

        System.out.println("\n=== After deleting 'public' ===");
        root.deleteFolder("public");
        root.print();
    }
}