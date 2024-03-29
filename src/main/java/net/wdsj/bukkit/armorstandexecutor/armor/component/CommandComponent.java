package net.wdsj.bukkit.armorstandexecutor.armor.component;

import net.wdsj.bukkit.armorstandexecutor.utils.BukkitUtils;
import org.bukkit.entity.Player;

/**
 * @author Arthur
 * @version 1.0
 * @date 2019/10/25 18:02
 */
public class CommandComponent extends ArmorComponent {

    public CommandComponent(String key) {
        super(key);
    }

    @Override
    public boolean execute(Player player, String value) {
        for (String s : format(player, value)) {
            BukkitUtils.executeCommand(s.replace("{player}", player.getName()), player);
        }
        return true;
    }


}
