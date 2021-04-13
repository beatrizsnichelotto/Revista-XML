package com.example.converterxml.metodos;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @Override
	public String marshal(Date data) throws Exception {
		return dateFormat.format(data);
	}

	@Override
	public Date unmarshal(String stringData) throws Exception {
		return dateFormat.parse(stringData);
	}

}
