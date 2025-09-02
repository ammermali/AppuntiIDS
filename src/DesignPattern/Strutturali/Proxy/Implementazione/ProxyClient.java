package DesignPattern.Strutturali.Proxy.Implementazione;

class ProxyClient {
    public static void main(String[] args) {
        Service service = new Service();
        Proxy proxy = new Proxy(service);

        proxy.operation();
    }
}
