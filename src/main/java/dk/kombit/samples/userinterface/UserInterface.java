package dk.kombit.samples.userinterface;

import dk.kombit.samples.klassifikation.Klasse;
import dk.kombit.samples.organisation.Organisation;
import dk.kombit.samples.sagdokumentIndeks.SagDokumentIndeks;
import dk.kombit.samples.utils.ClientProperties;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInterface {

    /**
     * The showUserInterface method is responsible for showing the console based interface
     *
     * @param sagDokumentIndeks
     * @param klassifikation
     * @param organisation
     * @return
     * @throws IOException
     */
    public boolean showUserInterface(SagDokumentIndeks sagDokumentIndeks, Klasse klassifikation, Organisation organisation) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chosenOption = 99; //to avoid initialization error in try catch

        System.out.println("*********************************************");
        System.out.println("Choose example:");
        System.out.println("(1) Import Case");
        System.out.println("(2) Search Case");
        System.out.println("(3) Remove Case");
        System.out.println("(4) Import, search, and remove case");
        System.out.println("(5) Search Organisation");
        System.out.println("(6) Search Class");
        System.out.println("(0) Exit");
        System.out.print("\r\nChoose: ");

        try {
            chosenOption = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {

        }
        return control(chosenOption, sagDokumentIndeks, klassifikation, organisation);
    }

    /**
     * The control method is responsible for running the examples according to the user input
     * Examples can be run individually or collectively
     *  @param choice
     * @param sagDokumentIndeks
     * @param klassifikation
     * @param organisation
     */
    private boolean control(int choice, SagDokumentIndeks sagDokumentIndeks, Klasse klassifikation, Organisation organisation){
        boolean shouldContinue = true;

        switch (choice) {
            case 1:
                //Import Case
                sagDokumentIndeks.importer(ClientProperties.getInstance().getUuid());
                break;
            case 2:
                //Search Case
                sagDokumentIndeks.fremsoeg(ClientProperties.getInstance().getUuid());
                break;
            case 3:
                //Remove Case
                sagDokumentIndeks.fjern(ClientProperties.getInstance().getUuid());
                break;
            case 4:
                //Collective running of example 1-3
                sagDokumentIndeks.importer(ClientProperties.getInstance().getUuid());
                sagDokumentIndeks.fremsoeg(ClientProperties.getInstance().getUuid());
                sagDokumentIndeks.fjern(ClientProperties.getInstance().getUuid());
                break;
            case 5:
                //Search Organisation
                organisation.getOrganisationByCvr(ClientProperties.getInstance().getMyndighedCvr());
                break;
            case 6:
                //Search Class
                klassifikation.soegKlasse(ClientProperties.getInstance().getKleKlasse());
                klassifikation.soegKlasse(ClientProperties.getInstance().getKleHandlingsfacet());
                break;
            case 0:
                //Exit
                shouldContinue = false;
                break;
            default:
                System.out.println("Error: Enter valid input");
        }
        return shouldContinue;
    }
}
