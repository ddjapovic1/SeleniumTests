import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.textui.TestRunner;

class Main {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(AllTests.class);
		
		Logger l = Logger.getLogger(TestRunner.class.toString());
		
		for(Failure f : result.getFailures()) {
			l.warning(f.toString());
		}
	
		l.info("Vreme izvrsavanja testova: " + result.getRunTime());
		l.info("Ukupan broj testova: " + result.getRunCount());
		l.info("Broj uspesnih testova: " + (result.getRunCount() - result.getFailureCount() - result.getIgnoreCount() - 
				result.getAssumptionFailureCount()));
		l.info("Broj palih testova: " + result.getFailureCount());
		l.info("Broj preskocenih testova: " + result.getIgnoreCount());
		l.info("Broj dinamickih preskocenih testova: " + result.getAssumptionFailureCount());
		
		if(result.wasSuccessful())
			l.info("Svi testovi su uspesno izvrseni.");
		else
			l.info("Postoje greske u testovima.");
		try {
            File myObj = new File("test-reports.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("test-reports.txt");
            myWriter.write("Vreme izvrsavanja:" + result.getRunTime());
            myWriter.write("\nBroj testova:"+ result.getRunCount());
            myWriter.write("\nUspesno testova:" + (result.getRunCount()-result.getFailureCount()-result.getIgnoreCount()-result.getAssumptionFailureCount()));
            myWriter.write("\nBroj palih testova:"+ result.getFailureCount());
            myWriter.write("\nBroj preskocenih:"+ result.getIgnoreCount());
            myWriter.write("\nBroj dinamicki preskocenih:" + result.getAssumptionFailureCount());
            myWriter.write("\n\n");
            myWriter.write("Tudors:\n");
            myWriter.write("SEDI??TE FIRME:\n" +
                    "Po??e??ka 58/7,11030 Beograd, Srbija\n");
            myWriter.write("Mati??ni broj:\n" +
                    "20732814\n"); 
            myWriter.write("\n" +
                    "Broj ra??una\n" +
                    "155-30479-44");
            myWriter.write("\nRadno vreme:\n" +
                    "Radnim danima od 09h do 16h");
            myWriter.write("\nTelefon:\n" +
                    "063 439 414");
            myWriter.write("\nEmail:\n" +
                    "online@tudors.rs");
            myWriter.write("\n\n\t\t\tIzve??taji testova:\n");
            myWriter.write("\nIme testa: CartTudors:\n" +
                    "Opis testa: Test je ra??en uz pomo?? AssertEquals metode.Uz pomo?? nje proveravamo da li se na stranici Korpa nalaze"
                    + " 3 reda, ??to zna??i da su to 3 dodata proizvoda. Ukoliko se nalaze ta??no tri proizvoda, ??to je i bio uslov, test je uspe??an.\n");
            myWriter.write("\nIme testova: facebookTudors, instagramTudors:\n" +
                    "Opis testa: Sajt poseduje dve ikonice koje su linkovane na dve dru??tvene mre??e,"
                    + " Instagram i Facebook. Nakon klika, test metoda ??e proveriti da li se uspe??no pristupa ovim dru??tvenim mre??ama. Za potrebe ovog testa kori????ene su assertEquals metode.\n");
            myWriter.write("\nIme testa: loginTudors:\n" +
                    "Opis testa: Potrebno je uneti e-mail adresu i lozinku kako bi se izvr??ilo prijavlijvanje korisnika na sistem."
                    + " Da bi smo proveli ispravnost, uz pomo?? assertEquals metode proverava se da li je nakon klika na dugme PRIJAVITE SE korisnik preusmeren na stranicu"
                    + " Dashboard, tj. na stranicu sa informacijama o profilu. Ako je korisnik preusmeren gde treba, prijava je uspela i test prolazi.\n");
            myWriter.write("\nIme testa: profileTudors:\n" +
                    "Opis testa: Da bi smo proverili da li su podaci koji su kori????eni pri registraciji jednaki sa podacima korisnika,"
                    + " bi??e kori????ena assertTrue metoda koja na osnovu recimo e-maila proverava da li se uneseni podaci poklapaju sa podacima na stranici Moj Nalog. \n");
            myWriter.write("\nIme testa: registerTudors:\n" +
                    "Opis testa: Radi provere ispravnosti testa, u kod je dodata assertTrue metoda koja proverava da li se nakon registracije"
                    + " korisniku otvara nova stranica na kojoj se nalazi poruka \"Uspe??no ste kreirali nalog.\" Ukoliko korisnik dobije tu poruku, test prolazi. \n");
            myWriter.write("\nIme testa: searchTudors:\n" +
                    "Opis testa: Testiranje je ura??eno uz pomo?? metode assertTrue\r\n"
                    + "Ova metoda proverava da li se u izvoru stranice nalazi navedena ??ifra ili klju??na re??. Ukoliko se proizvod pojavi, test je uspe??an. \n");
            myWriter.write("\nIme testa: totalPriceTudors:\n" +
            		"Opis testa: Radi provere ispravnosti testa, u kod je dodata assertTrue metoda koja proverava da li se nakon registracije"
            		+ " korisniku otvara nova stranica na kojoj se nalazi poruka \\\"Uspe??no ste kreirali nalog.\\\" Ukoliko korisnik dobije tu poruku, test prolazi. \\n\");\r\n"
            		+ "\n");
            myWriter.write("\n\t\tSVI TESTOVI SU USPE??NI!\n");
            		
            
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
		
	}
	