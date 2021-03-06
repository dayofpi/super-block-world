package com.dayofpi.super_block_world.audio;

import com.dayofpi.super_block_world.Main;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@Environment(EnvType.CLIENT)
public class Sounds {
    public static final SoundEvent AMBIENT_CAVE = createSound("ambient.cave");
    public static final SoundEvent BLOCK_BELL_CAP_FALL = createSound("block.bell_cap.fall");
    public static final SoundEvent BLOCK_BELL_CAP_HIT = createSound("block.bell_cap.hit");
    public static final SoundEvent BLOCK_BELL_CAP_JINGLE = createSound("block.bell_cap.jingle");
    public static final SoundEvent BLOCK_BELL_CAP_STEP = createSound("block.bell_cap.step");
    public static final SoundEvent BLOCK_BOO_LANTERN_HIDE = createSound("block.boo_lantern.hide");
    public static final SoundEvent BLOCK_BOO_LANTERN_REVEAL = createSound("block.boo_lantern.reveal");
    public static final SoundEvent BLOCK_BOWSER_LOCK_OPEN = createSound("block.bowser_lock.open");
    public static final SoundEvent BLOCK_DARK_PORTAL_TRAVEL = createSound("block.dark_portal.travel");
    public static final SoundEvent BLOCK_DASH_BLOCK_ACTIVATE = createSound("block.dash_block.activate");
    public static final SoundEvent BLOCK_DONUT_BLOCK_TRIGGER = createSound("block.donut_block.trigger");
    public static final SoundEvent BLOCK_EMPTY_BLOCK_STORE = createSound("block.empty_block.store");
    public static final SoundEvent BLOCK_GRASSY_TOADSTONE_BREAK = createSound("block.grassy_toadstone.break");
    public static final SoundEvent BLOCK_GRASSY_TOADSTONE_FALL = createSound("block.grassy_toadstone.fall");
    public static final SoundEvent BLOCK_GRASSY_TOADSTONE_HIT = createSound("block.grassy_toadstone.hit");
    public static final SoundEvent BLOCK_GRASSY_TOADSTONE_PLACE = createSound("block.grassy_toadstone.place");
    public static final SoundEvent BLOCK_GRASSY_TOADSTONE_STEP = createSound("block.grassy_toadstone.step");
    public static final SoundEvent BLOCK_ICY_SOIL_BREAK = createSound("block.icy_soil.break");
    public static final SoundEvent BLOCK_ICY_SOIL_FALL = createSound("block.icy_soil.fall");
    public static final SoundEvent BLOCK_ICY_SOIL_HIT = createSound("block.icy_soil.hit");
    public static final SoundEvent BLOCK_ICY_SOIL_PLACE = createSound("block.icy_soil.place");
    public static final SoundEvent BLOCK_ICY_SOIL_STEP = createSound("block.icy_soil.step");
    public static final SoundEvent BLOCK_ICY_STONE_BREAK = createSound("block.icy_stone.break");
    public static final SoundEvent BLOCK_ICY_STONE_FALL = createSound("block.icy_stone.fall");
    public static final SoundEvent BLOCK_ICY_STONE_HIT = createSound("block.icy_stone.hit");
    public static final SoundEvent BLOCK_ICY_STONE_PLACE = createSound("block.icy_stone.place");
    public static final SoundEvent BLOCK_ICY_STONE_STEP = createSound("block.icy_stone.step");
    public static final SoundEvent BLOCK_JELLYBEAM_ELECTROCUTE = createSound("block.jellybeam.damage");
    public static final SoundEvent BLOCK_ON_OFF_SWITCH = createSound("block.on_off_switch.activate");
    public static final SoundEvent BLOCK_POISON_BUBBLE = createSound("block.poison.bubble");
    public static final SoundEvent BLOCK_PORTAL_TRAVEL = createSound("block.portal.travel");
    public static final SoundEvent BLOCK_PORTAL_TRIGGER = createSound("block.portal.trigger");
    public static final SoundEvent BLOCK_POWER_STAR_AMBIENT = createSound("block.power_star.ambient");
    public static final SoundEvent BLOCK_POW_BLOCK_ACTIVATE = createSound("block.pow_block.activate");
    public static final SoundEvent BLOCK_PROPELLER_BLOCK_RISE = createSound("block.propeller_block.rise");
    public static final SoundEvent BLOCK_PULL_BLOCK_PULL = createSound("block.pull_block.pull");
    public static final SoundEvent BLOCK_P_SWITCH_CLICK = createSound("block.p_switch.click");
    public static final SoundEvent BLOCK_P_SWITCH_OFF = createSound("block.p_switch.off");
    public static final SoundEvent BLOCK_P_SWITCH_ON = createSound("block.p_switch.on");
    public static final SoundEvent BLOCK_QUESTION_BLOCK_ACTIVATE = createSound("block.question_block.activate");
    public static final SoundEvent BLOCK_QUESTION_BOX_SPAWN = createSound("block.question_box.spawn");
    public static final SoundEvent BLOCK_SHOREGRASS_BREAK = createSound("block.shoregrass.break");
    public static final SoundEvent BLOCK_SHOREGRASS_FALL = createSound("block.shoregrass.fall");
    public static final SoundEvent BLOCK_SHOREGRASS_HIT = createSound("block.shoregrass.hit");
    public static final SoundEvent BLOCK_SHOREGRASS_PLACE = createSound("block.shoregrass.place");
    public static final SoundEvent BLOCK_SHOREGRASS_STEP = createSound("block.shoregrass.step");
    public static final SoundEvent BLOCK_SPIKE_TRAP_EXTEND = createSound("block.spike_trap.extend");
    public static final SoundEvent BLOCK_SPIKE_TRAP_RETRACT = createSound("block.spike_trap.retract");
    public static final SoundEvent BLOCK_STONE_TORCH_AMBIENT = createSound("block.stone_torch.ambient");
    public static final SoundEvent BLOCK_TOADSTONE_BREAK = createSound("block.toadstone.break");
    public static final SoundEvent BLOCK_TOADSTONE_FALL = createSound("block.toadstone.fall");
    public static final SoundEvent BLOCK_TOADSTONE_HIT = createSound("block.toadstone.hit");
    public static final SoundEvent BLOCK_TOADSTONE_PLACE = createSound("block.toadstone.place");
    public static final SoundEvent BLOCK_TOADSTONE_STEP = createSound("block.toadstone.step");
    public static final SoundEvent BLOCK_TRAMPOLINE_RELEASE = createSound("block.trampoline.release");
    public static final SoundEvent BLOCK_WARP_PIPE_TELEPORT = createSound("block.warp_pipe.teleport");
    public static final SoundEvent BLOCK_YOSHI_EGG_HATCH = createSound("block.yoshi_egg.hatch");
    public static final SoundEvent ENTITY_BIG_GOOMBA_DEATH = createSound("entity.big_goomba.death");
    public static final SoundEvent ENTITY_BIG_GOOMBA_HURT = createSound("entity.big_goomba.hurt");
    public static final SoundEvent ENTITY_BIG_GOOMBA_STEP = createSound("entity.big_goomba.step");
    public static final SoundEvent ENTITY_BLOCKSTEPPER_ALARM = createSound("entity.blockstepper.alarm");
    public static final SoundEvent ENTITY_BLOCKSTEPPER_DEATH = createSound("entity.blockstepper.death");
    public static final SoundEvent ENTITY_BLOCKSTEPPER_HURT = createSound("entity.blockstepper.hurt");
    public static final SoundEvent ENTITY_BLOCKSTEPPER_MARCH = createSound("entity.blockstepper.march");
    public static final SoundEvent ENTITY_BLOCKSTEPPER_PANIC = createSound("entity.blockstepper.angry");
    public static final SoundEvent ENTITY_BLOCKSTEPPER_STEP = createSound("entity.blockstepper.step");
    public static final SoundEvent ENTITY_BLOOPER_FLOP = createSound("entity.blooper.flop");
    public static final SoundEvent ENTITY_BOB_OMB_AMBIENT = createSound("entity.bob_omb.ambient");
    public static final SoundEvent ENTITY_BOB_OMB_DEATH = createSound("entity.bob_omb.death");
    public static final SoundEvent ENTITY_BOB_OMB_FUSE = createSound("entity.bob_omb.fuse");
    public static final SoundEvent ENTITY_BOB_OMB_HURT = createSound("entity.bob_omb.hurt");
    public static final SoundEvent ENTITY_BOB_OMB_STEP = createSound("entity.bob_omb.step");
    public static final SoundEvent ENTITY_BOO_AMBIENT = createSound("entity.boo.ambient");
    public static final SoundEvent ENTITY_BOO_ATTACK = createSound("entity.boo.attack");
    public static final SoundEvent ENTITY_BOO_DEATH = createSound("entity.boo.death");
    public static final SoundEvent ENTITY_BOO_HURT = createSound("entity.boo.hurt");
    public static final SoundEvent ENTITY_BOO_SHY = createSound("entity.boo.shy");
    public static final SoundEvent ENTITY_BOO_STEAL = createSound("entity.boo.steal");
    public static final SoundEvent ENTITY_BULLET_IMPACT = createSound("entity.bullet.impact");
    public static final SoundEvent ENTITY_BULLET_SHOOT = createSound("entity.bullet.shoot");
    public static final SoundEvent ENTITY_CHEEP_CHEEP_DEATH = createSound("entity.cheep_cheep.death");
    public static final SoundEvent ENTITY_CHEEP_CHEEP_FLOP = createSound("entity.cheep_cheep.flop");
    public static final SoundEvent ENTITY_CHEEP_CHEEP_HURT = createSound("entity.cheep_cheep.hurt");
    public static final SoundEvent ENTITY_DINO_RHINO_AMBIENT = createSound("entity.dino_rhino.ambient");
    public static final SoundEvent ENTITY_DINO_RHINO_DEATH = createSound("entity.dino_rhino.death");
    public static final SoundEvent ENTITY_DINO_RHINO_HURT = createSound("entity.dino_rhino.hurt");
    public static final SoundEvent ENTITY_DRY_BONES_DEATH = createSound("entity.dry_bones.death");
    public static final SoundEvent ENTITY_DRY_BONES_HURT = createSound("entity.dry_bones.hurt");
    public static final SoundEvent ENTITY_DRY_BONES_WAKE = createSound("entity.dry_bones.wake");
    public static final SoundEvent ENTITY_FIREBALL_BOUNCE = createSound("entity.fireball.bounce");
    public static final SoundEvent ENTITY_FIREBALL_HIT = createSound("entity.fireball.hit");
    public static final SoundEvent ENTITY_FUZZY_BREAK_ITEM = createSound("entity.fuzzy.break_item");
    public static final SoundEvent ENTITY_GENERIC_EAT = createSound("entity.generic.eat");
    public static final SoundEvent ENTITY_GENERIC_FLUTTER = createSound("entity.generic.flutter");
    public static final SoundEvent ENTITY_GENERIC_JUMP = createSound("entity.generic.jump");
    public static final SoundEvent ENTITY_GENERIC_JUMP_ATTACK = createSound("entity.generic.jump_attack");
    public static final SoundEvent ENTITY_GENERIC_JUMP_BOUNCE = createSound("entity.generic.jump_bounce");
    public static final SoundEvent ENTITY_GENERIC_POWER_DOWN = createSound("entity.generic.power_down");
    public static final SoundEvent ENTITY_GENERIC_POWER_UP = createSound("entity.generic.power_up");
    public static final SoundEvent ENTITY_GENERIC_SPOT = createSound("entity.generic.spot");
    public static final SoundEvent ENTITY_GENERIC_TAIL_ATTACK = createSound("entity.generic.tail_attack");
    public static final SoundEvent ENTITY_GENERIC_TRANSFORM = createSound("entity.generic.transform");
    public static final SoundEvent ENTITY_GOOMBA_AMBIENT = createSound("entity.goomba.ambient");
    public static final SoundEvent ENTITY_GOOMBA_DEATH = createSound("entity.goomba.death");
    public static final SoundEvent ENTITY_GOOMBA_HURT = createSound("entity.goomba.hurt");
    public static final SoundEvent ENTITY_GOOMBA_STEP = createSound("entity.goomba.step");
    public static final SoundEvent ENTITY_GO_KART_HORN = createSound("entity.go_kart.horn");
    public static final SoundEvent ENTITY_GO_KART_LOOP = createSound("entity.go_kart.loop");
    public static final SoundEvent ENTITY_GO_KART_LOOP_UNDERWATER = createSound("entity.go_kart.loop_underwater");
    public static final SoundEvent ENTITY_ICEBALL_BOUNCE = createSound("entity.iceball.bounce");
    public static final SoundEvent ENTITY_ICEBALL_FREEZE = createSound("entity.iceball.freeze");
    public static final SoundEvent ENTITY_ICEBALL_HIT = createSound("entity.iceball.hit");
    public static final SoundEvent ENTITY_KING_BOB_OMB_DEATH = createSound("entity.king_bob_omb.death");
    public static final SoundEvent ENTITY_KING_BOB_OMB_HURT = createSound("entity.king_bob_omb.hurt");
    public static final SoundEvent ENTITY_KING_BOB_OMB_LAUGH = createSound("entity.king_bob_omb.laugh");
    public static final SoundEvent ENTITY_KING_BOB_OMB_STEP = createSound("entity.king_bob_omb.step");
    public static final SoundEvent ENTITY_KING_BOB_OMB_THROW = createSound("entity.king_bob_omb.throw");
    public static final SoundEvent ENTITY_KING_BOO_AMBIENT = createSound("entity.king_boo.ambient");
    public static final SoundEvent ENTITY_KING_BOO_CHARGE = createSound("entity.king_boo.charge");
    public static final SoundEvent ENTITY_KING_BOO_DEATH = createSound("entity.king_boo.death");
    public static final SoundEvent ENTITY_KING_BOO_HURT = createSound("entity.king_boo.hurt");
    public static final SoundEvent ENTITY_KING_BOO_UNLEASH = createSound("entity.king_boo.unleash");
    public static final SoundEvent ENTITY_KING_BOO_WEAKENED = createSound("entity.king_boo.weakened");
    public static final SoundEvent ENTITY_KOOPA_TROOPA_AMBIENT = createSound("entity.koopa_troopa.ambient");
    public static final SoundEvent ENTITY_KOOPA_TROOPA_DEATH = createSound("entity.koopa_troopa.death");
    public static final SoundEvent ENTITY_KOOPA_TROOPA_HURT = createSound("entity.koopa_troopa.hurt");
    public static final SoundEvent ENTITY_LAUNCH_STAR_AMBIENT = createSound("entity.launch_star.ambient");
    public static final SoundEvent ENTITY_LAUNCH_STAR_PLACE = createSound("entity.launch_star.place");
    public static final SoundEvent ENTITY_LAUNCH_STAR_USE = createSound("entity.launch_star.use");
    public static final SoundEvent ENTITY_LAVA_BUBBLE_DEATH = createSound("entity.lava_bubble.death");
    public static final SoundEvent ENTITY_LAVA_BUBBLE_HURT = createSound("entity.lava_bubble.hurt");
    public static final SoundEvent ENTITY_LAVA_BUBBLE_JUMP = createSound("entity.lava_bubble.jump");
    public static final SoundEvent ENTITY_MAILTOAD_RESTOCK = createSound("entity.mailtoad.restock");
    public static final SoundEvent ENTITY_MECHAKOOPA_CHARGE = createSound("entity.mechakoopa.charge");
    public static final SoundEvent ENTITY_MECHAKOOPA_DEATH = createSound("entity.mechakoopa.death");
    public static final SoundEvent ENTITY_MECHAKOOPA_HURT = createSound("entity.mechakoopa.hurt");
    public static final SoundEvent ENTITY_MECHAKOOPA_STEP = createSound("entity.mechakoopa.step");
    public static final SoundEvent ENTITY_MECHAKOOPA_ZAP = createSound("entity.mechakoopa.zap");
    public static final SoundEvent ENTITY_MINI_GOOMBA_DEATH = createSound("entity.mini_goomba.death");
    public static final SoundEvent ENTITY_MINI_GOOMBA_STEP = createSound("entity.mini_goomba.step");
    public static final SoundEvent ENTITY_MOO_MOO_BELL = createSound("entity.moo_moo.bell");
    public static final SoundEvent ENTITY_MUD_TROOPER_AMBIENT = createSound("entity.mud_trooper.ambient");
    public static final SoundEvent ENTITY_MUD_TROOPER_DEATH = createSound("entity.mud_trooper.death");
    public static final SoundEvent ENTITY_MUD_TROOPER_HURT = createSound("entity.mud_trooper.hurt");
    public static final SoundEvent ENTITY_MUMMY_ME_AMBIENT = createSound("entity.mummy_me.ambient");
    public static final SoundEvent ENTITY_MUMMY_ME_DEATH = createSound("entity.mummy_me.death");
    public static final SoundEvent ENTITY_MUMMY_ME_HURT = createSound("entity.mummy_me.hurt");
    public static final SoundEvent ENTITY_MUMMY_ME_MAGIC = createSound("entity.mummy_me.magic");
    public static final SoundEvent ENTITY_MUMMY_ME_MUMMIFY = createSound("entity.mummy_me.mummify");
    public static final SoundEvent ENTITY_PIRANHA_PLANT_ATTACK = createSound("entity.piranha_plant.attack");
    public static final SoundEvent ENTITY_PIRANHA_PLANT_BITE = createSound("entity.piranha_plant.bite");
    public static final SoundEvent ENTITY_PIRANHA_PLANT_DEATH = createSound("entity.piranha_plant.death");
    public static final SoundEvent ENTITY_PIRANHA_PLANT_HURT = createSound("entity.piranha_plant.hurt");
    public static final SoundEvent ENTITY_PIRANHA_PLANT_POISON = createSound("entity.piranha_plant.poison");
    public static final SoundEvent ENTITY_PIRANHA_PLANT_SLEEP = createSound("entity.piranha_plant.sleep");
    public static final SoundEvent ENTITY_SHELL_HIT = createSound("entity.shell.hit");
    public static final SoundEvent ENTITY_SHY_GUY_AMBIENT = createSound("entity.shy_guy.ambient");
    public static final SoundEvent ENTITY_SHY_GUY_DEATH = createSound("entity.shy_guy.death");
    public static final SoundEvent ENTITY_SHY_GUY_HURT = createSound("entity.shy_guy.hurt");
    public static final SoundEvent ENTITY_SPINDRIFT_DEATH = createSound("entity.spindrift.death");
    public static final SoundEvent ENTITY_SPINY_DEATH = createSound("entity.spiny.death");
    public static final SoundEvent ENTITY_SPINY_HURT = createSound("entity.spiny.hurt");
    public static final SoundEvent ENTITY_STAMP_BREAK = createSound("entity.stamp.break");
    public static final SoundEvent ENTITY_STAMP_PLACE = createSound("entity.stamp.place");
    public static final SoundEvent ENTITY_TOAD_AMBIENT = createSound("entity.toad.ambient");
    public static final SoundEvent ENTITY_TOAD_CHEER = createSound("entity.toad.cheer");
    public static final SoundEvent ENTITY_TOAD_DEATH = createSound("entity.toad.death");
    public static final SoundEvent ENTITY_TOAD_HURT = createSound("entity.toad.hurt");
    public static final SoundEvent ENTITY_THWOMP_FALL = createSound("entity.thwomp.fall");
    public static final SoundEvent ENTITY_THWOMP_LAND = createSound("entity.thwomp.land");
    public static final SoundEvent ENTITY_THWOMP_REST = createSound("entity.thwomp.rest");
    public static final SoundEvent ENTITY_THWOMP_HURT = createSound("entity.thwomp.hurt");
    public static final SoundEvent ENTITY_THWOMP_DEATH = createSound("entity.thwomp.death");
    public static final SoundEvent ENTITY_UNAGI_DEATH = createSound("entity.unagi.death");
    public static final SoundEvent ENTITY_UNAGI_FLOP = createSound("entity.unagi.flop");
    public static final SoundEvent ENTITY_YOSHI_AMBIENT = createSound("entity.yoshi.ambient");
    public static final SoundEvent ENTITY_YOSHI_DEATH = createSound("entity.yoshi.death");
    public static final SoundEvent ENTITY_YOSHI_EAT = createSound("entity.yoshi.eat");
    public static final SoundEvent ENTITY_YOSHI_FLUTTER = createSound("entity.yoshi.flutter");
    public static final SoundEvent ENTITY_YOSHI_HURT = createSound("entity.yoshi.hurt");
    public static final SoundEvent ENTITY_YOSHI_MOUNT = createSound("entity.yoshi.mount");
    public static final SoundEvent ENTITY_YOSHI_REACH = createSound("entity.yoshi.reach");
    public static final SoundEvent ENTITY_YOSHI_SPIT = createSound("entity.yoshi.spit");
    public static final SoundEvent ENTITY_YOSHI_STEP = createSound("entity.yoshi.step");
    public static final SoundEvent ENTITY_YOSHI_SWALLOW = createSound("entity.yoshi.swallow");
    public static final SoundEvent ITEM_COIN = createSound("item.coin.pickup");
    public static final SoundEvent ITEM_FIRE_FLOWER = createSound("item.fire_flower.shoot");
    public static final SoundEvent ITEM_ICE_FLOWER = createSound("item.ice_flower.shoot");
    public static final SoundEvent ITEM_LIFE_MUSHROOM = createSound("item.life_mushroom.use");
    public static final SoundEvent ITEM_ONE_UP = createSound("item.one_up.eat");
    public static final SoundEvent ITEM_POISON_MUSHROOM = createSound("item.poison_mushroom.eat");
    public static final SoundEvent ITEM_STAR_BIT = createSound("item.star_bit.pickup");
    public static final SoundEvent ITEM_STAR_COIN = createSound("item.star_coin.pickup");
    public static final SoundEvent ITEM_SUPER_HEART = createSound("item.super_heart.heal");
    public static final SoundEvent ITEM_SUPER_MUSHROOM = createSound("item.super_mushroom.eat");
    public static final SoundEvent ITEM_THROW = createSound("item.generic.throw");
    public static final SoundEvent ITEM_WARP_LINK_BREAK = createSound("item.warp_link.break");
    public static final SoundEvent ITEM_WARP_LINK_END = createSound("item.warp_link.end");
    public static final SoundEvent ITEM_WARP_LINK_RESET = createSound("item.warp_link.reset");
    public static final SoundEvent ITEM_WARP_LINK_START = createSound("item.warp_link.start");
    public static final SoundEvent MUSIC_WATER = createSound("music.water");
    public static final SoundEvent MUSIC_AMANITA_FOREST = createSound("music.forest");
    public static final SoundEvent MUSIC_BOSS_1 = createSound("music.boss.1");
    public static final SoundEvent MUSIC_BOSS_2 = createSound("music.boss.2");
    public static final SoundEvent MUSIC_CAVE = createSound("music.cave");
    public static final SoundEvent MUSIC_DAYTIME = createSound("music.day");
    public static final SoundEvent MUSIC_DISC_MY_SONG = createSound("music.disc.my_song");
    public static final SoundEvent MUSIC_DISC_TRAPPED = createSound("music.disc.trapped");
    public static final SoundEvent MUSIC_DISC_WALTZ_OF_THE_LOST = createSound("music.disc.waltz_of_the_lost");
    public static final SoundEvent MUSIC_GHOST_HOUSE = createSound("music.ghost_house");
    public static final SoundEvent MUSIC_LAVA = createSound("music.lava");
    public static final SoundEvent MUSIC_NIGHTTIME = createSound("music.night");
    public static final SoundEvent MUSIC_STARMAN = createSound("music.starman");
    public static final SoundEvent MUSIC_STARMAN_LEAD = createSound("music.starman_lead");
    public static final SoundEvent NOTE_BLOCK_BLING = createSound("block.note_block.bling");
    public static final SoundEvent NOTE_BLOCK_BLOCK = createSound("block.note_block.block");
    public static final SoundEvent NOTE_BLOCK_CHOIR = createSound("block.note_block.choir");
    public static final SoundEvent NOTE_BLOCK_DINODRUM = createSound("block.note_block.dinodrum");
    public static final SoundEvent NOTE_BLOCK_PAN_FLUTE = createSound("block.note_block.pan_flute");
    public static final SoundEvent ENTITY_STINGBY_HURT = createSound("entity.stingby.hurt");
    public static final SoundEvent ENTITY_STINGBY_DEATH = createSound("entity.stingby.death");
    public static final SoundEvent ENTITY_STINGBY_AMBIENT = createSound("entity.stingby.ambient");

