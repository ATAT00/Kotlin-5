package ru.otus.cars.fuel

sealed class TankMouth(private val tank: Tank) {
    fun open() {
        println("Горловина открыта")
    }

    fun close() {
        println("Горловина закрыта")
    }

    fun fill(liters: Int) {
        tank.receiveFuel(liters)
    }

    class LpgTankMouth(tank: Tank) : TankMouth(tank)
    class PetrolTankMouth(tank: Tank) : TankMouth(tank)
}

