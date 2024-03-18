package in.nitingrover.BookMyShow.controller;

import in.nitingrover.BookMyShow.dto.CityRequestDTO;
import in.nitingrover.BookMyShow.model.City;
import in.nitingrover.BookMyShow.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("/city")
    public ResponseEntity createCity(@RequestBody CityRequestDTO cityRequestDTO){
        try{
            String cityName = cityRequestDTO.getName();
            if(cityName == null || cityName.isBlank() || cityName.isEmpty()){
                throw new Exception("City name is invalid");
            }
            City savedCity = cityService.saveCity(cityName);
            return ResponseEntity.ok(savedCity);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
