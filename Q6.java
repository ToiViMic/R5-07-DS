public class Q6 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Veuillez fournir le nombre d'étoiles en paramètre.");
            return;
        }
        try {
            int n = Integer.parseInt(args[0]);
            // Affichage inversé du triangle
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n - i + 1; j++) {
                    System.out.print("*");//affichage du caractère *
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("Veuillez entrer un nombre valide.");
        }
    }
}
//petits chgt tests
//test? tu marches?
