package com.carpentersblocks.data;

import com.carpentersblocks.tileentity.TEBase;
import net.minecraftforge.common.util.ForgeDirection;

public interface ISided {

    /**
     * Sets block direction.
     *
     * @param  TE the {@link TEBase}
     * @param  side the side
     * @return <code>true</code> if direction not already set
     */
    public boolean setDirection(TEBase TE, ForgeDirection dir);

    /**
     * Gets block direction.
     *
     * @param  TE the {@link TEBase}
     * @return the {@link ForgeDirection}
     */
    public ForgeDirection getDirection(TEBase TE);
}
