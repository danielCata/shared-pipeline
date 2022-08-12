class clubnames {

    def names =[
            "Arsenal",
            "Chelsea",
            "Manchester United",
            "Brentford"
    ]

    def getRandom() {

        3.times {
            Collections.shuffle names
        }
        return  names.first()
    }
    
     def getLenght(name) {

       
      len = name.length()
       println(len)
    }

}


//a=new clubnames().getRandom()
//println(a)
