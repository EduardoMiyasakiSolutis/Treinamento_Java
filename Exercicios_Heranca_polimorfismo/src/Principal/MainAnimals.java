package Principal;

import classes.animal.*;

public class MainAnimals {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Cavalo cavalo = new Cavalo();
        Preguica preguica = new Preguica();

        cavalo.setNome("Trovo");
        cachorro.setNome("Fabio");
        preguica.setNome("Leanmari");

        System.out.println(cachorro.emitirSom());
        System.out.println(cavalo.emitirSom());
        System.out.println(preguica.emitirSom());

        Veterinario veterinario = new Veterinario();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

        Zoologico zoo = new Zoologico();

        zoo.animais[0] = cachorro;
        zoo.animais[1] = cavalo;
        zoo.animais[2] = preguica;
        zoo.animais[3] = cachorro;
        zoo.animais[4] = cavalo;
        zoo.animais[5] = preguica;
        zoo.animais[6] = cachorro;
        zoo.animais[7] = cavalo;
        zoo.animais[8] = preguica;
        zoo.animais[9] = preguica;

        for (int i = 0; i < 10; i++) {
            System.out.println(zoo.animais[i].getNome());
            System.out.println(zoo.animais[i].emitirSom());
            System.out.println(zoo.animais[i].mover());
        }
    }
}
