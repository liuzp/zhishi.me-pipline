package me.zhishi.parser;

import java.util.ArrayList;

import me.zhishi.parser.ZhishiArticle.ImageInfo;
import me.zhishi.tools.StringPair;

public interface ZhishiParser extends Parser
{
	public String getLabel();
	public String getAbstract();
	public String getRedirect();

	public ArrayList<StringPair> getProperties();
	
	public ImageInfo getImageInfo();
	
	public ArrayList<String> getCategories();
	public ArrayList<String> getInternalLinks();
	public ArrayList<String> getExternalLinks();
	public ArrayList<String> getRelatedPages();
	public ArrayList<String> getDisambiguations();

	public boolean isDisambiguationPage();
	public boolean isRedirectPage();

	public static String whitespace = "[\\t\\n\\x0B\\f\\r]";

}
