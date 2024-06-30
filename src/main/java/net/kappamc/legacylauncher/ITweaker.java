package net.kappamc.legacylauncher;

import java.io.File;
import java.util.List;

public interface ITweaker {

    void acceptOptions(List<String> args, File gameDir, File assetsDir, String profile);

    void injectIntoClassLoader(LaunchClassLoader classLoader);

    String getLaunchTarget();

    String[] getLaunchArguments();

}
