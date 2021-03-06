package com.dayofpi.super_block_world.registry;

import com.dayofpi.super_block_world.common.entities.projectile.*;
import com.dayofpi.super_block_world.util.AmmoDispenserBehavior;
import com.dayofpi.super_block_world.util.EnumUtil;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.BlockPlacementDispenserBehavior;
import net.minecraft.block.dispenser.BoatDispenserBehavior;
import net.minecraft.block.dispenser.ItemDispenserBehavior;
import net.minecraft.block.dispenser.ProjectileDispenserBehavior;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class DispenserBehaviors {
    public static void register() {
        DispenserBlock.registerBehavior(ModItems.AMANITA_BOAT, new BoatDispenserBehavior(EnumUtil.AMANITA_BOAT));
        DispenserBlock.registerBehavior(ModItems.DARK_AMANITA_BOAT, new BoatDispenserBehavior(EnumUtil.DARK_AMANITA_BOAT));
        DispenserBlock.registerBehavior(ModItems.BELL_BOAT, new BoatDispenserBehavior(EnumUtil.BELL_BOAT));
        DispenserBlock.registerBehavior(ModItems.AMANITA_CHEST_BOAT, new BoatDispenserBehavior(EnumUtil.AMANITA_BOAT, true));
        DispenserBlock.registerBehavior(ModItems.DARK_AMANITA_CHEST_BOAT, new BoatDispenserBehavior(EnumUtil.DARK_AMANITA_BOAT, true));
        DispenserBlock.registerBehavior(ModItems.BELL_CHEST_BOAT, new BoatDispenserBehavior(EnumUtil.BELL_BOAT, true));

        DispenserBlock.registerBehavior(ModBlocks.TRAMPOLINE.asItem(), new BlockPlacementDispenserBehavior());
        DispenserBlock.registerBehavior(ModItems.FIRE_FLOWER, new AmmoDispenserBehavior.FireFlower());
        DispenserBlock.registerBehavior(ModItems.ICE_FLOWER, new AmmoDispenserBehavior.IceFlower());

        DispenserBlock.registerBehavior(ModBlocks.YOSHI_EGG.asItem(), new ProjectileDispenserBehavior() {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {
                return Util.make(new YoshiEggEntity(world, position.getX(), position.getY(), position.getZ()), (yoshiEggEntity) -> {
                    yoshiEggEntity.setItem(stack);
                    if (stack.getNbt() != null) {
                        yoshiEggEntity.readCustomDataFromNbt(BlockItem.getBlockEntityNbt(stack));
                        stack.setNbt(new NbtCompound());
                    }
                });
            }
        });
        DispenserBlock.registerBehavior(ModItems.HAMMER, new ProjectileDispenserBehavior() {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {
                return Util.make(new HammerEntity(world, position.getX(), position.getY(), position.getZ()), (hammerEntity) -> hammerEntity.setItem(stack));
            }
        });
        DispenserBlock.registerBehavior(ModItems.TURNIP, new ProjectileDispenserBehavior() {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {
                return Util.make(new TurnipEntity(world, position.getX(), position.getY(), position.getZ()), (turnipEntity) -> turnipEntity.setItem(stack));
            }
        });
        DispenserBlock.registerBehavior(ModItems.BOMB, new ProjectileDispenserBehavior() {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {
                return Util.make(new BombEntity(world, position.getX(), position.getY(), position.getZ()), (bombEntity) -> bombEntity.setItem(stack));
            }
        });
        DispenserBlock.registerBehavior(ModItems.SUPER_HEART, new ProjectileDispenserBehavior() {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {
                return Util.make(new SuperHeartEntity(world, position.getX(), position.getY(), position.getZ()), (superHeartEntity) -> superHeartEntity.setItem(stack));
            }
        });

        DispenserBlock.registerBehavior(ModItems.MECHAKOOPA, new ItemDispenserBehavior() {
            public ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {
                Direction direction = pointer.getBlockState().get(DispenserBlock.FACING);
                EntityType<?> entityType = ModEntities.MECHAKOOPA;

                try {
                    entityType.spawnFromItemStack(pointer.getWorld(), stack, null, pointer.getPos().offset(direction), SpawnReason.DISPENSER, direction != Direction.UP, false);
                } catch (Exception exception) {
                    LOGGER.error("Error while dispensing Mechakoopa from dispenser at {}", pointer.getPos(), exception);
                    return ItemStack.EMPTY;
                }

                stack.decrement(1);
                pointer.getWorld().emitGameEvent(null, GameEvent.ENTITY_PLACE, pointer.getPos());
                return stack;
            }
        });

        DispenserBlock.registerBehavior(ModItems.GOO_ME, new ItemDispenserBehavior() {
            public ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {
                Direction direction = pointer.getBlockState().get(DispenserBlock.FACING);
                EntityType<?> entityType = ModEntities.GOO_ME;

                try {
                    entityType.spawnFromItemStack(pointer.getWorld(), stack, null, pointer.getPos().offset(direction), SpawnReason.DISPENSER, direction != Direction.UP, false);
                } catch (Exception exception) {
                    LOGGER.error("Error while dispensing GooMe from dispenser at {}", pointer.getPos(), exception);
                    return ItemStack.EMPTY;
                }

                stack.decrement(1);
                pointer.getWorld().emitGameEvent(null, GameEvent.ENTITY_PLACE, pointer.getPos());
                return stack;
            }
        });

        DispenserBlock.registerBehavior(ModItems.GO_KART, new ItemDispenserBehavior() {
            public ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {
                Direction direction = pointer.getBlockState().get(DispenserBlock.FACING);
                EntityType<?> entityType = ModEntities.GO_KART;

                try {
                    entityType.spawnFromItemStack(pointer.getWorld(), stack, null, pointer.getPos().offset(direction), SpawnReason.DISPENSER, direction != Direction.UP, false);
                } catch (Exception exception) {
                    LOGGER.error("Error while dispensing Go-Kart from dispenser at {}", pointer.getPos(), exception);
                    return ItemStack.EMPTY;
                }

                stack.decrement(1);
                pointer.getWorld().emitGameEvent(null, GameEvent.ENTITY_PLACE, pointer.getPos());
                return stack;
            }
        });
    }
}
