package com.johnb.johnsfirstplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandKit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args[0] == "test") {
            if (sender instanceof Player) {
                Player player = (Player) sender;

                // Create a new ItemStack (type: diamond)
                ItemStack diamond = new ItemStack(Material.DIAMOND);

                // Create a new ItemStack (type: brick)
                ItemStack bricks = new ItemStack(Material.BRICK);

                // Set the amount of the ItemStack
                bricks.setAmount(20);

                // Give the player our items (comma-separated list of all ItemStack)
                player.getInventory().addItem(bricks, diamond);
            }
        } else {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.RED + "Sorry! That kit doesn't exist.");
            player.sendMessage(ChatColor.GREEN + "These are the existing kits:");
            player.sendMessage(ChatColor.GRAY + "-" + ChatColor.GREEN + "Test");
        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}
