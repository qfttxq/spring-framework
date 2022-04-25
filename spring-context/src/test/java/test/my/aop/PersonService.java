package test.my.aop;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zzr
 * @date 2022/4/25 0025
 */
@Service
public class PersonService {
	public int getPersonCount() {
		System.out.println("人员数量为：" + 100);
		return 100;
	}

	public List query(String name) {
		System.out.println("查询人员");
		return null;
	}
}
