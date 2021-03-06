package com.dyn.render.proxy;

import java.util.Map;

import com.dyn.fixins.blocks.decision.DecisionBlockTileEntity;
import com.dyn.fixins.blocks.dialog.DialogBlockTileEntity;
import com.dyn.fixins.blocks.redstone.proximity.ProximityBlockTileEntity;
import com.dyn.fixins.blocks.redstone.timer.TimerBlockTileEntity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

public interface Proxy {

	public Map<String, ?> getKeyBindings();

	public void handleCodeExecutionEnded();

	public void handleErrorMessage(String error, String code, int line);

	public void init();

	public boolean isDialogInterfaceOpen();

	public void openDecisionGui(EntityLivingBase entity, DecisionBlockTileEntity decisionBlockTileEntity);

	public void openEditDecisionBlock(DecisionBlockTileEntity decisionBlock);

	public void openEditDialogInterface(DialogBlockTileEntity block);

	public void openSetProximityInterface(ProximityBlockTileEntity block);

	public void openSetTimerInterface(TimerBlockTileEntity block);

	public void setPlayerSkinTextureName(EntityPlayer player, String texture);

	public void toggleDialogHud(EntityLivingBase entity, boolean state, String text, int duration, boolean interupt);

	public void toggleRenderProgramInterface(boolean state);
}