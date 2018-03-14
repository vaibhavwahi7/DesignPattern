package Question4;

class Character1 extends StreetFighter{
    Character1(){
        super();
        roll=new RollType1();
        jump=new JumpType1();
    }
}
class Character2 extends StreetFighter{
    Character2(){
        super();
        roll=new RollType2();
        jump=new JumpType1();
    }
}

class Character3 extends StreetFighter{
    Character3(){
        super();
        roll=new RollType1();
        jump=new JumpType2();
    }
}
