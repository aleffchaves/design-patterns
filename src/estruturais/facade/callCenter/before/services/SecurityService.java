//package estruturais.facade;
//
//import java.util.List;
//
//import br.com.cod3r.facade.callCenter.before.model.Card;
//import br.com.cod3r.facade.callCenter.before.model.Register;
//
//public class SecurityService {
//	private CardService cardService;
//	private RegisterService registerService;
//
//	public SecurityService(CardService cardService, RegisterService registerService) {
//		this.cardService = cardService;
//		this.registerService = registerService;
//	}
//
//	public List<Register> blockCard(Card card) {
//		System.out.println("Blocking card:" + card);
//		List<Register> pendingRegistries = registerService.getRegistersByCard(card);
//		cardService.removeCard(card);
//		registerService.deleteCardRegistries(card);
//		return pendingRegistries;
//	}
//}
