package api;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{
    @Override
    public Set<Product> findAll()
    {
        Set<Product> products = new HashSet<>();

        products.add(new Product("Cannondale Scalpel", 500.00, "Rojo", 2021));
        products.add(new Product("Specialized Epic", 550.00, "Azul", 2022));
        products.add(new Product("Canyon Lux", 600.00, "Verde", 2021));
        products.add(new Product("Trek Supercaliber", 620.00, "Negro", 2023));
        products.add(new Product("Pinarello Razha", 650.00, "Blanco", 2022));
        products.add(new Product("Orbea Oiz", 700.00, "Amarillo", 2023));
        products.add(new Product("Bh Linx", 720.00, "Gris", 2021));
        products.add(new Product("Cannondale Fsi", 750.00, "Naranja", 2022));
        products.add(new Product("Canyon Exceed", 800.00, "Morado", 2023));
        products.add(new Product("Ktm Scarp", 850.00, "Rosa", 2021));

        return products;
    }

}