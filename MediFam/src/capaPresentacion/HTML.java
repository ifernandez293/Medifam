package capaPresentacion;

import java.util.ArrayList;

public class HTML 
{
	public static String inicializarDocumentoHtml="<!DOCTYPE html>\n<html>\n";
	public static String finalizarDocumentoHtml="</html>";
	
	public static String cabeceraTituloCSS(String css, String titulo) 
	{
		String cabecera="";
		
		cabecera+="<head>\n";
		cabecera+="<meta charset=\"UTF-8\">";
		cabecera+="<title>"+titulo+"</title>";
		cabecera+="<link rel=\"stylesheet\" type=\"text/css\" href=\""+css+"\">\n";
		cabecera+="</head>\n";
		
		return cabecera;
	}
	
	public static String cuerpo(String informacionCuerpo) 
	{
		String cuerpo="<body>";
		
		cuerpo+=informacionCuerpo;
		
		cuerpo+="</body>";
		
		return cuerpo;
	}
		
	public static String crearTitulo(String titulo) 
	{
		String contenido="";
		
		contenido+="<h1>";
		contenido+=titulo;
		contenido+="</h1>";
		
		return contenido;
	}
}
