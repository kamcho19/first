package first.sample.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO {
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return (List<Map<String, Object>>)selectList("sample.selectBoardList", map);
	}

}
