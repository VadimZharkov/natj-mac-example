import org.moe.natj.objc.SEL;

public class Main {

    public static void main(String[] args) {
        Application app = Application.alloc().init();
        app.performSelectorOnMainThreadWithObjectWaitUntilDone(new SEL("run"), null, true);
    }
}
