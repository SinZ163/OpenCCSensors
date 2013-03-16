package forestry.api.arboriculture;

import java.util.Collection;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.EnumPlantType;
import forestry.api.genetics.IAlleleSpecies;
import forestry.api.genetics.IFruitFamily;

public interface IAlleleTreeSpecies extends IAlleleSpecies {

	/**
	 * @return Native plant type of this species.
	 */
	EnumPlantType getPlantType();

	/**
	 * @return List of all {@link IFruitFamily}s which can grow on leaves generated by this species.
	 */
	Collection<IFruitFamily> getSuitableFruit();
	
	/**
	 * @return Trunk girth. 1 = 1x1, 2 = 2x2, etc.
	 */
	int getGirth();
	
	/**
	 * @param tree
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * @return Tree generator for the tree at the given location.
	 */
	WorldGenerator getGenerator(ITree tree, World world, int x, int y, int z);

	/**
	 * @return All available generator classes for this species.
	 */
	Class<? extends WorldGenerator>[] getGeneratorClasses();

	/* TEXTURES AND OVERRIDES */
	
	int getGermlingIconIndex(EnumGermlingType type);

	int getLeafTextureIndex(ITree tree, boolean fancy);

}
