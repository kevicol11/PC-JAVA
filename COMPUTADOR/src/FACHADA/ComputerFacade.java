package FACHADA;

public class ComputerFacade {
private CPU cpu;
private HardDriver hardDriver;
private Memory memory;

public ComputerFacade (){
    this.cpu = new CPU();
    this.hardDriver = new HardDriver();
    this.memory  = new Memory();

}
 public void star(){
    System.out.println("  Starting... ");
    cpu.freeze();
    memory.load();
    hardDriver.read();
    cpu.jump();
    cpu.execute();
}
}

