public class TitledPerson extends Person
{
    private String title;
    public TitledPerson()
    {
        super();
        title = "no title yet";
    }
    public TitledPerson(String initialName, String initialTitle)
    {
        super(initialName);
        title = initialTitle;
    }
    public void reset(String newName, String newTitle)
    {
        setName(newName);
        title = newTitle;
    }
    public void writeOutput()
    {
       super.writeOutput();
       System.out.println("Title: " + title);
    }
    public boolean equal(TitledPerson otherTitlePerson)
    {
        return hasSameName(otherTitlePerson) &&
                title.equalsIgnoreCase(otherTitlePerson.title);
    }
    public void setTitle(String newtitle)
    {
        title = newtitle;
    }
    public String getTitle()
    {
        return  title;
    }

}
