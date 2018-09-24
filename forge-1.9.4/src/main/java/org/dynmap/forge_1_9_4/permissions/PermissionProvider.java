package org.dynmap.forge_1_9_4.permissions;

import java.util.Set;

import net.minecraft.command.ICommandSender;

public interface PermissionProvider {
    boolean has(ICommandSender sender, String permission);
    boolean hasPermissionNode(ICommandSender sender, String permission); 
    
    Set<String> hasOfflinePermissions(String player, Set<String> perms);

    boolean hasOfflinePermission(String player, String perm);

}
