/*
 * Copyright (c) bdew, 2013 - 2014
 * https://github.com/bdew/gendustry
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://raw.github.com/bdew/gendustry/master/MMPL-1.0.txt
 */

package net.bdew.gendustry.config

import net.bdew.lib.config.FluidManager
import net.bdew.gendustry.mutagen.FluidMutagen
import net.bdew.gendustry.Gendustry

object Fluids extends FluidManager(Config.IDs) {
  val mutagen: FluidMutagen = regFluid(new FluidMutagen)
  Gendustry.logInfo("Fluids loaded")
}
