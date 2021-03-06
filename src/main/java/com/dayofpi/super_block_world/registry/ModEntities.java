package com.dayofpi.super_block_world.registry;

import com.dayofpi.super_block_world.Main;
import com.dayofpi.super_block_world.common.entities.boss.KingBobOmbEntity;
import com.dayofpi.super_block_world.common.entities.boss.KingBooEntity;
import com.dayofpi.super_block_world.common.entities.hostile.*;
import com.dayofpi.super_block_world.common.entities.misc.*;
import com.dayofpi.super_block_world.common.entities.passive.*;
import com.dayofpi.super_block_world.common.entities.projectile.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.MagmaCubeEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Heightmap;

public class ModEntities {
    public static final EntityType<BabyYoshiEntity> BABY_YOSHI = FabricEntityTypeBuilder.createMob().entityFactory(BabyYoshiEntity::new).spawnGroup(SpawnGroup.MISC).defaultAttributes(BabyYoshiEntity::createBabyYoshiAttributes).dimensions(EntityDimensions.fixed(0.8F, 0.8F)).build();
    public static final EntityType<BlockstepperEntity> BLOCKSTEPPER = FabricEntityTypeBuilder.createMob().entityFactory(BlockstepperEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, BlockstepperEntity::canSpawn).defaultAttributes(BlockstepperEntity::createBlockstepperAttributes).dimensions(EntityDimensions.fixed(0.7F, 0.8F)).build();
    public static final EntityType<BlooperEntity> BLOOPER = FabricEntityTypeBuilder.createMob().entityFactory(BlooperEntity::new).spawnGroup(SpawnGroup.WATER_CREATURE).spawnRestriction(SpawnRestriction.Location.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BlooperEntity::canSpawn).defaultAttributes(BlooperEntity::createBlooperAttributes).dimensions(EntityDimensions.changing(0.8F, 0.7F)).build();
    public static final EntityType<BobOmbBuddyEntity> BOB_OMB_BUDDY = FabricEntityTypeBuilder.createMob().entityFactory(BobOmbBuddyEntity::new).spawnGroup(SpawnGroup.MISC).defaultAttributes(BobOmbBuddyEntity::createBobOmbBuddyAttributes).dimensions(EntityDimensions.fixed(0.6F, 0.7F)).build();
    public static final EntityType<BobOmbEntity> BOB_OMB = FabricEntityTypeBuilder.createMob().entityFactory(BobOmbEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, BobOmbEntity::canSpawn).defaultAttributes(BobOmbEntity::createBobOmbAttributes).dimensions(EntityDimensions.fixed(0.6F, 0.7F)).build();
    public static final EntityType<BombEntity> BOMB = FabricEntityTypeBuilder.<BombEntity>create(SpawnGroup.MISC, BombEntity::new).dimensions(EntityDimensions.fixed(0.25F, 0.25F)).trackRangeBlocks(4).trackedUpdateRate(10).build();
    public static final EntityType<BooEntity> BOO = FabricEntityTypeBuilder.createMob().entityFactory(BooEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BooEntity::canSpawn).defaultAttributes(BooEntity::createBooAttributes).dimensions(EntityDimensions.fixed(0.8F, 0.8F)).build();
    public static final EntityType<CheepCheepEntity> CHEEP_CHEEP = FabricEntityTypeBuilder.createMob().entityFactory(CheepCheepEntity::new).spawnGroup(SpawnGroup.WATER_CREATURE).spawnRestriction(SpawnRestriction.Location.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, CheepCheepEntity::canCheepCheepSpawn).defaultAttributes(CheepCheepEntity::createCheepCheepAttributes).dimensions(EntityDimensions.fixed(0.6F, 0.6F)).build();
    public static final EntityType<DinoRhinoEntity> DINO_RHINO = FabricEntityTypeBuilder.createMob().entityFactory(DinoRhinoEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, DinoRhinoEntity::canDinoRhinoSpawn).defaultAttributes(DinoRhinoEntity::createDinoRhinoAttributes).dimensions(EntityDimensions.changing(1.2F, 1.2F)).fireImmune().build();
    public static final EntityType<DryBonesEntity> DRY_BONES = FabricEntityTypeBuilder.createMob().entityFactory(DryBonesEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, DryBonesEntity::canSpawn).defaultAttributes(DryBonesEntity::createDryBonesAttributes).dimensions(EntityDimensions.fixed(0.8F, 1.3F)).fireImmune().build();
    public static final EntityType<DryBonesShellEntity> DRY_BONES_SHELL = FabricEntityTypeBuilder.createMob().entityFactory(DryBonesShellEntity::new).spawnGroup(SpawnGroup.MISC).defaultAttributes(DryBonesShellEntity::createDryBonesShellAttributes).dimensions(EntityDimensions.fixed(1.0F, 0.8F)).fireImmune().build();
    public static final EntityType<FakeBlockEntity> FAKE_BLOCK = FabricEntityTypeBuilder.createMob().entityFactory(FakeBlockEntity::new).spawnGroup(SpawnGroup.MISC).defaultAttributes(FakeBlockEntity::createFakeBlockAttributes).dimensions(EntityDimensions.fixed(0.85F, 0.85F)).build();
    public static final EntityType<FuzzyEntity> FUZZY = FabricEntityTypeBuilder.createMob().entityFactory(FuzzyEntity::new).spawnGroup(SpawnGroup.MONSTER).defaultAttributes(FuzzyEntity::createFuzzyAttributes).dimensions(EntityDimensions.fixed(0.72F, 0.72F)).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, FuzzyEntity::canFuzzySpawn).fireImmune().build();
    public static final EntityType<GhostEssenceEntity> GHOST_ESSENCE = FabricEntityTypeBuilder.<GhostEssenceEntity>create(SpawnGroup.MISC, GhostEssenceEntity::new).dimensions(EntityDimensions.fixed(1.0F, 1.0F)).trackRangeBlocks(8).build();
    public static final EntityType<GladGoombaEntity> GLAD_GOOMBA = FabricEntityTypeBuilder.createMob().entityFactory(GladGoombaEntity::new).spawnGroup(SpawnGroup.MISC).defaultAttributes(GladGoombaEntity::createGladGoombaAttributes).dimensions(EntityDimensions.changing(0.7F, 0.7F)).build();
    public static final EntityType<GladParagoombaEntity> GLAD_PARAGOOMBA = FabricEntityTypeBuilder.createMob().entityFactory(GladParagoombaEntity::new).spawnGroup(SpawnGroup.MISC).defaultAttributes(GladParagoombaEntity::createGladParagoombaAttributes).dimensions(EntityDimensions.changing(0.7F, 0.7F)).build();
    public static final EntityType<GoKartEntity> GO_KART = FabricEntityTypeBuilder.<GoKartEntity>create(SpawnGroup.MISC, GoKartEntity::new).dimensions(EntityDimensions.fixed(1.0f, 0.5f)).trackRangeChunks(8).build();
    public static final EntityType<GooMeEntity> GOO_ME = FabricEntityTypeBuilder.createMob().entityFactory(GooMeEntity::new).spawnGroup(SpawnGroup.MISC).defaultAttributes(GooMeEntity::createGooMeAttributes).dimensions(EntityDimensions.fixed(0.6F, 1.8F)).build();
    public static final EntityType<GoombaEntity> GOOMBA = FabricEntityTypeBuilder.createMob().entityFactory(GoombaEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, GoombaEntity::canGoombaSpawn).defaultAttributes(GoombaEntity::createGoombaAttributes).dimensions(EntityDimensions.changing(0.9F, 0.9F)).build();
    public static final EntityType<HammerEntity> HAMMER = FabricEntityTypeBuilder.<HammerEntity>create(SpawnGroup.MISC, HammerEntity::new).dimensions(EntityDimensions.fixed(0.5F, 0.5F)).trackRangeBlocks(4).trackedUpdateRate(10).build();
    public static final EntityType<IceballEntity> ICEBALL = FabricEntityTypeBuilder.<IceballEntity>create(SpawnGroup.MISC, IceballEntity::new).dimensions(EntityDimensions.fixed(0.25F, 0.25F)).trackRangeBlocks(4).trackedUpdateRate(10).fireImmune().build();
    public static final EntityType<KingBobOmbEntity> KING_BOB_OMB = FabricEntityTypeBuilder.createMob().entityFactory(KingBobOmbEntity::new).spawnGroup(SpawnGroup.MISC).trackRangeChunks(10).defaultAttributes(KingBobOmbEntity::createKingBobOmbAttributes).dimensions(EntityDimensions.fixed(2.6F, 2.8F)).build();
    public static final EntityType<KingBooEntity> KING_BOO = FabricEntityTypeBuilder.createMob().entityFactory(KingBooEntity::new).spawnGroup(SpawnGroup.MISC).trackRangeChunks(10).defaultAttributes(KingBooEntity::createKingBooAttributes).dimensions(EntityDimensions.fixed(2.0F, 2.0F)).fireImmune().build();
    public static final EntityType<KoopaShellEntity> KOOPA_SHELL = FabricEntityTypeBuilder.createMob().entityFactory(KoopaShellEntity::new).spawnGroup(SpawnGroup.MISC).defaultAttributes(KoopaShellEntity::createKoopaShellAtrributes).dimensions(EntityDimensions.fixed(0.8F, 0.9F)).build();
    public static final EntityType<KoopaTroopaEntity> KOOPA_TROOPA = FabricEntityTypeBuilder.createMob().entityFactory(KoopaTroopaEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, KoopaTroopaEntity::canKoopaSpawn).defaultAttributes(KoopaTroopaEntity::createKoopaAttributes).dimensions(EntityDimensions.fixed(0.8F, 1.3F)).build();
    public static final EntityType<LaunchStarEntity> LAUNCH_STAR = FabricEntityTypeBuilder.<LaunchStarEntity>create(SpawnGroup.MISC, LaunchStarEntity::new).dimensions(EntityDimensions.fixed(0.9F, 0.9F)).trackRangeChunks(8).trackedUpdateRate(10).fireImmune().build();
    public static final EntityType<LavaBubbleEntity> LAVA_BUBBLE = FabricEntityTypeBuilder.createMob().entityFactory(LavaBubbleEntity::new).spawnGroup(SpawnGroup.MONSTER).defaultAttributes(MagmaCubeEntity::createMagmaCubeAttributes).spawnRestriction(SpawnRestriction.Location.IN_LAVA, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, LavaBubbleEntity::canLavaBubbleSpawn).fireImmune().dimensions(EntityDimensions.changing(2.04f, 2.04f)).build();
    public static final EntityType<LilOinkEntity> LIL_OINK = FabricEntityTypeBuilder.createMob().entityFactory(LilOinkEntity::new).spawnGroup(SpawnGroup.MISC).defaultAttributes(PigEntity::createPigAttributes).dimensions(EntityDimensions.changing(0.7F, 0.7F)).build();
    public static final EntityType<MailtoadEntity> MAILTOAD = FabricEntityTypeBuilder.createMob().entityFactory(MailtoadEntity::new).spawnGroup(SpawnGroup.MISC).defaultAttributes(ToadEntity::createToadAttributes).dimensions(EntityDimensions.changing(0.6F, 1.8F)).build();
    public static final EntityType<MechakoopaEntity> MECHAKOOPA = FabricEntityTypeBuilder.createMob().entityFactory(MechakoopaEntity::new).spawnGroup(SpawnGroup.MONSTER).defaultAttributes(MechakoopaEntity::createMechakoopaAttributes).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MechakoopaEntity::canMechakoopaSpawn).dimensions(EntityDimensions.fixed(0.6F, 0.6F)).build();
    public static final EntityType<MechakoopaMissileEntity> MECHAKOOPA_MISSILE = FabricEntityTypeBuilder.<MechakoopaMissileEntity>create(SpawnGroup.MISC, MechakoopaMissileEntity::new).dimensions(EntityDimensions.fixed(0.6F, 0.6F)).trackRangeBlocks(4).trackedUpdateRate(10).build();
    public static final EntityType<ModFireballEntity> FIREBALL = FabricEntityTypeBuilder.<ModFireballEntity>create(SpawnGroup.MISC, ModFireballEntity::new).dimensions(EntityDimensions.fixed(0.25F, 0.25F)).trackRangeBlocks(4).trackedUpdateRate(10).fireImmune().build();
    public static final EntityType<MooMooEntity> MOO_MOO = FabricEntityTypeBuilder.createMob().entityFactory(MooMooEntity::new).spawnGroup(SpawnGroup.CREATURE).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn).defaultAttributes(CowEntity::createCowAttributes).dimensions(EntityDimensions.changing(1.1F, 1.2F)).build();
    public static final EntityType<MudTrooperEntity> MUD_TROOPER = FabricEntityTypeBuilder.createMob().entityFactory(MudTrooperEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, RottenMushroomEntity::canRottenMushroomSpawn).defaultAttributes(MudTrooperEntity::createMudTrooperAttributes).dimensions(EntityDimensions.fixed(0.9F, 0.9F)).build();
    public static final EntityType<MummyMeEntity> MUMMY_ME = FabricEntityTypeBuilder.createMob().entityFactory(MummyMeEntity::new).spawnGroup(SpawnGroup.MONSTER).defaultAttributes(MummyMeEntity::createMummyMeAttributes).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MummyMeEntity::canMummyMeSpawn).dimensions(EntityDimensions.changing(0.6F, 1.8F)).build();
    public static final EntityType<ParabonesEntity> PARABONES = FabricEntityTypeBuilder.createMob().entityFactory(ParabonesEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, DryBonesEntity::canSpawn).defaultAttributes(ParabonesEntity::createParabonesAttributes).dimensions(EntityDimensions.fixed(0.8F, 1.3F)).fireImmune().build();
    public static final EntityType<ParagoombaEntity> PARAGOOMBA = FabricEntityTypeBuilder.createMob().entityFactory(ParagoombaEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ParagoombaEntity::canParagoombaSpawn).defaultAttributes(ParagoombaEntity::createParagoombaAttributes).dimensions(EntityDimensions.changing(0.9F, 0.9F)).build();
    public static final EntityType<ParatroopaEntity> PARATROOPA = FabricEntityTypeBuilder.createMob().entityFactory(ParatroopaEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ParatroopaEntity::canParatroopaSpawn).defaultAttributes(ParatroopaEntity::createParatroopaAttributes).dimensions(EntityDimensions.fixed(0.8F, 1.3F)).build();
    public static final EntityType<PiranhaPlantEntity> PIRANHA_PLANT = FabricEntityTypeBuilder.createMob().entityFactory(PiranhaPlantEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, PiranhaPlantEntity::canPiranhaPlantSpawn).defaultAttributes(PiranhaPlantEntity::createPiranhaPlantAttributes).dimensions(EntityDimensions.fixed(0.6F, 1.2F)).build();
    public static final EntityType<PropellerBlockEntity> PROPELLER_BLOCK = FabricEntityTypeBuilder.create(SpawnGroup.MISC, PropellerBlockEntity::new).dimensions(EntityDimensions.fixed(0.98f, 0.98f)).trackRangeChunks(10).trackedUpdateRate(20).build();
    public static final EntityType<PutridPiranhaEntity> PUTRID_PIRANHA = FabricEntityTypeBuilder.createMob().entityFactory(PutridPiranhaEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, PutridPiranhaEntity::canPiranhaPlantSpawn).defaultAttributes(PiranhaPlantEntity::createPiranhaPlantAttributes).dimensions(EntityDimensions.fixed(0.6F, 1.2F)).build();
    public static final EntityType<RottenMushroomEntity> ROTTEN_MUSHROOM = FabricEntityTypeBuilder.createMob().entityFactory(RottenMushroomEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, RottenMushroomEntity::canRottenMushroomSpawn).defaultAttributes(RottenMushroomEntity::createRottenMushroomAttributes).dimensions(EntityDimensions.fixed(0.7F, 0.7F)).build();
    public static final EntityType<ShyGuyEntity> SHY_GUY = FabricEntityTypeBuilder.createMob().entityFactory(ShyGuyEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ShyGuyEntity::canShyGuySpawn).defaultAttributes(ShyGuyEntity::createShyGuyAttributes).dimensions(EntityDimensions.fixed(0.8F, 0.8F)).build();
    public static final EntityType<SleepySheepEntity> SLEEPY_SHEEP = FabricEntityTypeBuilder.createMob().entityFactory(SleepySheepEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(SleepySheepEntity::createSleepySheepAttributes).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn).dimensions(EntityDimensions.changing(0.6F, 0.6F)).build();
    public static final EntityType<SpindriftEntity> SPINDRIFT = FabricEntityTypeBuilder.createMob().entityFactory(SpindriftEntity::new).spawnGroup(SpawnGroup.CREATURE).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, SpindriftEntity::canSpindriftSpawn).defaultAttributes(SpindriftEntity::createSpindriftAttributes).dimensions(EntityDimensions.fixed(0.6F, 0.7F)).build();
    public static final EntityType<SpinyEntity> SPINY = FabricEntityTypeBuilder.createMob().entityFactory(SpinyEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, SpinyEntity::canSpawn).defaultAttributes(SpinyEntity::createSpinyAttributes).dimensions(EntityDimensions.fixed(0.8F, 0.7F)).build();
    public static final EntityType<StampEntity> STAMP = FabricEntityTypeBuilder.<StampEntity>create(SpawnGroup.MISC, StampEntity::new).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeChunks(4).trackedUpdateRate(10).build();
    public static final EntityType<StarBitEntity> STAR_BIT = FabricEntityTypeBuilder.<StarBitEntity>create(SpawnGroup.MISC, StarBitEntity::new).dimensions(EntityDimensions.fixed(0.25F, 0.25F)).trackRangeBlocks(4).trackedUpdateRate(10).build();
    public static final EntityType<StingbyEntity> STINGBY = FabricEntityTypeBuilder.createMob().entityFactory(StingbyEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, StingbyEntity::canSpawn).defaultAttributes(StingbyEntity::createStingbyAttributes).dimensions(EntityDimensions.fixed(0.72F, 0.7F)).build();
    public static final EntityType<SuperHeartEntity> SUPER_HEART = FabricEntityTypeBuilder.<SuperHeartEntity>create(SpawnGroup.MISC, SuperHeartEntity::new).dimensions(EntityDimensions.fixed(0.25F, 0.25F)).trackRangeBlocks(4).trackedUpdateRate(10).build();
    public static final EntityType<SuperPickaxEntity> SUPER_PICKAX = FabricEntityTypeBuilder.create(SpawnGroup.MISC, SuperPickaxEntity::new).dimensions(EntityDimensions.fixed(0.6f, 0.6f)).trackRangeChunks(8).build();
    public static final EntityType<ThwompEntity> THWOMP = FabricEntityTypeBuilder.createMob().entityFactory(ThwompEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ThwompEntity::canSpawn).defaultAttributes(ThwompEntity::createThwompAttributes).dimensions(EntityDimensions.fixed(1.0F, 2.0F)).fireImmune().build();
    public static final EntityType<ToadEntity> TOAD = FabricEntityTypeBuilder.createMob().entityFactory(ToadEntity::new).spawnGroup(SpawnGroup.MISC).defaultAttributes(ToadEntity::createToadAttributes).dimensions(EntityDimensions.changing(0.6F, 1.8F)).build();
    public static final EntityType<TrampolineMinecartEntity> TRAMPOLINE_MINECART = FabricEntityTypeBuilder.<TrampolineMinecartEntity>create(SpawnGroup.MISC, TrampolineMinecartEntity::new).dimensions(EntityDimensions.fixed(0.98f, 0.7f)).trackRangeChunks(8).build();
    public static final EntityType<TurnipEntity> TURNIP = FabricEntityTypeBuilder.<TurnipEntity>create(SpawnGroup.MISC, TurnipEntity::new).dimensions(EntityDimensions.fixed(0.5F, 0.5F)).trackRangeBlocks(4).trackedUpdateRate(10).build();
    public static final EntityType<UnagiEntity> UNAGI = FabricEntityTypeBuilder.createMob().entityFactory(UnagiEntity::new).spawnGroup(SpawnGroup.MONSTER).spawnRestriction(SpawnRestriction.Location.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, UnagiEntity::canUnagiSpawn).defaultAttributes(UnagiEntity::createUnagiAttributes).dimensions(EntityDimensions.fixed(0.8F, 0.55F)).build();
    public static final EntityType<YoshiEggEntity> YOSHI_EGG = FabricEntityTypeBuilder.<YoshiEggEntity>create(SpawnGroup.MISC, YoshiEggEntity::new).dimensions(EntityDimensions.fixed(0.5F, 0.5F)).trackRangeBlocks(4).trackedUpdateRate(10).build();
    public static final EntityType<YoshiEntity> YOSHI = FabricEntityTypeBuilder.createMob().entityFactory(YoshiEntity::new).spawnGroup(SpawnGroup.MISC).defaultAttributes(YoshiEntity::createYoshiAttributes).dimensions(EntityDimensions.fixed(0.85F, 1.8F)).build();

    private static void registerEntity(String name, EntityType<?> entity) {
        Registry.register(Registry.ENTITY_TYPE, new Identifier(Main.MOD_ID, name), entity);
    }

    public static void register() {
        registerEntity("baby_yoshi", BABY_YOSHI);
        registerEntity("blockstepper", BLOCKSTEPPER);
        registerEntity("blooper", BLOOPER);
        registerEntity("bob_omb", BOB_OMB);
        registerEntity("bob_omb_buddy", BOB_OMB_BUDDY);
        registerEntity("bomb", BOMB);
        registerEntity("boo", BOO);
        registerEntity("cheep_cheep", CHEEP_CHEEP);
        registerEntity("dino_rhino", DINO_RHINO);
        registerEntity("dry_bones", DRY_BONES);
        registerEntity("dry_bones_shell", DRY_BONES_SHELL);
        registerEntity("fake_block", FAKE_BLOCK);
        registerEntity("fireball", FIREBALL);
        registerEntity("fuzzy", FUZZY);
        registerEntity("ghost_essence", GHOST_ESSENCE);
        registerEntity("glad_goomba", GLAD_GOOMBA);
        registerEntity("glad_paragoomba", GLAD_PARAGOOMBA);
        registerEntity("go_kart", GO_KART);
        registerEntity("goo_me", GOO_ME);
        registerEntity("goomba", GOOMBA);
        registerEntity("hammer", HAMMER);
        registerEntity("iceball", ICEBALL);
        registerEntity("king_bob_omb", KING_BOB_OMB);
        registerEntity("king_boo", KING_BOO);
        registerEntity("koopa_shell", KOOPA_SHELL);
        registerEntity("koopa_troopa", KOOPA_TROOPA);
        registerEntity("launch_star", LAUNCH_STAR);
        registerEntity("lava_bubble", LAVA_BUBBLE);
        registerEntity("lil_oink", LIL_OINK);
        registerEntity("mailtoad", MAILTOAD);
        registerEntity("mechakoopa", MECHAKOOPA);
        registerEntity("mechakoopa_missile", MECHAKOOPA_MISSILE);
        registerEntity("moo_moo", MOO_MOO);
        registerEntity("mud_trooper", MUD_TROOPER);
        registerEntity("mummy_me", MUMMY_ME);
        registerEntity("parabones", PARABONES);
        registerEntity("paragoomba", PARAGOOMBA);
        registerEntity("paratroopa", PARATROOPA);
        registerEntity("piranha_plant", PIRANHA_PLANT);
        registerEntity("propeller_block", PROPELLER_BLOCK);
        registerEntity("putrid_piranha", PUTRID_PIRANHA);
        registerEntity("rotten_mushroom", ROTTEN_MUSHROOM);
        registerEntity("shy_guy", SHY_GUY);
        registerEntity("sleepy_sheep", SLEEPY_SHEEP);
        registerEntity("spindrift", SPINDRIFT);
        registerEntity("spiny", SPINY);
        registerEntity("stamp", STAMP);
        registerEntity("star_bit", STAR_BIT);
        registerEntity("stingby", STINGBY);
        registerEntity("super_heart", SUPER_HEART);
        registerEntity("super_pickax", SUPER_PICKAX);
        registerEntity("thwomp", THWOMP);
        registerEntity("toad", TOAD);
        registerEntity("trampoline_minecart", TRAMPOLINE_MINECART);
        registerEntity("turnip", TURNIP);
        registerEntity("unagi", UNAGI);
        registerEntity("yoshi", YOSHI);
        registerEntity("yoshi_egg", YOSHI_EGG);
    }
}
