package Ver_6;

import java.io.*;


public class Le
{
	// Inibe o construtor por defeito
	private Le() 
	{
	}
	
	// Le um inteiro da entrada padrão. 
	// A entrada é terminada com um return. Se a entrada não for 
	// válida é mostrada a mensagem "!!! Não é um inteiro !!!" e o 
	// utilizador pode tentar de novo.
	// @devolve o número lido

	public static int umInt()
	{
		while(true)
   	{
     	try
      	{  
      		return Integer.valueOf(umaString().trim()).intValue();
      	} 
   		catch(Exception e)
      	{  
      		System.out.println("!!! Não é um inteiro !!!");
      	}
      }
	}

	
	// Le um double da entrada padrão. 
	// A entrada é terminada com um return. Se a entrada não for
	// válida é mostrada a mensagem "!!! Não é um double !!!" e o 
	// utilizador pode tentar de novo.
	// @devolve o número lido

	
	public static double umDouble()
	{
		while(true)
   	{
     	try
      	{ 
      		return Double.valueOf(umaString().trim()).doubleValue();
      	} 
   		catch(Exception e)
      	{  
      		System.out.println("!!! Não é um double !!!");
      	}
      }
	}
	
	// Le um float da entrada padrão. 
	// A entrada é terminada com um return. Se a entrada não for 
	// válida é mostrada a mensagem "!!! Não é um float !!!" e o 
