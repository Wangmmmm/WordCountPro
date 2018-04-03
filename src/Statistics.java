import sun.font.TrueTypeFont;

public class Statistics {
    enum State
    {
        Normal,
        Stat
    }
    State state;
    public Statistics()
    {
        state=State.Normal;

    }

    public void Count(char c)
    {

    }
    public void End()
    {

    }

    boolean IsChar(char c)
    {
        if (c>='a'&&c<='z')
            return true;
        else return false;
    }

    boolean IsBar(char c)
    {
        if(c=='-')return true;
        else return false;
    }
    boolean IsInvalid(char c)
    {
        if (!IsChar(c)&&!IsBar(c))
            return true;
        else return false;
    }



}
