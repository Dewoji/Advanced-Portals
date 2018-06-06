package com.sekwah.advancedportals.core.api.services;

import com.sekwah.advancedportals.core.AdvancedPortalsCore;
import com.sekwah.advancedportals.core.api.portal.PortalException;
import com.sekwah.advancedportals.core.entities.PortalLocation;
import com.sekwah.advancedportals.coreconnector.container.PlayerContainer;

public final class PortalTempDataServices {
    
    public void activateCooldown(PlayerContainer player) {
        AdvancedPortalsCore.getInfoLogger().log("PLAYER HAS JOINED TEST");
    }

    public void playerLeave(PlayerContainer player) {
        AdvancedPortalsCore.getInfoLogger().log("PLAYER HAS LEFT TEST");
    }

    public void playerSelectorActivate(PlayerContainer player, PortalLocation blockLoc, boolean leftClick) {

    }

    public void removePlayerSelection(PlayerContainer player) throws PortalException {

    }
}
