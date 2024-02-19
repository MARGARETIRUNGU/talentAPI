package com.example.talent_man.service_imp;

import com.example.talent_man.models.PotentialAttribute;
import com.example.talent_man.repos.PotentialAttributeRepo;
import com.example.talent_man.services.PotentialAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PotentialAttributeServiceImp implements PotentialAttributeService {
    @Autowired
    private PotentialAttributeRepo repo;

    @Override
    public PotentialAttribute addPotentialAttribute(PotentialAttribute potentialAttribute) {
        return repo.save(potentialAttribute);
    }

    @Override
    public PotentialAttribute getPotentialAttributeById(int id) {
        return null;
    }

    @Override
    public List<PotentialAttribute> getAllPotentialAttributes() {
        return null;
    }

    @Override
    public PotentialAttribute updatePotentialAttributeById(int id, PotentialAttribute potentialAttribute) {
        return null;
    }

    @Override
    public PotentialAttribute deletePotentialAttributeById(int id) {
        return null;
    }
}
