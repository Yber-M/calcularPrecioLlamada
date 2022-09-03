package phone;

public class clasePrincipal {
    public static void main(String[] args) {
        
        int cont = 0, cont2 = 0;   
        
        celular cl1 = new celular(987765234, 400, "Angelo", 0.20);
        celular cl2 = new celular(934123784, 800, "Marlon", 0.20);
        celular cl3 = new celular(945697785, 100, "Emanuel", 0.20);
        
        celular[] arrayCelular = new celular[]{cl1, cl2, cl3};
        
        System.out.println("--------- MOSTRANDO RESUTADOS ---------");
        for (celular cl: arrayCelular) {
            cont++;
            System.out.println("\n ------- Persona " + cont + " -------");
            System.out.println(cl.mostrar());
            
        }
        for (celular clN: arrayCelular) {
            cont2++;
            System.out.println("************* MOSTRANOD CON DATOS ACTUALIZADOS *************");
            System.out.println("PERSONA " + cont2);
            System.out.println(clN.mostrar2());
        }
    }
}
