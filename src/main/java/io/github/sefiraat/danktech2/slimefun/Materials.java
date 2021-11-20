package io.github.sefiraat.danktech2.slimefun;

import io.github.sefiraat.danktech2.DankTech2;
import io.github.sefiraat.danktech2.theme.ThemeType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class Materials {

    @Getter
    private static SlimefunItem dankCell1;
    @Getter
    private static SlimefunItem dankCell2;
    @Getter
    private static SlimefunItem dankCell3;
    @Getter
    private static SlimefunItem dankCell4;
    @Getter
    private static SlimefunItem dankCell5;
    @Getter
    private static SlimefunItem dankCell6;
    @Getter
    private static SlimefunItem dankCell7;
    @Getter
    private static SlimefunItem dankCell8;
    @Getter
    private static SlimefunItem dankCell9;

    public static void setup() {

        DankTech2 plugin = DankTech2.getInstance();

        final SlimefunItemStack cell1Core = SlimefunItems.SYNTHETIC_DIAMOND;
        final ItemStack cell1Material = new ItemStack(Material.IRON_INGOT);
        final ItemStack cell2Material = new ItemStack(Material.GOLD_INGOT);
        final ItemStack cell3Material = new ItemStack(Material.IRON_BLOCK);
        final ItemStack cell4Material = new ItemStack(Material.GOLD_BLOCK);
        final ItemStack cell5Material = new ItemStack(Material.DIAMOND);
        final ItemStack cell6Material = new ItemStack(Material.EMERALD);
        final ItemStack cell7Material = new ItemStack(Material.DIAMOND_BLOCK);
        final ItemStack cell8Material = new ItemStack(Material.EMERALD_BLOCK);
        final ItemStack cell9Material = new ItemStack(Material.NETHER_STAR);

        // Cell - 1
        dankCell1 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK2_CELL_1",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "Dank Cell - Tier 1",
                "A Dank Cell serves to provide a way",
                "to make the inside bigger than the",
                "outside."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell1Material, cell1Material, cell1Material,
                cell1Material, cell1Core, cell1Material,
                cell1Material, cell1Material, cell1Material,
            }
        );

        // Cell - 2
        dankCell2 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK2_CELL_2",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "Dank Cell - Tier 2",
                "A Dank Cell serves to provide a way",
                "to make the inside bigger than the",
                "outside."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell2Material, cell2Material, cell2Material,
                cell2Material, dankCell1.getItem(), cell2Material,
                cell2Material, cell2Material, cell2Material,
            }
        );

        // Cell - 3
        dankCell3 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK3_CELL_3",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "Dank Cell - Tier 3",
                "A Dank Cell serves to provide a way",
                "to make the inside bigger than the",
                "outside."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell3Material, cell3Material, cell3Material,
                cell3Material, dankCell2.getItem(), cell3Material,
                cell3Material, cell3Material, cell3Material,
            }
        );

        // Cell - 4
        dankCell4 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK4_CELL_4",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "Dank Cell - Tier 4",
                "A Dank Cell serves to provide a way",
                "to make the inside bigger than the",
                "outside."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell4Material, cell4Material, cell4Material,
                cell4Material, dankCell3.getItem(), cell4Material,
                cell4Material, cell4Material, cell4Material,
            }
        );

        // Cell - 5
        dankCell5 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK5_CELL_5",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "Dank Cell - Tier 5",
                "A Dank Cell serves to provide a way",
                "to make the inside bigger than the",
                "outside."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell5Material, cell5Material, cell5Material,
                cell5Material, dankCell4.getItem(), cell5Material,
                cell5Material, cell5Material, cell5Material,
            }
        );

        // Cell - 6
        dankCell6 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK6_CELL_6",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "Dank Cell - Tier 6",
                "A Dank Cell serves to provide a way",
                "to make the inside bigger than the",
                "outside."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell6Material, cell6Material, cell6Material,
                cell6Material, dankCell5.getItem(), cell6Material,
                cell6Material, cell6Material, cell6Material,
            }
        );

        // Cell - 7
        dankCell7 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK7_CELL_7",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "Dank Cell - Tier 7",
                "A Dank Cell serves to provide a way",
                "to make the inside bigger than the",
                "outside."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell7Material, cell7Material, cell7Material,
                cell7Material, dankCell6.getItem(), cell7Material,
                cell7Material, cell7Material, cell7Material,
            }
        );

        // Cell - 8
        dankCell8 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK8_CELL_8",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "Dank Cell - Tier 8",
                "A Dank Cell serves to provide a way",
                "to make the inside bigger than the",
                "outside."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell8Material, cell8Material, cell8Material,
                cell8Material, dankCell7.getItem(), cell8Material,
                cell8Material, cell8Material, cell8Material,
            }
        );

        // Cell - 9
        dankCell9 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK9_CELL_9",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "Dank Cell - Tier ★",
                "A Dank Cell serves to provide a way",
                "to make the inside bigger than the",
                "outside."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell9Material, cell9Material, cell9Material,
                cell9Material, dankCell8.getItem(), cell9Material,
                cell9Material, cell9Material, cell9Material,
            }
        );

        // Slimefun Registry
        dankCell1.register(plugin);
        dankCell2.register(plugin);
        dankCell3.register(plugin);
        dankCell4.register(plugin);
        dankCell5.register(plugin);
        dankCell6.register(plugin);
        dankCell7.register(plugin);
        dankCell8.register(plugin);
        dankCell9.register(plugin);
    }
}
