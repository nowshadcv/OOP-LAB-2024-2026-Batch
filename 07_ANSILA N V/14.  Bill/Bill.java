package MODULE3;

import java.util.*;

interface BillGen {
	int calculate();
}

class ProductB implements BillGen {
	String name;
	int prod_id, quantity, unit_price, total;

	ProductB() {}

	ProductB(String n, int p, int q, int u) {
		name = n;
		prod_id = p;
		quantity = q;
		unit_price = u;
	}

	public int calculate() {
		total = quantity * unit_price;
		return total;
	}
}

public class Bill {
	public static void main(String[] args) {
		Map<Integer, ProductB[]> orderMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		Set<Integer> orderNumbers = new HashSet<>();

		System.out.print("Enter no.of orders: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int orderNumber;

			while (true) {
				System.out.print("Enter unique Order Number: ");
				orderNumber = sc.nextInt();
				if (orderNumbers.contains(orderNumber)) {
					System.out.println("Order number already exists! Please enter a different one.");
				} else {
					orderNumbers.add(orderNumber);
					break;
				}
			}

			System.out.print("Enter the no.of Products for Order " + orderNumber + ": ");
			int m = sc.nextInt();
			ProductB[] products = new ProductB[m];

			for (int j = 0; j < m; j++) {
				System.out.println("Enter details for Product " + (j + 1));
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Product Id: ");
				int id = sc.nextInt();
				System.out.print("Quantity: ");
				int qty = sc.nextInt();
				System.out.print("Unit Price: ");
				int price = sc.nextInt();

				ProductB pb = new ProductB(name, id, qty, price);
				pb.calculate();
				products[j] = pb;
			}

			orderMap.put(orderNumber, products);
		}

		for (int orderNum : orderMap.keySet()) {
			int sum = 0;
			ProductB[] products = orderMap.get(orderNum);
			System.out.println("\nOrder No: " + orderNum);
			System.out.println(new Date());
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			System.out.printf("%5s %20s %25s %10s %10s", "prod_id", "name", "quantity", "unit_price", "total");
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			for (ProductB p : products) {
				System.out.printf("%5s %20s %25s %10s %10s", p.prod_id, p.name, p.quantity, p.unit_price, p.total);
				System.out.println();
				sum += p.total;
			}
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			System.out.println("Net Amount: " + sum);
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		}

		sc.close();
	}
}