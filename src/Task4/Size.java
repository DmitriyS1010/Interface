package Task4;

public enum Size {

    XXS(36){ @Override
    public String getDescription() {
        return "детский размер";
      }
    },
    XS(38),
    S(40),
    M(42),
    L(44),
    XL(46),
    XXL(48);




    Size(int euroSize){
        this.EuroSize = euroSize;

    }


    public String getDescription() {
        return "взрослый размер";
    }

    private int EuroSize;

    }
