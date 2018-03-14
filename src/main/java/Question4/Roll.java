package Question4;
interface Roll {
    String rollType();
}

interface Jump {
    String jumpType();
}

class RollType1 implements Roll{

    @Override
    public String rollType() {
        return "Roll  TYpe1";
    }
}

class RollType2 implements Roll{

    @Override
    public String rollType() {
        return "Roll  TYpe2";
    }
}



class JumpType1 implements Jump{

    @Override
    public String jumpType() {
        return "jump  TYpe1";
    }
}


class JumpType2 implements Jump{

    @Override
    public String jumpType() {
        return "jump  TYpe2";
    }
}