package net.kappamc.legacylauncher;

public interface IClassTransformer {
    byte[] transform(String name, String transformedName, byte[] basicClass);
}
