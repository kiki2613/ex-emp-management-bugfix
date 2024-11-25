package com.example.form;

/**
 * 従業員の名前で検索するフォーム.
 * 
 * @author M.aoki
 */
public class SearchEmployeeForm {
  /** 従業員名 */
  private String employeeName;

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  @Override
  public String toString() {
    return "SearchEmployeeForm [employeeName=" + employeeName + "]";
  }

}
