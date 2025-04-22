package MODULE3;
class ProductB implements BillGen 
{
    String name;
    int prod_id, quantity, unit_price, total;

    ProductB() {}

    ProductB(String n, int p, int q, int u) 
    {
        name = n;
        prod_id = p;
        quantity = q;
        unit_price = u;
    }

    public int calculate() 
    {
        total = quantity * unit_price;
        return total;
    }
}
