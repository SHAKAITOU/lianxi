package sha.work.entity.in;

import lombok.Data;

@Data
public class MiniLotoShowDataIn {
	private int pageCntRadio;
	private String searchTypeRadio;
	private String searchDt;
	private int searchTurnFrom;
	private int maxTurn;
	private String orderType;

}
