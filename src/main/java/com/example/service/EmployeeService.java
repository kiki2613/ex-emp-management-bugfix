package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Employee;
import com.example.repository.EmployeeRepository;

/**
 * 従業員情報を操作するサービス.
 * 
 * @author igamasayuki
 *
 */
@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	/**
	 * 従業員情報を全件取得します.
	 * 
	 * @return 従業員情報一覧
	 */
	public List<Employee> showList() {
		List<Employee> employeeList = employeeRepository.findAll();
		return employeeList;
	}

	/**
	 * 従業員情報を取得します.
	 * 
	 * @param id ID
	 * @return 従業員情報
	 * @throws org.springframework.dao.DataAccessException 検索されない場合は例外が発生します
	 */
	public Employee showDetail(Integer id) {
		Employee employee = employeeRepository.load(id);
		return employee;
	}

	/**
	 * 従業員情報を更新します.
	 * 
	 * @param employee 更新した従業員情報
	 */
	public void update(Employee employee) {
		employeeRepository.update(employee);
	}

	/**
	 * 入力された従業員名から従業員情報を検索する.
	 * 
	 * @param employeeName 従業員名
	 * @return 検索された従業員情報
	 */
	public List<Employee> search(String employeeName) {
		List<Employee> employeeList = new ArrayList<>();

		if (employeeName.isBlank()) {
			employeeList = employeeRepository.findAll();
		} else {
			employeeList = employeeRepository.findByEmployeeName(employeeName);
		}
		return employeeList;
	}

	public List<Employee> searchNull(String employeeName) {
		return employeeRepository.findAll();
	}
}
