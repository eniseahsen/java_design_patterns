public class GamingComputerBuilder implements ComputerBuilder{
  private Computer computer;
  public GamingComputerBuilder(){
      this.computer = new Computer();
  }


    @Override
    public void buildRAM(){
        computer.setRAM("i7");
    }

    @Override
    public Computer getComputer(){
        return this.computer;
    }
}
