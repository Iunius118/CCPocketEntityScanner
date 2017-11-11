/** Copyright (c) 2017, Iunius118 https://github.com/Iunius118
 *
 * This file is part of CCPocketEntityScanner API and distributed under the terms of the MIT License.
 */
package iunius118.mods.ccpocketentityscanner.api;

import javax.annotation.Nullable;

import dan200.computercraft.api.lua.ILuaObject;
import net.minecraft.entity.player.EntityPlayer;

public interface ILuaObjectProvider
{

    @Nullable
    ILuaObject getLuaObject(@Nullable EntityPlayer player);

}
