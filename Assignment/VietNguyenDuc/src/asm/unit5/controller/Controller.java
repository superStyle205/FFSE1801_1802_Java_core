package asm.unit5.controller;

import asm.unit5.view.CanBoView;

import java.util.Scanner;

public class Controller {
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            CanBoController canBoController = new CanBoController();
            CanBoController giangVienController = new CanBoController();
            CanBoView canBoView = new CanBoView();
            boolean pause = false;
            while (!pause) {
                canBoView.menu();
                int key = Integer.parseInt(sc.nextLine());
                switch (key) {
                    case 1:
                        int type1 = Integer.parseInt(canBoView.getType());
                        if (type1 == 1) {
                            giangVienController.insert(type1);

                        } else if (type1 == 2) {
                            canBoController.insert(type1);
                        }
                        break;
                    case 2:
                        int type2 = Integer.parseInt(canBoView.getType());
                        if (type2 == 1) {
                            System.out.println("ok");
                            giangVienController.find(type2);
                        } else if (type2 == 2) {
                            canBoController.find(type2);
                        }
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                        pause = true;
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println("erro: " + e);
        }

    }
}
