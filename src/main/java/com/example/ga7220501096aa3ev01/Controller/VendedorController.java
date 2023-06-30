package com.example.ga7220501096aa3ev01.Controller;

import com.example.ga7220501096aa3ev01.Models.Vendedor;
import com.example.ga7220501096aa3ev01.Repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VendedorController {

    @Autowired
    VehiculoRepository vehiculoRepository;

    @GetMapping(value = "/vendedores")
    public List<Vendedor> obtenerVendedores() {
        return vehiculoRepository.findAll();
    }

    @PostMapping(value = "/vendedores")
    public Vendedor crearVendedor(@RequestBody Vendedor vendedor) {
        vehiculoRepository.save(vendedor);
        return vendedor;
    }

    @DeleteMapping(value = "/vendedores/{id}")
    public boolean eliminarVendedor(@PathVariable int id) {
        try {
            vehiculoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @PutMapping(value = "/vendedores/{id}")
    public Vendedor actualizarVendedor(@PathVariable int id, @RequestBody Vendedor vendedor) {
        Vendedor vendedorActualizado = vehiculoRepository.findById(id).get();
        // Actualizar los datos del vendedor con los valores proporcionados
        vendedorActualizado.setNombres(vendedor.getNombres());
        vendedorActualizado.setApellidos(vendedor.getApellidos());
        vendedorActualizado.setTipo_identificacion(vendedor.getTipo_identificacion());
        vendedorActualizado.setNumero_identificacion(vendedor.getNumero_identificacion());
        vendedorActualizado.setCorreo(vendedor.getCorreo());
        vendedorActualizado.setCelular(vendedor.getCelular());
        vendedorActualizado.setFecha_nacimiento(vendedor.getFecha_nacimiento());
        vendedorActualizado.setDireccion(vendedor.getDireccion());
        vendedorActualizado.setClave(vendedor.getClave());

        try {
            vehiculoRepository.save(vendedorActualizado); // Guardar el vendedor actualizado en la base de datos
            return vendedorActualizado;
        } catch (Exception e) {
            return null;
        }
    }
}
