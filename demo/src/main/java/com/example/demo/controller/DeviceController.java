package com.example.demo.controller;

import com.example.demo.DTO.DeviceDTO;
import com.example.demo.model.Device;
import com.example.demo.service.DeviceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;


@RestController
public class DeviceController {

    private DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/allDevices")
    public ResponseEntity<List<Device>> getAllDevices() {
        return new ResponseEntity<>(deviceService.getAll(), OK);
    }

    @PostMapping("/addNew")
    public ResponseEntity<String> addDevice(@RequestBody DeviceDTO device) {
        deviceService.addDevice(device);
        return new ResponseEntity<>(OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDevice(@PathVariable Long id){
        deviceService.deleteDevice(id);
        return new ResponseEntity<>(OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateDevice(@RequestBody Device device) {
        deviceService.updateDevice(device);
        return new ResponseEntity<>(OK);
    }


}
