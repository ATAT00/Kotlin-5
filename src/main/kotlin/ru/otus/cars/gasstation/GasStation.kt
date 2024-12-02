package ru.otus.cars.gasstation

import ru.otus.cars.Car
import ru.otus.cars.fuel.TankMouth

class GasStation {
    fun fillUpCar(car: Car, liters: Int){
        try {
            when(car.tankMouth){
                is TankMouth.LpgTankMouth -> fillWithLpg(car, liters)
                is TankMouth.PetrolTankMouth -> fillWithPetrol(car, liters)
            }
        } catch (e: Error) {
            println("Что-то пошло не там при заправке: ${e.message}")
        }
    }

    private fun fillWithLpg(car: Car, liters: Int) {
        car.tankMouth.open()
        car.tankMouth.fill(liters)
        car.tankMouth.close()
        println("Заправил $liters газа")
    }

    private fun fillWithPetrol(car: Car, liters: Int) {
        car.tankMouth.open()
        car.tankMouth.fill(liters)
        car.tankMouth.close()
        println("Заправил $liters бензина")
    }
}