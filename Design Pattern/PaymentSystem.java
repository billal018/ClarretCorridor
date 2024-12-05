class PaymentSystem{
    public static void main(String[] args){
        LegacyPayment legacyPayment=new LegacyPayment();
        EcommercePlatform ecommercePlatform=new EcommercePlatform(legacyPayment);
        
    }
}