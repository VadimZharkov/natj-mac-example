import apple.NSObject;
import apple.appkit.NSApplication;
import apple.appkit.NSMenu;
import apple.appkit.NSMenuItem;
import apple.appkit.NSWindow;
import apple.coregraphics.c.CoreGraphics;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSAutoreleasePool;
import apple.foundation.NSProcessInfo;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;

import static apple.appkit.enums.Enums.*;

public class Application extends NSObject {
    static { NatJ.register(); }

    protected Application(Pointer peer) {
        super(peer);
    }

    @Selector("alloc")
    public static native Application alloc();

    @Selector("init")
    public native Application init();

    @Selector("run")
    public void run() {
        NSAutoreleasePool pool = NSAutoreleasePool.alloc().init();
        NSApplication nsApp = NSApplication.sharedApplication();
        nsApp.setActivationPolicy(NSApplicationActivationPolicyRegular);

        NSWindow window = NSWindow.alloc().initWithContentRectStyleMaskBackingDefer(
                new CGRect(new CGPoint(0, 0), new CGSize(300, 300)),
                NSTitledWindowMask, NSBackingStoreBuffered, false
        );
        window.setTitle("Hello NatJ");
        window.center();
        window.makeKeyAndOrderFront(null);

        nsApp.activateIgnoringOtherApps(true);
        nsApp.run();
    }
}
