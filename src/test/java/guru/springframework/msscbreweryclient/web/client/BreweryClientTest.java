package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getBeerById() {

        // Act
        BeerDto dto = client.getBeerById(UUID.randomUUID());

        // Assert
        assertNotNull(dto);

    }

    @Test
    void saveNewBeer() {

        // Arrange
        BeerDto dto = BeerDto.builder().beerName("New Beer").build();

        // Act
        URI uri = client.saveNewBeer(dto);

        // Assert
        assertNotNull(uri);

    }

    @Test
    void updateBeer() {

        // Arrange
        BeerDto dto = BeerDto.builder().beerName("New Beer").build();

        // Act
        client.updateBeer(UUID.randomUUID(), dto);

    }
}