

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

    String currentWord;

    public void Count(char c)
    {
        switch(state)
        {
            case Normal:
                if(IsInvalid(c))break;
                else {
                    if(IsChar(c))state=State.Stat;
                    break;
                }

            case Stat:


                break;

                default: break;
        }
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
