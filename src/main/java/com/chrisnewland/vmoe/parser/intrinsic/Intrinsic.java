/*
 * Copyright (c) 2018-2019 Chris Newland.
 * Licensed under https://github.com/chriswhocodes/VMOptionsExplorer/blob/master/LICENSE
 */
package com.chrisnewland.vmoe.parser.intrinsic;

public class Intrinsic
{
	private String id;
	private String klass;
	private String name;
	private String signature;
	private String flags;
	private String since;

	public String getId()
	{
		return id;
	}

	public String getKlass()
	{
		return klass;
	}

	public String getName()
	{
		return name;
	}

	public String getSignature()
	{
		return signature;
	}

	public String getFlags()
	{
		return flags;
	}

	public String getSince()
	{
		return since;
	}

	public void setSince(String since)
	{
		this.since = since;
	}

	public Intrinsic(String id, String klass, String name, String signature, String flags)
	{
		super();
		this.id = id;
		this.klass = klass;
		this.name = name;
		this.signature = signature;
		this.flags = flags;
	}

	@Override public String toString()
	{
		return "Intrinsic [id=" + id + ", klass=" + klass + ", name=" + name + ", signature=" + signature + ", flags=" + flags
				+ "]";
	}

	public static String getHeaderRow()
	{
		StringBuilder builder = new StringBuilder();

		builder.append("<tr>");
		builder.append("<th>").append("Id").append("</th>");
		builder.append("<th>").append("Since").append("</th>");
		builder.append("<th>").append("Class").append("</th>");
		builder.append("<th>").append("Name").append("</th>");
		builder.append("<th>").append("Signature").append("</th>");
		builder.append("<th>").append("Flags").append("</th>");
		builder.append("</tr>");

		return builder.toString();
	}

	public String toRow()
	{
		StringBuilder builder = new StringBuilder();

		builder.append("<tr>");
		builder.append("<td>").append(id).append("</td>");
		builder.append("<td>").append(since).append("</td>");
		builder.append("<td>").append(klass).append("</td>");
		builder.append("<td>").append(name).append("</td>");
		builder.append("<td>").append(signature).append("</td>");
		builder.append("<td>").append(flags).append("</td>");
		builder.append("</tr>");

		return builder.toString();
	}
}