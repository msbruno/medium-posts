interface Command {
    void execute();
}

class BotaoAquecer implements Command {

    IReceiver arCondicionado;

    public BotaoAquecer(IReceiver ar){
        this.arCondicionado = ar;
    }

    void execute() {
        arCondicionado.setaTemperatura(25);
        arCondicionado.ativaSwing();
    }
}

interface Receiver{
    void setaTemperatura(int temperatura);
    void ativaSwing();
    void liga();
}

class ArCondicionado implements Receiver {
    int temperatura;
    boolean swingAtivo = false;
    boolean ligado = false;

    public void ativaSwing() {
        this.swingAtivo = true;
    }

    public void setaTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void liga() {
        this.ligado = true;
    }
}

class Invoker() {
    Command botaoModoInverno;

    public Invoker(Command botaoInverno) {
        this.botaoInverno = botaoInverno;
    }

    public void ativaModoInverno() {
        this.botaoInverno.execute();
    }
} 


public class Client {

    public static main(String[] args) {
        var controle = new Invoker(new BotaoAquecer());
        controle.ativaModoInverno();
    }
}
