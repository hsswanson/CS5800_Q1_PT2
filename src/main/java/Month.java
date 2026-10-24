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
    APRIL{
        public boolean has31Days(){
            return false;
        }
    },
    MAY{
        public boolean has31Days(){
            return true;
        }
    },
    JUNE{
        public boolean has31Days(){
            return false;
        }
    },
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
    SEPTEMBER{
        public boolean has31Days(){
            return false;
        }
    },
    OCTOBER{
        public boolean has31Days(){
            return true;
        }
    },
    NOVEMBER{
        public boolean has31Days(){
            return false;
        }
    },
    DECEMBER{
        public boolean has31Days(){
            return true;
        }
    };


    public abstract boolean has31Days();
    //polymorphism in enums. I like this!
}
