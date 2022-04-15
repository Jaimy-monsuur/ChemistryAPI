package jaimy.monsuur.Chemistry.service;

import jaimy.monsuur.Chemistry.model.element;
import jaimy.monsuur.Chemistry.repo.elementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class elementService {
    @Autowired
    private elementRepo elementRepo;

    public List<element> getAllElements() {;
        return elementRepo.getAllElements();
    }

    public element getElementByAtomicNumber(int atomicNumber) {
        return elementRepo.getElementByAtomicNumber(atomicNumber);
    }

    public element getElementBySymbol(String symbol) {
        return elementRepo.getElementBySymbol(symbol);
    }

    public element getElementByName(String name) {
        return elementRepo.getElementByName(name);
    }

    public element addElement(element element) {
        return elementRepo.addElement(element);
    }

    public element updateElement(element element, int atomicNumber) { return elementRepo.updateElement(element, atomicNumber);}

    public boolean deleteElement(int atomicNumber) {
         return elementRepo.deleteElement(atomicNumber);
    }

    public element getElementByAtomicWeight(double atomicWeight) { return elementRepo.getElementByAtomicWeight(atomicWeight); }

    public element getElementByGroup(String group) { return elementRepo.getElementByGroup(group); }

}
