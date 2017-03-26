package ch3.page_88_inject;

public class BookwormOracle implements Oracle
{
    private Encyclopedia encyclopedia;

    public void setEncyclopedia(Encyclopedia encyclopedia) {
        this.encyclopedia = encyclopedia;
    }

    @Override
    public String defineMeaningOfLife() {
        return "Encyclopedias are a waste of money - use the Internet"; 
    }
}

