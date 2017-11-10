package iunius118.mods.ccpocketentityscanner;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = CCPocketEntityScanner.MOD_ID, name = CCPocketEntityScanner.MOD_NAME, version = CCPocketEntityScanner.MOD_VERSION, dependencies = CCPocketEntityScanner.MOD_DEPENDENCIES, useMetadata = true)
public class CCPocketEntityScanner
{
    public static final String MOD_ID = "ccpocketentityscanner";
    public static final String MOD_NAME = "CCPocketEntityScanner";
    public static final String MOD_VERSION = "${version}";
    public static final String MOD_DEPENDENCIES = "required-after:forge@[1.12-14.21.1.2387,)";
}
