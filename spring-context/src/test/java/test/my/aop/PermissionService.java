package test.my.aop;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

/**
 * @author zzr
 * @date 2022/4/25 0025
 */
@Service
public class PermissionService {

	public List getPermission(String role) {
		System.out.println("查询角色拥有的权限：" + role);
		return Collections.emptyList();
	}
}
