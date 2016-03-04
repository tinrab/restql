package com.moybl.restql;

import com.moybl.restql.generators.SQLGenerator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class RestQL {

	public static String parseToSQL(String source) {
		InputStream is = new ByteArrayInputStream(source.getBytes());

		return parseToSQL(is);
	}

	public static String parseToSQL(InputStream inputStream) {
		SQLGenerator sqlGenerator = new SQLGenerator();

		new RestQLParser().parse(new RestQLLexer(inputStream)).accept(sqlGenerator);

		return sqlGenerator.getResult();
	}

}