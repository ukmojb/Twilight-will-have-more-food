package com.wdcftgg.twhmf.Items;

import com.wdcftgg.twhmf.Init.ModItems;
import com.wdcftgg.twhmf.Main;
import com.wdcftgg.twhmf.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Fiddleheadstew extends Item implements IHasModel {
    public Fiddleheadstew(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registryItemRender(){
        Main.Proxy.registryModel(this, 0,"inventory");
    }
}
