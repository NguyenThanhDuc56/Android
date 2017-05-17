package com.example.vidu_listview_arraylist_object;

public class EmployeePartTime extends Employee {

public double TinhLuong() {
	return 150;
}

public String toString() {
	return super.toString() +" -->PartTime="+TinhLuong();
}
}