    private static SoundEvent createSound(String string) {
        return new SoundEvent(new Identifier(Main.MOD_ID, string));
    }

    private static void registerSound(SoundEvent type) {
        Registry.register(Registry.SOUND_EVENT, type.getId(), type);
    }

    public static void initSounds() {
        registerSound(AMBIENT_CAVE);
        registerSound(BLOCK_BELL_CAP_FALL);
        registerSound(BLOCK_BELL_CAP_HIT);
        registerSound(BLOCK_BELL_CAP_JINGLE);
        registerSound(BLOCK_BELL_CAP_STEP);
        registerSound(BLOCK_BOO_LANTERN_HIDE);
        registerSound(BLOCK_BOO_LANTERN_REVEAL);
        registerSound(BLOCK_BOWSER_LOCK_OPEN);
        registerSound(BLOCK_DARK_PORTAL_TRAVEL);
        registerSound(BLOCK_DASH_BLOCK_ACTIVATE);
        registerSound(BLOCK_DONUT_BLOCK_TRIGGER);
        registerSound(BLOCK_EMPTY_BLOCK_STORE);
        registerSound(BLOCK_GRASSY_TOADSTONE_BREAK);
        registerSound(BLOCK_GRASSY_TOADSTONE_FALL);
        registerSound(BLOCK_GRASSY_TOADSTONE_HIT);
        registerSound(BLOCK_GRASSY_TOADSTONE_PLACE);
        registerSound(BLOCK_GRASSY_TOADSTONE_STEP);
        registerSound(BLOCK_ICY_SOIL_BREAK);
        registerSound(BLOCK_ICY_SOIL_FALL);
        registerSound(BLOCK_ICY_SOIL_HIT);
        registerSound(BLOCK_ICY_SOIL_PLACE);
        registerSound(BLOCK_ICY_SOIL_STEP);
        registerSound(BLOCK_ICY_STONE_BREAK);
        registerSound(BLOCK_ICY_STONE_FALL);
        registerSound(BLOCK_ICY_STONE_HIT);
        registerSound(BLOCK_ICY_STONE_PLACE);
        registerSound(BLOCK_ICY_STONE_STEP);
        registerSound(BLOCK_JELLYBEAM_ELECTROCUTE);
        registerSound(BLOCK_ON_OFF_SWITCH);
        registerSound(BLOCK_POISON_BUBBLE);
        registerSound(BLOCK_PORTAL_TRAVEL);
        registerSound(BLOCK_PORTAL_TRIGGER);
        registerSound(BLOCK_POWER_STAR_AMBIENT);
        registerSound(BLOCK_POW_BLOCK_ACTIVATE);
        registerSound(BLOCK_PROPELLER_BLOCK_RISE);
        registerSound(BLOCK_PULL_BLOCK_PULL);
        registerSound(BLOCK_P_SWITCH_CLICK);
        registerSound(BLOCK_P_SWITCH_OFF);
        registerSound(BLOCK_P_SWITCH_ON);
        registerSound(BLOCK_QUESTION_BLOCK_ACTIVATE);
        registerSound(BLOCK_QUESTION_BOX_SPAWN);
        registerSound(BLOCK_SHOREGRASS_BREAK);
        registerSound(BLOCK_SHOREGRASS_FALL);
        registerSound(BLOCK_SHOREGRASS_HIT);
        registerSound(BLOCK_SHOREGRASS_PLACE);
        registerSound(BLOCK_SHOREGRASS_STEP);
        registerSound(BLOCK_SPIKE_TRAP_EXTEND);
        registerSound(BLOCK_SPIKE_TRAP_RETRACT);
        registerSound(BLOCK_STONE_TORCH_AMBIENT);
        registerSound(BLOCK_TOADSTONE_BREAK);
        registerSound(BLOCK_TOADSTONE_FALL);
        registerSound(BLOCK_TOADSTONE_HIT);
        registerSound(BLOCK_TOADSTONE_PLACE);
        registerSound(BLOCK_TOADSTONE_STEP);
        registerSound(BLOCK_TRAMPOLINE_RELEASE);
        registerSound(BLOCK_WARP_PIPE_TELEPORT);
        registerSound(BLOCK_YOSHI_EGG_HATCH);
        registerSound(ENTITY_BLOCKSTEPPER_ALARM);
        registerSound(ENTITY_BLOCKSTEPPER_DEATH);
        registerSound(ENTITY_BLOCKSTEPPER_HURT);
        registerSound(ENTITY_BLOCKSTEPPER_MARCH);
        registerSound(ENTITY_BLOCKSTEPPER_STEP);
        registerSound(ENTITY_BLOOPER_FLOP);
        registerSound(ENTITY_BOB_OMB_AMBIENT);
        registerSound(ENTITY_BOB_OMB_DEATH);
        registerSound(ENTITY_BOB_OMB_FUSE);
        registerSound(ENTITY_BOB_OMB_HURT);
        registerSound(ENTITY_BOB_OMB_STEP);
        registerSound(ENTITY_BOO_AMBIENT);
        registerSound(ENTITY_BOO_ATTACK);
        registerSound(ENTITY_BOO_DEATH);
        registerSound(ENTITY_BOO_HURT);
        registerSound(ENTITY_BOO_SHY);
        registerSound(ENTITY_BOO_STEAL);
        registerSound(ENTITY_BULLET_IMPACT);
        registerSound(ENTITY_BULLET_SHOOT);
        registerSound(ENTITY_CHEEP_CHEEP_DEATH);
        registerSound(ENTITY_CHEEP_CHEEP_FLOP);
        registerSound(ENTITY_CHEEP_CHEEP_HURT);
        registerSound(ENTITY_DINO_RHINO_AMBIENT);
        registerSound(ENTITY_DINO_RHINO_DEATH);
        registerSound(ENTITY_DINO_RHINO_HURT);
        registerSound(ENTITY_DRY_BONES_DEATH);
        registerSound(ENTITY_DRY_BONES_HURT);
        registerSound(ENTITY_DRY_BONES_WAKE);
        registerSound(ENTITY_FIREBALL_BOUNCE);
        registerSound(ENTITY_FIREBALL_HIT);
        registerSound(ENTITY_FUZZY_BREAK_ITEM);
        registerSound(ENTITY_GENERIC_EAT);
        registerSound(ENTITY_GENERIC_FLUTTER);
        registerSound(ENTITY_GENERIC_JUMP);
        registerSound(ENTITY_GENERIC_JUMP_ATTACK);
        registerSound(ENTITY_GENERIC_JUMP_BOUNCE);
        registerSound(ENTITY_GENERIC_POWER_DOWN);
        registerSound(ENTITY_GENERIC_POWER_UP);
        registerSound(ENTITY_GENERIC_SPOT);
        registerSound(ENTITY_GENERIC_TAIL_ATTACK);
        registerSound(ENTITY_GENERIC_TRANSFORM);
        registerSound(ENTITY_GOOMBA_AMBIENT);
        registerSound(ENTITY_GOOMBA_DEATH);
        registerSound(ENTITY_GOOMBA_HURT);
        registerSound(ENTITY_GO_KART_HORN);
        registerSound(ENTITY_GO_KART_LOOP);
        registerSound(ENTITY_GO_KART_LOOP_UNDERWATER);
        registerSound(ENTITY_ICEBALL_BOUNCE);
        registerSound(ENTITY_ICEBALL_HIT);
        registerSound(ENTITY_KING_BOB_OMB_DEATH);
        registerSound(ENTITY_KING_BOB_OMB_HURT);
        registerSound(ENTITY_KING_BOB_OMB_LAUGH);
        registerSound(ENTITY_KING_BOB_OMB_STEP);
        registerSound(ENTITY_KING_BOB_OMB_THROW);
        registerSound(ENTITY_KING_BOO_AMBIENT);
        registerSound(ENTITY_KING_BOO_CHARGE);
        registerSound(ENTITY_KING_BOO_DEATH);
        registerSound(ENTITY_KING_BOO_HURT);
        registerSound(ENTITY_KING_BOO_UNLEASH);
        registerSound(ENTITY_KING_BOO_WEAKENED);
        registerSound(ENTITY_KOOPA_TROOPA_AMBIENT);
        registerSound(ENTITY_KOOPA_TROOPA_DEATH);
        registerSound(ENTITY_KOOPA_TROOPA_HURT);
        registerSound(ENTITY_LAUNCH_STAR_AMBIENT);
        registerSound(ENTITY_LAUNCH_STAR_PLACE);
        registerSound(ENTITY_LAUNCH_STAR_USE);
        registerSound(ENTITY_LAVA_BUBBLE_DEATH);
        registerSound(ENTITY_LAVA_BUBBLE_HURT);
        registerSound(ENTITY_LAVA_BUBBLE_JUMP);
        registerSound(ENTITY_MAILTOAD_RESTOCK);
        registerSound(ENTITY_MECHAKOOPA_CHARGE);
        registerSound(ENTITY_MECHAKOOPA_DEATH);
        registerSound(ENTITY_MECHAKOOPA_HURT);
        registerSound(ENTITY_MECHAKOOPA_STEP);
        registerSound(ENTITY_MECHAKOOPA_ZAP);
        registerSound(ENTITY_MOO_MOO_BELL);
        registerSound(ENTITY_MUD_TROOPER_AMBIENT);
        registerSound(ENTITY_MUD_TROOPER_DEATH);
        registerSound(ENTITY_MUD_TROOPER_HURT);
        registerSound(ENTITY_MUMMY_ME_AMBIENT);
        registerSound(ENTITY_MUMMY_ME_DEATH);
        registerSound(ENTITY_MUMMY_ME_HURT);
        registerSound(ENTITY_MUMMY_ME_MAGIC);
        registerSound(ENTITY_MUMMY_ME_MUMMIFY);
        registerSound(ENTITY_PIRANHA_PLANT_ATTACK);
        registerSound(ENTITY_PIRANHA_PLANT_BITE);
        registerSound(ENTITY_PIRANHA_PLANT_DEATH);
        registerSound(ENTITY_PIRANHA_PLANT_HURT);
        registerSound(ENTITY_PIRANHA_PLANT_POISON);
        registerSound(ENTITY_PIRANHA_PLANT_SLEEP);
        registerSound(ENTITY_SHELL_HIT);
        registerSound(ENTITY_SHY_GUY_AMBIENT);
        registerSound(ENTITY_SHY_GUY_DEATH);
        registerSound(ENTITY_SHY_GUY_HURT);
        registerSound(ENTITY_SPINDRIFT_DEATH);
        registerSound(ENTITY_SPINY_DEATH);
        registerSound(ENTITY_SPINY_HURT);
        registerSound(ENTITY_STAMP_BREAK);
        registerSound(ENTITY_STAMP_PLACE);
        registerSound(ENTITY_TOAD_AMBIENT);
        registerSound(ENTITY_TOAD_CHEER);
        registerSound(ENTITY_TOAD_DEATH);
        registerSound(ENTITY_TOAD_HURT);
        registerSound(ENTITY_THWOMP_DEATH);
        registerSound(ENTITY_THWOMP_FALL);
        registerSound(ENTITY_THWOMP_REST);
        registerSound(ENTITY_THWOMP_LAND);
        registerSound(ENTITY_THWOMP_HURT);
        registerSound(ENTITY_UNAGI_DEATH);
        registerSound(ENTITY_UNAGI_FLOP);
        registerSound(ENTITY_YOSHI_DEATH);
        registerSound(ENTITY_YOSHI_EAT);
        registerSound(ENTITY_YOSHI_FLUTTER);
        registerSound(ENTITY_YOSHI_HURT);
        registerSound(ENTITY_YOSHI_MOUNT);
        registerSound(ENTITY_YOSHI_REACH);
        registerSound(ENTITY_YOSHI_SPIT);
        registerSound(ENTITY_YOSHI_STEP);
        registerSound(ENTITY_YOSHI_SWALLOW);
        registerSound(ITEM_COIN);
        registerSound(ITEM_FIRE_FLOWER);
        registerSound(ITEM_ICE_FLOWER);
        registerSound(ITEM_LIFE_MUSHROOM);
        registerSound(ITEM_ONE_UP);
        registerSound(ITEM_POISON_MUSHROOM);
        registerSound(ITEM_STAR_BIT);
        registerSound(ITEM_STAR_COIN);
        registerSound(ITEM_SUPER_HEART);
        registerSound(ITEM_SUPER_MUSHROOM);
        registerSound(ITEM_THROW);
        registerSound(ITEM_WARP_LINK_BREAK);
        registerSound(ITEM_WARP_LINK_END);
        registerSound(ITEM_WARP_LINK_RESET);
        registerSound(ITEM_WARP_LINK_START);
        registerSound(MUSIC_WATER);
        registerSound(MUSIC_AMANITA_FOREST);
        registerSound(MUSIC_BOSS_1);
        registerSound(MUSIC_BOSS_2);
        registerSound(MUSIC_CAVE);
        registerSound(MUSIC_DAYTIME);
        registerSound(MUSIC_DISC_MY_SONG);
        registerSound(MUSIC_DISC_TRAPPED);
        registerSound(MUSIC_DISC_WALTZ_OF_THE_LOST);
        registerSound(MUSIC_GHOST_HOUSE);
        registerSound(MUSIC_LAVA);
        registerSound(MUSIC_NIGHTTIME);
        registerSound(MUSIC_STARMAN);
        registerSound(MUSIC_STARMAN_LEAD);
        registerSound(NOTE_BLOCK_BLING);
        registerSound(NOTE_BLOCK_BLOCK);
        registerSound(NOTE_BLOCK_CHOIR);
        registerSound(NOTE_BLOCK_DINODRUM);
        registerSound(NOTE_BLOCK_PAN_FLUTE);
        registerSound(ENTITY_STINGBY_AMBIENT);
        registerSound(ENTITY_STINGBY_DEATH);
        registerSound(ENTITY_STINGBY_HURT);
    }
}
