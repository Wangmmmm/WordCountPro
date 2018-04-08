import java.util.ArrayList;

public class Statistics {
    enum State {
        Normal,
        Stat,
        OneBar,
    }

    State state;
    String currentWord;

    public Statistics() {
        state = State.Normal;
        currentWord = "";
        //   allWords=new ArrayList<String>();
    }
    public void Input(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            Count(s.charAt(i));
        }
        End();
    }
    public ArrayList<String> GetResult()
    {
        ArrayList<String> ss=new ArrayList<String>();
        for (MyString ms:MyString.myStrings
             ) {
            ss.add(ms.string);
        }
        return ss;
    }


    public void Count(char c) {
        if (c >= 'A' && c <= 'Z')
            c = Character.toLowerCase(c);
        switch (state) {
            case Normal:
                if (IsInvalid(c) || IsBar(c)) break;
                else {
                    if (IsChar(c)) {
                        state = State.Stat;
                        currentWord += c;
                    }
                    break;
                }
            case Stat:
                if (IsChar(c)) {
                    currentWord += c;

                } else if (IsBar(c)) {
                    currentWord += c;
                    state = State.OneBar;
                } else if (IsInvalid(c)) {
                    MyString.Insert(currentWord);
                    state = State.Normal;
                    currentWord = "";

                }
                break;
            case OneBar: {
                if (IsChar(c)) {
                    currentWord += c;
                    state=State.Stat;
                } else if (IsBar(c) || IsInvalid(c)) {
                    currentWord=currentWord.substring(0, currentWord.length()-1);
                    MyString.Insert(currentWord);
                    state = State.Normal;
                    currentWord = "";
                }
            }
            default:
                break;
        }
    }

    public void End() {
        Count(' ');
    }

    boolean IsChar(char c) {
        if ((c >= 'a' && c <= 'z'))
            return true;
        else return false;
    }

    boolean IsBar(char c) {
        if (c == '-') return true;
        else return false;
    }

    boolean IsInvalid(char c) {
        if (!IsChar(c) && !IsBar(c))
            return true;
        else return false;
    }


}
