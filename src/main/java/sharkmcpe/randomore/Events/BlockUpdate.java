package sharkmcpe.randomore.Events;

import cn.nukkit.block.*;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.block.BlockUpdateEvent;
import cn.nukkit.math.BlockFace;
import sharkmcpe.randomore.Math.RandomInteger;

public class BlockUpdate implements Listener {

    public static int i;
    public Block Near;

    @EventHandler
    public void blockset(BlockUpdateEvent event){
        Block block = event.getBlock();
        boolean water = false;
        boolean lava = false;
        for (i = 2; i <= 5; i++){
            Near = block.getSide(BlockFace.fromIndex(i));
            if(Near instanceof BlockWater){
                water = true;
            } else {
                if (Near instanceof BlockLava){
                    lava = true;
                }
            }
            if(water && lava){
                int i = RandomInteger.rand(1,6);
                Block newblock = Block.get(0);
                switch (i) {
                    case 1:
                        newblock = new BlockOreIron();
                        break;
                    case 2:
                        newblock = new BlockOreDiamond();
                        break;
                    case 3:
                        newblock = new BlockOreCoal();
                        break;
                    case 4:
                        newblock = new BlockOreLapis();
                        break;
                    case 5:
                        newblock = new BlockOreGold();
                        break;
                    case 6:
                        newblock = new BlockOreEmerald();
                        break;
                    case 7:
                        newblock = new BlockCobblestone();
                        break;
                    case 8:
                        newblock = new BlockCobblestone();
                        break;
                    case 9:
                        newblock = new BlockCobblestone();
                        break;
                    case 10:
                        newblock = new BlockCobblestone();
                        break;
                    default:
                        newblock = new BlockCobblestone();
                        break;
                }
                block.getLevel().setBlock(block, newblock, true, false);
                return;
            }
        }
    }
}
