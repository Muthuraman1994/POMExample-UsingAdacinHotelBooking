package Pom_AdacinBooking;


import SeleniumTask.Baseclass;

public class Adacin extends Baseclass {

	
	public static void main(String[] args) throws InterruptedException {
		
		browserConfigChrome();
		OpenUrl("http://adactinhotelapp.com/");
		maximizeWindow();
		
		Login l = new Login();
		textInput(l.getTxtuser(),"Aruchamy");
		textInput(l.getTxtpass(),"aruchamy");
		click(l.getLogin());
		
		SearchHotel sh = new SearchHotel();
		SelectbyIndex(sh.getBtnlocation(),3);		
		SelectbyIndex(sh.getHotel(),3);
		SelectbyIndex(sh.getRoomtype(),2);
		SelectbyIndex(sh.getNoRoom(),2);
		clear(sh.getCheckInDate());
		textInput(sh.getCheckInDate(),"10/06/2022");
		clear(sh.getCheckOutDate());
		textInput(sh.getCheckOutDate(),"11/06/2022");
		SelectbyIndex(sh.getAdultRoom(),1);
		click(sh.getsearchButton());
		
		SelectHotel s = new SelectHotel();
		click(s.getRadiobtn());
		click(s.getContinuebtn());
		
		BookHotel b = new BookHotel();
		textInput(b.getFirstName(), "Muthuraman");
		textInput(b.getLastName(), "B");
		textInput(b.getAddress(), "Thanjavur");
		textInput(b.getCardNo(), "1234567890987654");
		SelectbyIndex(b.getCardType(),2);
		SelectbyIndex(b.getExpiryMonth(),10);
		SelectbyIndex(b.getYear(), 10);
		textInput(b.getCvvNo(), "1234");
		click(b.getBookBtn());	
		Thread.sleep(30000);
		getTheAttribute(b.getorderNo(),"value");
		
		
		
		
	}
	
	
}
