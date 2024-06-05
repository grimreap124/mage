package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class ModernHorizons3Commander extends ExpansionSet {

    private static final ModernHorizons3Commander instance = new ModernHorizons3Commander();

    public static ModernHorizons3Commander getInstance() {
        return instance;
    }

    private ModernHorizons3Commander() {
        super("Modern Horizons 3 Commander", "M3C", ExpansionSet.buildDate(2024, 6, 7), SetType.SUPPLEMENTAL);
        this.hasBasicLands = false;

        cards.add(new SetCardInfo("Acidic Slime", 218, Rarity.UNCOMMON, mage.cards.a.AcidicSlime.class));
        cards.add(new SetCardInfo("Adarkar Wastes", 316, Rarity.RARE, mage.cards.a.AdarkarWastes.class));
        cards.add(new SetCardInfo("Aether Hub", 317, Rarity.UNCOMMON, mage.cards.a.AetherHub.class));
        cards.add(new SetCardInfo("Aethergeode Miner", 163, Rarity.RARE, mage.cards.a.AethergeodeMiner.class));
        cards.add(new SetCardInfo("Aethersphere Harvester", 280, Rarity.RARE, mage.cards.a.AethersphereHarvester.class));
        cards.add(new SetCardInfo("Aethersquall Ancient", 174, Rarity.RARE, mage.cards.a.AethersquallAncient.class));
        cards.add(new SetCardInfo("Aetherstorm Roc", 164, Rarity.RARE, mage.cards.a.AetherstormRoc.class));
        cards.add(new SetCardInfo("Aethertide Whale", 175, Rarity.RARE, mage.cards.a.AethertideWhale.class));
        cards.add(new SetCardInfo("Aetherworks Marvel", 281, Rarity.MYTHIC, mage.cards.a.AetherworksMarvel.class));
        cards.add(new SetCardInfo("Akroma's Will", 165, Rarity.RARE, mage.cards.a.AkromasWill.class));
        cards.add(new SetCardInfo("All Is Dust", 152, Rarity.MYTHIC, mage.cards.a.AllIsDust.class));
        cards.add(new SetCardInfo("Altar of the Goyf", 282, Rarity.UNCOMMON, mage.cards.a.AltarOfTheGoyf.class));
        cards.add(new SetCardInfo("Ancient Stirrings", 219, Rarity.COMMON, mage.cards.a.AncientStirrings.class));
        cards.add(new SetCardInfo("Angel of Invention", 166, Rarity.MYTHIC, mage.cards.a.AngelOfInvention.class));
        cards.add(new SetCardInfo("Anger", 208, Rarity.UNCOMMON, mage.cards.a.Anger.class));
        cards.add(new SetCardInfo("Apex Devastator", 220, Rarity.MYTHIC, mage.cards.a.ApexDevastator.class));
        cards.add(new SetCardInfo("Arcane Denial", 176, Rarity.COMMON, mage.cards.a.ArcaneDenial.class));
        cards.add(new SetCardInfo("Arcane Signet", 283, Rarity.COMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Archon of Cruelty", 197, Rarity.MYTHIC, mage.cards.a.ArchonOfCruelty.class));
        cards.add(new SetCardInfo("Artisan of Kozilek", 153, Rarity.UNCOMMON, mage.cards.a.ArtisanOfKozilek.class));
        cards.add(new SetCardInfo("Ash Barrens", 318, Rarity.COMMON, mage.cards.a.AshBarrens.class));
        cards.add(new SetCardInfo("Austere Command", 167, Rarity.RARE, mage.cards.a.AustereCommand.class));
        cards.add(new SetCardInfo("Avenger of Zendikar", 221, Rarity.MYTHIC, mage.cards.a.AvengerOfZendikar.class));
        cards.add(new SetCardInfo("Awakening Zone", 222, Rarity.RARE, mage.cards.a.AwakeningZone.class));
        cards.add(new SetCardInfo("Azlask, the Swelling Scourge", 5, Rarity.MYTHIC, mage.cards.a.AzlaskTheSwellingScourge.class));
        cards.add(new SetCardInfo("Azorius Chancery", 319, Rarity.UNCOMMON, mage.cards.a.AzoriusChancery.class));
        cards.add(new SetCardInfo("Barrowgoyf", 50, Rarity.RARE, mage.cards.b.Barrowgoyf.class));
        cards.add(new SetCardInfo("Basilisk Gate", 320, Rarity.COMMON, mage.cards.b.BasiliskGate.class));
        cards.add(new SetCardInfo("Battlefield Forge", 321, Rarity.RARE, mage.cards.b.BattlefieldForge.class));
        cards.add(new SetCardInfo("Beast Within", 223, Rarity.UNCOMMON, mage.cards.b.BeastWithin.class));
        cards.add(new SetCardInfo("Bident of Thassa", 177, Rarity.RARE, mage.cards.b.BidentOfThassa.class));
        cards.add(new SetCardInfo("Bituminous Blast", 255, Rarity.UNCOMMON, mage.cards.b.BituminousBlast.class));
        cards.add(new SetCardInfo("Blast Zone", 322, Rarity.RARE, mage.cards.b.BlastZone.class));
        cards.add(new SetCardInfo("Bloodbraid Challenger", 70, Rarity.RARE, mage.cards.b.BloodbraidChallenger.class));
        cards.add(new SetCardInfo("Bloodbraid Elf", 256, Rarity.UNCOMMON, mage.cards.b.BloodbraidElf.class));
        cards.add(new SetCardInfo("Bonders' Enclave", 323, Rarity.RARE, mage.cards.b.BondersEnclave.class));
        cards.add(new SetCardInfo("Brawn", 224, Rarity.UNCOMMON, mage.cards.b.Brawn.class));
        cards.add(new SetCardInfo("Broodmate Tyrant", 71, Rarity.RARE, mage.cards.b.BroodmateTyrant.class));
        cards.add(new SetCardInfo("Brudiclad, Telchor Engineer", 257, Rarity.MYTHIC, mage.cards.b.BrudicladTelchorEngineer.class));
        cards.add(new SetCardInfo("Brushland", 324, Rarity.RARE, mage.cards.b.Brushland.class));
        cards.add(new SetCardInfo("Burnished Hart", 284, Rarity.UNCOMMON, mage.cards.b.BurnishedHart.class));
        cards.add(new SetCardInfo("Canyon Slough", 325, Rarity.RARE, mage.cards.c.CanyonSlough.class));
        cards.add(new SetCardInfo("Cascading Cataracts", 326, Rarity.RARE, mage.cards.c.CascadingCataracts.class));
        cards.add(new SetCardInfo("Castle Vantress", 327, Rarity.RARE, mage.cards.c.CastleVantress.class));
        cards.add(new SetCardInfo("Caves of Koilos", 328, Rarity.RARE, mage.cards.c.CavesOfKoilos.class));
        cards.add(new SetCardInfo("Cayth, Famed Mechanist", 6, Rarity.MYTHIC, mage.cards.c.CaythFamedMechanist.class));
        cards.add(new SetCardInfo("Chandra's Ignition", 209, Rarity.RARE, mage.cards.c.ChandrasIgnition.class));
        cards.add(new SetCardInfo("Chittering Dispatcher", 63, Rarity.RARE, mage.cards.c.ChitteringDispatcher.class));
        cards.add(new SetCardInfo("Chromatic Lantern", 285, Rarity.RARE, mage.cards.c.ChromaticLantern.class));
        cards.add(new SetCardInfo("Cinder Glade", 329, Rarity.RARE, mage.cards.c.CinderGlade.class));
        cards.add(new SetCardInfo("Cloudpost", 330, Rarity.COMMON, mage.cards.c.Cloudpost.class));
        cards.add(new SetCardInfo("Coalition Relic", 286, Rarity.RARE, mage.cards.c.CoalitionRelic.class));
        cards.add(new SetCardInfo("Combustible Gearhulk", 210, Rarity.MYTHIC, mage.cards.c.CombustibleGearhulk.class));
        cards.add(new SetCardInfo("Command Tower", 331, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Confiscation Coup", 178, Rarity.RARE, mage.cards.c.ConfiscationCoup.class));
        cards.add(new SetCardInfo("Conversion Apparatus", 76, Rarity.RARE, mage.cards.c.ConversionApparatus.class));
        cards.add(new SetCardInfo("Corrupted Crossroads", 332, Rarity.RARE, mage.cards.c.CorruptedCrossroads.class));
        cards.add(new SetCardInfo("Coveted Jewel", 287, Rarity.RARE, mage.cards.c.CovetedJewel.class));
        cards.add(new SetCardInfo("Crib Swap", 168, Rarity.UNCOMMON, mage.cards.c.CribSwap.class));
        cards.add(new SetCardInfo("Curse of the Swine", 179, Rarity.RARE, mage.cards.c.CurseOfTheSwine.class));
        cards.add(new SetCardInfo("Dakmor Salvage", 333, Rarity.UNCOMMON, mage.cards.d.DakmorSalvage.class));
        cards.add(new SetCardInfo("Dark Depths", 334, Rarity.MYTHIC, mage.cards.d.DarkDepths.class));
        cards.add(new SetCardInfo("Deadbridge Chant", 258, Rarity.MYTHIC, mage.cards.d.DeadbridgeChant.class));
        cards.add(new SetCardInfo("Deathreap Ritual", 259, Rarity.UNCOMMON, mage.cards.d.DeathreapRitual.class));
        cards.add(new SetCardInfo("Decoction Module", 288, Rarity.UNCOMMON, mage.cards.d.DecoctionModule.class));
        cards.add(new SetCardInfo("Deepfathom Skulker", 180, Rarity.RARE, mage.cards.d.DeepfathomSkulker.class));
        cards.add(new SetCardInfo("Demolition Field", 335, Rarity.UNCOMMON, mage.cards.d.DemolitionField.class));
        cards.add(new SetCardInfo("Desert of the Indomitable", 336, Rarity.COMMON, mage.cards.d.DesertOfTheIndomitable.class));
        cards.add(new SetCardInfo("Desert of the Mindful", 337, Rarity.COMMON, mage.cards.d.DesertOfTheMindful.class));
        cards.add(new SetCardInfo("Dreamroot Cascade", 338, Rarity.RARE, mage.cards.d.DreamrootCascade.class));
        cards.add(new SetCardInfo("Dreamstone Hedron", 289, Rarity.UNCOMMON, mage.cards.d.DreamstoneHedron.class));
        cards.add(new SetCardInfo("Drown in Dreams", 181, Rarity.RARE, mage.cards.d.DrownInDreams.class));
        cards.add(new SetCardInfo("Drowner of Hope", 182, Rarity.RARE, mage.cards.d.DrownerOfHope.class));
        cards.add(new SetCardInfo("Dryad of the Ilysian Grove", 225, Rarity.RARE, mage.cards.d.DryadOfTheIlysianGrove.class));
        cards.add(new SetCardInfo("Elder Deep-Fiend", 154, Rarity.RARE, mage.cards.e.ElderDeepFiend.class));
        cards.add(new SetCardInfo("Eldrazi Conscription", 155, Rarity.RARE, mage.cards.e.EldraziConscription.class));
        cards.add(new SetCardInfo("Eldrazi Displacer", 169, Rarity.RARE, mage.cards.e.EldraziDisplacer.class));
        cards.add(new SetCardInfo("Eldrazi Monument", 290, Rarity.MYTHIC, mage.cards.e.EldraziMonument.class));
        cards.add(new SetCardInfo("Eldrazi Temple", 339, Rarity.RARE, mage.cards.e.EldraziTemple.class));
        cards.add(new SetCardInfo("Elvish Rejuvenator", 226, Rarity.COMMON, mage.cards.e.ElvishRejuvenator.class));
        cards.add(new SetCardInfo("Endbringer", 156, Rarity.RARE, mage.cards.e.Endbringer.class));
        cards.add(new SetCardInfo("Era of Innovation", 183, Rarity.UNCOMMON, mage.cards.e.EraOfInnovation.class));
        cards.add(new SetCardInfo("Eternal Witness", 227, Rarity.UNCOMMON, mage.cards.e.EternalWitness.class));
        cards.add(new SetCardInfo("Eureka Moment", 260, Rarity.COMMON, mage.cards.e.EurekaMoment.class));
        cards.add(new SetCardInfo("Evacuation", 184, Rarity.RARE, mage.cards.e.Evacuation.class));
        cards.add(new SetCardInfo("Everflowing Chalice", 291, Rarity.UNCOMMON, mage.cards.e.EverflowingChalice.class));
        cards.add(new SetCardInfo("Evolving Wilds", 340, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Exotic Orchard", 341, Rarity.RARE, mage.cards.e.ExoticOrchard.class));
        cards.add(new SetCardInfo("Expedition Map", 292, Rarity.COMMON, mage.cards.e.ExpeditionMap.class));
        cards.add(new SetCardInfo("Faithless Looting", 211, Rarity.COMMON, mage.cards.f.FaithlessLooting.class));
        cards.add(new SetCardInfo("Farewell", 170, Rarity.RARE, mage.cards.f.Farewell.class));
        cards.add(new SetCardInfo("Final Act", 52, Rarity.RARE, mage.cards.f.FinalAct.class));
        cards.add(new SetCardInfo("Finale of Revelation", 185, Rarity.MYTHIC, mage.cards.f.FinaleOfRevelation.class));
        cards.add(new SetCardInfo("Find // Finality", 261, Rarity.RARE, mage.cards.f.FindFinality.class));
        cards.add(new SetCardInfo("Flooded Grove", 342, Rarity.RARE, mage.cards.f.FloodedGrove.class));
        cards.add(new SetCardInfo("Floriferous Vinewall", 228, Rarity.COMMON, mage.cards.f.FloriferousVinewall.class));
        cards.add(new SetCardInfo("Fog Bank", 186, Rarity.UNCOMMON, mage.cards.f.FogBank.class));
        cards.add(new SetCardInfo("Forgotten Cave", 343, Rarity.COMMON, mage.cards.f.ForgottenCave.class));
        cards.add(new SetCardInfo("Forsaken Monument", 293, Rarity.MYTHIC, mage.cards.f.ForsakenMonument.class));
        cards.add(new SetCardInfo("Frostboil Snarl", 344, Rarity.RARE, mage.cards.f.FrostboilSnarl.class));
        cards.add(new SetCardInfo("Furycalm Snarl", 345, Rarity.RARE, mage.cards.f.FurycalmSnarl.class));
        cards.add(new SetCardInfo("Garruk's Uprising", 229, Rarity.UNCOMMON, mage.cards.g.GarruksUprising.class));
        cards.add(new SetCardInfo("Garruk, Apex Predator", 262, Rarity.MYTHIC, mage.cards.g.GarrukApexPredator.class));
        cards.add(new SetCardInfo("Glimmer of Genius", 187, Rarity.UNCOMMON, mage.cards.g.GlimmerOfGenius.class));
        cards.add(new SetCardInfo("Glimmerpost", 346, Rarity.COMMON, mage.cards.g.Glimmerpost.class));
        cards.add(new SetCardInfo("Goldspan Dragon", 212, Rarity.MYTHIC, mage.cards.g.GoldspanDragon.class));
        cards.add(new SetCardInfo("Gonti's Aether Heart", 294, Rarity.MYTHIC, mage.cards.g.GontisAetherHeart.class));
        cards.add(new SetCardInfo("Grapple with the Past", 230, Rarity.COMMON, mage.cards.g.GrappleWithThePast.class));
        cards.add(new SetCardInfo("Graveshifter", 198, Rarity.UNCOMMON, mage.cards.g.Graveshifter.class));
        cards.add(new SetCardInfo("Grenzo, Havoc Raiser", 213, Rarity.RARE, mage.cards.g.GrenzoHavocRaiser.class));
        cards.add(new SetCardInfo("Grisly Salvage", 263, Rarity.COMMON, mage.cards.g.GrislySalvage.class));
        cards.add(new SetCardInfo("Grist, the Hunger Tide", 264, Rarity.MYTHIC, mage.cards.g.GristTheHungerTide.class));
        cards.add(new SetCardInfo("Growth Spiral", 265, Rarity.COMMON, mage.cards.g.GrowthSpiral.class));
        cards.add(new SetCardInfo("Harmonize", 231, Rarity.UNCOMMON, mage.cards.h.Harmonize.class));
        cards.add(new SetCardInfo("Hashep Oasis", 347, Rarity.UNCOMMON, mage.cards.h.HashepOasis.class));
        cards.add(new SetCardInfo("Hedron Archive", 295, Rarity.UNCOMMON, mage.cards.h.HedronArchive.class));
        cards.add(new SetCardInfo("Herald's Horn", 296, Rarity.UNCOMMON, mage.cards.h.HeraldsHorn.class));
        cards.add(new SetCardInfo("Hidden Cataract", 348, Rarity.COMMON, mage.cards.h.HiddenCataract.class));
        cards.add(new SetCardInfo("Hidden Nursery", 349, Rarity.COMMON, mage.cards.h.HiddenNursery.class));
        cards.add(new SetCardInfo("Hideous Taskmaster", 57, Rarity.RARE, mage.cards.h.HideousTaskmaster.class));
        cards.add(new SetCardInfo("Horizon of Progress", 78, Rarity.RARE, mage.cards.h.HorizonOfProgress.class));
        cards.add(new SetCardInfo("Hour of Promise", 232, Rarity.RARE, mage.cards.h.HourOfPromise.class));
        cards.add(new SetCardInfo("Hydra Broodmaster", 233, Rarity.RARE, mage.cards.h.HydraBroodmaster.class));
        cards.add(new SetCardInfo("Hydroid Krasis", 266, Rarity.RARE, mage.cards.h.HydroidKrasis.class));
        cards.add(new SetCardInfo("Idol of Oblivion", 297, Rarity.UNCOMMON, mage.cards.i.IdolOfOblivion.class));
        cards.add(new SetCardInfo("Ignoble Hierarch", 234, Rarity.RARE, mage.cards.i.IgnobleHierarch.class));
        cards.add(new SetCardInfo("Imprisoned in the Moon", 188, Rarity.RARE, mage.cards.i.ImprisonedInTheMoon.class));
        cards.add(new SetCardInfo("Izoni, Thousand-Eyed", 267, Rarity.RARE, mage.cards.i.IzoniThousandEyed.class));
        cards.add(new SetCardInfo("Izzet Boilerworks", 350, Rarity.UNCOMMON, mage.cards.i.IzzetBoilerworks.class));
        cards.add(new SetCardInfo("Junji, the Midnight Sky", 199, Rarity.MYTHIC, mage.cards.j.JunjiTheMidnightSky.class));
        cards.add(new SetCardInfo("Jyoti, Moag Ancient", 8, Rarity.MYTHIC, mage.cards.j.JyotiMoagAncient.class));
        cards.add(new SetCardInfo("Karplusan Forest", 351, Rarity.RARE, mage.cards.k.KarplusanForest.class));
        cards.add(new SetCardInfo("Kessig Wolf Run", 352, Rarity.RARE, mage.cards.k.KessigWolfRun.class));
        cards.add(new SetCardInfo("Kolaghan's Command", 268, Rarity.RARE, mage.cards.k.KolaghansCommand.class));
        cards.add(new SetCardInfo("Kozilek's Return", 214, Rarity.MYTHIC, mage.cards.k.KozileksReturn.class));
        cards.add(new SetCardInfo("Lair of the Hydra", 353, Rarity.RARE, mage.cards.l.LairOfTheHydra.class));
        cards.add(new SetCardInfo("Lazotep Quarry", 79, Rarity.RARE, mage.cards.l.LazotepQuarry.class));
        cards.add(new SetCardInfo("Legion Loyalty", 171, Rarity.MYTHIC, mage.cards.l.LegionLoyalty.class));
        cards.add(new SetCardInfo("Lhurgoyf", 235, Rarity.RARE, mage.cards.l.Lhurgoyf.class));
        cards.add(new SetCardInfo("Lightning Greaves", 298, Rarity.UNCOMMON, mage.cards.l.LightningGreaves.class));
        cards.add(new SetCardInfo("Lightning Runner", 215, Rarity.MYTHIC, mage.cards.l.LightningRunner.class));
        cards.add(new SetCardInfo("Liliana, Death's Majesty", 200, Rarity.MYTHIC, mage.cards.l.LilianaDeathsMajesty.class));
        cards.add(new SetCardInfo("Llanowar Wastes", 354, Rarity.RARE, mage.cards.l.LlanowarWastes.class));
        cards.add(new SetCardInfo("Localized Destruction", 41, Rarity.RARE, mage.cards.l.LocalizedDestruction.class));
        cards.add(new SetCardInfo("Lumbering Falls", 355, Rarity.RARE, mage.cards.l.LumberingFalls.class));
        cards.add(new SetCardInfo("Lush Oasis", 356, Rarity.COMMON, mage.cards.l.LushOasis.class));
        cards.add(new SetCardInfo("Maelstrom Pulse", 269, Rarity.RARE, mage.cards.m.MaelstromPulse.class));
        cards.add(new SetCardInfo("Magus of the Candelabra", 236, Rarity.RARE, mage.cards.m.MagusOfTheCandelabra.class));
        cards.add(new SetCardInfo("Mana Reflection", 237, Rarity.RARE, mage.cards.m.ManaReflection.class));
        cards.add(new SetCardInfo("March from Velis Vel", 48, Rarity.RARE, mage.cards.m.MarchFromVelisVel.class));
        cards.add(new SetCardInfo("Maskwood Nexus", 299, Rarity.RARE, mage.cards.m.MaskwoodNexus.class));
        cards.add(new SetCardInfo("Midnight Clock", 189, Rarity.RARE, mage.cards.m.MidnightClock.class));
        cards.add(new SetCardInfo("Mirage Mirror", 300, Rarity.RARE, mage.cards.m.MirageMirror.class));
        cards.add(new SetCardInfo("Morophon, the Boundless", 157, Rarity.MYTHIC, mage.cards.m.MorophonTheBoundless.class));
        cards.add(new SetCardInfo("Mortivore", 201, Rarity.RARE, mage.cards.m.Mortivore.class));
        cards.add(new SetCardInfo("Mossfire Valley", 357, Rarity.RARE, mage.cards.m.MossfireValley.class));
        cards.add(new SetCardInfo("Myr Battlesphere", 301, Rarity.RARE, mage.cards.m.MyrBattlesphere.class));
        cards.add(new SetCardInfo("Myriad Landscape", 358, Rarity.UNCOMMON, mage.cards.m.MyriadLandscape.class));
        cards.add(new SetCardInfo("Mystic Forge", 302, Rarity.RARE, mage.cards.m.MysticForge.class));
        cards.add(new SetCardInfo("Mystic Gate", 359, Rarity.RARE, mage.cards.m.MysticGate.class));
        cards.add(new SetCardInfo("Mystic Monastery", 360, Rarity.UNCOMMON, mage.cards.m.MysticMonastery.class));
        cards.add(new SetCardInfo("Necrogoyf", 202, Rarity.RARE, mage.cards.n.Necrogoyf.class));
        cards.add(new SetCardInfo("Nissa, Steward of Elements", 270, Rarity.MYTHIC, mage.cards.n.NissaStewardOfElements.class));
        cards.add(new SetCardInfo("Oblivion Sower", 158, Rarity.MYTHIC, mage.cards.o.OblivionSower.class));
        cards.add(new SetCardInfo("Oblivion Stone", 303, Rarity.RARE, mage.cards.o.OblivionStone.class));
        cards.add(new SetCardInfo("Opal Palace", 361, Rarity.COMMON, mage.cards.o.OpalPalace.class));
        cards.add(new SetCardInfo("Overflowing Basin", 362, Rarity.RARE, mage.cards.o.OverflowingBasin.class));
        cards.add(new SetCardInfo("Path of Ancestry", 363, Rarity.COMMON, mage.cards.p.PathOfAncestry.class));
        cards.add(new SetCardInfo("Poison Dart Frog", 238, Rarity.COMMON, mage.cards.p.PoisonDartFrog.class));
        cards.add(new SetCardInfo("Pongify", 190, Rarity.UNCOMMON, mage.cards.p.Pongify.class));
        cards.add(new SetCardInfo("Port Town", 364, Rarity.RARE, mage.cards.p.PortTown.class));
        cards.add(new SetCardInfo("Prairie Stream", 365, Rarity.RARE, mage.cards.p.PrairieStream.class));
        cards.add(new SetCardInfo("Professional Face-Breaker", 216, Rarity.RARE, mage.cards.p.ProfessionalFaceBreaker.class));
        cards.add(new SetCardInfo("Propaganda", 191, Rarity.UNCOMMON, mage.cards.p.Propaganda.class));
        cards.add(new SetCardInfo("Pyrogoyf", 59, Rarity.RARE, mage.cards.p.Pyrogoyf.class));
        cards.add(new SetCardInfo("Quandrix Campus", 366, Rarity.COMMON, mage.cards.q.QuandrixCampus.class));
        cards.add(new SetCardInfo("Raging Ravine", 367, Rarity.RARE, mage.cards.r.RagingRavine.class));
        cards.add(new SetCardInfo("Rampaging Baloths", 239, Rarity.MYTHIC, mage.cards.r.RampagingBaloths.class));
        cards.add(new SetCardInfo("Rampant Growth", 240, Rarity.COMMON, mage.cards.r.RampantGrowth.class));
        cards.add(new SetCardInfo("Ramunap Excavator", 241, Rarity.RARE, mage.cards.r.RamunapExcavator.class));
        cards.add(new SetCardInfo("Reliquary Tower", 368, Rarity.UNCOMMON, mage.cards.r.ReliquaryTower.class));
        cards.add(new SetCardInfo("Replication Technique", 192, Rarity.RARE, mage.cards.r.ReplicationTechnique.class));
        cards.add(new SetCardInfo("Return of the Wildspeaker", 242, Rarity.RARE, mage.cards.r.ReturnOfTheWildspeaker.class));
        cards.add(new SetCardInfo("Rishkar's Expertise", 411, Rarity.RARE, mage.cards.r.RishkarsExpertise.class));
        cards.add(new SetCardInfo("Riveteers Charm", 271, Rarity.UNCOMMON, mage.cards.r.RiveteersCharm.class));
        cards.add(new SetCardInfo("Riveteers Overlook", 369, Rarity.COMMON, mage.cards.r.RiveteersOverlook.class));
        cards.add(new SetCardInfo("Ruins of Oran-Rief", 370, Rarity.RARE, mage.cards.r.RuinsOfOranRief.class));
        cards.add(new SetCardInfo("Sakura-Tribe Elder", 243, Rarity.COMMON, mage.cards.s.SakuraTribeElder.class));
        cards.add(new SetCardInfo("Salvation Colossus", 43, Rarity.RARE, mage.cards.s.SalvationColossus.class));
        cards.add(new SetCardInfo("Satya, Aetherflux Genius", 3, Rarity.MYTHIC, mage.cards.s.SatyaAetherfluxGenius.class));
        cards.add(new SetCardInfo("Satyr Wayfinder", 244, Rarity.COMMON, mage.cards.s.SatyrWayfinder.class));
        cards.add(new SetCardInfo("Savage Lands", 371, Rarity.UNCOMMON, mage.cards.s.SavageLands.class));
        cards.add(new SetCardInfo("Scute Swarm", 245, Rarity.RARE, mage.cards.s.ScuteSwarm.class));
        cards.add(new SetCardInfo("Secluded Courtyard", 372, Rarity.UNCOMMON, mage.cards.s.SecludedCourtyard.class));
        cards.add(new SetCardInfo("Seer's Sundial", 304, Rarity.RARE, mage.cards.s.SeersSundial.class));
        cards.add(new SetCardInfo("Selvala, Heart of the Wilds", 246, Rarity.MYTHIC, mage.cards.s.SelvalaHeartOfTheWilds.class));
        cards.add(new SetCardInfo("Shadowblood Ridge", 373, Rarity.RARE, mage.cards.s.ShadowbloodRidge.class));
        cards.add(new SetCardInfo("Sheltered Thicket", 374, Rarity.RARE, mage.cards.s.ShelteredThicket.class));
        cards.add(new SetCardInfo("Shivan Reef", 375, Rarity.RARE, mage.cards.s.ShivanReef.class));
        cards.add(new SetCardInfo("Shrine of the Forsaken Gods", 376, Rarity.RARE, mage.cards.s.ShrineOfTheForsakenGods.class));
        cards.add(new SetCardInfo("Siege-Gang Lieutenant", 61, Rarity.RARE, mage.cards.s.SiegeGangLieutenant.class));
        cards.add(new SetCardInfo("Sifter of Skulls", 203, Rarity.RARE, mage.cards.s.SifterOfSkulls.class));
        cards.add(new SetCardInfo("Simic Growth Chamber", 377, Rarity.COMMON, mage.cards.s.SimicGrowthChamber.class));
        cards.add(new SetCardInfo("Simic Guildgate", 378, Rarity.COMMON, mage.cards.s.SimicGuildgate.class));
        cards.add(new SetCardInfo("Sire of Stagnation", 272, Rarity.MYTHIC, mage.cards.s.SireOfStagnation.class));
        cards.add(new SetCardInfo("Skittering Invasion", 159, Rarity.UNCOMMON, mage.cards.s.SkitteringInvasion.class));
        cards.add(new SetCardInfo("Skullwinder", 247, Rarity.UNCOMMON, mage.cards.s.Skullwinder.class));
        cards.add(new SetCardInfo("Skyclave Apparition", 172, Rarity.RARE, mage.cards.s.SkyclaveApparition.class));
        cards.add(new SetCardInfo("Smoldering Marsh", 379, Rarity.RARE, mage.cards.s.SmolderingMarsh.class));
        cards.add(new SetCardInfo("Sol Ring", 305, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 306, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Spawning Bed", 380, Rarity.UNCOMMON, mage.cards.s.SpawningBed.class));
        cards.add(new SetCardInfo("Sphinx of the Revelation", 75, Rarity.RARE, mage.cards.s.SphinxOfTheRevelation.class));
        cards.add(new SetCardInfo("Stitcher's Supplier", 204, Rarity.UNCOMMON, mage.cards.s.StitchersSupplier.class));
        cards.add(new SetCardInfo("Stone Idol Generator", 77, Rarity.RARE, mage.cards.s.StoneIdolGenerator.class));
        cards.add(new SetCardInfo("Suffer the Past", 205, Rarity.UNCOMMON, mage.cards.s.SufferThePast.class));
        cards.add(new SetCardInfo("Sulfurous Springs", 381, Rarity.RARE, mage.cards.s.SulfurousSprings.class));
        cards.add(new SetCardInfo("Summary Dismissal", 193, Rarity.RARE, mage.cards.s.SummaryDismissal.class));
        cards.add(new SetCardInfo("Swords to Plowshares", 173, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Sylvan Scrying", 248, Rarity.UNCOMMON, mage.cards.s.SylvanScrying.class));
        cards.add(new SetCardInfo("Syphon Mind", 206, Rarity.COMMON, mage.cards.s.SyphonMind.class));
        cards.add(new SetCardInfo("Syr Konrad, the Grim", 207, Rarity.UNCOMMON, mage.cards.s.SyrKonradTheGrim.class));
        cards.add(new SetCardInfo("Tainted Peak", 382, Rarity.UNCOMMON, mage.cards.t.TaintedPeak.class));
        cards.add(new SetCardInfo("Tainted Wood", 383, Rarity.UNCOMMON, mage.cards.t.TaintedWood.class));
        cards.add(new SetCardInfo("Talisman of Conviction", 307, Rarity.UNCOMMON, mage.cards.t.TalismanOfConviction.class));
        cards.add(new SetCardInfo("Talisman of Creativity", 308, Rarity.UNCOMMON, mage.cards.t.TalismanOfCreativity.class));
        cards.add(new SetCardInfo("Talisman of Curiosity", 309, Rarity.UNCOMMON, mage.cards.t.TalismanOfCuriosity.class));
        cards.add(new SetCardInfo("Talisman of Dominance", 310, Rarity.UNCOMMON, mage.cards.t.TalismanOfDominance.class));
        cards.add(new SetCardInfo("Talisman of Impulse", 311, Rarity.UNCOMMON, mage.cards.t.TalismanOfImpulse.class));
        cards.add(new SetCardInfo("Talisman of Indulgence", 312, Rarity.UNCOMMON, mage.cards.t.TalismanOfIndulgence.class));
        cards.add(new SetCardInfo("Talisman of Progress", 313, Rarity.UNCOMMON, mage.cards.t.TalismanOfProgress.class));
        cards.add(new SetCardInfo("Talisman of Resilience", 314, Rarity.UNCOMMON, mage.cards.t.TalismanOfResilience.class));
        cards.add(new SetCardInfo("Talon Gates of Madara", 82, Rarity.RARE, mage.cards.t.TalonGatesOfMadara.class));
        cards.add(new SetCardInfo("Tarmogoyf Nest", 68, Rarity.RARE, mage.cards.t.TarmogoyfNest.class));
        cards.add(new SetCardInfo("Tatyova, Benthic Druid", 273, Rarity.UNCOMMON, mage.cards.t.TatyovaBenthicDruid.class));
        cards.add(new SetCardInfo("Tectonic Edge", 384, Rarity.UNCOMMON, mage.cards.t.TectonicEdge.class));
        cards.add(new SetCardInfo("Temple of Abandon", 385, Rarity.RARE, mage.cards.t.TempleOfAbandon.class));
        cards.add(new SetCardInfo("Temple of Enlightenment", 386, Rarity.RARE, mage.cards.t.TempleOfEnlightenment.class));
        cards.add(new SetCardInfo("Temple of Epiphany", 387, Rarity.RARE, mage.cards.t.TempleOfEpiphany.class));
        cards.add(new SetCardInfo("Temple of Malady", 388, Rarity.RARE, mage.cards.t.TempleOfMalady.class));
        cards.add(new SetCardInfo("Temple of Malice", 389, Rarity.RARE, mage.cards.t.TempleOfMalice.class));
        cards.add(new SetCardInfo("Temple of Mystery", 390, Rarity.RARE, mage.cards.t.TempleOfMystery.class));
        cards.add(new SetCardInfo("Temple of Silence", 391, Rarity.RARE, mage.cards.t.TempleOfSilence.class));
        cards.add(new SetCardInfo("Temple of Triumph", 392, Rarity.RARE, mage.cards.t.TempleOfTriumph.class));
        cards.add(new SetCardInfo("Tendo Ice Bridge", 393, Rarity.RARE, mage.cards.t.TendoIceBridge.class));
        cards.add(new SetCardInfo("Terastodon", 249, Rarity.RARE, mage.cards.t.Terastodon.class));
        cards.add(new SetCardInfo("Terminate", 274, Rarity.COMMON, mage.cards.t.Terminate.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 394, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Tezzeret's Gambit", 194, Rarity.UNCOMMON, mage.cards.t.TezzeretsGambit.class));
        cards.add(new SetCardInfo("The Reaver Cleaver", 217, Rarity.RARE, mage.cards.t.TheReaverCleaver.class));
        cards.add(new SetCardInfo("Thespian's Stage", 395, Rarity.RARE, mage.cards.t.ThespiansStage.class));
        cards.add(new SetCardInfo("Thornwood Falls", 396, Rarity.COMMON, mage.cards.t.ThornwoodFalls.class));
        cards.add(new SetCardInfo("Tomb of the Spirit Dragon", 397, Rarity.UNCOMMON, mage.cards.t.TombOfTheSpiritDragon.class));
        cards.add(new SetCardInfo("Tranquil Thicket", 398, Rarity.COMMON, mage.cards.t.TranquilThicket.class));
        cards.add(new SetCardInfo("Treasure Cruise", 195, Rarity.COMMON, mage.cards.t.TreasureCruise.class));
        cards.add(new SetCardInfo("Trenchpost", 83, Rarity.RARE, mage.cards.t.Trenchpost.class));
        cards.add(new SetCardInfo("Ugin's Insight", 196, Rarity.RARE, mage.cards.u.UginsInsight.class));
        cards.add(new SetCardInfo("Ugin, the Ineffable", 160, Rarity.RARE, mage.cards.u.UginTheIneffable.class));
        cards.add(new SetCardInfo("Ulamog's Crusher", 161, Rarity.COMMON, mage.cards.u.UlamogsCrusher.class));
        cards.add(new SetCardInfo("Ulamog's Dreadsire", 38, Rarity.RARE, mage.cards.u.UlamogsDreadsire.class));
        cards.add(new SetCardInfo("Ulamog's Nullifier", 275, Rarity.UNCOMMON, mage.cards.u.UlamogsNullifier.class));
        cards.add(new SetCardInfo("Ulvenwald Hydra", 250, Rarity.MYTHIC, mage.cards.u.UlvenwaldHydra.class));
        cards.add(new SetCardInfo("Unclaimed Territory", 399, Rarity.UNCOMMON, mage.cards.u.UnclaimedTerritory.class));
        cards.add(new SetCardInfo("Underground River", 400, Rarity.RARE, mage.cards.u.UndergroundRiver.class));
        cards.add(new SetCardInfo("Urban Evolution", 276, Rarity.UNCOMMON, mage.cards.u.UrbanEvolution.class));
        cards.add(new SetCardInfo("Uro, Titan of Nature's Wrath", 277, Rarity.MYTHIC, mage.cards.u.UroTitanOfNaturesWrath.class));
        cards.add(new SetCardInfo("Urza's Mine", 401, Rarity.COMMON, mage.cards.u.UrzasMine.class));
        cards.add(new SetCardInfo("Urza's Power Plant", 402, Rarity.COMMON, mage.cards.u.UrzasPowerPlant.class));
        cards.add(new SetCardInfo("Urza's Tower", 403, Rarity.COMMON, mage.cards.u.UrzasTower.class));
        cards.add(new SetCardInfo("Vesuva", 404, Rarity.RARE, mage.cards.v.Vesuva.class));
        cards.add(new SetCardInfo("Vile Redeemer", 251, Rarity.RARE, mage.cards.v.VileRedeemer.class));
        cards.add(new SetCardInfo("Vineglimmer Snarl", 405, Rarity.RARE, mage.cards.v.VineglimmerSnarl.class));
        cards.add(new SetCardInfo("Viridescent Bog", 406, Rarity.RARE, mage.cards.v.ViridescentBog.class));
        cards.add(new SetCardInfo("Vivien Reid", 252, Rarity.MYTHIC, mage.cards.v.VivienReid.class));
        cards.add(new SetCardInfo("Volatile Fault", 407, Rarity.UNCOMMON, mage.cards.v.VolatileFault.class));
        cards.add(new SetCardInfo("Warping Wail", 162, Rarity.UNCOMMON, mage.cards.w.WarpingWail.class));
        cards.add(new SetCardInfo("Wastes", 408, Rarity.COMMON, mage.cards.w.Wastes.class));
        cards.add(new SetCardInfo("Wayfarer's Bauble", 315, Rarity.COMMON, mage.cards.w.WayfarersBauble.class));
        cards.add(new SetCardInfo("Whirler Virtuoso", 278, Rarity.UNCOMMON, mage.cards.w.WhirlerVirtuoso.class));
        cards.add(new SetCardInfo("World Breaker", 253, Rarity.MYTHIC, mage.cards.w.WorldBreaker.class));
        cards.add(new SetCardInfo("Yavimaya Coast", 410, Rarity.RARE, mage.cards.y.YavimayaCoast.class));
        cards.add(new SetCardInfo("Yavimaya Elder", 254, Rarity.COMMON, mage.cards.y.YavimayaElder.class));
        cards.add(new SetCardInfo("Yavimaya, Cradle of Growth", 409, Rarity.RARE, mage.cards.y.YavimayaCradleOfGrowth.class));
        cards.add(new SetCardInfo("Ziatora, the Incinerator", 279, Rarity.MYTHIC, mage.cards.z.ZiatoraTheIncinerator.class));
    }
}
