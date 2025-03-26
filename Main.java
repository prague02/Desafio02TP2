import br.edu.fatecpg.model.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", "Eletronico", 3000));
        produtos.add(new Produto("Geladeira", "Eletrodomestico", 4000));
        produtos.add(new Produto("Iphone", "Eletronico", 7000));
        produtos.add(new Produto("Cadeira Gamer", "Móveis", 3000));
        produtos.add(new Produto("Teclado", "Eletronico", 300));

        List<Produto> eletronicos = produtos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("Eletronico"))
                .toList();
        eletronicos.forEach(Produto::aplicarDesconto);

        double somaTotal = produtos.stream()
                .mapToDouble(Produto::getPreco).sum();

        System.out.println("Lista dos produtos com desconto aplicado: ");

        eletronicos.forEach(System.out::println);

        System.out.println("Soma total dos preços de todos os produtos: " + String.format("%.2f", somaTotal));



    }
}
