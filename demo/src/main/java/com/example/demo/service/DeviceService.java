package com.example.demo.service;

import com.example.demo.DTO.DeviceDTO;
import com.example.demo.model.Device;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.example.demo.repository.DeviceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {

    private DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository){
        this.deviceRepository = deviceRepository;
    }
    public List<Device> getAll(){
        return this.deviceRepository.findAll();
    }

    public void addDevice(DeviceDTO deviceDTO) {
        Device device = new Device( deviceDTO.getName(), deviceDTO.getType(), deviceDTO.getData());
        this.deviceRepository.save(device);
    }

    public void deleteDevice(Long id) {
        this.deviceRepository.deleteById(id);
    }
    public void updateDevice(Device device) {
        this.deviceRepository.save(device);

    }
}
