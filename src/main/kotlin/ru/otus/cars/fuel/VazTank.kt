package ru.otus.cars.fuel

class VazTank : Tank {
    override lateinit var mouth: TankMouth

    private var fuelAmount: Int = 0

    override fun getContents(): Int = fuelAmount

    override fun receiveFuel(liters: Int) {
        fuelAmount += liters
    }

}