package sha.work.service.batch;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import sha.framework.service.BaseService;
import sha.framework.util.FileReaderUtil;
import sha.work.dto.loto.Loto6;
import sha.work.dto.loto.def.Loto6Table;
import sha.work.mapper.loto.Loto6Mapper;
import sha.work.util.FileUtil;

@Service
public class Loto6ImportDataService extends BaseService {

	/** DB access class. */
	@Autowired
	private Loto6Mapper loto6Mapper;
	
	@Autowired
    ResourceLoader resourceLoader;

	public void importData() {

		List<List<String>> csvData = FileReaderUtil.readCsv(new File(FileUtil.getLoto6ImportDataFileCsv()));

		for(List<String> data : csvData) {
			Loto6 loto6 = new Loto6();
			loto6.setTurn(Integer.valueOf(data.get(Loto6Table.TURN.getId())));
			loto6.setOpenDt(data.get(Loto6Table.OPEN_DT.getId()));
			loto6.setL1(Integer.valueOf(data.get(Loto6Table.L1.getId())));
			loto6.setL2(Integer.valueOf(data.get(Loto6Table.L2.getId())));
			loto6.setL3(Integer.valueOf(data.get(Loto6Table.L3.getId())));
			loto6.setL4(Integer.valueOf(data.get(Loto6Table.L4.getId())));
			loto6.setL5(Integer.valueOf(data.get(Loto6Table.L5.getId())));
			loto6.setL6(Integer.valueOf(data.get(Loto6Table.L6.getId())));
			loto6.setB1(Integer.valueOf(data.get(Loto6Table.B1.getId())));

			loto6Mapper.save(loto6);
		}
	}
}
