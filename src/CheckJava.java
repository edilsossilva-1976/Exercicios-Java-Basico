/*
 *  Escreva um programa Java para verificar se o Java está instalado no seu computador. 
 */
public class CheckJava {
    public static void main(String[] args) {
        //Mostrar a versão do Java
        System.out.println("Java Version: "+System.getProperty("java.version"));

        //Mostrar a versao do Java em tempo de execução
        System.out.println("Java runtime Version: "+System.getProperty("java.runtime.version"));

        //Mostrar o diretorio Java Home
        System.out.println("Java Home: "+System.getProperty("java.home"));

        //Mostrar o nome do distribuidor Java
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));

        //Mostrar a url do distribuidor Java
        System.out.println("Java url: "+System.getProperty("java.vendor.url"));

        //Mostrar o caminho da classe java
        System.out.println("Java Class Path: "+System.getProperty("java.class.path"));
    }
}
