package org.example;

import static org.example.calcularIndiceCredibilidade.*;

public class avaliarCredibildade {
    avaliarCredibildade(){
        if(credibilidade <5 ){
            System.out.println("suspeito");
        } else if (credibilidade >= 5 || credibilidade <=8 ) {
            System.out.println("plausivel");
        } else if (credibilidade > 9) {
            System.out.println("Altamente confiavel");
        }
    }
}
