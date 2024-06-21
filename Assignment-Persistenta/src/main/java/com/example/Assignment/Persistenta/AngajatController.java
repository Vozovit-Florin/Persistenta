package com.example.Assignment.Persistenta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AngajatController {
    @Autowired
    AngajatDao angajatDao;

    @GetMapping("/angajati")
    @ResponseBody
    public List<Angajat>showAllAngajati(){
        return angajatDao.findAll();
    }
    @GetMapping("/insertAngajati")
    @ResponseBody
    public Angajat insertDummyAngajati(){
        Angajat angajat = new Angajat();
        angajat.setAdresa("bucuresti");
        angajat.setPrenume("Florin");
        angajat.setSalariu(1.000);
        angajat.setVarsta(20);
        angajatDao.save(angajat);
        return angajat;
    }
}
