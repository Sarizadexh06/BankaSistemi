

import java.io.PrintStream;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank musteri1 = new Bank("Pasha SARIZADA", "1209", 2500.0);
        Bank musteri2 = new Bank("Alp BASKAN", "1308", 5987.06);
        Bank musteri3 = new Bank("Emrecan ER", "1407", 3900.69);
        Bank musteri4 = new Bank("Turgay CEYLAN", "1506", 15604.0);
        Bank bank = new Bank("Sarizade BANK", "01", 750000.0);
        String islemler = "1.Para yatirmak\n2.Para cekmek\n3.Para gondermek\n4.Bakiye Kontrolu\n5.Kart iadesi";

        label113:
        for(int i = 0; i < 1; ++i) {
            System.out.println("\n***Bankamiza hos geldiniz***\n");
            PrintStream var10000 = System.out;
            String var10001 = bank.getName();
            var10000.println(var10001 + " \n" + bank.getIban() + " ibanimiz\nBankin genel bakiyesi:" + bank.getBakiye());
            System.out.println(islemler);
            System.out.println("Isleminizi secin:");
            int secim = scanner.nextInt();
            int para;
            int tus;

            int j;
            switch (secim) {
                case 1:
                    System.out.println("Yatirmak istediginiz tutari giriniz:");
                    para = scanner.nextInt();
                    musteri1.paraYatir((double)para);
                    var10000 = System.out;
                    var10001 = musteri1.getIban();
                    var10000.println(var10001 + " numarali ibaninizin yeni bakiyesi:" + musteri1.getBakiye());
                    j = 0;

                    while(true) {
                        if (j >= 1) {
                            continue label113;
                        }

                        System.out.println("Geri donmek icin (1) tuslayiniz:");
                        tus = scanner.nextInt();
                        if (tus == 1) {
                            i -= 2;
                        } else {
                            System.out.println("Gecerli bir tus giriniz..");
                            --j;
                        }

                        ++j;
                    }
                case 2:
                    j = 0;

                    for(; j < 1; ++j) {
                        System.out.println("Cekmek istediginiz tutari giriniz:");
                        para = scanner.nextInt();
                        if ((double)para > musteri1.getBakiye()) {
                            System.out.println("Yetersiz Bakiye, bir daha deneyiniz..");
                            --j;
                        } else {
                            musteri1.paraCek((double)para);
                            var10000 = System.out;
                            var10001 = musteri1.getIban();
                            var10000.println(var10001 + " numarali ibaninizin yeni bakiyesi:" + musteri1.getBakiye());

                            for(j = 0; j < 1; ++j) {
                                System.out.println("Geri donmek icin (1):");
                                tus = scanner.nextInt();
                                if (tus == 1) {
                                    i -= 2;
                                } else {
                                    System.out.println("Gecerli bir tus giriniz..");
                                    --j;
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    var10000 = System.out;
                    var10001 = musteri2.getIban();
                    var10000.println(var10001 + "\t" + musteri2.name);
                    var10000 = System.out;
                    var10001 = musteri3.getIban();
                    var10000.println(var10001 + "\t" + musteri3.name);
                    var10000 = System.out;
                    var10001 = musteri4.getIban();
                    var10000.println(var10001 + "\t" + musteri4.name);
                    System.out.println("Para gondermek istediginiz ibani yaziniz:");
                    String iban = scanner.next();
                    scanner.nextLine();
                    double komisyon;
                    if (iban.equals(musteri2.getIban())) {
                        System.out.println(musteri2.name + "isimli sahisa ne kadar gondermek istiyorsunuz?");
                        para = scanner.nextInt();
                        if (musteri1.getBakiye() < (double)para) {
                            System.out.println("Yeterli Bakiyeniz mevcut degil");
                        } else if (para > 1000) {
                            System.out.println("1000 liradan fazla para transferi yaptiginizda komisyon 0.10");
                            komisyon = (double)para * 0.1;
                            bank.setBakiye(bank.getBakiye() + komisyon);
                            musteri1.paraCek((double)para);
                            musteri2.paraYatir((double)para);
                            System.out.println("Guncel Bakiyeniz:" + musteri1.getBakiye());
                            System.out.println("Gonderdiginiz sahisin bakiyesi:" + musteri2.getBakiye());
                        } else {
                            musteri1.paraCek((double)para);
                            musteri2.paraYatir((double)para);
                            System.out.println("Guncel Bakiyeniz:" + musteri1.getBakiye());
                            System.out.println("Gonderdiginiz sahisin bakiyesi:" + musteri2.getBakiye());
                        }
                    } else if (iban.equals(musteri3.getIban())) {
                        System.out.println(musteri3.name + "isimli sahisa ne kadar gondermek istiyorsunuz?");
                        para = scanner.nextInt();
                        if (musteri1.getBakiye() < (double)para) {
                            System.out.println("Yeterli Bakiyeniz mevcut degil");
                        }

                        if (para > 1000) {
                            System.out.println("1000 liradan fazla para transferi yaptiginizda komisyon 0.10");
                            komisyon = (double)para * 0.1;
                            bank.setBakiye(bank.getBakiye() + komisyon);
                            musteri1.paraCek((double)para);
                            musteri3.paraYatir((double)para);
                            System.out.println("Guncel Bakiyeniz:" + musteri1.getBakiye());
                            System.out.println("Gonderdiginiz sahisin bakiyesi:" + musteri3.getBakiye());
                        } else {
                            musteri1.paraCek((double)para);
                            musteri3.paraYatir((double)para);
                            System.out.println("Guncel Bakiyeniz:" + musteri1.getBakiye());
                            System.out.println("Gonderdiginiz sahisin bakiyesi:" + musteri3.getBakiye());
                        }
                    } else if (iban.equals(musteri4.getIban())) {
                        System.out.println(musteri4.name + "isimli sahisa ne kadar gondermek istiyorsunuz?");
                        para = scanner.nextInt();
                        if (musteri1.getBakiye() < (double)para) {
                            System.out.println("Yeterli Bakiyeniz mevcut degil");
                        }

                        if (para > 1000) {
                            System.out.println("1000 liradan fazla para transferi yaptiginizda komisyon 0.10");
                            komisyon = (double)para * 0.1;
                            bank.setBakiye(bank.getBakiye() + komisyon);
                            musteri1.paraCek((double)para);
                            musteri4.paraYatir((double)para);
                            System.out.println("Guncel Bakiyeniz:" + musteri1.getBakiye());
                            System.out.println("Gonderdiginiz sahisin bakiyesi:" + musteri4.getBakiye());
                        } else {
                            musteri1.paraCek((double)para);
                            musteri4.paraYatir((double)para);
                            System.out.println("Guncel Bakiyeniz:" + musteri1.getBakiye());
                            System.out.println("Gonderdiginiz sahisin bakiyesi:" + musteri4.getBakiye());
                        }
                    }

                    tus = 0;

                    while(true) {
                        if (tus >= 1) {
                            continue label113;
                        }

                        System.out.println("Geri donmek icin (1):");
                        tus = scanner.nextInt();
                        if (tus == 1) {
                            i -= 2;
                        } else {
                            System.out.println("Gecerli bir tus giriniz..");
                            --tus;
                        }

                        ++tus;
                    }
                case 4:
                    System.out.println("Bakiyeniz:" + musteri1.getBakiye());
                    tus = 0;

                    while(true) {
                        if (tus >= 1) {
                            continue label113;
                        }

                        System.out.println("Geri donmek icin (1):");
                        tus = scanner.nextInt();
                        if (tus == 1) {
                            i -= 2;
                        } else {
                            System.out.println("Gecerli bir tus giriniz..");
                            --tus;
                        }

                        ++tus;
                    }
                case 5:
                    System.out.println("Programdan cikiliyor..\n");
                    System.out.println("Kartinizi geri alabilirsiniz...");
                    i = 2;
                    break;
                default:
                    i = 0;
                    if (i < 1) {
                        System.out.println("Lutfen gecerli bir sayi giriniz..");
                        --i;
                    }
            }
        }

    }
}
