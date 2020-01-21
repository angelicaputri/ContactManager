package contactmanager;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Contact nambah = new Contact(); //untuk input isi kontak. nambah itu objek, kontak itu class
        ContactManager kontak = new ContactManager(); //simpen kontak
        Contact nyari = new Contact();
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("Tambah Data! \n 1. Input\n 2. Search ");
        System.out.print("Masukkan pilihan : ");
        int pilihan = input.nextInt();
        input.nextLine();
        switch(pilihan){
        case 1 :{
            System.out.println("INPUT DATA");
            System.out.print("1. Nama : ");
            nambah.name = input.nextLine(); //akses
            System.out.print("2. Nomor Telepon : ");
            nambah.phoneNumber = input.nextLine();
            System.out.print("3. Email : ");
            nambah.email = input.nextLine();
            kontak.addContact(nambah);//} //menyimpan inputan
            break;
        }
        
        case 2 : {
            System.out.println("SEARCH");
            System.out.print("Nama yang ingin dicari : ");
            String cariNama = input.nextLine(); //input buat nama yg dicari1
            nyari = kontak.searchContact(cariNama); //cari nama
            System.out.println("Nama : " + nyari.name);
            System.out.println("No. Telpon : " + nyari.phoneNumber);
            System.out.println("Email : " + nyari.email);
            break;
        }
        }
        }while(true);
        
        }
}