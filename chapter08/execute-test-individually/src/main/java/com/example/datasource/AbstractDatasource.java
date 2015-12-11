package com.example.datasource;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDatasource<T> {

	/**
	 * DB에서 취득한 것을 모델로 반환
	 * @return 모델 리스트
	 */
	public List<T> findAll() {
		List<T> list = new ArrayList<>();
		long count = 1000L;
		for(long i=1L; i<=count; i++) {
			list.add(createModel(i));
		}
		return list;
	}
	
	/**
	 * DB에서 취득한 것을 모델로 반환
	 * @param id
	 * @return 모델
	 */
	public T findById(Long id) {
		return createModel(id);
	}
	
	/**
	 * condition의 id에 지정한 값만 대기한 후 모델 반환
	 * @param condition
	 * @return 모델
	 */
	public T findWithComplexCondition(Condition condition) {
		Long waitTime = condition.getId();
		try {
			Thread.sleep(waitTime);
		} catch(InterruptedException ex) {}
		return createModel(condition.getId());
	}
	
	abstract T createModel(Long id);
}
