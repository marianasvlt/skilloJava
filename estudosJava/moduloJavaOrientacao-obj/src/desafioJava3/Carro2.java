package desafioJava3;

public class Carro2 {
    private String marca;
    private String modelo;
    private int precoano2023;
    private int precoano2024;
    private int precoano2025;

    public Carro2(String marca, String modelo, int precoano2023, int precoano2024, int precoano2025){
        this.marca = marca;
        this.modelo = modelo;
        this.precoano2023 = precoano2023;
        this.precoano2024 = precoano2024;
        this.precoano2025 = precoano2025;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecoano2023() {
        return precoano2023;
    }

    public int getPrecoano2024() {
        return precoano2024;
    }

    public int getPrecoano2025() {
        return precoano2025;
    }


    public void exibirFichaTecnica(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
    }

    public int mediaPreco(){
        int mediaPrecoPorAno = (precoano2023 + precoano2024 + precoano2025) /3;
        System.out.println("A média dos preços é: " + mediaPrecoPorAno);
        return mediaPrecoPorAno;
    }

    public void verificarPreco(){
        int maiorPreco;
        int menorPreco;

        if (precoano2023 >= precoano2024 && precoano2023 >= precoano2025){
            maiorPreco = precoano2023;
            System.out.println("Maior preço: " + precoano2023);
        } else if (precoano2024 >= precoano2023 && precoano2024 >= precoano2025){
            maiorPreco = precoano2024;
            System.out.println("Maior preço: " + precoano2024);
        } else {
            maiorPreco = precoano2025;
            System.out.println("Maior preço: " + precoano2025);
        }

        if (precoano2023 <= precoano2024 && precoano2023 <= precoano2025){
            menorPreco = precoano2023;
            System.out.println("Menor preço: " + precoano2023);
        } else if (precoano2024 <= precoano2023 && precoano2024 <= precoano2025){
            menorPreco = precoano2024;
            System.out.println("Menor preço: " + precoano2024);
        } else {
            menorPreco = precoano2025;
            System.out.println("Menor preço: " + precoano2025);
        }


    }

}
