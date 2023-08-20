package dev.lyonssp

import dev.lyonssp.petstore.api.PetsApi
import dev.lyonssp.petstore.model.Pet
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller
class PetsController : PetsApi {
    @Get
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        return "Hello World"
    }

    override fun createPets(): HttpResponse<Void> {
        return HttpResponse.ok()
    }

    override fun listPets(limit: Int?): HttpResponse<MutableList<Pet>> {
        return HttpResponse.ok()
    }

    override fun showPetById(petId: String?): Pet {
        return Pet(1, "Fido")
    }
}