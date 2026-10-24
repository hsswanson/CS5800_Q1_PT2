public enum Month {
    JANUANRY{
        public boolean has31Days(){
            return true;
        }
    },
    //FEBUARY{},
    MARCH{
        public boolean has31Days(){
            return true;
        }
    },
    //APRIL{},
    MAY{
        public boolean has31Days(){
            return true;
        }
    },
    //JUNE{},
    JULY{
        public boolean has31Days(){
            return true;
        }
    },
    AUGUST{
        public boolean has31Days(){
            return true;
        }
    },
    //SEPTEMBER{},
    OCTOBER{
        public boolean has31Days(){
            return true;
        }
    },
    //NOVEMBER{},
    DECEMBER{
        public boolean has31Days(){
            return true;
        }
    };


    public abstract boolean has31Days();
    //polymorphism in enums. I like this!
}
