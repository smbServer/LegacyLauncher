package net.kappamc.legacylauncher;

public interface IClassNameTransformer {

    String unmapClassName(String name);

    String remapClassName(String name);

}
