package UE05.Exercise2;

public final class Bill {
    private BillItem[] items = new BillItem[0];


    public BillItem[] getItems() {
        return items;
    }

    public void setItems(BillItem[] items) {
        this.items = items;
    }

    public double getTotalPrice(){
        double result = 0;

        for(BillItem item : items){
            result+= item.getPrice();
        }
        return result;
    }



    // toString needs to be implemented
}
