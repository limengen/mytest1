package com.itheima.spring.demo4;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ConnectProperty {
	private List list;
	private Map map;
	private Set set;
	private Properties props;

	public ConnectProperty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConnectProperty(List list, Map map, Set set, Properties props) {
		super();
		this.list = list;
		this.map = map;
		this.set = set;
		this.props = props;
	}

	@Override
	public String toString() {
		return "ConnectProperty [list=" + list + ", map=" + map + ", set=" + set + ", props=" + props + "]";
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

}
