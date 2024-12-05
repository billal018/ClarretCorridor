public class EcommercePlatform implements ModernEcommerce  {
    
    private LegacyPayment legacyPayment;

    public EcommercePlatform(LegacyPayment legacyPayment){
        this.legacyPayment=legacyPayment;
    }

   @Override
    public void InitialTransaction(String transaction){

    }

    @Override
    public void ProcessTransaction(String transaction){

    }  
} 

