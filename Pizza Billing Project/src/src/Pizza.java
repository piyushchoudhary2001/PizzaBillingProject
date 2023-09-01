public class Pizza {
    public int BasePrice;
    public int ExtraTopings;
    public int ExtraCheese;
    public int TakeAwayBag;

    public Boolean isExtraTopings;
    public Boolean isExtraCheese;
    public Boolean isTakeAway;

    public int size;//0 for small--1 for Medium--2 for Larger

    public int Total;
    public String bill;
    public Boolean isVeg;

    public Pizza(Boolean isVeg,int size)
    {
        this.isVeg=isVeg;
        this.size=size;
        if(isVeg)
        {
            switch (size){
                case 0: Small(isVeg);
                break;
                case 1: Medium(isVeg);
                break;
                case 2: Large(isVeg);
                break;
            }
            this.ExtraTopings=50;
        }else {
            switch (size){
                case 0: Small(isVeg);
                    break;
                case 1: Medium(isVeg);
                    break;
                case 2: Large(isVeg);
                    break;
            }
            this.ExtraTopings=80;
        }
        this.ExtraCheese=30;
        this.TakeAwayBag=15;
        //this.isExtraTopings=false;
        this.isExtraTopings=false;
        this.isExtraCheese=false;
        this.isTakeAway=false;
    }

    private void Large(Boolean isVeg) {
        if(isVeg) {
            this.BasePrice = 550;
        }else
            this.BasePrice=750;
    }

    private void Medium(Boolean isVeg) {
        if(isVeg) {
            this.BasePrice = 400;
        }else
            this.BasePrice=500;
    }

    private void Small(Boolean isVeg) {
        if(isVeg) {
            this.BasePrice = 200;
        }else
            this.BasePrice=300;
    }

    public int getExtraCheesePrice()
    {
        return ExtraCheese;
    }
    public void addExtraCheese()
    {
          if(!isExtraCheese)
          {
              isExtraCheese=true;
          }
    }

    public int getExtraTopingsPrice()
    {
        return ExtraTopings;
    }

    public void addExtraTopings()
    {
        if(!isExtraTopings)
        {
            isExtraTopings=true;
        }
    }


    public int getTakeAwayBagPrice()
    {
        return TakeAwayBag;
    }
    public void addTakeAway()
    {
        if(!isTakeAway)
           isTakeAway=true;
    }

    public String getBill()
    {
        if(isVeg)
        {
            bill="Your Veg";
        }else {
            bill="Your Non-Veg";
        }
        switch (size)
        {
            case 0: bill+=" Small Pizza Price = "+this.BasePrice+"/-"+"\n";
            break;
            case 1: bill+=" Medium Pizza Price = "+this.BasePrice+"/-"+"\n";
            break;
            case 2: bill+=" Large Pizza Price = "+this.BasePrice+"/-"+"\n";
        }
        this.Total+=this.BasePrice;
        if(isExtraCheese)
        {
            bill+="Price for ExtraCheese "+this.ExtraCheese+"/-"+"\n";
            this.Total+=this.ExtraCheese;
        }
        if(isExtraTopings)
        {
            bill+="Price for ExtraTopings "+this.ExtraTopings+"/-"+"\n";
            this.Total+=this.ExtraTopings;
        }
        if(isTakeAway)
        {
            bill+="Price for Bag "+this.TakeAwayBag+"/-"+"\n";
            this.Total+=this.TakeAwayBag;
        }

        bill+="You final price for this Pizza "+this.Total+"/-"+"\n";
        return bill;
    }
    public int getTotal()
    {
        return this.Total;
    }


}
