package Sort.Emulation.ReceivedMessages;

import java.util.ArrayList;
import java.util.Random;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import Sort.Emulation.Helpers.SendsMessagesTimeController;
import Sort.Emulation.Models.FromXSD.MSG;
import Sort.Emulation.Models.FromXSD.MSG.BODY;
import Sort.Emulation.Models.FromXSD.MSG.HEADER;
import Sort.Emulation.SendMessages.SORTRPT;

public class SORTRPL {

	public static void sortrplLogic(MSG msg) throws JAXBException{
		
		HEADER head = msg.getHEADER();
		BODY body = msg.getBODY();
		String HPIC = null;
		String CDDT = null;
		ArrayList<String> DIDArray = new ArrayList<String>();
		System.out.println("Время определения порта сброса " + SendsMessagesTimeController.getTimeResponseMessage(head.getHDMGID()) + " секунд");
		for (JAXBElement<?> element : body.getHPICOrPIBOrPAB()) {
			if(element.getName().toString().equals("HPIC")){
				HPIC = (String) element.getValue();
			}
			if(element.getName().toString().equals("CDDT")){
				CDDT = (String) element.getValue();
			}
			if(element.getName().toString().equals("DID")){
				DIDArray.add((String) element.getValue());
			}
		}
		String DID = DIDArray.get(0);
		
		SORTRPT.sendSortrpt(HPIC, CDDT, DID);
		
	}

	
}
