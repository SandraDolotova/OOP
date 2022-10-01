public class Invoice {

   private String partNumber;
   private String partDescription;
   private int  quantityPurchased;
   private int pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantityPurchased, int pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantityPurchased = quantityPurchased;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public int getQuantityPurchased() {
        if (quantityPurchased >= 0){
        } else {
            this.quantityPurchased = 0;
        }
        return quantityPurchased;
    }
    public int getPricePerItem() {
        if (pricePerItem >= 0){
        } else {
            this.pricePerItem = 0;
        }
        return pricePerItem;
    }
   public int getInvoiceAmount(){
        return pricePerItem * quantityPurchased;
   }
    @Override
    public String toString() {
        return "Part number: " + getPartNumber() + "\n"
                + "Part Description: " + getPartDescription() + "\n"
                + "Quantity purchased: " + getQuantityPurchased() + "\n"
                + "Price per Item: " + getPricePerItem() + "\n"
                + "Total Invoice Amount: " + getInvoiceAmount() + "\n"
                + "==============================================";
    }

}
