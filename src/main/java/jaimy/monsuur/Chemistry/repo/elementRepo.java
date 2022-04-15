package jaimy.monsuur.Chemistry.repo;

import jaimy.monsuur.Chemistry.model.element;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class elementRepo {
    private ArrayList<element> elements;

    public elementRepo() {
        this.elements = new ArrayList<element>(Arrays.asList(
                new element(1, "Hydrogen", "H", 1.008, "Reactive nonmetals" ),
                new element(2, "Helium", "He", 4.0026, "Noble gases" ),
                new element(3, "Lithium", "Li", 6.94, "Alkali metals" ),
                new element(4, "Beryllium", "Be", 9.0122, "Alkaline earth metals" ),
                new element(5, "Boron", "B", 10.81, "Metalloids" ),
                new element(6, "Carbon", "C", 12.011, "Nonmetals" ),
                new element(7, "Nitrogen", "N", 14.007, "Reactive nonmetals" ),
                new element(8, "Oxygen", "O", 15.999, "Reactive nonmetals" ),
                new element(9, "Fluorine", "F", 18.998, "Reactive nonmetals" ),
                new element(10, "Neon", "Ne", 20.180, "Noble gases" ),
                new element(11, "Sodium", "Na", 22.990, "Alkali metals" ),
                new element(12, "Magnesium", "Mg", 24.305, "Alkaline earth metals" ),
                new element(13, "Aluminium", "Al", 26.982, "Post-transition metals" ),
                new element(14, "Silicon", "Si", 28.085, "Metalloids" ),
                new element(15, "Phosphorus", "P", 30.974, "Nonmetals" ),
                new element(16, "Sulfur", "S", 32.06, "Nonmetals" ),
                new element(17, "Chlorine", "Cl", 35.453, "Reactive nonmetals" ),
                new element(18, "Argon", "Ar", 39.948, "Noble gases" ),
                new element(19, "Potassium", "K", 39.098, "Alkali metals" ),
                new element(20, "Calcium", "Ca", 40.078, "Alkaline earth metals" ),
                new element(21, "Scandium", "Sc", 44.956, "Transition metals" ),
                new element(22, "Titanium", "Ti", 47.867, "Transition metals" ),
                new element(23, "Vanadium", "V", 50.942, "Transition metals" ),
                new element(24, "Chromium", "Cr", 51.996, "Transition metals" ),
                new element(25, "Manganese", "Mn", 54.938, "Transition metals" ),
                new element(26, "Iron", "Fe", 55.845, "Transition metals" ),
                new element(27, "Cobalt", "Co", 58.933, "Transition metals" ),
                new element(28, "Nickel", "Ni", 58.693, "Transition metals" ),
                new element(29, "Copper", "Cu", 63.546, "Transition metals" ),
                new element(30, "Zinc", "Zn", 65.38, "Transition metals" ),
                new element(31, "Gallium", "Ga", 69.723, "Post-transition metals" ),
                new element(32, "Germanium", "Ge", 72.630, "Metalloids" ),
                new element(33, "Arsenic", "As", 74.922, "Metalloids" ),
                new element(34, "Selenium", "Se", 78.971, "Nonmetals" ),
                new element(35, "Bromine", "Br", 79.904, "Reactive nonmetals" ),
                new element(36, "Krypton", "Kr", 83.798, "Noble gases" ),
                new element(37, "Rubidium", "Rb", 85.468, "Alkali metals" ),
                new element(38, "Strontium", "Sr", 87.62, "Alkaline earth metals" ),
                new element(39, "Yttrium", "Y", 88.906, "Transition metals" ),
                new element(40, "Zirconium", "Zr", 91.224, "Transition metals" ),
                new element(41, "Niobium", "Nb", 92.906, "Transition metals" ),
                new element(42, "Molybdenum", "Mo", 95.95, "Transition metals" ),
                new element(43, "Technetium", "Tc", 98, "Transition metals" ),
                new element(44, "Ruthenium", "Ru", 101.07, "Transition metals" ),
                new element(45, "Rhodium", "Rh", 102.91, "Transition metals" ),
                new element(46, "Palladium", "Pd", 106.42, "Transition metals" ),
                new element(47, "Silver", "Ag", 107.87, "Transition metals" ),
                new element(48, "Cadmium", "Cd", 112.41, "Transition metals" ),
                new element(49, "Indium", "In", 114.82, "Post-transition metals" ),
                new element(50, "Tin", "Sn", 118.71, "Post-transition metals" ),
                new element(51, "Antimony", "Sb", 121.76, "Metalloids" ),
                new element(52, "Tellurium", "Te", 127.60, "Metalloids" ),
                new element(53, "Iodine", "I", 126.90, "Halogens" ),
                new element(54, "Xenon", "Xe", 131.29, "Noble gases" ),
                new element(55, "Cesium", "Cs", 132.91, "Alkali metals" ),
                new element(56, "Barium", "Ba", 137.33, "Alkaline earth metals" ),
                new element(57, "Lanthanum", "La", 138.91, "Lanthanoids" ),
                new element(58, "Cerium", "Ce", 140.12, "Lanthanoids" ),
                new element(59, "Praseodymium", "Pr", 140.91, "Lanthanoids" ),
                new element(60, "Neodymium", "Nd", 144.24, "Lanthanoids" ),
                new element(61, "Promethium", "Pm", 145, "Lanthanoids" ),
                new element(62, "Samarium", "Sm", 150.36, "Lanthanoids" ),
                new element(63, "Europium", "Eu", 151.96, "Lanthanoids" ),
                new element(64, "Gadolinium", "Gd", 157.25, "Lanthanoids" ),
                new element(65, "Terbium", "Tb", 158.93, "Lanthanoids" ),
                new element(66, "Dysprosium", "Dy", 162.50, "Lanthanoids" ),
                new element(67, "Holmium", "Ho", 164.93, "Lanthanoids" ),
                new element(68, "Erbium", "Er", 167.26, "Lanthanoids" ),
                new element(69, "Thulium", "Tm", 168.93, "Lanthanoids" ),
                new element(70, "Ytterbium", "Yb", 173.04, "Lanthanoids" ),
                new element(71, "Lutetium", "Lu", 174.97, "Lanthanoids" ),
                new element(72, "Hafnium", "Hf", 178.49, "Transition metals" ),
                new element(73, "Tantalum", "Ta", 180.95, "Transition metals" ),
                new element(74, "Tungsten", "W", 183.84, "Transition metals" ),
                new element(75, "Rhenium", "Re", 186.21, "Transition metals" ),
                new element(76, "Osmium", "Os", 190.23, "Transition metals" ),
                new element(77, "Iridium", "Ir", 192.22, "Transition metals" ),
                new element(78, "Platinum", "Pt", 195.08, "Transition metals" ),
                new element(79, "Gold", "Au", 196.97, "Transition metals" ),
                new element(80, "Mercury", "Hg", 200.59, "Transition metals" ),
                new element(81, "Thallium", "Tl", 204.38, "Post-transition metals" ),
                new element(82, "Lead", "Pb", 207.2, "Post-transition metals" ),
                new element(83, "Bismuth", "Bi", 208.98, "Post-transition metals" ),
                new element(84, "Polonium", "Po", 209, "Post-transition metals" ),
                new element(85, "Astatine", "At", 210, "Halogens" ),
                new element(86, "Radon", "Rn", 222, "Noble gases" ),
                new element(87, "Francium", "Fr", 223, "Alkali metals" ),
                new element(88, "Radium", "Ra", 226, "Alkaline earth metals" ),
                new element(89, "Actinium", "Ac", 227, "Actinoids" ),
                new element(90, "Thorium", "Th", 232.04, "Actinoids" ),
                new element(91, "Protactinium", "Pa", 231.04, "Actinoids" ),
                new element(92, "Uranium", "U", 238.03, "Actinoids" ),
                new element(93, "Neptunium", "Np", 237, "Actinoids" ),
                new element(94, "Plutonium", "Pu", 244, "Actinoids" ),
                new element(95, "Americium", "Am", 243, "Actinoids" ),
                new element(96, "Curium", "Cm", 247, "Actinoids" ),
                new element(97, "Berkelium", "Bk", 247, "Actinoids" ),
                new element(98, "Californium", "Cf", 251, "Actinoids" ),
                new element(99, "Einsteinium", "Es", 252, "Actinoids" ),
                new element(100, "Fermium", "Fm", 257, "Actinoids" ),
                new element(101, "Mendelevium", "Md", 258, "Actinoids" ),
                new element(102, "Nobelium", "No", 259, "Actinoids" ),
                new element(103, "Lawrencium", "Lr", 262, "Actinoids" ),
                new element(104, "Rutherfordium", "Rf", 261, "Transition metals" ),
                new element(105, "Dubnium", "Db", 262, "Transition metals" ),
                new element(106, "Seaborgium", "Sg", 266, "Transition metals" ),
                new element(107, "Bohrium", "Bh", 264, "Transition metals" ),
                new element(108, "Hassium", "Hs", 269, "Transition metals" ),

                //man made
                new element(109, "Meitnerium", "Mt", 278, "N/A" ),
                new element(110, "Darmstadtium", "Ds", 271, "N/A" ),
                new element(111, "Roentgenium", "Rg", 272, "N/A" ),
                new element(112, "Copernicium", "Cn", 285, "N/A" ),
                new element(113, "Nihonium", "Nh", 286, "N/A" ),
                new element(114, "Flerovium", "Fl", 289, "N/A" ),
                new element(115, "Moscovium", "Mc", 290, "N/A" ),
                new element(116, "Livermorium", "Lv", 293, "N/A" ),
                new element(117, "Tennessine", "Ts", 294, "N/A" ),
                new element(118, "Oganesson", "Og", 294, "N/A" )
        ));
    }

    public List<element> getAllElements() {
        return elements.stream().sorted(Comparator.comparing(element::getAtomicNumber)).collect(Collectors.toList());
    }

    public element getElementByAtomicNumber(int atomicNumber) {
        return elements.stream().filter(e -> e.getAtomicNumber() == atomicNumber).findAny().orElse(null);
    }

    public element getElementByName(String name) {
        return elements.stream().filter(e -> e.getName().equals(name)).findAny().orElse(null);
    }

    public element getElementBySymbol(String symbol) {
        return elements.stream().filter(e -> e.getSymbol().equals(symbol)).findAny().orElse(null);
    }

    public element getElementByAtomicWeight(double atomicWeight) {
        return elements.stream().filter(e -> e.getAtomicWeight() == atomicWeight).findAny().orElse(null);
    }

    public element getElementByGroup(String group) {
        return elements.stream().filter(e -> e.getGroup().equals(group)).findAny().orElse(null);
    }

    public element addElement(element element) {
        elements.add(element); return getElementByAtomicNumber(element.getAtomicNumber());
    }

    public element updateElement(element element, int atomicNumber) {
        int index = this.elements.indexOf(getElementByAtomicNumber(atomicNumber));
        //if index not null, update
        if (index != -1) {
            elements.set(index, element);
        }
        return getElementByAtomicNumber(element.getAtomicNumber());
    }

    public boolean deleteElement(int atomicNumber) {
        return this.elements.removeIf(e -> e.getAtomicNumber() == atomicNumber);
    }

}
