package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Ouvinte extends Usuario{
    private ArrayList<Playlist> playlists;
    public Ouvinte(String nome, int idade, String genero, String nacionalidade) {
        super(nome, idade, genero, nacionalidade);
        playlists = new ArrayList<>();
    }

    public void adicionarPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }
    public void removerPlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }

    public static Ouvinte criarOuvinte(Scanner scanner) {
        System.out.println("==== Criar Ouvinte ====");
        System.out.print("Nome do ouvinte: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do ouvinte: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Gênero do ouvinte: ");
        String genero = scanner.nextLine();

        System.out.print("Nacionalidade do ouvinte: ");
        String nacionalidade = scanner.nextLine();

        Ouvinte ouvinte = new Ouvinte(nome, idade, genero, nacionalidade);
        System.out.println("Ouvinte criado com sucesso!");

        return ouvinte;
    }
}