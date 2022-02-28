package Printing;

abstract public class Printing{
    String Name;
    int PageCount;
    Printing(String Name, int PageCount) throws Exception{
        setName(Name);
        setPageCount(PageCount);
    }

    public void showInfo(){

        System.out.printf("Name: %s\nPages: %d\n", Name, PageCount);
    }
    public  String getName(){

        return Name;
    }
    private void setName(String name) throws Exception{
        if (name == null || name.length() < 1){
            throw new Exception("Name can't be empty or less then one symbol");}
        this.Name = name.substring(0, 1).toUpperCase() +
                name.substring(1);
    }
    public int getPageCount(){

        return PageCount;
    }
    private  void setPageCount(int pages) throws Exception{
        if (pages < 1)
            throw new Exception("Number of pages can't be less then one");
        this.PageCount = pages;
    }
}
